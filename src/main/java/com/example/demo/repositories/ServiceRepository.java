package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Service;

@Repository("servicerepository")
public interface ServiceRepository extends JpaRepository<Service, Integer> {

}
