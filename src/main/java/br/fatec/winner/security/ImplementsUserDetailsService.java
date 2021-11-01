package br.fatec.winner.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.fatec.winner.model.Usuario;
import br.fatec.winner.repository.UsuarioRepository;

@Service
public class ImplementsUserDetailsService implements UserDetailsService{

    @Autowired
    private UsuarioRepository ur;
    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Usuario usuario = ur.findByLogin(login);
        if(usuario == null) {
            throw new UsernameNotFoundException("Usuario não encontrado!");
        }
        return usuario;
    }

}

