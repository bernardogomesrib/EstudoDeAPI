package com.ifpe.quizz.perguntas;

import jakarta.*;
//import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class RespostaUsuario {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "questao_id")
    private Questao questao;
    private int idUsuario;
    private String resposta;
    private String explicacao;
    private boolean correta;
    
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
    public RespostaUsuario(){}
    public  RespostaUsuario(int idUsuario, String resposta,String explicacao, boolean correta){
        this.idUsuario = idUsuario;
        this.resposta = resposta;
        this.explicacao = explicacao;
        this.correta = correta;
    }
    public String getExplicacao() {
        return explicacao;
    }
    public int getIdUsuario() {
        return idUsuario;
    }
    public String getResposta() {
        return resposta;
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
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
}
