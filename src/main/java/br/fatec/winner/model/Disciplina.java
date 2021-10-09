package br.fatec.winner.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Disciplina {
	
	@Id	
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	
	private String disciplina;
	
	@ManyToMany 
	private List<Aluno> alunos;

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public Disciplina(Long id, String disciplina) {
		super();
		this.id = id;
		this.disciplina = disciplina;
	}
	public Disciplina() {
		
	}

}
