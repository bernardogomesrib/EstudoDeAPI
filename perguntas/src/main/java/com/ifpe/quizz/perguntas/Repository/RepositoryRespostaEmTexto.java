package com.ifpe.quizz.perguntas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifpe.quizz.perguntas.entities.RespostaEmTexto;

public interface RepositoryRespostaEmTexto extends JpaRepository<RespostaEmTexto,Long> {
}
