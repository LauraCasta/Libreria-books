package com.libreria.service;

import com.libreria.entity.CarritoEntity;
import com.libreria.repository.CarritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarritoService {
    @Autowired
    private CarritoRepository repository;

    public CarritoEntity getIdCarrito(int codigo){
        return repository.findByIdCarrito(codigo);
    }
    public void postCarrito(CarritoEntity producto){
        repository.save(producto);
    }
    
    public void putCarrito(CarritoEntity producto){
        repository.save(producto);
    }
    public void deleteCarrito(int id){
        repository.deleteById(id);
    }
}
