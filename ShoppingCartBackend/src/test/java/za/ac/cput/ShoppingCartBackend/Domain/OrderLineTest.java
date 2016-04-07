package za.ac.cput.ShoppingCartBackend.Domain;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.ShoppingCartBackend.config.factory.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-04-02
 */
public class OrderLineTest extends TestCase {
    private Item item, itemCopy;
    private Orders order, orderCopy;
    private List<Item> items, itemsCopy;
    private Date date;
    private List<Orders> orders, ordersCopy;
    private OrderLine orderLine, orderLineCopy;

    @Before
    public void setUp(){
        item = ItemFactory.createItem("Sausage", "images/image5.jpg", "this is sausage", 30.50, 1000);
        itemCopy = new Item.Builder().copy(item).name("Sausage").imageLocation("images/image5.jpg").description("this is sausage").price(20.99).quantity(500).build();

        items = new ArrayList<Item>();
        itemsCopy = new ArrayList<Item>();

        items.add(item);
        itemsCopy.add(itemCopy);

        date = new Date();

        order = OrderFactory.createOrders(date.toString(), items);
        orderCopy = new Orders.Builder().copy(order).orderDate(date.toString()).item(itemsCopy).build();

        orders = new ArrayList<Orders>();
        ordersCopy = new ArrayList<Orders>();

        orders.add(order);
        ordersCopy.add(orderCopy);

        orderLine = OrderLineFactory.createOrderLine(orders);
        orderLineCopy = new OrderLine.Builder().copy(orderLine).order(ordersCopy).build();
    }


    @After
    public void tearDown(){
        item = itemCopy = null;
        items = itemsCopy = null;
        date = null;
        order = orderCopy = null;
        orderLine = orderLineCopy = null;
    }

    @Test
    public void testCreate()throws Exception{
        //testing date
        assertEquals(date.toString(), orderLine.getOrders().get(0).getOrderDate());

        //testing item
        assertEquals("Sausage", orderLine.getOrders().get(0).getItem().get(0).getName());
        assertEquals("images/image5.jpg", orderLine.getOrders().get(0).getItem().get(0).getImageLocation());
        assertEquals("this is sausage", orderLine.getOrders().get(0).getItem().get(0).getDescription());
        assertEquals(30.50, orderLine.getOrders().get(0).getItem().get(0).getPrice(), .0);
        assertEquals(1000, orderLine.getOrders().get(0).getItem().get(0).getQuantity());
    }

    @Test
    public void testUpdate() throws Exception
    {
        //testing date
        assertEquals(date.toString(), orderLineCopy.getOrders().get(0).getOrderDate());

        //testing item
        assertEquals("Sausage", orderLineCopy.getOrders().get(0).getItem().get(0).getName());
        assertEquals("images/image5.jpg", orderLineCopy.getOrders().get(0).getItem().get(0).getImageLocation());
        assertEquals("this is sausage", orderLineCopy.getOrders().get(0).getItem().get(0).getDescription());
        assertEquals(20.99, orderLineCopy.getOrders().get(0).getItem().get(0).getPrice(), .0);
        assertEquals(500, orderLineCopy.getOrders().get(0).getItem().get(0).getQuantity());
    }
}
