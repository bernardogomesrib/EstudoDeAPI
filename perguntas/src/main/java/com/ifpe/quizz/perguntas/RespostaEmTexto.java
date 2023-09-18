package com.ifpe.quizz.perguntas;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class RespostaEmTexto {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "questao_id")
    private Questao questao;
    private String texto;
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
    
    public RespostaEmTexto(){}
    public RespostaEmTexto(String texto,String explicacao,boolean correta){
        this.texto = texto;
        this.explicacao = explicacao;
        this.correta = correta;
    }
    public String getExplicacao() {
        return explicacao;
    }
    public String getTexto() {
        return texto;
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
    public void setTexto(String texto) {
        this.texto = texto;
    }
}
