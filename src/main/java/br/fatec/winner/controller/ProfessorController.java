package br.fatec.winner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.fatec.winner.model.Professor;
import br.fatec.winner.service.ProfessorService;

@RestController
@RequestMapping("/professors")
public class ProfessorController implements ControllerInterface<Professor> {
	
	@Autowired
    ProfessorService service;

    @Override
    @GetMapping
    public ResponseEntity<List<Professor>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Long id) {
        Professor _Professor = service.findById(id);
        if(_Professor != null) {
            return ResponseEntity.ok(_Professor);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @Override
    @PostMapping
    public ResponseEntity<Professor> post(@RequestBody Professor obj) {
        service.create(obj);
        return ResponseEntity.ok(obj);
    }

    @Override
    @PutMapping
    public ResponseEntity<?> put(@RequestBody Professor obj) {
        if(service.update(obj)) {
            return ResponseEntity.ok(obj);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @Override
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        if(service.delete(id)) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
