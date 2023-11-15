package com.libreria.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreria.entity.MedioPagoEntity;
import com.libreria.repository.MedioPagoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MedioPagoService {
    @Autowired
    private MedioPagoRepository repository;


    public List<MedioPagoEntity> getMedioPago(){
        return repository.findAll();
    }
   
    public Optional<MedioPagoEntity> getMedioPago(int codigo){
        return repository.findByIdMedioPago(codigo);
    }

}
