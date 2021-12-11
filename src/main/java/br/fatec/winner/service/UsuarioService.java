package br.fatec.winner.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


import br.fatec.winner.model.Usuario;
import br.fatec.winner.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;


    public Usuario save(Usuario obj) {
        obj.setSenha(new BCryptPasswordEncoder().encode(obj.getSenha())); 
        repository.save(obj);
        return obj;
    }
   
	public Usuario findById(Long id) {
		Optional<Usuario> obj = repository.findById(id);
		return obj.orElse(null);

	}

	
	public List<Usuario> findAll() {

		return repository.findAll();
	}

}
