package co.com.samtel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.samtel.entity.PersonaEntity;

@Repository
public interface IPersonaRepository extends JpaRepository<PersonaEntity, Long> {

}
