package com.gimnasio.almacen.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gimnasio.almacen.dto.MaquinaEjercicio;

public interface MaquinaEjercicioRepo extends JpaRepository<MaquinaEjercicio, Long> {
	MaquinaEjercicio getByid(Long id);
	List<MaquinaEjercicio> findAll();
	}