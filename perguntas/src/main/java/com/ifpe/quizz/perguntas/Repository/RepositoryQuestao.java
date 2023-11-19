package com.ifpe.quizz.perguntas.Repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ifpe.quizz.perguntas.Entities.Questao;


public interface RepositoryQuestao extends JpaRepository<Questao,Long> {
    Optional<Questao> findById(Long id);
    @Query("SELECT ob FROM Questao ob WHERE ob.assunto = :assunto")
    List<Questao> findByAssunto(@Param("assunto") String assunto);
    @Query("SELECT ob FROM Questao ob WHERE ob.assunto = :assunto AND ob.materia = :materia")
    List<Questao> findByAssuntoEMateria(@Param("materia")String materia, @Param("assunto") String assunto);
    
}
