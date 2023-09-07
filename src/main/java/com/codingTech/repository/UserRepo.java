package com.codingTech.repository;

import com.codingTech.model.Categorie;
import com.codingTech.model.Produit;
import com.codingTech.model.Role;
import com.codingTech.model.User;

import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class UserRepo {
	
	@PersistenceContext
	EntityManager em;
	
	public Optional<User> userLogin(String email, String password) {
		Query query = em.createQuery("FROM User WHERE where email = :email AND password = :password");
		query.setParameter("email", email);
		query.setParameter("password", password);
		
		Optional<User> optUser =(Optional<User>) query.getSingleResult();
		
		
		return optUser;
	}
	
	public static Optional<Role> getRoleById(int id) {
		return null;
	}
	
	public static Optional<User> getUserById(int id) {
		return null;
	}
	
	public static Optional<Categorie> getCategorieById(int id) {
		return null;
	}
	
	public static Optional<Categorie> getCategorieByName(String categorieName) {
		return null;
	}
	
	public static List<Categorie> getAllCategories() {
		return null;
	}
	
	public static List<Produit> getAllProducts() {
		return null;
	}

	public static List<Produit> getProductsByCategorie(String categorieName) {
		return null;
	}
	
	public static List<Produit> getProductsByName(String productName) {
		return null;
	}
}
