package com.example.demo.repository;

import com.example.demo.entity.Escritor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EscritorRepository extends JpaRepository<Escritor, Integer> {

}
