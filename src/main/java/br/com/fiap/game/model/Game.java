package br.com.fiap.game.model;

//rm93618 - Luca Katsumata Spiller, RM94250 - MATHEUS GOMES CAMPOLONGO

import br.com.fiap.game.dados.AtualizarGame;
import br.com.fiap.game.dados.InserirGame;
import jakarta.persistence.*;

@Entity(name = "gamerfeeling ")
@Table(name = "TB_GAMER_FEEL")
public class Game {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String desenvolvedora;
    private String distribuidora;
    private String idiomas;
    private int numJogadores;
    private int dataLancamento;
    @Enumerated(EnumType.STRING)
    private Genero genero;
    @Embedded
    private Requisitos requisitos;
    private boolean delLogica;

    public Game(){}

    public Game(InserirGame dados) {
        this.titulo = dados.titulo();
        this.desenvolvedora = dados.desenvolvedora();
        this.distribuidora = dados.distribuidora();
        this.idiomas = dados.idiomas();
        this.numJogadores = dados.numJogadores();
        this.dataLancamento = dados.dataLancamento();
        this.genero = dados.genero();
        this.requisitos = new Requisitos(dados.requisitos());
        this.delLogica = true;
    }

    public void deletarGame(){
        this.delLogica = false;
    }

    public void atualizarGame(AtualizarGame dados) {
        if (dados.titulo() != null) {
            this.titulo = dados.titulo();
        }
        if (dados.desenvolvedora() != null) {
            this.desenvolvedora = dados.desenvolvedora();
        }
        if (dados.distribuidora() != null) {
            this.distribuidora = dados.distribuidora();
        }
        if (dados.idiomas() != null) {
            this.idiomas = dados.idiomas();
        }
        if (dados.numJogadores() != 0) {
            this.numJogadores = dados.numJogadores();
        }
        if (dados.dataLancamento() != 0) {
            this.dataLancamento = dados.dataLancamento();
        }
        if (dados.genero() != null) {
            this.genero = dados.genero();
        }
        if (dados.requisitos() != null) {
            this.requisitos.atualizarGame(dados.requisitos());
        }

    }


    public Long getId() {
        return id;
    }

    public Game setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitulo() {
        return titulo;
    }

    public Game setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public String getDesenvolvedora() {
        return desenvolvedora;
    }

    public Game setDesenvolvedora(String desenvolvedora) {
        this.desenvolvedora = desenvolvedora;
        return this;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public Game setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
        return this;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public Game setIdiomas(String idiomas) {
        this.idiomas = idiomas;
        return this;
    }

    public int getNumJogadores() {
        return numJogadores;
    }

    public Game setNumJogadores(int numJogadores) {
        this.numJogadores = numJogadores;
        return this;
    }

    public int getDataLancamento() {
        return dataLancamento;
    }

    public Game setDataLancamento(int dataLancamento) {
        this.dataLancamento = dataLancamento;
        return this;
    }

    public Genero getGenero() {
        return genero;
    }

    public Game setGenero(Genero genero) {
        this.genero = genero;
        return this;
    }

    public Requisitos getRequisitos() {
        return requisitos;
    }

    public Game setRequisitos(Requisitos requisitos) {
        this.requisitos = requisitos;
        return this;
    }

    public boolean isVisivel() {
        return delLogica;
    }

    public Game setDelLogica(boolean delLogica) {
        this.delLogica = delLogica;
        return this;
    }
}
