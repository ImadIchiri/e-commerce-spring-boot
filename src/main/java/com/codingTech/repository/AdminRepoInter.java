package com.codingTech.repository;

import com.codingTech.model.Categorie;

public interface AdminRepoInter {
	
    public void addCategory(Categorie categorie);
    public  void updateCategory(Categorie categorie);
    public  void deleteProduct(int productId);
}
