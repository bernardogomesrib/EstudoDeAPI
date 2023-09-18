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
    private Questao questao;
    private String titulo;
    private String texto;
    private int ordem;
    //Syntax error, insert "enum Identifier" to complete EnumHeaderNameJava(1610612976)
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
    
    public Texto(){}
    public Texto(String titulo,String texto,int ordem){
        this.titulo = titulo;
        this.texto = texto;
        this.ordem = ordem;
    }
   
    public int getOrdem() {
        return ordem;
    }
    public String getTexto() {
        return texto;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
