package es.sdos.oficina.reservasalas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.sdos.oficina.reservasalas.dao.ReservarSalasDao;
import es.sdos.oficina.reservasalas.domain.SalaReservada;
import es.sdos.oficina.reservasalas.service.ReservarSalasService;

import es.sdos.oficina.reservasalas.util.ReservaSalaUtils;
import es.sdos.oficina.reservasalas.validation.ReservarSalasValidation;

@Service
public class ReservaSalaServiceImpl implements ReservarSalasService {

	@Autowired
	private ReservarSalasValidation reservarSalasValidation;

	@Autowired
	private ReservaSalaUtils reservaSalaUtils;

	@Autowired
	private ReservarSalasDao reservarSalasDao;

	@Override
	public Boolean addReserva(SalaReservada reservaSala) {
		this.reservarSalasValidation.isValidReservarSalasRequest(reservaSala);

		SalaReservada salaReservada = this.reservaSalaUtils.map(reservaSala, SalaReservada.class);
		return this.reservarSalasDao.addReserva(salaReservada);

	}

	@Override
	public void removeReserva(SalaReservada reservaSala) {
		this.reservarSalasValidation.isValidReservarSalasRequest(reservaSala);

		SalaReservada salaReservada = this.reservaSalaUtils.map(reservaSala, SalaReservada.class);
		Long reservaId = salaReservada.getId();
		this.reservarSalasDao.removeReserva(reservaId);

	}

	@Override
	public List<SalaReservada> getReservas() {

		return this.reservarSalasDao.getReservas();

	}
}