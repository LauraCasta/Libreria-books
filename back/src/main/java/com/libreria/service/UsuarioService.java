package com.libreria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreria.entity.UsuarioEntity;
import com.libreria.repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    public UsuarioEntity getUsuario(int codigo){
        return repository.findByIdUsuario(codigo);
    }

}
