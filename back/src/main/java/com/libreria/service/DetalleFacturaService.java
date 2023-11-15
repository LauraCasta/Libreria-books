package com.libreria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreria.entity.DetalleFacturaEntity;
import com.libreria.repository.DetalleFacturaRepository;

import java.util.Optional;

@Service
public class DetalleFacturaService {
    @Autowired
    private DetalleFacturaRepository repository;
   
    public Optional<DetalleFacturaEntity> getDetalle(int codigo){
        return repository.findByIdDetalle(codigo);
    }
}
