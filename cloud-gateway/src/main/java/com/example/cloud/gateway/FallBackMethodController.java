package com.example.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
	
	@GetMapping("/userServiceFallBack")
	public String userServiceFallbackMethod() {		
		return "user service is down";
	}
	
	@GetMapping("/departmentServiceFallBack")
	public String departmentServiceFallbackMethod() {		
		return "department service is down";
	}

}
