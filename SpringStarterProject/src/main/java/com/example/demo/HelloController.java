package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
	@RequestMapping("/M21")
	public String display()
	{
		return "Wecome to M21 Batch";
	}

}
