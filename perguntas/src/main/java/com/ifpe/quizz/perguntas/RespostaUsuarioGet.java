package com.ifpe.quizz.perguntas;


public class RespostaUsuarioGet {
    private long id;
    private long questao_id;
    private long idUsuario;
    private String resposta;
    private String explicacao;
    private boolean correta;
    public RespostaUsuarioGet(Object[]obj){
        this.setId(obj[0]);
        this.setCorreta(obj[1]);
        this.setExplicacao(obj[2]);
        this.setIdUsuario(obj[3]);
        this.setResposta(obj[4]);
        this.setQuestao_id(obj[5]);
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
    public long getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(Object idUsuario) {
        this.idUsuario = Long.parseLong(idUsuario.toString());
    }
    public String getResposta() {
        return resposta;
    }
    public void setResposta(Object resposta) {
        this.resposta = resposta.toString();
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
