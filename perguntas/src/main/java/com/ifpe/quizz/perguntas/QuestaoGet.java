package com.ifpe.quizz.perguntas;

import java.util.List;

public class QuestaoGet {
    private long id;
    private String materia;
    private String assunto;
    private String tipo;
    private int ordem;
    private String pergunta;
    private List<ImagemGet>imagens;
    private List<TextoGet>textos;
    private List<RespostaArquivoGet>respostaArquivos;
    private List<RespostaEmTextoGet>respostaEmTextos;
    public QuestaoGet(Object[]obj){
        /* [
    1,
    "peido",
    "arroto",
    4,
    "qual é o livro sobre scat e peidos feito pelo autor Gustavo Scat?",
    "uma escolha"
  ] */
        this.setId(obj[0]);
        
        this.setAssunto(obj[1]);
        
        this.setMateria(obj[2]);
        
        this.setOrdem(obj[3]);
        
        this.setPergunta(obj[4]);
        
        this.setTipo(obj[5]);
    }
    public long getId() {
        return id;
    }
    public void setId(Object id) {
        this.id = Long.parseLong(id.toString());
    }
    public String getMateria() {
        return materia;
    }
    public void setMateria(Object materia) {
        this.materia = materia.toString();
    }
    public String getAssunto() {
        return assunto;
    }
    public void setAssunto(Object assunto) {
        this.assunto = assunto.toString();
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(Object tipo) {
        this.tipo = tipo.toString();
    }
    public int getOrdem() {
        return ordem;
    }
    public void setOrdem(Object ordem) {
        this.ordem = Integer.parseInt(ordem.toString());
    }
    public String getPergunta() {
        return pergunta;
    }
    public void setPergunta(Object pergunta) {
        this.pergunta = pergunta.toString();
    }
    public List<ImagemGet> getImagens() {
        return imagens;
    }
    public void setImagens(List<ImagemGet> imagens) {
        this.imagens = imagens;
    }
    public List<TextoGet> getTextos() {
        return textos;
    }
    public void setTextos(List<TextoGet> textos) {
        this.textos = textos;
    }
    public List<RespostaArquivoGet> getRespostaArquivos() {
        return respostaArquivos;
    }
    public void setRespostaArquivos(List<RespostaArquivoGet> respostaArquivos) {
        this.respostaArquivos = respostaArquivos;
    }
    public List<RespostaEmTextoGet> getRespostaEmTextos() {
        return respostaEmTextos;
    }
    public void setRespostaEmTextos(List<RespostaEmTextoGet> respostaEmTextos) {
        this.respostaEmTextos = respostaEmTextos;
    }

}