package es.sdos.oficina.reservasalas.rest;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import es.sdos.oficina.reservasalas.domain.Sala;

@RestController
public interface SalasManagementApi {
	@GetMapping(value = "/admin/getSala", produces = { MediaType.APPLICATION_JSON_VALUE })
	List<Sala> getSalas();

	@PutMapping(value = "/admin/addSala", produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE })
	ResponseEntity addSala(@RequestBody Sala sala);

}
