package com.cloud.dbservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbController {

	@GetMapping("/hi")
	public String sayhi() {
		return "Hello World";
	}
}
