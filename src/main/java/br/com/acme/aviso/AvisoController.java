package br.com.acme.aviso;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/avisos")
public class AvisoController {

	@Autowired
	private AvisoService service;
	
	@PostMapping("/save")
	public void save(@RequestBody Aviso aviso) {
		this.service.save(aviso);
	}
	
	@GetMapping("/delete/{id}")
	public void excluir(@PathVariable Long id) {
		this.service.remove(id);
	}
	
	@GetMapping("/edit/{id}")
	public Aviso edit(@PathVariable("id") Long id) {
		Optional<Aviso> aviso = this.service.getById(id);
		return aviso.get();
	}
	
}
