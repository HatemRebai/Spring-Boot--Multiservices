package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.DBFile;
@Repository

public interface DBFileRepository  extends JpaRepository<DBFile, String>{

}
