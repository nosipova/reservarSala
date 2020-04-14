package es.sdos.oficina.reservasalas.domain;

import java.sql.Date;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class ReservaSalaRequest   {
	@NotEmpty(message="Es un campo obligatorio ")
	private Long numPersonas;
	@NotEmpty(message="Es un campo obligatorio ")
	private Date fecha;
	@NotEmpty(message="Es un campo obligatorio ")
	private String initHour;
	@NotEmpty(message="Es un campo obligatorio ")
	private String finishHour;
	@NotEmpty(message="Es un campo obligatorio ")
	private String recursos;
}
