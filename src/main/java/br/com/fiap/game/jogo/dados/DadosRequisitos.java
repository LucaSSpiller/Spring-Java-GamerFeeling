package br.com.fiap.game.jogo.dados;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosRequisitos(

     String sistOperacional,
     @NotBlank
     String processador,
     @NotBlank
     String memoria,
     @NotBlank
     String placaVideo,
     @NotNull @Min(1)
     Integer armazenamento
    ){ }
