package za.ac.cput.ShoppingCartBackend.Domain;

import junit.framework.TestCase;
import org.junit.*;
import za.ac.cput.ShoppingCartBackend.config.factory.ContactFactory;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-04-02
 */
public class ContactTest extends TestCase {
    private Contact contact, contactCopy;

    @Before
    public void setUp(){
        contact = ContactFactory.createContact("bthebus2@gmail.com","0213456789", "0831234567");
        contactCopy = new Contact.Builder().copy(contact).email("213039168@mycput.ac.za").telephone("0213135555").cellphone("0823123132").build();
    }

    @After
    public void tearDown() throws Exception{
        contact = null;
        contactCopy = null;
    }

    @Test
    public void testCreate()throws Exception{
        assertEquals("bthebus2@gmail.com", contact.getEmail());
        assertEquals("0213456789", contact.getTelephone());
        assertEquals("0831234567", contact.getCellPhone());
    }

    @Test
    public void testUpdate() throws Exception
    {
        assertEquals("213039168@mycput.ac.za", contactCopy.getEmail());
        assertEquals("0213135555", contactCopy.getTelephone());
        assertEquals("0823123132", contactCopy.getCellPhone());
    }
}
