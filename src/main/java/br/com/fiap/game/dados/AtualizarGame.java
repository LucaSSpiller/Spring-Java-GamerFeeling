package br.com.fiap.game.dados;

import br.com.fiap.game.model.Genero;
import jakarta.validation.constraints.*;

import java.time.Year;

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
