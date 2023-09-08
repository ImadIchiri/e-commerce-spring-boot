package com.codingTech.controllers.adminController;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingTech.model.Produit;

@Controller
@RequestMapping("/dashboard/products")
public class ProductsController {
	
	
	
	@GetMapping("") // Filter By Title '?title=ABABABABA'
	public String showProucts(@RequestParam(name = "title", required = false) Optional<String> title) {
		System.out.println("products.jsp");
		return "/dashboard/products";
	}
	
	@GetMapping("/{category}")
	public String showProductsByCategry(@PathVariable String category) {
	 
	 return "";
	}
	 
	 @GetMapping("/add")
	 public String showAddProuct() {
		 
		 return "";
	 }
	 
	 @PostMapping("/add")
	 public String addProuct(@RequestParam Produit produit) {
		 
		 return "redirect:/products";
	 }
	 
	 @GetMapping("/edit/{id}")
	 public String showEditProuct(@PathVariable int id) {
		 
		 return "";
	 }
	 
	 @PostMapping("/edit")
	 public String editProuct(@RequestParam Produit produit) {
		 
		 return "redirect:/products";
	 }
	 
	 @PostMapping("/delete")
	 public String deleteProuct(@RequestParam int id) {
		 
		 return "redirect:/products";
	 }
}
