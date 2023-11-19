package com.ifpe.quizz.perguntas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifpe.quizz.perguntas.entities.Imagem;

public interface RepositoryImagem extends JpaRepository<Imagem,Long> {
}
