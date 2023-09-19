package com.ifpe.quizz.perguntas;

public class RespostaEmTextoGet {
    private long id;   
    private long questao_id;
    private String texto;
    private String explicacao;
    private boolean correta;
    public RespostaEmTextoGet(Object[]obj){
        this.setId(obj[0]);
        this.setCorreta(obj[1]);
        this.setExplicacao(obj[2]);
        this.setTexto(obj[3]);
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
    public String getTexto() {
        return texto;
    }
    public void setTexto(Object texto) {
        this.texto = texto.toString();
    }
    public String getExplicacao() {
        return explicacao;
    }
    public void setExplicacao(Object explicacao) {
        this.explicacao = explicacao.toString();
    }
    public boolean isCorreta() {
        return correta;
    }
    public void setCorreta(Object correta) {
        this.correta = Boolean.parseBoolean(correta.toString());
    }
    
}
