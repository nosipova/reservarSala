package es.sdos.oficina.reservasalas.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.sdos.oficina.reservasalas.dao.ReservarSalasDao;
import es.sdos.oficina.reservasalas.domain.SalaReservada;
import es.sdos.oficina.reservasalas.repository.ReservarSalaRepository;

@Component
public class ReservarSalaDaoImpl implements ReservarSalasDao {

	@Autowired
	private ReservarSalaRepository reservarSalaRepository;

	@Override
	public List<SalaReservada> getReservas() {

		return this.reservarSalaRepository.findAll();
	}

	@Override
	public Boolean addReserva(SalaReservada reserva) {
		this.reservarSalaRepository.save(reserva);
		return true;
	}

	@Override
	public Boolean removeReserva(Long reservaId) {
		if (this.reservarSalaRepository.existsById(reservaId)) {
			this.reservarSalaRepository.deleteById(reservaId);
			return true;
		} else {
			return false;
		}
	}
}
