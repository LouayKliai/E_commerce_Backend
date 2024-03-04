package com.demo.controller;

import java.util.List; 

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.model.Produit;
import com.demo.services.ProduitService;

@RestController
@RequestMapping("/produits")
public class ProduitController {
	private final  ProduitService produitService;
	public ProduitController(ProduitService produitService) {
		this.produitService=produitService;
	}
	

	@DeleteMapping("{id}")
	public void deleteProduit(@PathVariable("id") int id) {
		produitService.deleteOneProduit(id);
	}
	
	@DeleteMapping
	public void deleteAll() {
		produitService.deleteAllProduits();
		
	}
	
	@GetMapping("{id}")
	public Produit getProduit(@PathVariable("id") int id) {
		return produitService.getOneProduit(id);
	}
	
	@GetMapping()
	public List<Produit> getAllProduit(){
		return produitService.getAllProduits();
		}
	
	@PostMapping()
	public Produit createProduit(@RequestBody Produit produit) {
		return produitService.createOneProduit(produit);	
	}
	
	
	

}
