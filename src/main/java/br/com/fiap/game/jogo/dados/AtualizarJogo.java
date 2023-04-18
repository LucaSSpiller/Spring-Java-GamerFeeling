package br.com.fiap.game.jogo.dados;

import br.com.fiap.game.jogo.model.Genero;
import jakarta.validation.constraints.*;

import java.time.Year;

public record AtualizarJogo(
        String titulo,
        String desenvolvedora,
        String distribuidora,
        String idiomas,
        @Min(1) @Max(4)
        Integer numJogadores,
        @PastOrPresent
        Year dataLancamento,
        Genero genero,
        DadosRequisitos requisitos
) {



}
