package com.guilherme.deploy_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeployController {
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("/segundo-metodo")
	public String segundoMetodo() {
		return "Segundo método!";
	}
	
	@GetMapping("/terceiro-metodo")
	public String terceiroMetodo() {
		return "Terceiro método!";
	}	
}
