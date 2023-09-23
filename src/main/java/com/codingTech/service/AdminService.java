package com.codingTech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingTech.repository.AdminRepoInter;

@Service
public class AdminService implements AdminServiceInter {
	
	@Autowired
	AdminRepoInter adminRepo;

	public void deleteProduct(int id) {
		adminRepo.deleteProduct(id);
	}
}
