package com.ifpe.quizz.perguntas;

public class TextoGet {

    private long id;
    private long questao_id;
    private String titulo;
    private String texto;
    private int ordem;
    public TextoGet(Object[]obj){
        this.setId(obj[0]);
        this.setOrdem(obj[1]);
        this.setTexto(obj[2]);
        this.setTitulo(obj[3]);
        this.setQuestao_id(obj[4]);
    }
    public long getId() {
        return id;
    }
    public void setId(Object id) {
        this.id = Long.parseLong(id.toString());
    }
    public long getQuestao_id() {
        return questao_id;
    }
    public void setQuestao_id(Object questao_id) {
        this.questao_id = Long.parseLong(questao_id.toString());
   }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(Object titulo) {
        this.titulo = titulo.toString();
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(Object texto) {
        this.texto = texto.toString();
    }
    public int getOrdem() {
        return ordem;
    }
    public void setOrdem(Object ordem) {
        this.ordem = Integer.parseInt(ordem.toString());
    }
           
}
