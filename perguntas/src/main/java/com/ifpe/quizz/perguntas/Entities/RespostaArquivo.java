package com.ifpe.quizz.perguntas.Entities;

import jakarta.persistence.Column;

//import org.hibernate.engine.jdbc.env.internal.LobCreationLogging_.logger;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


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
    @Column(name = "questao_id")
    private long questao_id;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public boolean isCorreta() {
        return correta;
    }
    public void setCorreta(boolean correta) {
        this.correta = correta;
    }
    public String getExplicacao() {
        return explicacao;
    }
    public void setExplicacao(String explicacao) {
        this.explicacao = explicacao;
    }
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTranscricao() {
        return transcricao;
    }
    public void setTranscricao(String transcricao) {
        this.transcricao = transcricao;
    }
    public long getQuestao_id() {
        return questao_id;
    }
    public void setQuestao_id(long questao_id) {
        this.questao_id = questao_id;
    }
    
}
