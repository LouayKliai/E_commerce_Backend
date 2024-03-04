package com.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.model.Client;
import com.demo.services.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {

	private final ClientService clientService;
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }
	
    
	@DeleteMapping("{id}")
	public void deleteClient(@PathVariable("id") int id) {
		clientService.deleteOneClient(id);
	}
	
	@DeleteMapping
	public void deleteAll() {
		clientService.deleteAllClient();
		
	}
	
	@GetMapping("{id}")
	public Optional<Client> getClient(@PathVariable("id") int id) {
		return clientService.getOneClient(id);	
	}
	
	@GetMapping()
	public List<Client> getAllClient(){
		return clientService.getAllClient();
	}
	
	@PostMapping()
	public Client createClinet(@RequestBody Client client) {
		return clientService.createOneClient(client);
		
	}
	
	
	

}
