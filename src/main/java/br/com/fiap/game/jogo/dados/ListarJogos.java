package br.com.fiap.game.jogo.dados;

import br.com.fiap.game.jogo.model.Genero;
import br.com.fiap.game.jogo.model.Jogo;

public record ListarJogos(

    Long id,
    String titulo,
    String desenvolvedora,
    int numJogadores,
    Genero genero,
    int armazenamento
    ){
    public ListarJogos(Jogo jogo){
        this (
                jogo.getId(),
                jogo.getTitulo(),
                jogo.getDesenvolvedora(),
                jogo.getNumJogadores(),
                jogo.getGenero(),
                jogo.getRequisitos().getArmazenamento()
        );
    }
}
