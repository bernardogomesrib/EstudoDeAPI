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
//import org.springframework.web.bind.annotation.RequestParam;



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
    public Questao pegarUma(@PathVariable long id){
        return ctrl.findByid(id);
    }
    @GetMapping("/pegar")
    public List<Questao> pegaTudo(){
        return ctrl.findAll();
    }
  /*  @GetMapping("/pegarRespostas/{questao_id}")
    public List<RespostaEmTexto> pegaRespostasTextos(@PathVariable long questao_id){
        return ctrl.resultadoRespostasTexto(questao_id);
    } */
   
    @GetMapping("/respostaArquivo/{questao_id}")
    public List<RespostaArquivo> getMethodName(@PathVariable long questao_id) {
        List<Object[]> objs = ctrl.findRespostaArquivo(questao_id);
        ArrayList<RespostaArquivo> resps = new ArrayList<RespostaArquivo>();
        for (Object[] objects : objs) {
            RespostaArquivo a = new RespostaArquivo();
            a.setId(Long.parseLong(objects[0].toString()));
            a.setCorreta(Boolean.parseBoolean(objects[1].toString()));
            a.setExplicacao(objects[2].toString());
            a.setLink(objects[3].toString());
            a.setTipo(objects[4].toString());
            a.setTranscricao(objects[5].toString());
            a.setQuestao_id(new Questao(objects[6]));
            resps.add(a);
        }
        List<RespostaArquivo> respostas = resps;
        return respostas; 
    }
    
    public ControladorDoBanco getCtrl() {
        return ctrl;
    }
    public void setCtrl(ControladorDoBanco ctrl) {
        this.ctrl = ctrl;
    }
   /* @GetMapping("respostasArq/{num}")
    public List<RespostaArquivo> pegarRespostas(@PathVariable long num){
        return ctrl.findRespostaArquivo(num);
    } */
}
