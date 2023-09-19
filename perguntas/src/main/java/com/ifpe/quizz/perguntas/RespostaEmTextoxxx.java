package com.ifpe.quizz.perguntas;

public class RespostaEmTextoxxx {
    private long id;   
    private long questao_id;
    private String texto;
    private String explicacao;
    private boolean correta;
    public long getId() {
        return id;
    }
    public boolean isCorreta() {
        return correta;
    }
    public String getExplicacao() {
        return explicacao;
    }
    public String getTexto() {
        return texto;
    }
    public long getQuestao_id() {
        return questao_id;
    }
    public void setCorreta(boolean correta) {
        this.correta = correta;
    }
    public void setExplicacao(String explicacao) {
        this.explicacao = explicacao;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setQuestao_id(long questao_id) {
        this.questao_id = questao_id;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }

}
