package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstDemoController {

	@RequestMapping(method = RequestMethod.GET, path = "/msg")
	public String message() {
		return "This is Vaibhav";
	}
}
