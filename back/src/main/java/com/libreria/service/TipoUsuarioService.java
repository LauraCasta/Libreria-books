package com.libreria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreria.entity.TipoUsuarioEntity;
import com.libreria.repository.TipoUsuarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TipoUsuarioService {
       @Autowired
    private TipoUsuarioRepository repository;


    public List<TipoUsuarioEntity> getTiposUsuarios(){
        return repository.findAll();
    }
   
    public Optional<TipoUsuarioEntity> getTipoUsuario(int codigo){
        return repository.findByIdTipoUsuario(codigo);
    }

}
