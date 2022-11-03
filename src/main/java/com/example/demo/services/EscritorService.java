package com.example.demo.services;

import com.example.demo.entity.Escritor;
import com.example.demo.repository.EscritorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EscritorService {

    @Autowired
    private EscritorRepository escritorRepository;

    public List<Escritor> getUserList() {
        return escritorRepository.findAll();
    }
}
