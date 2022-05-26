package cl.creyes.trivia.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.creyes.trivia.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/home")
	public String inicio(Principal principal,Model model) {
		model.addAttribute("name",userService.findByEmail(principal.getName()).getUsername());
		return "home";
	}
}
