package za.ac.cput.ShoppingCartBackend.config.factory;

import za.ac.cput.ShoppingCartBackend.Domain.Item;
import za.ac.cput.ShoppingCartBackend.Domain.Orders;

import java.util.List;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-04-03
 */
public class OrderFactory {
    public static Orders createOrders(String orderDate, List<Item> item){
        Orders orders = new Orders.Builder().orderDate(orderDate).item(item).build();
        return  orders;
    }
}
