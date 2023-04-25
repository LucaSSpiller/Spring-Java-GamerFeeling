package br.com.fiap.game.dados;

//rm93618 - Luca Katsumata Spiller, RM94250 - MATHEUS GOMES CAMPOLONGO

import br.com.fiap.game.model.Genero;
import br.com.fiap.game.model.Game;

public record ListarGames(

    Long id,
    String titulo,
    String desenvolvedora,
    int numJogadores,
    Genero genero,
    String armazenamento
    ){
    public ListarGames(Game game){
        this (
                game.getId(),
                game.getTitulo(),
                game.getDesenvolvedora(),
                game.getNumJogadores(),
                game.getGenero(),
                game.getRequisitos().getArmazenamento()
        );
    }
}
