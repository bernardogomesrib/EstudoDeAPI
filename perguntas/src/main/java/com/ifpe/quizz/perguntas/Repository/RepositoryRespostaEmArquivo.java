package com.ifpe.quizz.perguntas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifpe.quizz.perguntas.Entities.RespostaArquivo;

public interface RepositoryRespostaEmArquivo extends JpaRepository<RespostaArquivo,Long> {
    
}
