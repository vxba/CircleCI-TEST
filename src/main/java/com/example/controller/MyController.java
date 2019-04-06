package com.example.controller;

import org.springframework.stereotype.Controller;

public class MyController {
	
	
	public String hello(String name) {
		return "Hello " + name;
	}

}
