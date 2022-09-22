package br.com.vitormoura.IntroApp.service;

import br.com.vitormoura.IntroApp.model.ClienteModel;
import br.com.vitormoura.IntroApp.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClientRepository repository;

    public Optional<ClienteModel> findById(long id) {
        return repository.findById(id);
    }

    public List<ClienteModel> findAll(){
        return repository.findAll();
    }

    public ClienteModel save(ClienteModel model){
        return repository.save(model);
    }

    public ClienteModel update(ClienteModel model){
        var found = repository.findById(model.getId());
        if(found.isPresent()){
            found.get().setName(model.getName());
            found.get().setGender(model.getGender());
            found.get().setCity(model.getCity());
            return repository.save(found.get());
        }else {
            return null;
        }
    }

    public void delete(long id){
        var found = repository.findById(id);
        if(found.isPresent()){
            repository.delete(found.get());
        }
    }
}
