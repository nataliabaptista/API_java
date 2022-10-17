package com.workshop.API_java.DTO;
import java.io.Serializable;
import com.workshop.API_java.domain.Pessoa;

public class PessoaDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String nome;
	private Integer idade;
	private Double peso;
	
	public PessoaDTO() {
		
	}
	
	public PessoaDTO(Pessoa obj) {
		id = obj.getId();
		nome = obj.getNome();
		idade = obj.getIdade();
		peso = obj.getPeso();
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
}
