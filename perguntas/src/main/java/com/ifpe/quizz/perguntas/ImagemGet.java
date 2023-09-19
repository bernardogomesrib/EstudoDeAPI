package com.ifpe.quizz.perguntas;

public class ImagemGet {

    private long id;
    private long questao_id;
    private String link;
    private String trancricao;
    private int ordem;
    public ImagemGet(Object[]obj){
        this.setId(obj[0]);
        this.setLink(obj[1]);
        this.setOrdem(obj[2]);
        this.setTrancricao(obj[3]);
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
    public String getLink() {
        return link;
    }
    public void setLink(Object link) {
        this.link = link.toString();
    }
    public String getTrancricao() {
        return trancricao;
    }
    public void setTrancricao(Object trancricao) {
        this.trancricao = trancricao.toString();
    }
    public int getOrdem() {
        return ordem;
    }
    public void setOrdem(Object ordem) {
        this.ordem = Integer.parseInt(ordem.toString());
    }
    
}
