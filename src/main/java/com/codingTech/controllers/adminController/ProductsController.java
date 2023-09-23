package com.codingTech.controllers.adminController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.codingTech.model.Categorie;
import com.codingTech.model.Produit;
import com.codingTech.service.AdminServiceInter;
import com.codingTech.service.InterUserService;

@Controller
@RequestMapping("/dashboard/products")
public class ProductsController {
	
	@Autowired
	InterUserService userService;
	
	@Autowired
	AdminServiceInter adminService;
	
	@GetMapping("")
	public String showProducts(
		@RequestParam(name = "title", required = false) Optional<String> optTitle,
		Model model) {
		List<Produit> products = userService.selectAllProducts();
		List<Categorie> categories = userService.selectAllCategories();
		
		model.addAttribute("categories", categories);
		
		if (optTitle.isPresent()) {
			String title = optTitle.get();

			List<Produit> filtredList = products.stream()
			.filter(
				product -> product.getTitre().toLowerCase()
				.contains(title.toLowerCase())
				).collect(Collectors.toList());
				model.addAttribute("products", filtredList);
				model.addAttribute("title", title);
		} else {
			model.addAttribute("products", products);
		}
			

		 return "/dashboard/products";
	}
	
	@GetMapping("/{category}")
	public String showProductsByCategry(@PathVariable String category, Model model) {
		List<Produit> products = userService.selectProductsByCategory(category);
		List<Categorie> categories = userService.selectAllCategories();
		
		model.addAttribute("categories", categories);
		model.addAttribute("products", products);

	 	return "/dashboard/products";
	}
	 
	 @GetMapping("/add")
	 public ModelAndView showAddProduct(Model model) {
		List<Categorie> categories = userService.selectAllCategories();
		
		model.addAttribute("categories", categories);
		return new ModelAndView("/dashboard/addProduct", "product", new Produit());
	 }
	 
	 @PostMapping("/add")
	 public String addProduct(@RequestParam Produit produit) {
		 System.out.println("POST_ADD: " + produit);
		 return "redirect:/products";
	 }
	 
	 @GetMapping("/edit/{id}")
	 public String showEditProuct(@PathVariable int id) {
		
		 return "";
	 }
	 
	 @PostMapping("/edit")
	 public String editProuct(@RequestBody final Produit produit) {
		 System.out.println(produit);
		 return "redirect:/products";
	 }
	 
	 @PostMapping("/delete")
	 public String deleteProuct(@RequestParam("delete_id") int id) {
		  adminService.deleteProduct(id);
		  return "redirect:/dashboard/products";
	 }
}
