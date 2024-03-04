package com.demo.services.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.model.Client;
import com.demo.model.GENRE;
import com.demo.repository.ClientRepository;
import com.demo.services.ClientService;

public class ClientServiceImplement implements ClientService{

	@Autowired
	ClientRepository clientRepo;
	
	@Override
	public Client createOneClient(Client client) {
		return clientRepo.save(client);
	}
	
	@Override
	public Optional<Client> getOneClient(int id) {
		
		return clientRepo.findById(id);
	}

	@Override
	public List<Client> getAllClient() {
		return clientRepo.findAll();
	}

	@Override
	public void deleteOneClient(int id) {
		if(clientRepo.existsById(id)) {
			clientRepo.deleteById(id);
		}	
	}

	@Override
	public void deleteAllClient() {
		clientRepo.deleteAll();
	}

	@Override
	public Optional<List<Client>> findByNomOrPrenom(String nom, String prenom) {
		return clientRepo.findByNomOrPrenom(nom, prenom);
	}

	@Override
	public Optional<List<Client>> findByAgeGreaterThan(int age) {
		return clientRepo.findByAgeGreaterThan(age);
	}

	@Override
	public Optional<List<Client>> findByAgeLessThanEqual(int age) {
		return clientRepo.findByAgeLessThanEqual(age);
	}

	@Override
	public Optional<List<Client>> findByGenre(GENRE genre) {
		return clientRepo.findByGenre(genre);
	}

	@Override
	public Optional<Client> findByEmail(String email) {
		return clientRepo.findByEmail(email);
		
	}

}
