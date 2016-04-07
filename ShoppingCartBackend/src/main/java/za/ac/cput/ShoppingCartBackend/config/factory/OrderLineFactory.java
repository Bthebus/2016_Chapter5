package za.ac.cput.ShoppingCartBackend.config.factory;

import za.ac.cput.ShoppingCartBackend.Domain.OrderLine;
import za.ac.cput.ShoppingCartBackend.Domain.Orders;

import java.util.List;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-04-03
 */
public class OrderLineFactory {
    public static OrderLine createOrderLine(List<Orders> orders){
        OrderLine orderLine = new OrderLine.Builder().order(orders).build();
        return orderLine;
    }
}
