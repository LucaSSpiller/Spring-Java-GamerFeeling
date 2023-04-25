package br.com.fiap.game.dados;

//rm93618 - Luca Katsumata Spiller, RM94250 - MATHEUS GOMES CAMPOLONGO

import br.com.fiap.game.model.Genero;


public record AtualizarGame(
        Long id,
        String titulo,
        String desenvolvedora,
        String distribuidora,
        String idiomas,

        int numJogadores,

        int dataLancamento,
        Genero genero,
        DadosRequisitos requisitos
) {



}
