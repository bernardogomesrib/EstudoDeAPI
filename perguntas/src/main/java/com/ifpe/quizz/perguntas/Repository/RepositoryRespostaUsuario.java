package com.ifpe.quizz.perguntas.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ifpe.quizz.perguntas.RespostaUsuario;

public interface RepositoryRespostaUsuario extends JpaRepository<RespostaUsuario,Long>{
    @Query("SELECT a FROM RespostaUsuario a WHERE a.questao_id = :idquestao")
    List<RespostaUsuario> FindByquestao_id(@Param("idquestao") Long idquestao);
    @Query("SELECT a FROM RespostaUsuario a WHERE a.idUsuario = :idquestao")
    List<RespostaUsuario> FindByUsuarioId(@Param("idquestao") Long idquestao);
}
