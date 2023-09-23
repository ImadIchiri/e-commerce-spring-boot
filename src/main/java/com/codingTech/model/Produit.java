package com.codingTech.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String titre;
	private double prix;
	@Column(name = "quantiteDispo")
	private int quantityDispo;
	@Column(name = "image")
	private String imageName;
	@ManyToOne(fetch = FetchType.EAGER)
	private Categorie categorie;
	
	public Produit() {}
	
	public Produit(String titre, double prix, int quantityDispo, String imageName, Categorie categorie) {
		this.titre = titre;
		this.prix = prix;
		this.quantityDispo = quantityDispo;
		this.imageName = imageName;
		this.categorie = categorie;
	}
	
	public Produit(int id, String titre, double prix, int quantityDispo, String imageName, Categorie categorie) {
		this.id = id;
		this.titre = titre;
		this.prix = prix;
		this.quantityDispo = quantityDispo;
		this.imageName = imageName;
		this.categorie = categorie;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getQuantityDispo() {
		return quantityDispo;
	}

	public void setQuantityDispo(int quantityDispo) {
		this.quantityDispo = quantityDispo;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", titre=" + titre + ", prix=" + prix + ", quantityDispo=" + quantityDispo
				+ ", imageName=" + imageName + ", categorie=" + categorie + "]";
	}
}