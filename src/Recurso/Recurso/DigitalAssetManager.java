package Recurso;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DigitalAssetManager implements DigitalAssetManagerInterface {
    private Map<String, User> registeredUsers;
    private Map<String, DigitalObject> digitalObjects;
    private Map<User, List<DigitalObject>> userObjects;

    public DigitalAssetManager() {
        registeredUsers = new HashMap<>();
        digitalObjects = new HashMap<>();
        userObjects = new HashMap<>();
    }

    @Override
    public User registerUser(String userName) {
        if (registeredUsers.containsKey(userName)) {
            throw new IllegalArgumentException("Username already registered: " + userName);
        }

        User user = new User(userName);
        registeredUsers.put(userName, user);
        userObjects.put(user, new ArrayList<>());
        return user;
    }

    @Override
    public User getUser(String userName) {
        return registeredUsers.get(userName);
    }

    @Override
    public User createGuestUser() {
        User guestUser = new User("Guest" + registeredUsers.size());
        registeredUsers.put(guestUser.getUserName(), guestUser);
        userObjects.put(guestUser, new ArrayList<>());
        return guestUser;
    }

    @Override
    public DigitalObject registerDigitalObject(String doi, User owner) {
        return registerDigitalObject(doi, SensitivityLevel.PUBLIC, owner);
    }

    @Override
    public DigitalObject registerDigitalObject(String doi, SensitivityLevel sensitivityLevel, User owner) {
        DigitalObject digitalObject = new DigitalObject(doi, sensitivityLevel, owner);
        digitalObjects.put(doi, digitalObject);
        userObjects.get(owner).add(digitalObject);
        return digitalObject;
    }

    @Override
    public List<String> listRegisteredUsers() {
        List<String> userList = new ArrayList<>();
        for (User user : registeredUsers.values()) {
            userList.add(user.getUserName());
        }
        return userList;
    }

    @Override
    public List<String> listUserObjects(User u) {
        List<String> objectList = new ArrayList<>();
        for (DigitalObject digitalObject : userObjects.get(u)) {
            objectList.add(digitalObject.getDoi());
        }
        return objectList;
    }

    @Override
    public boolean setObjectSensitivity(String doi, SensitivityLevel sensitivityLevel, User owner) {
        DigitalObject digitalObject = digitalObjects.get(doi);
        if (digitalObject == null || !digitalObject.getOwner().equals(owner)) {
            return false;
        }

        digitalObject = new DigitalObject(digitalObject.getDoi(), sensitivityLevel, owner);
        digitalObjects.put(doi, digitalObject);
        return true;
    }

    @Override
    public boolean setPublic(String doi, User owner) {
        DigitalObject digitalObject = digitalObjects.get(doi);
        if (digitalObject == null || !digitalObject.getOwner().equals(owner)) {
            return false;
        }

        digitalObject = new DigitalObject(digitalObject.getDoi(), SensitivityLevel.PUBLIC, owner);
        digitalObjects.put(doi, digitalObject);
        return true;
    }

    @Override
    public boolean shareObject(String doi, User owner, User otherUser) {
        DigitalObject digitalObject = digitalObjects.get(doi);
        if (digitalObject == null || !digitalObject.getOwner().equals(owner)) {
            return false;
        }

        userObjects.get(otherUser).add(digitalObject);
        return true;
    }

    @Override
    public DigitalObject getObject(String doi, User user) {
        DigitalObject digitalObject = digitalObjects.get(doi);
        if (digitalObject == null || digitalObject.getSensitivityLevel() != SensitivityLevel.PUBLIC) {
            return null;
        }

        return digitalObject;
    }

    public Collection<String> listUsersWithObjectAccess(String doi) {
        return null;
    }

    public Collection<String> listObjectSharedWithUser(User user) {
        return null;
    }
                   
   
}
