package br.com.fiap.game.model;

import br.com.fiap.game.dados.DadosRequisitos;
import jakarta.persistence.Embeddable;

@Embeddable
public class Requisitos {

    private String sistema;
    private String processador;
    private String memoria;
    private String placa;
    private int armazenamento;

    public Requisitos() {
    }

    public Requisitos(DadosRequisitos dados) {
        this.sistema = dados.sistema();
        this.processador = dados.processador();
        this.memoria = dados. memoria();
        this.placa = dados.placa();
        this.armazenamento = dados.armazenamento();
    }

    public void atualizarGame(DadosRequisitos dados) {
        if (dados.sistema() != null) {
            this.sistema = dados.sistema();
        }
        if (dados.processador() != null) {
            this.processador = dados.processador();
        }
        if (dados.memoria() != null) {
            this.memoria = dados.memoria();
        }
        if (dados.placa() != null) {
            this.placa = dados.placa();
        }
        if (dados.armazenamento() != 0) {
            this.armazenamento = dados.armazenamento();
        }




    }

    public Requisitos(String sistema, String processador, String memoria, String placa, int armazenamento) {
        this.sistema = sistema;
        this.processador = processador;
        this.memoria = memoria;
        this.placa = placa;
        this.armazenamento = armazenamento;
    }

    public String getSistema() {
        return sistema;
    }

    public Requisitos setSistema(String sistema) {
        this.sistema = sistema;
        return this;
    }

    public String getProcessador() {
        return processador;
    }

    public Requisitos setProcessador(String processador) {
        this.processador = processador;
        return this;
    }

    public String getMemoria() {
        return memoria;
    }

    public Requisitos setMemoria(String memoria) {
        this.memoria = memoria;
        return this;
    }

    public String getPlaca() {
        return placa;
    }

    public Requisitos setPlaca(String placa) {
        this.placa = placa;
        return this;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public Requisitos setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
        return this;
    }
}
