package es.sdos.oficina.reservasalas.validation.impl;

import org.springframework.stereotype.Component;

import es.sdos.oficina.reservasalas.ReservarSalasConstant;
import es.sdos.oficina.reservasalas.domain.SalaReservada;
import es.sdos.oficina.reservasalas.validation.ReservarSalasValidation;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ReservarSalasValidationImpl implements ReservarSalasValidation, ReservarSalasConstant {

	@Override
	public boolean isValidReservarSalasRequest(SalaReservada request) {
		// TODO Auto-generated method stub
		return true;
	}
	
}
