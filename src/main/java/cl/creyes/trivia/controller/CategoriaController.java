package cl.creyes.trivia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {

	@GetMapping("/form")
	public String categoriaForm(@RequestParam String categoria) {
		System.out.println(categoria);
		return "preguntas";
	}
	
}
