package org.java.vproy.repository;


import java.util.List;

import org.java.vproy.model.PersonaInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaInfoDao extends CrudRepository<PersonaInfo, Long> {
	public List<PersonaInfo> findByIdPersona(Long idPersona);
	

}
