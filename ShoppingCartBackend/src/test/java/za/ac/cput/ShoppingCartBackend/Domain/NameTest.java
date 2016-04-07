package za.ac.cput.ShoppingCartBackend.Domain;

import junit.framework.TestCase;
import org.junit.*;
import za.ac.cput.ShoppingCartBackend.config.factory.NameFactory;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-04-02
 */
public class NameTest extends TestCase{

    private Name name, nameCopy;

    @Before
    public void setUp() throws Exception{
        name = NameFactory.createName("Braedy", "Elwyn", "Thebus");
        nameCopy = new Name.Builder().copy(name).name("Bob").middleName("Elwyn").surname("Thebus").build();
    }

    @After
    public void tearDown()throws Exception{
        name = null;
        nameCopy = null;
    }

    @Test
    public void testCreate() throws Exception
    {
        assertEquals("Braedy", name.getName());
        assertEquals("Elwyn", name.getMiddleName());
        assertEquals("Thebus", name.getSurname());
    }

    @Test
    public void testUpdate() throws Exception{
        assertEquals("Bob", nameCopy.getName());
        assertEquals("Elwyn", nameCopy.getMiddleName());
        assertEquals("Thebus", nameCopy.getSurname());
    }
}
