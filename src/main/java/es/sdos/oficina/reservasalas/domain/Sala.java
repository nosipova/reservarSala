package es.sdos.oficina.reservasalas.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sala")
public class Sala implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 154967036347359275L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private String nombre;
	private Long capacidad;
	private String recursos_tec;

	public Sala(Long codigo, String nombre, Long capacidad, String recursos_tec) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.recursos_tec = recursos_tec;

	}

	public Sala() {

	}

	public Long getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;

	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;

	}

	public Long getCapacidad() {
		return this.capacidad;
	}

	public void setCapacidad(Long capacidad) {
		this.capacidad = capacidad;

	}

	public String getRecursos_tec() {
		return this.recursos_tec;
	}

	public void setRecursos_tec(String recursos_tec) {
		this.recursos_tec = recursos_tec;

	}
}
