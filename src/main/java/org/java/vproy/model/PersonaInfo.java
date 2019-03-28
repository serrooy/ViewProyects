package org.java.vproy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DBPERSONAINFO")
public class PersonaInfo {

	public PersonaInfo() {
		super();
	}
	
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;

	@Column(name = "IDPERSONA", nullable = false)
	private Long idPersona;

	@Column(name = "TIPOINFO", nullable = false)
	private String tipoInfo;
	
	@Column(name = "USER", nullable = false)
	private String user;
	
	@Column(name = "PASSWORD", nullable = false)
	private String pass;

	public PersonaInfo(Long id, Long idPersona, String tipoInfo, String user, String pass) {
		super();
		this.id = id;
		this.idPersona = idPersona;
		this.tipoInfo = tipoInfo;
		this.user = user;
		this.pass = pass;
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

	public String getTipoInfo() {
		return tipoInfo;
	}

	public void setTipoInfo(String tipoInfo) {
		this.tipoInfo = tipoInfo;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}



}
