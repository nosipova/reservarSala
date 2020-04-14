package es.sdos.oficina.reservasalas.validation;

import es.sdos.oficina.reservasalas.domain.SalaReservada;

public interface ReservarSalasValidation {
	boolean isValidReservarSalasRequest(SalaReservada request);
}
