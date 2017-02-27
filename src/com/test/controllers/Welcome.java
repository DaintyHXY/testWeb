package com.test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.models.User;

@Controller
public class Welcome {
	@RequestMapping(value = "/hello")
	public String printHello(Model m, User u) {
		m.addAttribute("message",u.getUsername()+"//"+u.getPwd());
		return "welcome";
	}
}