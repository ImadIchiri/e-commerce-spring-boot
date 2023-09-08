package com.codingTech.service;

import java.util.Optional;

import com.codingTech.model.LignePanier;
import com.codingTech.model.Panier;
import com.codingTech.model.Produit;

public interface interClientService {
	public Optional<LignePanier> addProductToPanier(Panier panier, Produit produit, int quantite) ;
	public void removeProduitFromPanier(int idlLignePanier);

}
