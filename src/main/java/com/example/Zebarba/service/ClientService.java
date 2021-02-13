package com.example.Zebarba.service;

import com.example.Zebarba.model.Client;
import com.example.Zebarba.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClientService {

    @Autowired
    private ClientRepository repository;

    public Iterable<Client> findAll() {
        return repository.findAll();
    }

    public Client save(Client client) {
        return repository.save(client);
    }

    public Client findById(Integer id) {
        return repository.findById(id).get();
    }

    public void deleteById(Integer id) {
         repository.deleteById(id);
    }
}
