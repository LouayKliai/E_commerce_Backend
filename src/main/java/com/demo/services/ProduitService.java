package com.demo.services;

import java.util.List;
import java.util.Optional;

import com.demo.model.Produit;

public interface ProduitService {
	public Produit createOneProduit(Produit produit);
	public List<Produit> getAllProduits();
	public Produit getOneProduit(int id);
	public void deleteOneProduit(int id);
	public void deleteAllProduits();
	Optional<List<Produit>>  findByNomContaining(String nom);
	Optional<List<Produit>>  findByDescriptionContaining(String description);
	Optional<List<Produit>>  findByPrixBetween(double prixMin,double prixMax);
	Optional<List<Produit>>  findByPrixLessThan(double prix);
	Optional<List<Produit>>  findByPrixGreaterThan(double prix);


}
