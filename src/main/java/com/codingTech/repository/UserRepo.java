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

import org.springframework.stereotype.Repository;

@Repository
public class UserRepo {
	
	@PersistenceContext

	EntityManager em;
	
	public Optional<User> userLogin(String email, String password) {
		Query query = em.createQuery("FROM User WHERE where email = :email AND password = :password");
		query.setParameter("email", email);
		query.setParameter("password", password);	
		Optional<User> optUser =(Optional<User>) query.getSingleResult();
		em.close();
		return optUser;
	}
	
	public Optional<Role> getRoleById(int id) {
		
		Role r = null;
		r= em.find(Role.class, id);
		em.close();
		return Optional.ofNullable(r);
	}
	
	public Optional<User> getUserById(int id) {
		User u = null;
		u = em.find(User.class, id);
		em.close();
		return Optional.ofNullable(u);
	}
	
	public Optional<Categorie> getCategorieById(int id) {
		Categorie c = null;
		c = em.find(Categorie.class, id);
		em.close();
		return Optional.ofNullable(c);
	}
	
	public Optional<Categorie> getCategorieByName(String categorieName) {
		Query q = em.createQuery("select c from Categorie c where c.categorie = :categorieNom");
		q.setParameter("categorieNom", categorieName);
		Categorie categorie = (Categorie) q.getSingleResult();
		em.close();
		return Optional.ofNullable(categorie);
	}
	
	public List<Categorie> getAllCategories() {
		Query q = em.createQuery("from Categorie");
		List <Categorie> listC = q.getResultList();
		em.close();
		return listC;
	}
	
	public List<Produit> getAllProducts() {
		Query q = em.createQuery("from Produit");
		List <Produit> listP = q.getResultList();
		em.close();
		return listP;
	}

	public List<Produit> getProductsByCategorie(String categorieName) {
		Query q = em.createQuery("select p from Produit p where p.categorie = :produitCategorie");
		q.setParameter("produitCategorie", categorieName);
		List<Produit> ListP = q.getResultList();

		em.close();
		return ListP;
	}
	
	public List<Produit> getProductsByName(String productName) {
		Query q = em.createQuery("select p from Produit p where p.nom = :produitNom");
		q.setParameter("produitNom", productName);
		List<Produit> ListP = q.getResultList();

		em.close();
		return ListP;
	}
}
