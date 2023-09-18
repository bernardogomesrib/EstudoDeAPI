package com.ifpe.quizz.perguntas;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Imagem {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "questao_id")
    private Questao questao;
    private String link;
    private String trancricao;
    private int ordem;
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
    public Imagem(){}
    public Imagem(String link, String transcricao, int ordem){
        this.link = link;
        this.trancricao = transcricao;
        this.ordem = ordem;
    }
    public String getLink() {
        return link;
    }
    public int getOrdem() {
        return ordem;
    }
    public String getTrancricao() {
        return trancricao;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }
    public void setTrancricao(String trancricao) {
        this.trancricao = trancricao;
    }
    
}
