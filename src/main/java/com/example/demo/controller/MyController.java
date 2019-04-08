package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping(value = "/hello/{name}")
	public String hello(@PathVariable("name") String name) {
		return "Hello " + name;
	}
	
	@RequestMapping(value="/demo1")
	public String demo01() {
		return "Demo1";
	}

}
