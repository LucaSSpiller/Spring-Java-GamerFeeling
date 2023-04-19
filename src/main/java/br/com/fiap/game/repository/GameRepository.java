package br.com.fiap.game.repository;

import br.com.fiap.game.model.Game;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
    Page<Game> findAllByVisivelTrue(Pageable pagina);
}
