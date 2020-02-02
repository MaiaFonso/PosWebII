/**
 * 
 */
package br.com.acme.aviso;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.acme.condominio.Condominio;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * @author carlosfilho
 *
 */
@Entity
@Getter
@Setter
@Builder
@EqualsAndHashCode
@Table(name = "tb_avisos")
public class Aviso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	private String descricaoAviso;
	
	@ManyToOne
	@JoinColumn(name = "id_condominio")
	private Condominio condominioAviso;

	public String getDescricaoAviso() {
		return descricaoAviso;
	}

	public void setDescricaoAviso(String descricaoAviso) {
		this.descricaoAviso = descricaoAviso;
	}
}
