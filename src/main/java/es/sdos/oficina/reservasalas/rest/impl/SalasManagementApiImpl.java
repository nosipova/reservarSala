package es.sdos.oficina.reservasalas.rest.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import es.sdos.oficina.reservasalas.domain.Sala;
import es.sdos.oficina.reservasalas.rest.SalasManagementApi;
import es.sdos.oficina.reservasalas.service.SalasManagementService;

@Component
public class SalasManagementApiImpl implements SalasManagementApi {

	@Autowired
	private SalasManagementService salasManagementService;
	
	
	@Override
	public List<Sala> getSalas() {
		List<Sala> Salas = this.salasManagementService.getSalas();
		return Salas;
	}


	@Override
	public ResponseEntity addSala(@RequestBody Sala sala) {
//		if (this.esAuthService.isAdmin(key)) {
			Boolean result = this.salasManagementService.addSala(sala);
			return new ResponseEntity(result, HttpStatus.CREATED);
//		}
//		else {
//			return new ResponseEntity(new Response("Invalid Consmer Key"), HttpStatus.UNAUTHORIZED);
//		}
	}


}
