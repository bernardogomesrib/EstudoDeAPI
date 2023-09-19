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
public class RespostaUsuario {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "questao_id")
    private Questao questao_id;
    private int idUsuario;
    private String resposta;
    private String explicacao;
    private boolean correta;
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
    public int getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getResposta() {
        return resposta;
    }
    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
    public String getExplicacao() {
        return explicacao;
    }
    public void setExplicacao(String explicacao) {
        this.explicacao = explicacao;
    }
    public boolean isCorreta() {
        return correta;
    }
    public void setCorreta(boolean correta) {
        this.correta = correta;
    }
    }
