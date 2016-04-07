package za.ac.cput.ShoppingCartBackend.Domain;

import junit.framework.TestCase;
import org.junit.*;
import za.ac.cput.ShoppingCartBackend.config.factory.EmployeeFactory;
import za.ac.cput.ShoppingCartBackend.config.factory.NameFactory;
import za.ac.cput.ShoppingCartBackend.config.factory.UserFactory;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-04-02
 */
public class EmployeeTest extends TestCase {

    private User user, userCopy;
    private Name name, nameCopy;
    private Employee employee, employeeCopy;

    @Before
    public void setUp(){
        //creating employee
        user = UserFactory.createUser("Bob122", "789ppl4");
        name = NameFactory.createName("Sue", "Jean", "White");
        employee = EmployeeFactory.createEmployee(name, user);

        //creating employeeCopy
        //employee only wants password to be changed
        userCopy = new User.Builder().copy(user).password("787pp14").build();
        //Employee Surname changes
        nameCopy = new Name.Builder().copy(name).surname("Frittz").build();
        employeeCopy = new Employee.Builder().copy(employee).name(nameCopy).user(userCopy).build();
    }

    @After
    public void tearDown(){

        user = userCopy = null;
        name = nameCopy = null;
        employee = employeeCopy = null;
    }

    @Test
    public void testCreate()throws Exception{
        //testing name
        assertEquals("Sue", employee.getName().getName());
        assertEquals("Jean", employee.getName().getMiddleName());
        assertEquals("White", employee.getName().getSurname());

        //testing user info
        assertEquals("Bob122", employee.getUser().getUsername());
        assertEquals("789ppl4", employee.getUser().getPassword());
    }

    @Test
    public void testUpdate() throws Exception
    {
        //testing name update
        assertEquals("Sue", employeeCopy.getName().getName());
        assertEquals("Jean", employeeCopy.getName().getMiddleName());
        assertEquals("Frittz", employeeCopy.getName().getSurname());

        //testing user info update
        assertEquals("Bob122", employeeCopy.getUser().getUsername());
        assertEquals("787pp14", employeeCopy.getUser().getPassword());
    }
}
