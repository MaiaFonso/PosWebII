package br.com.acme.aviso;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AvisoService {
	
	@Autowired
	private AvisoRepository repository;
	
	@Transactional(readOnly=true)
	public List<Aviso> list(){
		return this.repository.findAll();
	}
	
	@Transactional
	public void save(Aviso aviso) {
		this.repository.save(aviso);
	}
	
	@Transactional
	public void remove(Long id) {
		this.repository.deleteAll();
	}

	public Optional<Aviso> getById(Long id) {
		return this.repository.findById(id);
	}

}
