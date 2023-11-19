package com.ifpe.quizz.perguntas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifpe.quizz.perguntas.RespostaFunc;

public interface RepositoryRespostaEmFunc extends JpaRepository<RespostaFunc,Long> {    
}
