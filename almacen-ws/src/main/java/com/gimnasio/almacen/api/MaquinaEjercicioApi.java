package com.gimnasio.almacen.api;

import javax.validation.Valid;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gimnasio.almacen.dto.MaquinaEjercicio;
import com.gimnasio.almacen.service.MaquinaEjercicioService;

@RestController
public class MaquinaEjercicioApi {

	@Autowired
	MaquinaEjercicioService maquinaService;
	
	@Autowired
	Mapper mapper;
	
	@RequestMapping(value="/maquinaEjercicio", method=RequestMethod.GET)
	public MaquinaEjercicio getById(){
        return new MaquinaEjercicio(1L, "Eliptica", "4544DD456SFSA", "Zona Cardio");
    }
	
	
	@RequestMapping(value="/maquina", method=RequestMethod.POST)
	public MaquinaEjercicioResponse updateOrSave(@RequestBody @Valid MaquinaEjercicioRequest maquinaRequest){
	    // Mapeo request dto ==&amp;amp;amp;amp;amp;gt; entity
		MaquinaEjercicio maquina = mapper.map(maquinaRequest, MaquinaEjercicio.class);
	     
	    // Invoca lógica de negocio
		MaquinaEjercicio updatedMaquinaEjercicio = maquinaService.save(maquina);
	     
	    // Mapeo entity ==&amp;amp;amp;amp;amp;gt; response dto
		MaquinaEjercicioResponse maquinaResponse = mapper.map(updatedMaquinaEjercicio, MaquinaEjercicioResponse.class); 
	     
	    return maquinaResponse;
	}
}
