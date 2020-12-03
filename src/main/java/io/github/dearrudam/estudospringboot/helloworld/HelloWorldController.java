package io.github.dearrudam.estudospringboot.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	// GET/POST/PUT/DELETE/HEAD/PATCH/
	
	//  -> GET / POST / DELETE/ PUT 
	@GetMapping( "/hello")
	public String hello(
			String nome
			) {
		return "Hello world!";
	}
	
	
}
