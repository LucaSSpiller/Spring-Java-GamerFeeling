package br.com.fiap.game.dados;

import br.com.fiap.game.model.Genero;
import jakarta.validation.constraints.*;

import java.time.Year;

public record InserirGame(
        @NotBlank
        String titulo,
        @NotBlank
        String desenvolvedora,
        String distribuidora,
        @NotBlank
        String idiomas,
        @NotNull @Min(1) @Max(4)
        int numJogadores,
        @NotNull @PastOrPresent
        int dataLancamento,
        @NotNull
        Genero genero,
        @NotNull
        DadosRequisitos requisitos

    ){
}
