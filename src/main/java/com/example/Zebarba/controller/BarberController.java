package com.example.Zebarba.controller;

import com.example.Zebarba.model.Barber;
import com.example.Zebarba.service.BarberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BarberController {
    @Autowired
    private BarberService service;

    @GetMapping("/barber")
    public Iterable<Barber> read(){
        return service.findAll();
    }

    @PostMapping("/barber")
    public Barber create(@RequestBody Barber barber){
        return service.save(barber);
    }

    @GetMapping("/barber/{id}")
    public Barber findById(@PathVariable Integer id){
        return service.findById(id);
    }

    @PutMapping("/barber")
    public Barber update(@RequestBody Barber appointment){
        return service.save(appointment);
    }

    @DeleteMapping("/barber/{id}")
    public void delete(@PathVariable Integer id){
        service.deleteById(id);
    }
}
