package com.demo.services.implementations;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

import com.demo.model.Produit;
import com.demo.repository.ProduitRepository;
import com.demo.services.ProduitService;

public class ProduitServiceImplement implements ProduitService {
	
	@Autowired
	ProduitRepository produitRepo;
	
	@Override
	public Produit createOneProduit(Produit produit) {
		return produitRepo.save(produit);
	}

	@Override
	public List<Produit> getAllProduits() {
		return produitRepo.findAll();
	}

	@Override
	public Produit getOneProduit(int id) {
		return produitRepo.findById(id).orElse(null); 
	}

	@Override
	public void deleteOneProduit(int id) {
		produitRepo.deleteById(id);
	}

	@Override
	public void deleteAllProduits() {
		produitRepo.deleteAll();
	}

	@Override
	public Optional<List<Produit>> findByNomContaining(String nom) {
		return produitRepo.findByDescriptionContaining(nom);
	}

	@Override
	public Optional<List<Produit>> findByDescriptionContaining(String description) {
		return produitRepo.findByDescriptionContaining(description);
	}

	@Override
	public Optional<List<Produit>> findByPrixBetween(double prixMin, double prixMax) {
		return produitRepo.findByPrixBetween(prixMin, prixMax);
	}

	@Override
	public Optional<List<Produit>> findByPrixLessThan(double prix) {
		return produitRepo.findByPrixLessThan(prix);
	}

	@Override
	public Optional<List<Produit>> findByPrixGreaterThan(double prix) {
		return produitRepo.findByPrixGreaterThan(prix);
	}

}
