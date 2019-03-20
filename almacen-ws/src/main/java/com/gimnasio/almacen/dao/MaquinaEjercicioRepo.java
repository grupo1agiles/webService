package com.gimnasio.almacen.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gimnasio.almacen.dto.MaquinaEjercicio;

public interface MaquinaEjercicioRepo extends JpaRepository<MaquinaEjercicio, Long> {
	 
	}