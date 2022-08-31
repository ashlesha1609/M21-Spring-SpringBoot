package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Responce;
@RestController
public class AnimalController 
{
	@GetMapping(path="/animal",produces="application/txt")
	public ResponseEntity<Responce>getAnimalDetails()
	{
		Responce r=new Responce();
		r.setData("LION");
		r.setResponsecode(15);
		r.setStatus("Success");
		return new ResponseEntity<>(r,HttpStatus.OK);
	}

}
