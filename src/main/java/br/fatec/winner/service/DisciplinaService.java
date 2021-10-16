package br.fatec.winner.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.fatec.winner.model.Disciplina;
import br.fatec.winner.repository.DisciplinaRepository;

@Service
public class DisciplinaService implements ServiceInterface<Disciplina> {

	@Autowired
	private DisciplinaRepository repository;

	@Override
	public Disciplina create(Disciplina obj) {
		return repository.save(obj);

	}

	@Override
	public Disciplina findById(Long id) {
		Optional<Disciplina> obj = repository.findById(id);
		return obj.orElse(null);

	}

	@Override
	public List<Disciplina> findAll() {

		return repository.findAll();
	}

	@Override
	public boolean update(Disciplina obj) {
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
