package com.ifpe.quizz.perguntas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifpe.quizz.perguntas.RespostaEmTexto;

public interface RepositoryRespostaEmTexto extends JpaRepository<RespostaEmTexto,Long> {
    
}
