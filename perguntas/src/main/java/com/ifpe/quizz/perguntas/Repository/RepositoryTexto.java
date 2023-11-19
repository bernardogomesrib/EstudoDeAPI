package com.ifpe.quizz.perguntas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifpe.quizz.perguntas.Entities.Texto;

public interface RepositoryTexto extends JpaRepository<Texto,Long> {
    
}
