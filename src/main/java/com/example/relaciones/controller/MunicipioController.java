package com.example.relaciones.controller;

import java.util.ArrayList;

import com.example.relaciones.models.MunicipioModel;
import com.example.relaciones.services.MunicipioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/municipio")
public class MunicipioController {

    @Autowired
    MunicipioService municipioService;


    @GetMapping
    public ArrayList<MunicipioModel> getMunicipio(){
        return municipioService.getMunicipios();
    }
    
}
