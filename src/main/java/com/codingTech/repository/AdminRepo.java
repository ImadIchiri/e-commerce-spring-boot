package com.codingTech.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.Embeddable;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Transient;

import org.springframework.stereotype.Repository;

import com.codingTech.model.Categorie;
import com.codingTech.model.Commande;
import com.codingTech.model.Produit;

@Repository
public class AdminRepo {
	
	@PersistenceContext
	EntityManager em;
	
	// Méthode pour ajouter une nouvelle catégorie
    public void addCategory(Categorie categorie) {
    	em.persist(categorie);
		em.close();

    }
    
    // Méthode pour mettre à jour une catégorie
    public  void updateCategory(Categorie categorie) {
    	em.merge(categorie);
		em.close();

    }
    
    // Méthode pour supprimer une catégorie
    public  void deleteCategory(int categoryId) {
    	Categorie categoryToDelete = em.find(Categorie.class, categoryId);
    	em.remove(categoryToDelete);
		em.close();

    	
    }

    //Méthode pour ajouter un produit
    public  void addProduct(Produit produit) {
    	em.persist(produit);
		em.close();

    }

    // Méthode pour mettre à jour un produit
    public  void updateProduct(Produit produit) {
    	em.merge(produit);
		em.close();

    }

    // Méthode pour supprimer un produit
    public  void deleteProduct(int productId) {
    	Produit produitToDelete = em.find(Produit.class, productId);
    	em.remove(produitToDelete);
		em.close();

    }

    // Méthode pour mettre à jour la quantité d'un produit
    
    public  void decreaseQuantity(Produit produit, int quantity) {
    	// Check If The 'QuantityDispo > quantity'
    	if (produit.getQuantityDispo() < quantity) return;
    	
    	produit.setQuantityDispo(produit.getQuantityDispo() - quantity);	
    	em.merge(produit);
		em.close();

    }

    // Méthode pour recevoire un produit par son ID
    public  Optional<Produit> getProductById(int productId) {
    	Produit produitById =  em.find(Produit.class,productId);
		em.close();
    	return Optional.ofNullable(produitById);
    }

    // Méthode pour récupérer la liste des commandes passées par les utilisateurs (simplifié ici)
    public  List<Commande> getAllOrders() {
    	List<Commande> listCommande = em.createQuery("from commande").getResultList();
		em.close();
    	return listCommande;
    }

    // Méthode pour selectionner le dérnier Produit inseré (Sans Image)
    public  Optional<Produit> getProductToSetImage() {
    	
    	
    	return Optional.ofNullable(new Produit());
    }
}
