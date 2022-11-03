package br.com.vitormoura.IntroApp.controller;

import br.com.vitormoura.IntroApp.model.ClienteModel;
import br.com.vitormoura.IntroApp.service.ClientServiceV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clients/v1")
public class ClienteControllerV1 {

    @Autowired
    private ClientServiceV1 service;

    @GetMapping("/{id}")
    public Optional<ClienteModel> findById(@PathVariable("id") long id) {
        return service.findById(id);
    }

    @GetMapping
    public List<ClienteModel> findAll() {
        return service.findAll();
    }

    @PostMapping
    public ClienteModel save(@RequestBody ClienteModel model) {
        return service.save(model);
    }

    @PutMapping
    public ClienteModel update(@RequestBody ClienteModel model) {
        return service.update(model);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") long id) {
        var found = service.findById(id);
        if (found.isPresent()) {
            service.delete(id);
            return ResponseEntity.ok().build();
        } else {
            return null;
        }
    }

}
