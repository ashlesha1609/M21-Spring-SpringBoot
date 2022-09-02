package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringStartApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringStartApplication.class, args);
		//String str="Welcome to Spring REST";
		//System.out.println(str);
		//Employee e=new Employee();//calling default constructor
		//USING  STRING IOC
		Employee e=context.getBean(Employee.class);
		e.print();
	}

}
