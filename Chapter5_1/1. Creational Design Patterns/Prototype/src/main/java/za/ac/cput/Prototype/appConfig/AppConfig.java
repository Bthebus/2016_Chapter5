package za.ac.cput.Prototype.appConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.Prototype.impl.Customer;
import za.ac.cput.Prototype.impl.Employee;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-27
 */
@Configuration
public class AppConfig {
    @Bean(name="Employee")
    public Employee getEmployee()
    {
        return new Employee("Braedy", "Thebus", "9212100558066", "3Fcp#5", 11);
    }

    @Bean(name="Customer")
    public Customer getCustomer()
    {
        return new Customer("John", "Smith", "084 384 5615", 26, "10/12/1988", 15);
    }
}
