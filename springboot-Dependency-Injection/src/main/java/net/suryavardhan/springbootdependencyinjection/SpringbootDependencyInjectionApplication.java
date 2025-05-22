package net.suryavardhan.springbootdependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import net.suryavardhan.springbootdependencyinjection.model.Employee;

@SpringBootApplication
public class SpringbootDependencyInjectionApplication implements CommandLineRunner{
	@Autowired
    private ApplicationContext applicationContext;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDependencyInjectionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Retrieve the Employee bean from the application context
        Employee employee = applicationContext.getBean(Employee.class);

        // Display Employee and Department info
        employee.displayEmployeeInfo();
    }
}