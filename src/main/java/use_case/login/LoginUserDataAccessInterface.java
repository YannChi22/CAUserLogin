package use_case.login;

import entity.User;

/**
 * DAO for the Login Use Case.
 */
public interface LoginUserDataAccessInterface {

    /**
     * Checks if the given username exists.
     * @param username the username to look for
     * @return true if a user with the given username exists; false otherwise
     */
    boolean existsByName(String username);

    /**
     * Saves the user.
     * @param user the user to save
     */
    void save(User user);

    /**
     * Returns the user with the given username.
     * @param username the username to look up
     * @return the user with the given username
     */
    User get(String username);

    /**
     * Default user.
     */
    default void setCurrentUser() {
        setCurrentUser(null);
    }

    /**
     * Setting user to name.
     * @param name the name of user
     */
    void setCurrentUser(String name);

    /**
     * Return the current user.
     */
    String getCurrentUser();
}
