package org.java.vproy.controller;

import java.util.List;
import java.util.Map;

import org.java.vproy.model.Persona;
import org.java.vproy.util.Constantes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

	public static final String LOG_USU = "logUsu";

	@RequestMapping("/")
	public String init() {
		return Constantes.INDEX;
	}

	@RequestMapping("/persona")
	public String persona() {
		return "/Persona.jsp";
	}

	@RequestMapping(value = "/", method = { RequestMethod.POST })
	public String accionV(Model model, @RequestParam Map<String, String> requestParams) throws Exception {
		
		return "/Persona.jsp";
	}

	/**
	 * Centraliza la pantalla de busqueda de personas
	 * 
	 * @param nombre
	 * @param empresa
	 * @param proyecto
	 * @return
	 */
	private List<Persona> buscarPersonas(String nombre, String empresa, String proyecto) {

		return null;

	}

	/**
	 * Inserta una nueva persona. Simple
	 * @param nombre
	 * @param empresa
	 * @param proyecto
	 * @param telefono
	 * @return
	 */
	private boolean nuevaPersona(String nombre, String empresa, String proyecto, String telefono) {

		return false;

	}

}
