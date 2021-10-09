package br.fatec.winner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.fatec.winner.model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

	
}
