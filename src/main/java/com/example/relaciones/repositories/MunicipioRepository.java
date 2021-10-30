package com.example.relaciones.repositories;

import com.example.relaciones.models.MunicipioModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MunicipioRepository extends CrudRepository<MunicipioModel, Long> {
    
}
