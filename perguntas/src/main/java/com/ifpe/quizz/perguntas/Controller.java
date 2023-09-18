package com.ifpe.quizz.perguntas;

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
    public Questao pegarUma(@PathVariable long id){
        return ctrl.findByid(id);
    }
    @GetMapping("/pegar")
    public List<Questao> pegaTudo(){
        return ctrl.findAll();
    }
    public ControladorDoBanco getCtrl() {
        return ctrl;
    }
    public void setCtrl(ControladorDoBanco ctrl) {
        this.ctrl = ctrl;
    }
    @GetMapping("respostasArq/{num}")
    public List<RespostaArquivo> pegarRespostas(@PathVariable long num){
        return ctrl.findRespostaArquivo(num);
    }
}
