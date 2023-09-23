package com.codingTech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingTech.model.Categorie;
import com.codingTech.model.Produit;
import com.codingTech.model.Role;
import com.codingTech.model.User;
import com.codingTech.repository.InterUserRepo;

@Service
public class UserService implements InterUserService{
	@Autowired
	InterUserRepo repo;
	
	@Override
	public Optional<User> userLogIn(String email, String password) {
		return repo.userLogin(email, password);
	}

	@Override
	public Optional<Role> selectRoleById(int id) {
		return repo.getRoleById(id);
	}

	@Override
	public Optional<User> selectUserById(int id) {
		return repo.getUserById(id);
	}

	@Override
	public Optional<Categorie> selectCategoryById(int id) {
		return repo.getCategorieById(id);
	}

	@Override
	public Optional<Categorie> selectCategoryByName(String categorieName) {
		return repo.getCategorieByName(categorieName);
	}

	@Override
	public List<Categorie> selectAllCategories() {
		return repo.getAllCategories();
	}

	@Override
	public List<Produit> selectAllProducts() {
		return repo.getAllProducts();
	}

	@Override
	public List<Produit> selectProductsByCategory(String categorieName) {
		return repo.getProductsByCategorie(categorieName);
	}

	@Override
	public List<Produit> selectProductsByName(String productName) {
		return repo.getProductsByName(productName);
	}
	

}
