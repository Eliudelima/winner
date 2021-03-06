package br.fatec.winner.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.fatec.winner.model.Aluno;

import br.fatec.winner.repository.AlunoRepository;


@Service
public class AlunoService implements ServiceInterface<Aluno> {

	@Autowired
	private AlunoRepository repository;

	@Override
	public Aluno create(Aluno obj) {
		return repository.save(obj);

	}

	@Override
	public Aluno findById(Long id) {
		Optional<Aluno> obj = repository.findById(id);
		return obj.orElse(null);

	}

	@Override
	public List<Aluno> findAll() {

		return repository.findAll();
	}

	@Override
	public boolean update(Aluno obj) {
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