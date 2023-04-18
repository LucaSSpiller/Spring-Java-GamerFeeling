package br.com.fiap.game.controller;

import br.com.fiap.game.jogo.dados.AtualizarJogo;
import br.com.fiap.game.jogo.dados.InserirJogo;
import br.com.fiap.game.jogo.dados.ListarJogos;
import br.com.fiap.game.jogo.model.Jogo;
import br.com.fiap.game.repository.JogoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jogo")
public class Controller {

    @Autowired
    private JogoRepository repo;

    @PostMapping
    @Transactional
    public void save(@RequestBody @Valid InserirJogo dados){
        repo.save(new Jogo(dados));
    }

    @PutMapping("/{id}")
    @Transactional
    public void put(@PathVariable Long id, @RequestBody @Valid AtualizarJogo dados) {
        var jogo = new Jogo();
        jogo = repo.getReferenceById(id);
        jogo.atualizarJogo(dados);
    }

    @GetMapping
    public Page<ListarJogos> findAll(@PageableDefault(size = 5, sort = {"titulo"})Pageable pageable) {
        return repo.findAllByVisivelTrue(pageable).map(ListarJogos::new);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void delete(@PathVariable Long id) {
        var jogo = new Jogo();
        jogo = repo.getReferenceById(id);
        jogo.deletarJogo();
    }

}
