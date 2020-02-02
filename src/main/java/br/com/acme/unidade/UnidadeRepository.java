package br.com.acme.unidade;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.acme.multas.Multa;

@Repository
public interface UnidadeRepository extends JpaRepository<Unidade, Long> {
	
	public List<Unidade> findByNomeContaining(String nome);
//	public List<Multa> findByUnidadeNotIn(List<String> nome);

}