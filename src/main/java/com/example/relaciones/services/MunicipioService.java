package com.example.relaciones.services;

import java.util.ArrayList;

import com.example.relaciones.models.MunicipioModel;
import com.example.relaciones.repositories.MunicipioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MunicipioService {

    @Autowired
    MunicipioRepository municipioRepository;


    public ArrayList<MunicipioModel> getMunicipios() {
        return (ArrayList<MunicipioModel>) municipioRepository.findAll();
    }
    
    
    
}
