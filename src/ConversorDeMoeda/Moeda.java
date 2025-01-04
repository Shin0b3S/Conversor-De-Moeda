package ConversorDeMoeda;

import java.util.HashMap;

class Moeda {
    private String nome;
    private double indiceDeTroca;

    public Moeda(String nome, double indiceDeTroca) {
        this.nome = nome;
        this.indiceDeTroca = indiceDeTroca;
    }

    public double getIndiceDeTroca() {
        return indiceDeTroca;
    }
}