package com.libreria.service;

import com.libreria.entity.CategoriaEntity;
import com.libreria.entity.LibrosEntity;
import com.libreria.repository.LibrosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibrosService {  
    @Autowired
    private LibrosRepository repository;


    public List<LibrosEntity> getLibros(){
        return repository.findAll();
    }
    public List<LibrosEntity> getLibroCateg(int Codigo){
        return repository.findAllByIdCategoria(Codigo);
    }
    public Optional<LibrosEntity> getLibro(int codigo){
        return repository.findByIdLibro(codigo);
    }

}
