package com.ifpe.quizz.perguntas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifpe.quizz.perguntas.Imagem;

public interface RepositoryImagem extends JpaRepository<Imagem,Long> {
    
}
