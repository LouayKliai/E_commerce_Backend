package com.demo.model;

import java.io.Serializable; 
import java.util.HashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Produit extends AuditModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(nullable = false)
	private String nom;
	@Column(nullable = false)
	private String description,codeBarre;
	private String photo;
	@jakarta.validation.constraints.Min(value = 1)
	private double prix;
	@jakarta.validation.constraints.Min(value = 0)
	private int quantite;
	@JsonBackReference
	@JsonIgnoreProperties({"applications","hibernateLazyInitializer"})

	@jakarta.persistence.ManyToMany(mappedBy = "produits")
	private Set<Commande> commandes=new HashSet<Commande>();
}