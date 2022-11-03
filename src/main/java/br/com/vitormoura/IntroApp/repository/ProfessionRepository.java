package br.com.vitormoura.IntroApp.repository;

import br.com.vitormoura.IntroApp.model.ProfessionModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfessionRepository extends JpaRepository<ProfessionModel, Long> {

    Optional<ProfessionModel> findById(long id);


}
