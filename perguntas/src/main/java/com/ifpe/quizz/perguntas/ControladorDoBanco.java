package com.ifpe.quizz.perguntas;



//import java.lang.reflect.Field;i//import java.util.ArrayList;
import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import org.springframework.stereotype.Repository;


@Repository
public interface ControladorDoBanco extends CrudRepository<Questao,Long>{
    List<Questao> findAll();
    Questao findByid(long id);
    @Query(value = "select * from resposta_arquivo where questao_id = :questao_id ;",nativeQuery = true)
    List<Object[]> findRespostaArquivo(@Param("questao_id")long questao_id);
    @Query(value = "select * from resposta_em_texto where questao_id = :questao_id ;", nativeQuery = true)
    Iterable<Object[]> findRespostaEmTextos(@Param("questao_id") long questao_id);   
    @Query(value = "select * from resposta_func where questao_id = :questao_id ;",nativeQuery = true)
    Iterable<Object[]> findRespostaFuncs(@Param("questao_id") long questao_id);
    @Query(value = "select * from texto where questao_id = :questao_id ;",nativeQuery = true)
    Iterable<Object[]> findTextos(@Param("questao_id") long questao_id);
    @Query(value = "select * from imagem where questao_id = :questao_id ;",nativeQuery = true)
    Iterable<Object[]> findImagens(@Param("questao_id") long questao_id);
    @Query(value = "select * from resposta_usuario where questao_id = ?1 and :2 ;",nativeQuery = true)
    Iterable<Object[]> findRespostaUsuario(long questao_id,long id_usuario);
    @Query(value = "select * from questao where id = :questao_id ;",nativeQuery = true)
    Iterable<Object[]> find(@Param("questao_id") long questao_id);
   
}


