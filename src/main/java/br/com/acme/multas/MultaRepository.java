package br.com.acme.multas;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.acme.unidade.Unidade;

@Repository
public interface MultaRepository extends JpaRepository<Multa, Long> {
	
	public List<Multa> findByNomeContaining(String nome);
	public List<Unidade> findDistinctByUnidadeMulta(Long id);

}
