package com.libreria.repository;

import com.libreria.entity.VentasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VentasRepository extends JpaRepository<VentasEntity, Integer> {

}
