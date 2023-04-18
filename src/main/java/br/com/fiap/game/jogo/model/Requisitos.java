package br.com.fiap.game.jogo.model;

import br.com.fiap.game.jogo.dados.DadosRequisitos;
import jakarta.persistence.Embeddable;

@Embeddable
public class Requisitos {

    private String sistOperacional;
    private String processador;
    private String memoria;
    private String placaVideo;
    private int armazenamento;

    public Requisitos() {
    }

    public Requisitos(DadosRequisitos dados) {
        this.sistOperacional = dados.sistOperacional();
        this.processador = dados.processador();
        this.memoria = dados. memoria();
        this.placaVideo = dados.placaVideo();
        this.armazenamento = dados.armazenamento();
    }

    public void atualizarJogo(DadosRequisitos dados) {
        if (dados.armazenamento() != null) {
            this.armazenamento = dados.armazenamento();
        }
        if (dados.memoria() != null) {
            this.memoria = dados.memoria();
        }
        if (dados.sistOperacional() != null) {
            this.sistOperacional = dados.sistOperacional();
        }
        if (dados.placaVideo() != null) {
            this.placaVideo = dados.placaVideo();
        }
        if (dados.processador() != null) {
            this.processador = dados.processador();
        }
    }

    public Requisitos(String sistOperacional, String processador, String memoria, String placaVideo, int armazenamento) {
        this.sistOperacional = sistOperacional;
        this.processador = processador;
        this.memoria = memoria;
        this.placaVideo = placaVideo;
        this.armazenamento = armazenamento;
    }

    public String getSistOperacional() {
        return sistOperacional;
    }

    public Requisitos setSistOperacional(String sistOperacional) {
        this.sistOperacional = sistOperacional;
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

    public String getPlacaVideo() {
        return placaVideo;
    }

    public Requisitos setPlacaVideo(String placaVideo) {
        this.placaVideo = placaVideo;
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
