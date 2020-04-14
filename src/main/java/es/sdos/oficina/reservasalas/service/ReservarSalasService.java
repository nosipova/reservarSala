package es.sdos.oficina.reservasalas.service;

import java.util.List;

import es.sdos.oficina.reservasalas.domain.SalaReservada;



public interface ReservarSalasService {
	public List<SalaReservada> getReservas();
	public Boolean addReserva(SalaReservada reservaSala);
	public void removeReserva(SalaReservada reservaSala);

}
