package br.com.fiap.game.dados;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosRequisitos(

     String sistema,
     @NotBlank
     String processador,
     @NotBlank
     String memoria,
     @NotBlank
     String placa,
     @NotNull @Min(1)
     int armazenamento
    ){ }
