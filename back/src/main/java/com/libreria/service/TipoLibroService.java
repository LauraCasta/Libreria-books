package com.libreria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreria.entity.TipoLibroEntity;
import com.libreria.repository.TipoLibroRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TipoLibroService {
    @Autowired
    private TipoLibroRepository tpLibrorepository;


    public List<TipoLibroEntity> getTiposLibros(){
        return tpLibrorepository.findAll();
    }
   
    public Optional<TipoLibroEntity> getTipoLibro(int codigo){
        return tpLibrorepository.findByIdTipoLibro(codigo);
    }

}
