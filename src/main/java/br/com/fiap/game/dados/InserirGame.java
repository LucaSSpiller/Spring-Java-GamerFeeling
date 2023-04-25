package br.com.fiap.game.dados;

//rm93618 - Luca Katsumata Spiller, RM94250 - MATHEUS GOMES CAMPOLONGO

import br.com.fiap.game.model.Genero;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.Range;

public record InserirGame(
        @NotBlank
        String titulo,
        @NotBlank
        String desenvolvedora,
        String distribuidora,
        @NotBlank
        String idiomas,
        @Range(min = 1, max = 4, message = "Quantidade máxima de jogadores excedida!")
        int numJogadores,
        @NotNull
        int dataLancamento,
        @NotNull
        Genero genero,
        @NotNull
        DadosRequisitos requisitos

    ){
}
