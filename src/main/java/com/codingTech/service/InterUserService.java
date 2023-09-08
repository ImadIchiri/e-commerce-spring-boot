package com.codingTech.service;

import java.util.List;
import java.util.Optional;

import com.codingTech.model.Categorie;
import com.codingTech.model.Produit;
import com.codingTech.model.Role;
import com.codingTech.model.User;

public interface InterUserService {

	public Optional<User> userLogIn(String email, String password);
	public Optional<Role> selectRoleById(int id);
	public Optional<User> selectUserById(int id);
	public Optional<Categorie> selectCategoryById(int id);
	public Optional<Categorie> selectCategoryByName(String categorieName);
	public List<Categorie> selectAllCategories();
	public List<Produit> selectAllProducts();
	public List<Produit> selectProductsByCategory(String categorieName);
	public List<Produit> selectProductsByName(String productName);
	
}




