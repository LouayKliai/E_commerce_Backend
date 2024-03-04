package com.demo.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Client extends AuditModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8655857365132918097L;
	@Column(nullable = false)
	@NotBlank
	private String nom,prenom;
	@Column(nullable = false)
	private String adresse,password;
	@Email
	@Column(nullable = false,unique = true)
	private String email;
	@Enumerated(EnumType.STRING)
	GRADE grade;
	@Enumerated(EnumType.STRING)

	GENRE genre;
	@Min(value=16)
	int age;
	@JsonBackReference
	@ManyToMany(mappedBy = "clients")
	@JsonIgnoreProperties({"applications","hibernateLazyInitializer"})

	private Set<Commande> commandes=new HashSet<Commande>();


}
