package com.cpifppiramide.actividad2.domain;

public class Coche {
    private final String matricula, marca, modelo;
    private final Integer km;

    public Coche(String matricula, String marca, String modelo, Integer km) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.km = km;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getKm() {
        return km;
    }
}
