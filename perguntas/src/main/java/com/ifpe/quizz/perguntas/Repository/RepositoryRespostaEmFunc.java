package com.ifpe.quizz.perguntas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifpe.quizz.perguntas.Entities.RespostaFunc;

public interface RepositoryRespostaEmFunc extends JpaRepository<RespostaFunc,Long> {    
}
