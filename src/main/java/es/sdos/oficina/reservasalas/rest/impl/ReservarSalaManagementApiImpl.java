package es.sdos.oficina.reservasalas.rest.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import es.sdos.oficina.reservasalas.domain.SalaReservada;
import es.sdos.oficina.reservasalas.rest.ReservarSalaManagementApi;
import es.sdos.oficina.reservasalas.service.ReservarSalasService;

@Component
public class ReservarSalaManagementApiImpl implements ReservarSalaManagementApi {

	@Autowired
	private ReservarSalasService reservarSalasService;
	


	@Override
	public List<SalaReservada> getReservas() {
		
		List<SalaReservada> reservas= reservarSalasService.getReservas();
		return reservas;
	}


	@Override
	public ResponseEntity<SalaReservada> addReserva(SalaReservada reservaSala) {

		Boolean result = this.reservarSalasService.addReserva(reservaSala);
		return new ResponseEntity(result, HttpStatus.CREATED);
	}


}
