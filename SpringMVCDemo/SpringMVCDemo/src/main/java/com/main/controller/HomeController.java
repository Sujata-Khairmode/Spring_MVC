package com.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.main.entity.User;

@Controller
public class HomeController {
	
	@ModelAttribute
	public User setUpUserForm() {
		return new User();
	}
	
	@GetMapping("/")
	public String home(Model model) {
		return "home";
	}
	
	@GetMapping("/userform")
	public String UserForm( Model model) {
		return "/userform";
	}
	
	@PostMapping("/submit")
	public String submitform(@ModelAttribute User user, Model model) {
		model.addAttribute("message","Your response submitted Successfully...");
		model.addAttribute("user",user);
		return "home";
	}
	
	

}
