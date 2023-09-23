package com.codingTech.repository;

import java.util.List;
import java.util.Optional;

import com.codingTech.model.Categorie;
import com.codingTech.model.Produit;
import com.codingTech.model.Role;
import com.codingTech.model.User;

public interface InterUserRepo {
	
	public Optional<User> userLogin(String email, String password);

	public Optional<Role> getRoleById(int id);

	public Optional<User> getUserById(int id);

	public Optional<Categorie> getCategorieById(int id);

	public Optional<Categorie> getCategorieByName(String categorieName);

	public List<Categorie> getAllCategories();

	public List<Produit> getAllProducts();
	
	public List<Produit> getProductsByCategorie(String categorieName);
	
	public List<Produit> getProductsByName(String productName);

}
