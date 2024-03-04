package com.demo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Min;

@Entity

public class Commande extends AuditModel implements Serializable{
	@Min(value = 1)
	private int quantite;
	@JsonManagedReference
	@ManyToMany
	@JsonIgnoreProperties({"applications","hibernateLazyInitializer"})

	List<Client> clients=new ArrayList<Client>();
	@JsonManagedReference
	@ManyToMany
	@JsonIgnoreProperties({"applications","hibernateLazyInitializer"})

	List<Produit> produits=new ArrayList<Produit>();
	private String etat;

}
