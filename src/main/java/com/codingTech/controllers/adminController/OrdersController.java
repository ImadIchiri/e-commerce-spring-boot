package com.codingTech.controllers.adminController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/dashboard/orders")
public class OrdersController {
	
	@GetMapping("")
	public String showOrders() {
		
		return "";
	}
	
	@PostMapping("/delete")
	public String deleteOrder(@RequestParam int id) {
		
		return "";
	}
}
