package com.libreria.repository;

import com.libreria.entity.TipoUsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TipoUsuarioRepository extends JpaRepository<TipoUsuarioEntity, Integer> {
    Optional<TipoUsuarioEntity> findByIdTipoUsuario(int idTpUsuario);  
}
