package br.com.acme.aviso;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface AvisoRepository extends JpaRepository<Aviso, Long> {

	public List<Aviso> findByNomeContaining(String nome);
	
}
