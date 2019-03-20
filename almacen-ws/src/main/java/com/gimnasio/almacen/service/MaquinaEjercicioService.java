package com.gimnasio.almacen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gimnasio.almacen.dao.MaquinaEjercicioRepo;
import com.gimnasio.almacen.dto.MaquinaEjercicio;

@Service
public class MaquinaEjercicioService {

	@Autowired
	MaquinaEjercicioRepo dao;

    public MaquinaEjercicio save(MaquinaEjercicio maquina){
        return dao.saveAndFlush(maquina);
    }
}