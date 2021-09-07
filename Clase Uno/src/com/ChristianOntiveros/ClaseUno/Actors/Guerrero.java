package com.ChristianOntiveros.ClaseUno.Actors;

public class Guerrero {

    private double altura;
    private String colorPiel;
    private int agilidad, fuerza, resistencia, vida;

    public Guerrero(double altura, String colorPiel, int agilidad, int fuerza, int resistencia, int vida) {
        this.altura = altura;
        this.colorPiel = colorPiel;
        this.agilidad = agilidad;
        this.fuerza = fuerza;
        this.resistencia = resistencia;
        this.vida = vida;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void bailaGuerrero(){
        System.out.println("Soy un guerrero y bailo");
    }

    public void duermeGuerrero(){
        System.out.println("Soy un guerrero y duermo");
    }

    @Override
    public String toString() {
        return "Guerrero{" +
                "altura=" + altura +
                ", colorPiel='" + colorPiel + '\'' +
                ", agilidad=" + agilidad +
                ", fuerza=" + fuerza +
                ", resistencia=" + resistencia +
                ", vida=" + vida +
                '}';
    }
}
