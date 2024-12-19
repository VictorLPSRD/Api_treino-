package com.meuprojeto.treinofitness.model;


import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
public class Treino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Long id;
        private String Nomeexercicio;
        private int repeticoes;
        private int series;
        private int carga; //Carga Kg


}
