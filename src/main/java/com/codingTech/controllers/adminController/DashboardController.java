package com.codingTech.controllers.adminController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {
	
	 @GetMapping("")
	 public String showDashboard() {
		 
		 return "";
	 }	
}