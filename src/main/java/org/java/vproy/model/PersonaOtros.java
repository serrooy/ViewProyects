package org.java.vproy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DBPERSONAOTROS")
public class PersonaOtros {
	
	public PersonaOtros() {
		super();
	}
	
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;

	@Column(name = "IDPERSONA", nullable = false)
	private Long idPersona;

	@Column(name = "TIPOOTRO", nullable = false)
	private String tipoOtro;
	
	@Column(name = "DESCOTRO", nullable = false , length = 1000)
	private String descOTRO;

	public PersonaOtros(Long id, Long idPersona, String tipoOtro, String descOTRO) {
		super();
		this.id = id;
		this.idPersona = idPersona;
		this.tipoOtro = tipoOtro;
		this.descOTRO = descOTRO;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	public String getTipoOtro() {
		return tipoOtro;
	}

	public void setTipoOtro(String tipoOtro) {
		this.tipoOtro = tipoOtro;
	}

	public String getDescOTRO() {
		return descOTRO;
	}

	public void setDescOTRO(String descOTRO) {
		this.descOTRO = descOTRO;
	}

}
