package com.ifpe.quizz.perguntas.Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifpe.quizz.perguntas.Entities.Questao;
import com.ifpe.quizz.perguntas.Entities.RespostaUsuario;
import com.ifpe.quizz.perguntas.Repository.RepositoryQuestao;
import com.ifpe.quizz.perguntas.Repository.RepositoryRespostaUsuario;

@RestController
@RequestMapping("/questao")
public class Controller {
    @Autowired
    private RepositoryQuestao rsq;
    @Autowired
    private RepositoryRespostaUsuario rus;
    @GetMapping("/buscar/{id}")
    public Optional<Questao> pegaicarai(@PathVariable long id){
        return rsq.findById(id);
    }
    @PostMapping("/cadastrar/")
    public Questao cadastrar(@RequestBody Questao qst){
            return rsq.save(qst);
    }
    @GetMapping("/respostausuario/questao/{id}")
    public List<RespostaUsuario> pegarRespostasDousuarioPorPergunta(@PathVariable long id){
        return rus.FindByquestao_id(id);
    }
     @GetMapping("/respostausuario/usuario/{id}")
    public List<RespostaUsuario> pegarRespostasDousuarioPorUsuario(@PathVariable long id){
        return rus.FindByUsuarioId(id);
    }
    @GetMapping("/buscar/{materia}/{assunto}/")
    public List<Questao> procuraQuestaoporMateriaEAssunto(@PathVariable String materia,@PathVariable String assunto){
        return rsq.findByAssuntoEMateria(materia, assunto);
    }
    @GetMapping("/buscar/{materia}/{assunto}/{id}")
    public Questao procuraQuestaoporMateriaEAssunto(@PathVariable String materia,@PathVariable String assunto,@PathVariable long id){
        return rsq.findByAssuntoMateriaeId(materia, assunto,id);
    }
   
}
