package za.ac.cput.ShoppingCartBackend.config.factory;

import za.ac.cput.ShoppingCartBackend.Domain.Contact;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-04-03
 */
public class ContactFactory {
    public static Contact createContact(String email, String telephone, String cellphone)
    {
        Contact contact = new Contact.Builder().email(email).telephone(telephone).cellphone(cellphone).build();
        return contact;
    }
}
