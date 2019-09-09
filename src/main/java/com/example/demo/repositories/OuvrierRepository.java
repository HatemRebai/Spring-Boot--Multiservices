package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Ouvrier;
@Repository("ouvrierrepository")

public interface OuvrierRepository extends JpaRepository<Ouvrier, Integer> {

}
