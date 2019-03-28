package org.java.vproy.controller;

import java.util.List;
import java.util.Map;

import org.java.vproy.model.Persona;
import org.java.vproy.service.PersonaService;
import org.java.vproy.util.Constantes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

	public static final String LOG_USU = "logUsu";
	
	@Autowired
	PersonaService pService;

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
		
		
		String accion = requestParams.get("accion");
		if(accion==null || accion.isEmpty()) {
			return "/Persona.jsp";
		}else {
			if(accion.equals("B")) {//Buscar Persona
				String nombre =requestParams.get("nPersona");
				String empresa =requestParams.get("nEmpresa");
				String proyecto =requestParams.get("nProy");
				
				
				
			}else if (accion.equals("N")) { // Nueva persona
				
				String nombre =requestParams.get("iPersona");
				String empresa =requestParams.get("iEmpresa");
				String proyecto =requestParams.get("iProy");
				String tel =requestParams.get("iTel");
				
				if(nombre==null || nombre.isEmpty() || tel==null || tel.isEmpty()) {
					model.addAttribute("msg", "ERROR - El nombre y el telefono son parametros obligatorios");
					model.addAttribute("iPersona", nombre);
					model.addAttribute("iEmpresa", empresa);
					model.addAttribute("iProy", proyecto);
					model.addAttribute("iTel", tel);
				}else {
					Persona p=pService.nuevaPersonaSimple(nombre, empresa, proyecto, tel);
					model.addAttribute("msg","Se ha insertado la persona con exito");
				}
			}
		}
		
		
		
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
}
