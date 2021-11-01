package br.fatec.winner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.fatec.winner.model.LancamentoNota;

@Repository
public interface LancamentoNotaRepository extends JpaRepository<LancamentoNota, Long>{

}
