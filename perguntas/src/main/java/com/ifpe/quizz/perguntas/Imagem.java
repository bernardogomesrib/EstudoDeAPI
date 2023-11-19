package com.ifpe.quizz.perguntas;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Imagem {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    @Column(name = "questao_id")
    private long questao_id;
    private String link;
    private String trancricao;
    private int ordem;
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
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public String getTrancricao() {
        return trancricao;
    }
    public void setTrancricao(String trancricao) {
        this.trancricao = trancricao;
    }
    public int getOrdem() {
        return ordem;
    }
    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }
   
}
