package br.fatec.winner.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.fatec.winner.model.Professor;

import br.fatec.winner.repository.ProfessorRepository;

@Service
public class ProfessorService implements ServiceInterface <Professor> {

	@Autowired
	private ProfessorRepository repository;

	@Override
	public Professor create(Professor obj) {
		return repository.save(obj);

	}

	@Override
	public Professor findById(Long id) {
		Optional<Professor> obj = repository.findById(id);
		return obj.orElse(null);

	}

	@Override
	public List<Professor> findAll() {

		return repository.findAll();
	}

	@Override
	public boolean update(Professor obj) {
		if (repository.existsById(obj.getId())) {
			repository.save(obj);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(Long id) {
		if (repository.existsById(id)) {
			repository.deleteById(id);
			return true;
		}
		return false;
	}
	
	
}
