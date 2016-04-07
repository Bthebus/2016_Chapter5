package za.ac.cput.ShoppingCartBackend.Domain;

import junit.framework.TestCase;
import org.junit.*;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-04-02
 */
public class IContactTest extends TestCase {

    private IContact contact;

    @Before
    public void setUp() throws Exception
    {
        contact = new IContact() {
            @Override
            public String getEmail() {
                return "bthebus2@gmail.com";
            }

            @Override
            public String getTelephone() {
                return "0211234567";
            }

            @Override
            public String getCellPhone() {
                return "0841234567";
            }
        };
    }

    @After
    public void tearDown() throws Exception {
        contact = null;
    }

    @Test
    public void testGetEmail() throws Exception {
        assertEquals("bthebus2@gmail.com", contact.getEmail());
    }

    @Test
    public void testGetTelephone() throws Exception
    {
        assertEquals("0211234567", contact.getTelephone());
    }

    @Test
    public void testGetCellphone() throws Exception
    {
        assertEquals("0841234567", contact.getCellPhone());
    }
}
