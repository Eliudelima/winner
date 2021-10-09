package br.fatec.winner.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.fatec.winner.model.Aluno;
import br.fatec.winner.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository repository;
	
	
	public List<Aluno> findAll() {
		
		return repository.findAll();
	}
	
	public Aluno save(Aluno obj) {
		
		return repository.save(obj);
	}
	
}
