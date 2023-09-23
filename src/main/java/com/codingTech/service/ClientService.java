package com.codingTech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingTech.model.LignePanier;
import com.codingTech.model.Panier;
import com.codingTech.model.Produit;

@Service
public class ClientService implements interClientService{
	@Autowired
	interClientService service;
	
	public Optional<LignePanier> addProductToPanier(Panier panier, Produit produit, int quantite) {
		LignePanier lPanier = null;
		if (produit.getQuantityDispo() >= quantite) {
			lPanier = new LignePanier(produit, panier, quantite);
		}
	
		return Optional.ofNullable(lPanier);
	}
	
	public void removeProduitFromPanier(int idLignePanier) {
	    List<LignePanier> listLignePanier = Panier.getListLignePanier();

	    listLignePanier.removeIf(ligne -> ligne.getId() == idLignePanier);
	}
	
}
