package es.sdos.oficina.reservasalas.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.sdos.oficina.reservasalas.dao.SalaDao;
import es.sdos.oficina.reservasalas.domain.Sala;
import es.sdos.oficina.reservasalas.repository.SalaRepository;

@Component
public class SalaDaoImpl implements SalaDao {

	@Autowired
	private SalaRepository SalaRepository;
	
	@Override
	public List<Sala> getSalas() {
		return this.SalaRepository.findAll();
	}


	@Override
	public Boolean addSala(Sala Sala) {
		this.SalaRepository.save(Sala);
		return true;
	}

	@Override
	public Boolean removeSala(Long SalaId) {
		if (this.SalaRepository.existsById(SalaId)) {
			this.SalaRepository.deleteById(SalaId);
			return true;
		}
		else {
			return false;
		}
	}


	@Override
	public Boolean updateSala(Sala sala) {
		// TODO Auto-generated method stub
		return null;
	}
}
