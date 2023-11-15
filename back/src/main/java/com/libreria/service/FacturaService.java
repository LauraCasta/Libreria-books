package com.libreria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreria.entity.FacturaEntity;
import com.libreria.repository.FacturaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FacturaService {
    @Autowired
    private FacturaRepository repository;


    public List<FacturaEntity> getFaturas(){
        return repository.findAll();
    }
   
    public Optional<FacturaEntity> getIdFactura(int codigo){
        return repository.findByIdFactura(codigo);
    }

}
