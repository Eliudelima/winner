package br.fatec.winner.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aluno {
	@Id	
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String notaDisciplina;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Aluno(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Aluno() {
		
	}

	public String getNotaDisciplina() {
		return notaDisciplina;
	}

	public void setNotaDisciplina(String notaDisciplina) {
		this.notaDisciplina = notaDisciplina;
	}
}
