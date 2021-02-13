package com.example.Zebarba.controller;

import com.example.Zebarba.model.Client;
import com.example.Zebarba.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping("/client")
    public Iterable<Client> read() {
         return service.findAll();
    }

    @PostMapping("/client")
    public Client create(@RequestBody Client client) {
        return service.save(client);
    }

    @GetMapping("/client/{id}")
    public Client findById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PutMapping("/client")
    public Client update(@RequestBody Client appointment) {
        return service.save(appointment);
    }

    @DeleteMapping("/client/{id}")
    public void delete(@PathVariable Integer id){
        service.deleteById(id);
    }

}
