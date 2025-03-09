package com.myProject.api;

import com.myProject.api.model.Employee;
import com.myProject.api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication implements CommandLineRunner {
	@Autowired
	EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Iterable<Employee> employees= employeeService.getEmployees();
		System.out.println("debut de la boucle for");
		for (Employee employee: employees) {
			System.out.println(employee);
		}
		System.out.println("fin de la boucle for");
	}
}
