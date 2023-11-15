package com.libreria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreria.repository.CategoriaRepository;
import com.libreria.entity.CategoriaEntity;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository repository;


    public List<CategoriaEntity> getCategorias(){
        return repository.findAll();
    }
   
    public Optional<CategoriaEntity> getCatego(String categoria){
        return repository.findByCategoriaLibro(categoria);
    }

}
