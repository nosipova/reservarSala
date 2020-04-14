package es.sdos.oficina.reservasalas.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import es.sdos.oficina.reservasalas.domain.Sala;

@Repository
public interface SalaDao {
	List<Sala> getSalas();
	Boolean addSala(Sala sala);
	Boolean updateSala(Sala sala);
	Boolean removeSala(Long salaId);
}
