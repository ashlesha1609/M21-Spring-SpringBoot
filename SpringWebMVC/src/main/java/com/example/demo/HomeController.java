
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  // request and response
public class HomeController 
{
	@RequestMapping("/Home")
	public String Home()
	{
		System.out.println("Hey Guys! welcome to java Full Stack Program");
		return "home.jsp";
	}

}


//