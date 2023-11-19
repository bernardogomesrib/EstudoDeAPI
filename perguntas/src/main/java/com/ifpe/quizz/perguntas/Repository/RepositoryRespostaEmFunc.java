package com.ifpe.quizz.perguntas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifpe.quizz.perguntas.entities.RespostaFunc;

public interface RepositoryRespostaEmFunc extends JpaRepository<RespostaFunc,Long> {
}
