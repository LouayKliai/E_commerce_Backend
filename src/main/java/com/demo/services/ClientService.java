package com.demo.services;
import java.util.List;
import java.util.Optional;

import com.demo.model.Client;
import com.demo.model.GENRE;
public interface ClientService {
	Client createOneClient(Client client);
	Optional<Client> getOneClient(int id);
	List<Client> getAllClient();
	void deleteOneClient(int id);
	void deleteAllClient();
	Optional<Client> findByEmail(String email);
	Optional<List<Client>> findByNomOrPrenom(String nom,String prenom);
	Optional<List<Client>> findByAgeGreaterThan(int age);
	Optional<List<Client>> findByAgeLessThanEqual(int age);
	Optional<List<Client>> findByGenre(GENRE genre);

}
