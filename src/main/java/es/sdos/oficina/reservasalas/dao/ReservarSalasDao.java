package es.sdos.oficina.reservasalas.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import es.sdos.oficina.reservasalas.domain.SalaReservada;

@Repository
public interface ReservarSalasDao {
	List<SalaReservada> getReservas();

	Boolean addReserva(SalaReservada reserva);

	Boolean removeReserva(Long reservaId);

}
