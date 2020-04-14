package es.sdos.oficina.reservasalas.service;

import java.util.List;

import org.springframework.stereotype.Service;
import es.sdos.oficina.reservasalas.domain.*;


@Service
public interface SalasManagementService {
	public List<Sala> getSalas();
	public Boolean addSala(Sala sala);
	public Boolean updateSala(Sala sala);
	public Boolean removeSala(Long SalaCodigo);
}
