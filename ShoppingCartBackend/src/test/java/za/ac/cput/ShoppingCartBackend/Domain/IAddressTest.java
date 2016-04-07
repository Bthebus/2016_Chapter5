package za.ac.cput.ShoppingCartBackend.Domain;

import junit.framework.TestCase;
import org.junit.*;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-04-02
 */
public class IAddressTest extends TestCase {

    private IAddress address;

    @Before
    public void setUp() throws Exception
    {
        address = new IAddress() {
            @Override
            public String getHomeNumber() {
                return "7";
            }

            @Override
            public String getStreetName() {
                return "Peach Street";
            }

            @Override
            public String getCity() {
                return "Cape Town";
            }

            @Override
            public String getProvince() {
                return "Western Cape";
            }

            @Override
            public String getPostalCode() {
                return "7780";
            }
        };
    }

    @After
    public void tearDown() throws Exception
    {
        address = null;
    }

    @Test
    public void testGetHomeNumber() throws Exception
    {
        assertEquals("7", address.getHomeNumber());
    }

    @Test
    public void testGetStreetName() {
        assertEquals("Peach Street", address.getStreetName());
    }

    @Test
    public void testGetCity() {
        assertEquals("Cape Town", address.getCity());
    }

    @Test
    public void testGetProvince() {
        assertEquals("Western Cape", address.getProvince());
    }

    @Test
    public void testGetPostalCode() {
        assertEquals("7780", address.getPostalCode());
    }
}
