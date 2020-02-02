package br.com.acme.multas;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.persistence.PostRemove;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.acme.unidade.Unidade;

@Controller
@RequestMapping("/multas")
public class MultaController {

	@Autowired
	private MultaService service;
	
	@PostMapping("/save")
	public void save(@RequestBody Multa multa) {
		this.service.save(multa);
	}
	
	@PostMapping("/enviamulta")
	public void enviaMulta(@RequestBody Multa multa) {
		
	}
	
	@GetMapping("/delete/{id}")
	public void excluir(@PathVariable Long id) {
		this.service.remove(id);
	}
	
	@GetMapping("/edit/{id}")
	public Multa edit(@PathVariable("id") Long id) {
		Optional<Multa> multa = this.service.getById(id);
		return multa.get();
	}
	
	@GetMapping("/unidade")
	public List<Unidade> getUnidade(@PathVariable("id") Long id) {
		return this.service.getUnidadeComMulta(id);
	}
	
}

