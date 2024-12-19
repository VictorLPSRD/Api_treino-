package com.meuprojeto.treinofitness.service;

import com.meuprojeto.treinofitness.repository.TreinoRepositorio;

import com.meuprojeto.treinofitness.model.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreinoService {
    private final TreinoRepositorio treinoRepositorio;

  public TreinoService(TreinoRepositorio treinoRepositorio){
      this.treinoRepositorio = treinoRepositorio;
  }

  public List<Treino> listartreino(){
      return treinoRepositorio.findAll();
  }

  public Treino salvar(Treino treino){
      return treinoRepositorio.save(treino);
  }

  public void deletar(Long id){
      treinoRepositorio.deleteById(id);
  }
}
