package com.ifpe.quizz.perguntas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifpe.quizz.perguntas.entities.RespostaArquivo;

public interface RepositoryRespostaEmArquivo extends JpaRepository<RespostaArquivo,Long> {
}
