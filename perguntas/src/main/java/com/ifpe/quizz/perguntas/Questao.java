package com.ifpe.quizz.perguntas;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
@Entity
public class Questao {
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    private String materia;
    private String assunto;
    private String tipo;
    private int ordem;
    private String pergunta;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "Questao_id")
    private List<Imagem>imagens;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "Questao_id")
    private List<Texto>textos;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "Questao_id")
    private List<RespostaArquivo>respostaArquivos;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "Questao_id")
    private List<RespostaEmTexto>respostaEmTextos;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "Questao_id")
    private List<RespostaFunc>respostaFuncs;
    
    
    public Questao(){}
    public Questao  (long id,String materia,String assunto,int ordem,String tipo,String pergunta,List<Imagem> imagens,List<Texto> textos,List<RespostaArquivo> respostaArquivos,List<RespostaEmTexto>  respostaEmTextos,List<RespostaFunc> respostaFuncs)
    {
        this.id = id;
        this.ordem = ordem;
        this.textos = textos;
        this.imagens = imagens;
        this.materia = materia;
        this.assunto = assunto;
        this.pergunta = pergunta;
        this.respostaFuncs = respostaFuncs;
        this.respostaArquivos = respostaArquivos;
        this.respostaEmTextos = respostaEmTextos;
        this.tipo = tipo;

    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public List<Imagem> getImagens() {
        return imagens;
    }
    public List<RespostaArquivo> getRespostaArquivos() {
        return respostaArquivos;
    }
    public List<RespostaEmTexto> getRespostaEmTextos() {
        return respostaEmTextos;
    }
    public List<RespostaFunc> getRespostaFuncs() {
        return respostaFuncs;
    }
    public List<Texto> getTextos() {
        return textos;
    }
    public String getAssunto() {
        return assunto;
    }
    public long getId() {
        return id;
    }
    public String getMateria() {
        return materia;
    }
    public int getOrdem() {
        return ordem;
    }
    public String getPergunta() {
        return pergunta;
    }
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setImagens(List<Imagem> imagens) {
        this.imagens = imagens;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }
    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }
    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }
    public void setRespostaArquivos(List<RespostaArquivo>  respostaArquivos) {
        this.respostaArquivos = respostaArquivos;
    }
    public void setRespostaEmTextos(List<RespostaEmTexto>  respostaEmTextos) {
        this.respostaEmTextos = respostaEmTextos;
    }
    public void setRespostaFuncs(List<RespostaFunc>  respostaFuncs) {
        this.respostaFuncs = respostaFuncs;
    }
    public void setTextos(List<Texto>  textos) {
        this.textos = textos;
    }
    public Questao(long id) {
        this.id = id;
    }

}
