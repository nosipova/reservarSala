package es.sdos.oficina.reservasalas.rest;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.sdos.oficina.reservasalas.domain.SalaReservada;

@RestController
public interface ReservarSalaManagementApi {
	@GetMapping(value = "/admin/getReservas", produces = { MediaType.APPLICATION_JSON_VALUE })
	List<SalaReservada> getReservas();

	@PutMapping(value = "/admin/addReserva", produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE })
	ResponseEntity<SalaReservada> addReserva(@RequestBody SalaReservada reservaSala);

}
