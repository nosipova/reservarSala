package es.sdos.oficina.reservasalas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.sdos.oficina.reservasalas.domain.SalaReservada;

public interface ReservarSalaRepository extends JpaRepository<SalaReservada, Long>{
	

}
