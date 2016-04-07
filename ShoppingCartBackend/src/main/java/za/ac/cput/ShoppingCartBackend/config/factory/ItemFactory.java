package za.ac.cput.ShoppingCartBackend.config.factory;

import za.ac.cput.ShoppingCartBackend.Domain.Item;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-04-03
 */
public class ItemFactory {
    public static Item createItem(String name, String imageLocation, String description, double price, int quantity ){
        Item item = new Item.Builder().name(name).imageLocation(imageLocation).description(description).price(price).quantity(quantity).build();
        return item;
    }
}
