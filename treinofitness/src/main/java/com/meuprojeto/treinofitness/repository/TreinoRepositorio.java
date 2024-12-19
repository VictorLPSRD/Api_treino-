package com.meuprojeto.treinofitness.repository;

import com.meuprojeto.treinofitness.model.Treino;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreinoRepositorio extends JpaRepository<Treino, Long> {
}
