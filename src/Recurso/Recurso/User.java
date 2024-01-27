package Recurso;

public class User {
    private static int nextId = 0;
    protected int id;
    private String userName;

    public User(String userName) {
        this.id = generateId();
        this.userName = userName;
    }

     
    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    private static int generateId() {
        return nextId++;
    }
}




