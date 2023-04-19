package br.com.fiap.game.controller;

import br.com.fiap.game.dados.AtualizarGame;
import br.com.fiap.game.dados.InserirGame;
import br.com.fiap.game.dados.ListarGames;
import br.com.fiap.game.model.Game;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/game")
public class GameController {

    @Autowired
    private GameRepository repository;

    @PostMapping
    @Transactional
    public void save(@RequestBody @Valid InserirGame dados){
        repository.save(new Game(dados));
    }


    @GetMapping
    public Page<ListarGames> findAll(@PageableDefault(size = 5, sort = {"titulo"}) Pageable pagina) {
        return repository.findAllByVisivelTrue(pagina).map(ListarGames::new);
    }


    @PutMapping
    @Transactional
    public void put(@RequestBody @Valid AtualizarGame dados) {
        var game = new Game();
        game = repository.getReferenceById(dados.id());
        game.atualizarGame(dados);
    }


    @DeleteMapping("/{id}")
    @Transactional
    public void delete(@PathVariable Long id) {
        var game = new Game();
        game = repository.getReferenceById(id);
        game.deletarGame();
    }

}
