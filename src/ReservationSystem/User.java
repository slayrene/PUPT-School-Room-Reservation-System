package ReservationSystem;

/**
 * User class represents a user in the reservation system. 
 * It currently only stores the username.
 */
public class User {
    
    private String username;
    /**
     * Creates a new User object with the provided username.
     * 
     * @param username The username for the user
     */
    public User(String username) {
        this.username = username;
    }
    /**
     * Gets the username of the user.
     * 
     * @return The username of the user
     */
    public String getUsername() {
        return username;
    }
    /**
     * Sets the username of the user.
     * 
     * @param username The new username for the user
     */
    public void setUsername(String username) {
        this.username = username;
    }    
}
