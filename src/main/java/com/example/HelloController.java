package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;

@Controller("/hello")
public class HelloController {

	@Get
	@Secured(SecurityRule.IS_ANONYMOUS)
	public String sayHello() {
		return "Hello World!";
	}
}
