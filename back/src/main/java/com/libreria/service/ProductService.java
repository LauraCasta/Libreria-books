package com.libreria.service;

import com.libreria.entity.ProductosEntity;
import com.libreria.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public void postProductos(ProductosEntity producto){
        repository.save(producto);
    }

    public List<ProductosEntity> getProductos(){
        return repository.findAll();
    }
    public void putProducto(ProductosEntity producto){
        repository.save(producto);
    }
    public void deleteProducto(int id){
        repository.deleteById(id);
    }
    public Optional<ProductosEntity> getProducto(String codigo){
        return repository.findByStrCodigoProducto(codigo);
    }



}
