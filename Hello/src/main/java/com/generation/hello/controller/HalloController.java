package com.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persistencia")
public class HalloController {
@GetMapping
public String persistencia() {
	return "Mentalidade de persistĂȘncia para conseguir realizar a atividade";
}

}
