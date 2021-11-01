package br.fatec.winner.service;

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
}
