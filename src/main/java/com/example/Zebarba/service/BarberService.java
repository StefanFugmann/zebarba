package com.example.Zebarba.service;

import com.example.Zebarba.model.Barber;
import com.example.Zebarba.repository.BarberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BarberService {

    @Autowired
    private BarberRepository repository;

    public Iterable<Barber> findAll() {
        return  repository.findAll();
    }

    public Barber save(Barber barber) {
        return repository.save(barber);
    }

    public Barber findById(Integer id) {
        return repository.findById(id).get();
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
