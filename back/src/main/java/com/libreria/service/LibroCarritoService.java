package com.libreria.service;

import com.libreria.entity.LibroCarritoEntity;
import com.libreria.repository.LibroCarritoRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroCarritoService {
    @Autowired
    private LibroCarritoRepository repository;

    public List<LibroCarritoEntity> getListItem(){
        return repository.findAll();
    }
    public Optional<LibroCarritoEntity> getIdItem(int codigo){
        return repository.findByIdItem(codigo);
    }
    public void postItem(LibroCarritoEntity producto){
        repository.save(producto);
    }
    
    public void putItem(LibroCarritoEntity producto){
        repository.save(producto);
    }
    public void deleteItem(int id){
        repository.deleteById(id);
    }
}
