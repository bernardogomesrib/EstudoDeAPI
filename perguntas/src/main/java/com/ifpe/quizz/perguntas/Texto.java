package com.ifpe.quizz.perguntas;

//import jakarta.persistence.EmbeddedId;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Texto {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "questao_id")
    private Questao questao_id;
    private String titulo;
    private String texto;
    private int ordem;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Questao getQuestao_id() {
        return questao_id;
    }
    public void setQuestao_id(Questao questao_id) {
        this.questao_id = questao_id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public int getOrdem() {
        return ordem;
    }
    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }
       
}
