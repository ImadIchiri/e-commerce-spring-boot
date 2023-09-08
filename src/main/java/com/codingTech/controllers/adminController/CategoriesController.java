package com.codingTech.controllers.adminController;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingTech.model.Categorie;

@Controller
@RequestMapping("/dashboard/categories")
public class CategoriesController {
	
	 @GetMapping("")
	 public String showCategories(@RequestParam(name = "category", required = false) Optional<String> category) {
		 
		 return "";
	 }
	 
	 @GetMapping("/edit/{id}")
	 public String editCategory(@PathVariable int id) {
		 
		 return "";
	 }
	 
	 @PostMapping("/edit")
	 public String editCategory(@PathVariable Categorie categorie) {
		 
		 return "redirect:/categories";
	 }
	 
	 @PostMapping("/delete")
	 public String deleteCategory(@RequestParam int id) {
		 
		 return "redirect:/categories";
	 }
	
}
