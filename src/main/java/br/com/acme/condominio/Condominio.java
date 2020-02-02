/**
 * 
 */
package br.com.acme.condominio;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.acme.aviso.Aviso;
import br.com.acme.multas.Multa;
import br.com.acme.unidade.Unidade;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@EqualsAndHashCode
@Table(name = "tb_condominio")
public class Condominio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	private String email;
	
	private String telefone;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "unidadeMulta")
	private Set<Multa> multasAplicadas;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "condominioUnidade")
	private Set<Unidade> unidadeAplicadas;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "condominioAviso")
	private Set<Aviso> avisos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
