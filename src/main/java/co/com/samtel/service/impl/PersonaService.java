package co.com.samtel.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.samtel.entity.PersonaEntity;
import co.com.samtel.repository.IPersonaRepository;
import co.com.samtel.service.IPersonaService;

@Service
public class PersonaService implements IPersonaService {
	
	@Autowired
	IPersonaRepository personaRepository;
	
	@Override
	public Optional<PersonaEntity> findById(Long id) {
		return personaRepository.findById(id);
	}

}
