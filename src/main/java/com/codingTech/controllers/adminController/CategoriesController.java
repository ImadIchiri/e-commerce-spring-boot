package com.codingTech.controllers.adminController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingTech.model.Categorie;
import com.codingTech.service.UserService;

@Controller
@RequestMapping("/dashboard/categories")
public class CategoriesController {

	@Autowired
	UserService userService;
	
	 @GetMapping("")
	 public String showCategories(@RequestParam(name = "category", required = false) Optional<String> category, Model model) {
		List<Categorie> categories = userService.selectAllCategories();
		 
		model.addAttribute("categories", categories);
		return "dashboard/categories";
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
