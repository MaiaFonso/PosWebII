package br.com.acme.unidade;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UnidadeService {
	
	@Autowired
	private UnidadeRepository repository;
	
	@Transactional(readOnly=true)
	public List<Unidade> list(){
		return this.repository.findAll();
	}
	
	@Transactional
	public void save(Unidade unidade) {
		this.repository.save(unidade);
	}
	
	@Transactional
	public void remove(Long id) {
		this.repository.deleteAll();
	}
	
	@Transactional
	public List<Unidade> getUnidadeSemMulta() {
		return this.repository.findAll();
	}

	@Transactional
	public Optional<Unidade> getById(Long id) {
		return null;
	}

}

