package com.demo.services.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.model.Commande;
import com.demo.repository.CommandeRepository;
import com.demo.services.CommandeService;

public class CommandeServiceImplement  implements CommandeService {

	@Autowired
	CommandeRepository commandeRepo;
	
	@Override
	public Commande createOneCommande(Commande commande) {
		return commandeRepo.save(commande);
	}

	@Override
	public Commande getOneCommande(int id) {
		return commandeRepo.findById(id).orElse(null);
	}

	@Override
	public List<Commande> getAllCommandes() {
		return commandeRepo.findAll();
	}

	@Override
	public void deleteOneCommande(int id) {
		commandeRepo.deleteById(id);
	}
	
	@Override
	public void deleteAllCommandes() {
		commandeRepo.deleteAll();
	}

	@Override
	public Optional<List<Commande>> findByClients(int id_client) {
		 return commandeRepo.findByClients(id_client);
	}

	@Override
	public Optional<List<Commande>> findByQuantiteGreaterThanEqual(int quantite) {
		return commandeRepo.findByQuantiteGreaterThanEqual(quantite);
	}

	@Override
	public Optional<List<Commande>> findByProduits(int id_produit) {
		return commandeRepo.findByProduits(id_produit);
	}

}
