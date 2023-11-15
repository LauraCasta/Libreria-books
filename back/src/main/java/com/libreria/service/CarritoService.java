package com.libreria.service;

import com.libreria.entity.CarritoEntity;
import com.libreria.repository.CarritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarritoService {
    @Autowired
    private CarritoRepository repository;

    public void postProductos(CarritoEntity producto){
        repository.save(producto);
    }

    public List<CarritoEntity> getProductos(){
        return repository.findAll();
    }
    public void putProducto(CarritoEntity producto){
        repository.save(producto);
    }
    public void deleteProducto(int id){
        repository.deleteById(id);
    }
    public Optional<CarritoEntity> getProducto(int codigo){
        return repository.findByIdCarrito(codigo);
    }



}
