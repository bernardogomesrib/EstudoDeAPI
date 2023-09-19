package com.ifpe.quizz.perguntas;

import jakarta.*;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class RespostaArquivo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    private boolean correta;
    private String explicacao;
    private String link;
    private String tipo;
    private String transcricao;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "questao_id")
    private Questao questao;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Questao getQuestao() {
        return questao;
    }
    public void setQuestao(Questao questao) {
        this.questao = questao;
    }
    public RespostaArquivo(){}
    public RespostaArquivo(String link, String tipo, String transcricao, String explicacao, boolean correta){
        this.link  = link;
        this.tipo = tipo;
        this.correta = correta;
        this.explicacao = explicacao;
        this.transcricao = transcricao;
    }
    public String getExplicacao() {
        return explicacao;
    }
    public String getLink() {
        return link;
    }
    public String getTipo() {
        return tipo;
    }
    public String getTranscricao() {
        return transcricao;
    }
    public boolean isCorreta() {
        return correta;
    }
    public void setCorreta(boolean correta) {
        this.correta = correta;
    }
    public void setExplicacao(String explicacao) {
        this.explicacao = explicacao;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setTranscricao(String transcricao) {
        this.transcricao = transcricao;
    }
}
