package za.ac.cput.ShoppingCartBackend.config.factory;

import za.ac.cput.ShoppingCartBackend.Domain.User;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-04-03
 */
public class UserFactory {
    public static User createUser(String username, String password){
        User user = new User.Builder().username(username).password(password).build();
        return user;
    }
}
