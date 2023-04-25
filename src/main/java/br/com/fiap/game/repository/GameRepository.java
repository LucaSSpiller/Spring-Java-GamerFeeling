package br.com.fiap.game.repository;

//rm93618 - Luca Katsumata Spiller, RM94250 - MATHEUS GOMES CAMPOLONGO

import br.com.fiap.game.model.Game;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
    Page<Game> findAllByDelLogicaTrue(Pageable pagina);
}
