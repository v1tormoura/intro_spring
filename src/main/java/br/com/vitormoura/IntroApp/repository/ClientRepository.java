package br.com.vitormoura.IntroApp.repository;

import br.com.vitormoura.IntroApp.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<ClienteModel, Long> {

    Optional<ClienteModel>findByID(long id);

    List<ClienteModel>findByNameContainsIgnoreCaseOrderByName(String name);

}