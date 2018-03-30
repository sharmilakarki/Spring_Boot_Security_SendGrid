package com.sharmila.karki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestController {

	@GetMapping("/index")
	public String getIndex(){
		return "home";
	}
	
	@GetMapping("/error")
	public String getErrorPage(){
		return "error";
	}
}
