package com.et.portal.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.et.portal.model.ETUserModel;
import com.et.portal.service.UserService;

@Controller
@Scope("session")
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping("/register")
	public ModelAndView registerForm() {
		return new ModelAndView("register", "user",new ETUserModel());
	}
	
	@PostMapping("/register")
	public ModelAndView registerUser(@ModelAttribute("user") @Valid ETUserModel user,BindingResult validResult) {
		
		ModelAndView mv=null;
		
		if(validResult.hasErrors())
			mv = new ModelAndView("register", "user",user);
		else {
			user = service.register(user);
			mv = new ModelAndView("redirect:/home");
		}
		
		return mv;
	}
	
	@PostMapping("/login")
	public ModelAndView login(@RequestParam("eid") String email,@RequestParam("pwd") String password) {
		ModelAndView mv = null;
		
		if(service.login(email, password)) {
			mv = new ModelAndView("userDashboard","currentUser",service.getCurrentUser());
		}else {
			mv = new ModelAndView("index","errMsg","Access Denied!");
		}
		
		return mv;
	}
}
