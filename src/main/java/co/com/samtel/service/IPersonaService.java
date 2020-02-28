package co.com.samtel.service;

import java.util.Optional;

import co.com.samtel.entity.PersonaEntity;

public interface IPersonaService {
	
	Optional<PersonaEntity> findById(Long id);
}
