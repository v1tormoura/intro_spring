package br.com.vitormoura.IntroApp.controller;

import br.com.vitormoura.IntroApp.model.ClienteModel;
import br.com.vitormoura.IntroApp.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.desktop.OpenFilesEvent;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clients")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping("/{id}")
    public Optional<ClienteModel> findById(@PathVariable("id") long id){
        return  service.findById(id);
    }

    @GetMapping
    public List<ClienteModel> findAll(){
        return service.findAll();
    }

    @PostMapping
    public ClienteModel save(@RequestBody ClienteModel model){
        return service.save(model);
    }
}
