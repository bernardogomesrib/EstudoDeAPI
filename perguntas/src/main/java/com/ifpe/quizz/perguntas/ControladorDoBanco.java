package com.ifpe.quizz.perguntas;



import java.util.List;


//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ControladorDoBanco extends CrudRepository<Questao,Long>{
    List<Questao> findAll();
    Questao findByid(long id);
    @Query(value = "select resposta_arquivo.id,resposta_arquivo.correta,resposta_arquivo.explicacao,resposta_arquivo.link,resposta_arquivo.tipo,resposta_arquivo.transcricao,resposta_arquivo.questao_id from resposta_arquivo where questao_id = :questao_id ;",nativeQuery = true)
    List<RespostaArquivo> findRespostaArquivo(@Param("questao_id") long questao_id);

}
