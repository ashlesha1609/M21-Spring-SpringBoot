package com.cg.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) 
	{
		/*Agenda
		//1.We should not touch the source code
		//2.This Application should be configurable.
		//Hard-Coding  
		
		//for vi class method
		Vi a=new Vi();
		a.calling();
		a.data();
		
		//for Jio class method
		Jio a1=new Jio();
		a1.calling();
		a1.data(); */
		
		@SuppressWarnings("resource")
		ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
		System.out.println("Config loaded....");
		/*Airtel ai = (Airtel)a.getBean("Airtel");
		ai.calling();
		ai.data();*/
		
		/*Jio j = (Jio)a.getBean("Jio");
		j.calling();
		j.data();*/
		
		Sim s = a.getBean("sim",Sim.class);
		s.calling();
		s.data();
		
		Sim s1 = a.getBean("sim1",Sim.class);
		s1.calling();
		s1.data();

	}

}
