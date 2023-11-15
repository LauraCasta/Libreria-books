package com.libreria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreria.entity.InventarioEntity;
import com.libreria.repository.InventarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class InventarioService {
    @Autowired
    private InventarioRepository repository;


    public List<InventarioEntity> getInventario(){
        return repository.findAll();
    }
   
    public Optional<InventarioEntity> getLibroInven(int codigo){
        return repository.findByIdInventario(codigo);
    }

}
