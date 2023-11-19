package com.ifpe.quizz.perguntas.Entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class RespostaEmTexto {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    @Column(name = "questao_id")
    private long questao_id;
    private String texto;
    private String explicacao;
    private boolean correta;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getQuestao_id() {
        return questao_id;
    }
    public void setQuestao_id(long questao_id) {
        this.questao_id = questao_id;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public String getExplicacao() {
        return explicacao;
    }
    public void setExplicacao(String explicacao) {
        this.explicacao = explicacao;
    }
    public boolean isCorreta() {
        return correta;
    }
    public void setCorreta(boolean correta) {
        this.correta = correta;
    }
    }
