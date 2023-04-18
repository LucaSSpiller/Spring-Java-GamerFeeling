package br.com.fiap.game.jogo.dados;

import br.com.fiap.game.jogo.model.Genero;
import jakarta.validation.constraints.*;

import java.time.Year;

public record InserirJogo(
        @NotBlank
        String titulo,
        @NotBlank
        String desenvolvedora,
        String distribuidora,
        @NotBlank
        String idiomas,
        @NotNull @Min(1) @Max(4)
        Integer numJogadores,
        @NotNull @PastOrPresent
        Year dataLancamento,
        @NotNull
        Genero genero,
        @NotNull
        DadosRequisitos requisitos

    ){
}
