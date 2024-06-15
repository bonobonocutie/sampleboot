package com.exam.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	private Logger logger = LoggerFactory.getLogger(getClass());

	// login 요청 - 협력자
	@GetMapping(value={"/login"})
	public String showHomePage() {
		return "loginForm";
	}
	
	@PostMapping(value={"/login_fail"})
	public String showlogin_failPage() {
		return "redirect:login";
	}
	
	@GetMapping(value={"/login_success"})
	public String showlogin_successPage() {
		return "redirect:home";
	}
}
