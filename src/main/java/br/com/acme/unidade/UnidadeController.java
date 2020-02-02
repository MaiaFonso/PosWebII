package br.com.acme.unidade;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/unidades")
public class UnidadeController {

	@Autowired
	private UnidadeService service;
	
	@PostMapping("/save")
	public void save(@RequestBody Unidade unidade) {
		this.service.save(unidade);
	}
	
	@GetMapping("/delete/{id}")
	public void excluir(@PathVariable Long id) {
		this.service.remove(id);
	}
	
	@GetMapping("/edit/{id}")
	public Unidade edit(@PathVariable("id") Long id) {
		Optional<Unidade> unidade = this.service.getById(id);
		return unidade.get();
	}
	
}
