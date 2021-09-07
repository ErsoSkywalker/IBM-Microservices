package com.ChristianOntiveros.ClaseUno.Actors;

public class Batallon {

    private String nombre;
    private Guerrero guerrero;

    public Batallon(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Guerrero getGuerrero() {
        return guerrero;
    }

    public void setGuerrero(Guerrero guerrero) {
        this.guerrero = guerrero;
    }

    @Override
    public String toString() {
        return "Batallon{" +
                "nombre='" + nombre + '\'' +
                ", guerrero=" + guerrero +
                '}';
    }
}
