package com.codingTech.repository;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.codingTech.model.Commande;
import com.codingTech.model.Produit;
import com.codingTech.model.User;

@Repository
public class ClientRepo {
	
	@PersistenceContext
	EntityManager em;
	
	public  Produit getProductById(int productId) {
		Produit produitById = em.find(Produit.class,productId);
		return produitById;
	}
	
	
	
	public static void addCommande(int idProduit, int quantite, User user, String dateCommande) {
		
		
	}
	
	public static Optional<Commande> createCommande(User user, String dateCommande) {
		
		
		return Optional.ofNullable(new Commande());
	}

	public static int createLigneCommande(Commande commande, Produit produit, int quantite) {
		return 0;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	

}

