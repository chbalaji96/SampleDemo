package com.example.demoSample.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@GetMapping("Hello")
	public String Employee() {
		return "Hello World";
	}
	}


