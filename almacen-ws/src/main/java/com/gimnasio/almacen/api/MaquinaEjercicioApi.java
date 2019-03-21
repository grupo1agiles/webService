package com.gimnasio.almacen.api;

import java.util.List;

import javax.validation.Valid;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gimnasio.almacen.dao.MaquinaEjercicioRepo;
import com.gimnasio.almacen.dto.MaquinaEjercicio;
import com.gimnasio.almacen.service.MaquinaEjercicioService;

@RestController
public class MaquinaEjercicioApi {

	@Autowired
	MaquinaEjercicioService maquinaService;
	
	@Autowired
    MaquinaEjercicioRepo reposotry;

	@Autowired
	Mapper mapper;
	
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
	
	@RequestMapping(value="/maquinaEjercicio1", method=RequestMethod.GET)
	public MaquinaEjercicio getById(){
        return new MaquinaEjercicio(1L, "Eliptica", "4544DD456SFSA", "Zona Cardio");
    }
	
	
	/////////////////////
	
	 @RequestMapping(value = "/maquinaEjercicio", method = RequestMethod.GET, produces = "application/json")
	    public List<MaquinaEjercicio> listAllbook(){
	        return (List<MaquinaEjercicio>)reposotry.findAll();
	    }
	    
	    @RequestMapping(value = "/maquinaEjercicio/id/{id}", method = RequestMethod.GET, produces = "application/json")
	    public ResponseEntity getById(@PathVariable Long id){
	    	MaquinaEjercicio maquinabyid = reposotry.getByid(id);
	        if(maquinabyid == null){
	            return new ResponseEntity("No encontrado",HttpStatus.NOT_FOUND);
	        }
	            return new ResponseEntity<>(maquinabyid, HttpStatus.ACCEPTED);
	        
	    }
	////////////////////////////0
	    
	    
	    @GetMapping("/insert")
	    public String bulkcreate(){
	    // save a single Customer
	    	reposotry.save(new MaquinaEjercicio(1L,"Eliptica", "FG56DSF23","Zona cardio"));
	   
	    return "Customers are created";
	    }
	    
}
