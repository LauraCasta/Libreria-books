package com.libreria.service;

import com.libreria.entity.TipoDocumentoEntity;
import com.libreria.repository.TipoDocumentoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDocumentoService {
       @Autowired
    private TipoDocumentoRepository repository;


    public List<TipoDocumentoEntity> getTiposDocs(){
        return repository.findAll();
    }
   
    public Optional<TipoDocumentoEntity> getTipoDoc(int codigo){
        return repository.findByIdTipoDocumento(codigo);
    }

}
