package com.projeto.vendas.entidade;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Embeddable
public class Endereco {
	
	@NotNull(message = "Endereço deve ser informado")
	@Column(name ="endereco_cep")
	private String cep;
	
	@Column(name ="endereco_logadouro")
	private String logadouro;
	
	@Column(name ="endereco_numero")
	private String numero;
	
	@Column(name ="endereco_bairro")
	private String bairro;
	
	@Column(name="endereco_cidade")
	private String cidade;
	
	@Column(name="endereco_estado")
	private String estado;
	
	@Column(name="endereco_complemento")
	private String complemento;
	
	@Column(name="endereco_pontoReferencia")
	private String pontoReferencia;
		
}
