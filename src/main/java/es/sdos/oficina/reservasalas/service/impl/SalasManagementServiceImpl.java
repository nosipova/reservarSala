package es.sdos.oficina.reservasalas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.sdos.oficina.reservasalas.dao.SalaDao;
import es.sdos.oficina.reservasalas.domain.Sala;
import es.sdos.oficina.reservasalas.service.SalasManagementService;

@Component
public class SalasManagementServiceImpl implements SalasManagementService {

	@Autowired
	private SalaDao salaDao;
	
	
	@Override
	public Boolean addSala(Sala sala) {
		return this.salaDao.addSala(sala);
	}

	@Override
	public Boolean removeSala(Long salaId) {
		return this.salaDao.removeSala(salaId);
	}
	
	@Override
	public List<Sala> getSalas() {
		List<Sala> salas = this.salaDao.getSalas();
		
		return salas;
	}

	@Override
	public Boolean updateSala(Sala sala) {
		return this.updateSala(sala);
	}


}
