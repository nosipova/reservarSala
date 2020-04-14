package es.sdos.oficina.reservasalas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.sdos.oficina.reservasalas.domain.Sala;

public interface SalaRepository extends JpaRepository<Sala, Long>{
	

}
