package br.com.fiap.game.repository;

import br.com.fiap.game.jogo.model.Jogo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogoRepository extends JpaRepository<Jogo, Long> {
    Page<Jogo> findAllByVisivelTrue(Pageable pageable);
}
