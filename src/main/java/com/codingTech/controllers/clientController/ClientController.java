package com.codingTech.controllers.clientController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.codingTech.model.Produit;
import com.codingTech.service.InterUserService;

@Controller
public class ClientController {
	@Autowired
	InterUserService service;
	// Home Page
	// show all products
	
	@GetMapping("/Produits")
	public String afficherProduits(Model model)
	{
		List<Produit> listP = service.selectAllProducts();
		model.addAttribute("listProduits", listP);
		return "Store";
	}
	
	
	
	
	
	
	
	
	
	// Panier (POST & GET)
	
	
	
	//
	
}
