package com.demo.services;

import java.util.List;
import java.util.Optional;

import com.demo.model.Commande;

public interface CommandeService {
	public Commande createOneCommande(Commande commande);
	public Commande getOneCommande(int id);
	public List<Commande> getAllCommandes();
	public void deleteOneCommande(int id);
	public void deleteAllCommandes();
	Optional<List<Commande>> findByProduits(int id_produit);
	Optional<List<Commande>> findByClients(int id_client);
	Optional<List<Commande>>  findByQuantiteGreaterThanEqual(int quantite);

}
