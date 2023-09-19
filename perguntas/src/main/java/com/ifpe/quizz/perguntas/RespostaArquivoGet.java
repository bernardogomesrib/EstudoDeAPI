package com.ifpe.quizz.perguntas;



public class RespostaArquivoGet {
    private long id;
    private boolean correta;
    private String explicacao;
    private String link;
    private String tipo;
    private String transcricao;
    private long questao_id;
    public RespostaArquivoGet(Object[]obj){
        this.setId(obj[0]);
        this.setCorreta(obj[1]);
        this.setExplicacao(obj[2]);
        this.setLink(obj[3]);
        this.setTipo(obj[4]);
        this.setTranscricao(obj[5]);
        this.setQuestao_id(obj[6]);

    }
    public long getId() {
        return id;
    }
    public void setId(Object id) {
        this.id = Long.parseLong(id.toString());
    }
    public boolean isCorreta() {
        return correta;
    }
    public void setCorreta(Object correta) {
        this.correta = Boolean.parseBoolean(correta.toString());
    }
    public String getExplicacao() {
        return explicacao;
    }
    public void setExplicacao(Object explicacao) {
        this.explicacao = explicacao.toString();
    }
    public String getLink() {
        return link;
    }
    public void setLink(Object link) {
        this.link = link.toString();
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(Object tipo) {
        this.tipo = tipo.toString();
    }
    public String getTranscricao() {
        return transcricao;
    }
    public void setTranscricao(Object transcricao) {
        this.transcricao = transcricao.toString();
    }
    public long getQuestao_id() {
        return questao_id;
    }
    public void setQuestao_id(Object questao_id) {
        this.questao_id = Long.parseLong(questao_id.toString());
   }
  
}
