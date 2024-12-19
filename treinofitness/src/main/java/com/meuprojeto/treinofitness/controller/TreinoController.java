package com.meuprojeto.treinofitness.controller;

import com.meuprojeto.treinofitness.service.TreinoService;
import com.meuprojeto.treinofitness.model.Treino;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/treinos")
public class TreinoController {

    public final TreinoService treinoService;

    public TreinoController(TreinoService treinoService){
        this.treinoService = treinoService;
    }

    @GetMapping
    public ResponseEntity<List<Treino>>listaTodos(){
        return ResponseEntity.ok(treinoService.listartreino());
    }

    @PostMapping
    public ResponseEntity<Treino>criar(@RequestBody Treino treino){
        return ResponseEntity.status(HttpStatus.CREATED).body(treinoService.salvar(treino));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        treinoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
