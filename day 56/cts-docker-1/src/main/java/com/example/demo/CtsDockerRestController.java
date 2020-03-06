package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CtsDockerRestController {

	@GetMapping("/hello")
	public String show() {
		return "good";
	}
}
