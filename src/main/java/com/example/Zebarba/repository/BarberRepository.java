package com.example.Zebarba.repository;

import com.example.Zebarba.model.Barber;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarberRepository extends CrudRepository<Barber, Integer> {
}
