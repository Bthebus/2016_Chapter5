package za.ac.cput.ShoppingCartBackend.Domain;

import junit.framework.TestCase;
import org.junit.*;
import za.ac.cput.ShoppingCartBackend.config.factory.UserFactory;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-04-02
 */
public class UserTest extends TestCase{

    private User user, userCopy;

    @Before
    public void setUp(){

        user = UserFactory.createUser("Tom12", "tom12A!");
        userCopy = new User.Builder().copy(user).username("Tommy12").password("7p8l5k!").build();
    }

    @After
    public void tearDown(){
        user = userCopy = null;
    }

    @Test
    public void testCreate()throws Exception{
        assertEquals("Tom12", user.getUsername());
        assertEquals("tom12A!", user.getPassword());
    }

    @Test
    public void testUpdate() throws Exception
    {
        assertEquals("Tommy12", userCopy.getUsername());
        assertEquals("7p8l5k!", userCopy.getPassword());
    }
}
