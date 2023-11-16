package com.libreria.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreria.entity.UsuarioEntity;
import com.libreria.repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    public Optional<UsuarioEntity> getUsuario(String user){
        return repository.findByNomUsuario(user);
    }

    public void postUsuario(UsuarioEntity usuario){
        repository.save(usuario);
    }

}
