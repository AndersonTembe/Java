package Recurso;
public class GuestUser extends User {
     private static int nextGuestId = -1;

    public GuestUser(String userName) {
        super(userName);
        
    }

    private static synchronized int getNextGuestId() {
        return nextGuestId--;
    }
  


}

