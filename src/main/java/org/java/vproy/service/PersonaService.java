package org.java.vproy.service;

import org.java.vproy.model.Persona;
import org.java.vproy.repository.PersonaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

	@Autowired
	PersonaDao personaDao;
	
	/**
	 * Guarda una nueva persona simple. 
	 * @param nombre	obligatorio
	 * @param empresa	opcional
	 * @param proyecto	opcional
	 * @param telefono	obligatorio
	 * @return
	 * @throws Exception
	 */
	public Persona nuevaPersonaSimple(String nombre, String empresa, String proyecto, String telefono) throws Exception {
		
		try {
			Long.parseLong(telefono);
		}catch(Exception e) {
			throw new Exception("El telefono no es un numerico valido");
		}
		
		Persona p =  new Persona(nombre, telefono);
		
		if(empresa!=null && !empresa.isEmpty()) {
			p.setEmpresa(empresa);
		}
		
		if(proyecto!=null && !proyecto.isEmpty()) {
			p.setProyecto(proyecto);
		}
	
		return personaDao.save(p);
		
	}

}
