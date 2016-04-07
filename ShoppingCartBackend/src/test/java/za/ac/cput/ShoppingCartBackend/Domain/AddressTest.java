package za.ac.cput.ShoppingCartBackend.Domain;

import junit.framework.TestCase;
import org.junit.*;
import za.ac.cput.ShoppingCartBackend.config.factory.AddressFactory;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-04-02
 */
public class AddressTest extends TestCase{

    private Address address, addressCopy;

    @Before
    public void setUp(){
        address = AddressFactory.createAddress("7", "Line Road", "cape town", "western cape", "7732");
        addressCopy = new Address.Builder().copy(address).homeNumber("3").streetName("Hoek").city("Joburg").province("Gauteng").postalCode("9785").build();

    }

    @After
    public void tearDown(){
        address = null;
        addressCopy = null;
    }

    @Test
    public void testCreate()throws Exception{
        assertEquals("7", address.getHomeNumber());
        assertEquals("Line Road", address.getStreetName());
        assertEquals("cape town", address.getCity());
        assertEquals("western cape", address.getProvince());
        assertEquals("7732", address.getPostalCode());
    }

    @Test
    public void testUpdate() throws Exception
    {
        assertEquals("3", addressCopy.getHomeNumber());
        assertEquals("Hoek", addressCopy.getStreetName());
        assertEquals("Joburg", addressCopy.getCity());
        assertEquals("Gauteng", addressCopy.getProvince());
        assertEquals("9785", addressCopy.getPostalCode());
    }
}
