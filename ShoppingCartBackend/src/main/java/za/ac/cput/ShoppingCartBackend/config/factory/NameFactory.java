package za.ac.cput.ShoppingCartBackend.config.factory;

import za.ac.cput.ShoppingCartBackend.Domain.Name;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-04-03
 */
public class NameFactory {
    public static Name createName(String  firstName, String middleName, String surname){
        Name name = new Name.Builder().name(firstName).middleName(middleName).surname(surname).build();
        return name;
    }
}
