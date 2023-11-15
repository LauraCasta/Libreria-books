package com.libreria.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreria.entity.VentasEntity;
import com.libreria.repository.VentasRepository;

import java.util.List;

@Service
public class VentasService {
       @Autowired
    private VentasRepository repository;

    public List<VentasEntity> getVentas(){
        return repository.findAll();
    }

}
