package com.ifpe.quizz.perguntas;

import java.util.ArrayList;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;






@RestController
@RequestMapping("/questao")
public class Controller {
    @Autowired
    private ControladorDoBanco ctrl;
    @PostMapping("/cadastrar")
    public Questao cadastrar(@RequestBody Questao qst){
            return ctrl.save(qst);
    }
    @GetMapping("/pegar/{id}")
    public List<QuestaoGet> pegarUma(@PathVariable long id){
         List<Object[]> objs = ctrl.find(id);
        ArrayList<QuestaoGet> resps = new ArrayList<QuestaoGet>();
        for (Object[] objects : objs) {
            resps.add(new QuestaoGet(objects));
        }
        for (int i=0;i<resps.size();i++){
            resps.get(i).setRespostaArquivos(getRespArq(id));
            resps.get(i).setRespostaEmTextos(getRespText(id));
            resps.get(i).setImagens(getImages(id));
            resps.get(i).setTextos(getTexts(id));
        }
        List<QuestaoGet> respostas = resps;
        return respostas;
    }

       
    
    @GetMapping("/pegar/")
    public List<List<QuestaoGet>> pegaTudo(){
        List<Object[]>tds = ctrl.findTodos();
        ArrayList<List<QuestaoGet>>lista = new ArrayList<List<QuestaoGet>>();
        for (Object[] objects : tds) {
           lista.add(pegarUma(Long.parseLong(objects[0].toString()))); 
        }
        List<List<QuestaoGet>> resp = lista;
        return resp;
    }
  /*  @GetMapping("/pegarRespostas/{questao_id}")
    public List<RespostaEmTexto> pegaRespostasTextos(@PathVariable long questao_id){
        return ctrl.resultadoRespostasTexto(questao_id);
    } */
   
    @GetMapping("/respostaArquivo/{questao_id}")
    public List<RespostaArquivoGet> getRespArq(@PathVariable long questao_id) {
        List<Object[]> objs = ctrl.findRespostaArquivo(questao_id);
        ArrayList<RespostaArquivoGet> resps = new ArrayList<RespostaArquivoGet>();
        for (Object[] objects : objs) {
            resps.add(new RespostaArquivoGet(objects));
        }
        List<RespostaArquivoGet> respostas = resps;
        return respostas; 
    }
    @GetMapping("/respostaEmTexto/{QID}")
    public List<RespostaEmTextoGet> getRespText(@PathVariable long QID){
        List<Object[]> objs = ctrl.findRespostaEmTextos(QID);
        ArrayList<RespostaEmTextoGet> resps = new ArrayList<RespostaEmTextoGet>();
        for (Object[] objects : objs) {
            resps.add(new RespostaEmTextoGet(objects));
        }
        List<RespostaEmTextoGet> respostas = resps;
        return respostas; 
    }
    @GetMapping("/respostaEmFunc/{qid}")
    public List<RespostaFuncGet> getRespFunc(@PathVariable long qid) {
        List<Object[]> objs = ctrl.findRespostaFunc(qid);
        ArrayList<RespostaFuncGet> resps = new ArrayList<RespostaFuncGet>();
        for (Object[] objects : objs) {
            resps.add(new RespostaFuncGet(objects));
        }
        List<RespostaFuncGet> respostas = resps;
        return respostas; 
    }
    public void setCtrl(ControladorDoBanco ctrl) {
        this.ctrl = ctrl;
    }
    @GetMapping("/RespostaUsuario/{qid}/{usr}")
    public List<RespostaUsuarioGet> getRespUs(@PathVariable long qid,long usr){
         List<Object[]> objs = ctrl.findRespostaUsuario(qid,usr);
        ArrayList<RespostaUsuarioGet> resps = new ArrayList<RespostaUsuarioGet>();
        for (Object[] objects : objs) {
            resps.add(new RespostaUsuarioGet(objects));
        }
        List<RespostaUsuarioGet> respostas = resps;
        return respostas; 
    }
    @GetMapping("/Texto/{QID}")
    public List<TextoGet>getTexts(@PathVariable long QID){
         List<Object[]> objs = ctrl.findTextos(QID);
        ArrayList<TextoGet> resps = new ArrayList<TextoGet>();
        for (Object[] objects : objs) {
            resps.add(new TextoGet(objects));
        }
        List<TextoGet> respostas = resps;
        return respostas; 
    }
    @GetMapping("/Imagem/{QID}")
    public List<ImagemGet> getImages(@PathVariable long QID){
         List<Object[]> objs = ctrl.findImagens(QID);
        ArrayList<ImagemGet> resps = new ArrayList<ImagemGet>();
        for (Object[] objects : objs) {
            resps.add(new ImagemGet(objects));
        }
        List<ImagemGet> respostas = resps;
        return respostas; 
    }
    
   /* @GetMapping("respostasArq/{num}")
    public List<RespostaArquivo> pegarRespostas(@PathVariable long num){
        return ctrl.findRespostaArquivo(num);
    } */
}
