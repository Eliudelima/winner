package br.fatec.winner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.fatec.winner.model.Usuario;
import br.fatec.winner.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService service;

	@PostMapping
	public ResponseEntity<Usuario> post(@RequestBody Usuario obj) {
		return ResponseEntity.ok(service.save(obj));
	}
	
    @GetMapping
    public ResponseEntity<List<Usuario>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    
    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Long id) {
    	Usuario _Usuario = service.findById(id);
        if(_Usuario != null) {
            return ResponseEntity.ok(_Usuario);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

}
