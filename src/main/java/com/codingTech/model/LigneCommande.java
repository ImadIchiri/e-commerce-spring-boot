package com.codingTech.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class LigneCommande {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	private Commande commande;
	@OneToOne
	private Produit produit;
	private int quantite;
	
	public LigneCommande() {}
	
	public LigneCommande(Commande commande, Produit produit, int quantite) {
		this.commande = commande;
		this.produit = produit;
		this.quantite = quantite;
	}
	
	public LigneCommande(int id, Commande commande, Produit produit, int quantite) {
		this.id = id;
		this.commande = commande;
		this.produit = produit;
		this.quantite = quantite;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	
	
}
