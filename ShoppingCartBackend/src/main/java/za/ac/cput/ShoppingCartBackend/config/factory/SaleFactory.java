package za.ac.cput.ShoppingCartBackend.config.factory;

import za.ac.cput.ShoppingCartBackend.Domain.Orders;
import za.ac.cput.ShoppingCartBackend.Domain.Sale;

import java.util.List;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-04-03
 */
public class SaleFactory {
    public static Sale createSale(List<Orders> orders){
        Sale sale = new Sale.Builder().order(orders).build();
        return sale;
    }
}
