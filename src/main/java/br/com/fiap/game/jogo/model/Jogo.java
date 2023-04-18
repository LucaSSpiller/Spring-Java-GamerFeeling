package br.com.fiap.game.jogo.model;

import br.com.fiap.game.jogo.dados.AtualizarJogo;
import br.com.fiap.game.jogo.dados.InserirJogo;
import jakarta.persistence.*;

import java.time.Year;

@Entity(name = "gamerfeeling ")
@Table(name = "TB_GAME_FEEL")
public class Jogo {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String desenvolvedora;
    private String distribuidora;
    private String idiomas;
    private int numJogadores;
    private Year dataLancamento;
    @Enumerated(EnumType.STRING)
    private Genero genero;
    @Embedded
    private Requisitos requisitos;
    private boolean visivel;

    public Jogo(){}

    public Jogo(InserirJogo dados) {
        this.titulo = dados.titulo();
        this.desenvolvedora = dados.desenvolvedora();
        this.distribuidora = dados.distribuidora();
        this.idiomas = dados.idiomas();
        this.numJogadores = dados.numJogadores();
        this.dataLancamento = dados.dataLancamento();
        this.genero = dados.genero();
        this.requisitos = new Requisitos(dados.requisitos());
        this.visivel = true;
    }

    public void deletarJogo(){
        this.visivel = false;
    }

    public void atualizarJogo(AtualizarJogo dados) {
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
        if (dados.numJogadores() != null) {
            this.numJogadores = dados.numJogadores();
        }
        if (dados.dataLancamento() != null) {
            this.dataLancamento = dados.dataLancamento();
        }
        if (dados.genero() != null) {
            this.genero = dados.genero();
        }
        if (dados.requisitos() != null) {
            this.requisitos.atualizarJogo(dados.requisitos());
        }

    }


    public Long getId() {
        return id;
    }

    public Jogo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitulo() {
        return titulo;
    }

    public Jogo setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public String getDesenvolvedora() {
        return desenvolvedora;
    }

    public Jogo setDesenvolvedora(String desenvolvedora) {
        this.desenvolvedora = desenvolvedora;
        return this;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public Jogo setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
        return this;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public Jogo setIdiomas(String idiomas) {
        this.idiomas = idiomas;
        return this;
    }

    public int getNumJogadores() {
        return numJogadores;
    }

    public Jogo setNumJogadores(int numJogadores) {
        this.numJogadores = numJogadores;
        return this;
    }

    public Year getDataLancamento() {
        return dataLancamento;
    }

    public Jogo setDataLancamento(Year dataLancamento) {
        this.dataLancamento = dataLancamento;
        return this;
    }

    public Genero getGenero() {
        return genero;
    }

    public Jogo setGenero(Genero genero) {
        this.genero = genero;
        return this;
    }

    public Requisitos getRequisitos() {
        return requisitos;
    }

    public Jogo setRequisitos(Requisitos requisitos) {
        this.requisitos = requisitos;
        return this;
    }

    public boolean isVisivel() {
        return visivel;
    }

    public Jogo setVisivel(boolean visivel) {
        this.visivel = visivel;
        return this;
    }
}
