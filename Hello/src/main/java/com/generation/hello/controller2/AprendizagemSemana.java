package com.generation.hello.controller2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/desafio")

public class AprendizagemSemana {


@GetMapping
public String desafio() {
	return "Irá ser um desafio aprender SpringBoot, mas estou pronto para esse desafio";
}

}