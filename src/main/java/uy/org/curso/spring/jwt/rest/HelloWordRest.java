package uy.org.curso.spring.jwt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordRest {

	@GetMapping(value = "/hello", produces = MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<String> sayHello(){
		return new ResponseEntity<>("Hola Mundo", HttpStatus.OK);
	}
}
