package com.rab3.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LoginController {
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public void login(){
		System.out.println("Login is me ");
		
	}
	

}
