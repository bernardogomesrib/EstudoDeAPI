package com.ifpe.quizz.perguntas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifpe.quizz.perguntas.entities.Texto;

public interface RepositoryTexto extends JpaRepository<Texto,Long> {
}
