package za.ac.cput.ShoppingCartBackend.config.factory;

import za.ac.cput.ShoppingCartBackend.Domain.Employee;
import za.ac.cput.ShoppingCartBackend.Domain.Name;
import za.ac.cput.ShoppingCartBackend.Domain.User;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-04-03
 */
public class EmployeeFactory {
    public static Employee createEmployee(Name name, User user){
        Employee employee = new Employee.Builder().name(name).user(user).build();
        return  employee;
    }
}
