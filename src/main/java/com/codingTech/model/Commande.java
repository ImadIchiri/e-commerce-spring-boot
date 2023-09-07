package com.codingTech.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class Commande {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String dateCommande;
	@ManyToOne
	private User user;
	@Transient
	private List<Produit> listProduits;
	
	public Commande() {}
	
	public Commande(String dateCommande, User user, List<Produit> listProduits) {
		super();
		this.dateCommande = dateCommande;
		this.user = user;
		this.listProduits = listProduits;
	}



	public Commande(int id, String dateCommande, User user, List<Produit> listProduits) {
		super();
		this.id = id;
		this.dateCommande = dateCommande;
		this.user = user;
		this.listProduits = listProduits;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getDateCommande() {
		return dateCommande;
	}
	public void setDateCommande(String dateCommande) {
		this.dateCommande = dateCommande;
	}

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	public List<Produit> getListProduits() {
		return listProduits;
	}

	public void setListProduits(List<Produit> listProduits) {
		this.listProduits = listProduits;
	}
}