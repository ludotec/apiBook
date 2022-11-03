package com.example.demo.controller;

import com.example.demo.entity.Escritor;
import com.example.demo.services.EscritorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class EscritorController {

    @Autowired
    private EscritorService services;

    @GetMapping("/escritores")//you can give this any name you want and after adding this string to the end of base url you can use this
    public ResponseEntity<List<Escritor>> getAllUsers() {
        return ResponseEntity.ok(services.getUserList());
    }
}
