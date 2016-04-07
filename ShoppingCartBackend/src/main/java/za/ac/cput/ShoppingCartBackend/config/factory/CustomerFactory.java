package za.ac.cput.ShoppingCartBackend.config.factory;

import za.ac.cput.ShoppingCartBackend.Domain.*;

import java.util.List;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-04-03
 */
public class CustomerFactory {
    public static Customer createCustomer(Name name, Contact contact, Address address, User user, List<Orders> order){
        Customer customer = new Customer.Builder().name(name).contactInformation(contact).address(address).user(user).order(order).build();
        return customer;
    }
}
