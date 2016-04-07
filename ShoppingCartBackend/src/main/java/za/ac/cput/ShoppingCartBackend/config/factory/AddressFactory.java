package za.ac.cput.ShoppingCartBackend.config.factory;

import za.ac.cput.ShoppingCartBackend.Domain.Address;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-04-03
 */
public class AddressFactory {

    public static Address createAddress(String homeNumber, String streetName, String city, String province, String postalCode){
        Address address = new Address.Builder().homeNumber(homeNumber).streetName(streetName).city(city).province(province).postalCode(postalCode).build();
        return address;
    }
}
