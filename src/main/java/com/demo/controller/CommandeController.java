package com.demo.controller;

import java.util.List; 
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.model.Commande;
import com.demo.services.CommandeService;

@RestController
@RequestMapping("/commandes")
public class CommandeController {
	private final CommandeService commandeService;
    public CommandeController(CommandeService commandeService) {
        this.commandeService = commandeService;
    }
	
    
	@DeleteMapping("{id}")
	public void deleteCommande(@PathVariable("id") int id) {
		commandeService.deleteOneCommande(id);
	}
	
	@DeleteMapping
	public void deleteAll() {
		commandeService.deleteAllCommandes();
		
	}
	
	@GetMapping("{id}")
	public Commande getCommande(@PathVariable("id") int id) {
		return commandeService.getOneCommande(id);
	}
	
	@GetMapping()
	public List<Commande> getAllCommande(){
		return commandeService.getAllCommandes();
		}
	
	@PostMapping()
	public Commande createCommande(@RequestBody Commande commande) {
		return commandeService.createOneCommande(commande);	
	}
}