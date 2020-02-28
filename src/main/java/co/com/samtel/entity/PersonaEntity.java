package co.com.samtel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "persona")
@Getter @Setter
public class PersonaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "articulo_generator")
	@SequenceGenerator(name = "articulo_generator", sequenceName = "articulo_seq", allocationSize = 1)
	private Long id;
	@Column(name = "nombre_custom", unique = true)
	
	private String nombre;
}
