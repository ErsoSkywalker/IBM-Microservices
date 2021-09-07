package com.ChristianOntiveros.ClaseUno.Actors;

public class Orco extends Guerrero{


    public Orco(double altura, String colorPiel, int agilidad, int fuerza, int resistencia, int vida) {
        super(altura, colorPiel, agilidad, fuerza, resistencia, vida);
    }

    /*
    *
    * Se hace Override de los comportamientos
    * específicos para los orcos.
    *
    * */

    @Override
    public void duermeGuerrero(){
        System.out.println("Soy un Orco y estoy durmiendo");
    }

    @Override
    public void bailaGuerrero(){
        System.out.println("Soy un Orco y no bailo!");
    }

}
