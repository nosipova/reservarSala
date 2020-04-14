package es.sdos.oficina.reservasalas.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sala_reservada")
public class SalaReservada implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4041833122058515518L;
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long numPersonas;
	private Date fecha;
	private String initHour;
	private String finishHour;
	@OneToOne
	@JoinColumn(name = "codigo")
	private Sala codigo;

	public SalaReservada() {

	}

	public SalaReservada(Long id, Long numPersonas, Date fecha, String initHour, String finishHour, Sala codigo) {
		this.id = id;
		this.numPersonas = numPersonas;
		this.fecha = fecha;
		this.initHour = initHour;
		this.finishHour = finishHour;
		this.codigo = codigo;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNumPersonas() {
		return this.numPersonas;
	}

	public void setNumPersonas(Long numPersonas) {
		this.numPersonas = numPersonas;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getInitHour() {
		return this.initHour;
	}

	public void setInitHour(String initHour) {
		this.initHour = initHour;
	}

	public String getFinishHour() {
		return this.finishHour;
	}

	public void setFinishHour(String finishHour) {
		this.finishHour = finishHour;
	}

	public Sala getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Sala sala) {
		this.codigo = sala;
	}

}
