package com.slokam.sec;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("hello")
	@PreAuthorize("hasRole('se')")
	public String hello() {
		return "Hello Hi How are you?";
	}
	
	@PreAuthorize("hasRole('hr')")
	@GetMapping("test1")
	public String test1() {
		return "Test1";
	}
	@PreAuthorize("hasRole('tester')")
	@GetMapping("test2")
	public String test2() {
		return "Test2";
	}
}
