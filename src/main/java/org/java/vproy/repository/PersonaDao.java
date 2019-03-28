package org.java.vproy.repository;


import java.util.List;

import org.java.vproy.model.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaDao extends CrudRepository<Persona, Long> {
 
	
	  public List<Persona> findByNombreLike(String nombre);
	  
	  public List<Persona> findByEmpresaLike(String empresa);
	  
	  public List<Persona> findByProyectoLike(String proy);
	  
	  public List<Persona> findByEmpresaAndNombreLike(String empresa,String nombre);
	  
	  public List<Persona> findByProyectoAndNombreLike(String proy,String nombre);
	  
}
