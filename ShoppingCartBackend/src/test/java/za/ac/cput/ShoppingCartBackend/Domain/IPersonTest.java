package za.ac.cput.ShoppingCartBackend.Domain;

import junit.framework.TestCase;
import org.junit.*;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-04-02
 */
public class IPersonTest extends TestCase {
    private IPerson person;

    @Before
    public void setUp() throws Exception
    {
        person = new IPerson() {
            @Override
            public String getName() {
                return "Braedy";
            }
            @Override
            public String getMiddleName() {
                return "Elwyn";
            }

            @Override
            public String getSurname() {
                return "Thebus";
            }
        };
    }

    @After
    public void tearDown() throws Exception
    {
        person = null;
    }

    @Test
    public void testGetName() throws Exception
    {
        assertEquals("Braedy", person.getName());
    }

    @Test
    public void testGetMiddleName() throws Exception
    {
        assertEquals("Elwyn", person.getMiddleName());
    }

    @Test
    public void testGetSurname() throws Exception
    {
        assertEquals("Thebus", person.getSurname());
    }

}
