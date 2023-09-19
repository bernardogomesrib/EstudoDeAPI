package com.ifpe.quizz.perguntas;



import java.lang.reflect.Field;
import java.util.ArrayList;
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
    @Query(value = "select * from resposta_arquivo where questao_id = :questao_id ;",nativeQuery = true)
    List<RespostaArquivo> findRespostaArquivo(@Param("questao_id") long questao_id);
    @Query(value = "select * from resposta_em_texto where questao_id = :questao_id ;", nativeQuery = true)
    Iterable<Object[]> findRespostaEmTextos(@Param("questao_id") long questao_id);   
    public default List<RespostaEmTexto> resultadoRespostasTexto(long questao_id){
        Iterable<Object[]> obj = this.findRespostaEmTextos(questao_id);
        ArrayList<RespostaEmTexto> resps = new ArrayList<RespostaEmTexto>();
        for (Object[] objects : obj) {
            resps.add(new RespostaEmTexto(objects[3].toString(),objects[2].toString(),Boolean.parseBoolean(objects[1].toString())));
        }
        List<RespostaEmTexto> r = resps;
        return r;                
    }
   
}


