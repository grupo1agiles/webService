package com.gimnasio.almacen.api;

import static org.assertj.core.api.Assertions.assertThat;

import org.dozer.Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.gimnasio.almacen.dto.MaquinaEjercicio;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MappingTest {

	@Autowired
	Mapper mapper;
	
	@Test
	public void fromRequestToEntity() {
		MaquinaEjercicio c = new MaquinaEjercicio(1L, "John", "Doe", "+57 312 222 3344"); 
		MaquinaEjercicioRequest req = mapper.map(c, MaquinaEjercicioRequest.class);
		
		assertThat(req)
			.hasFieldOrPropertyWithValue("id", c.getId())
			.hasFieldOrPropertyWithValue("nombre", c.getNombre())
			.hasFieldOrPropertyWithValue("serial", c.getSerial())
			.hasFieldOrPropertyWithValue("ubicacion", c.getUbicacion());
	}
	
}
