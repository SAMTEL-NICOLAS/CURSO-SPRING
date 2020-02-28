package co.com.samtel.rest;

import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.samtel.entity.PersonaEntity;
import co.com.samtel.service.IPersonaService;

@RestController
@RequestMapping("/v1/personas")
public class PersonaController {
	
	
	IPersonaService personaService;
	
	@Autowired
	public PersonaController(IPersonaService personaService) {
		super();
		this.personaService = personaService;
	}
	@GetMapping(value = "/keepalive")
	public String keepAlive() {
		return "Hola";
	}
	@GetMapping(value = "/{id}")
	public Optional<PersonaEntity> getPersonById(@PathVariable(value = "id") Long id) {
		return personaService.findById(id);
	}
	
}
