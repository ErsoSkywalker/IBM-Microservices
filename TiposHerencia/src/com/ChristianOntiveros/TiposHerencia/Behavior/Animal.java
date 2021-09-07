package com.ChristianOntiveros.TiposHerencia.Behavior;

public interface Animal extends Ente{

    public default void respirar(){
        System.out.println("Soy un animal y estoy respirando");
    }

    public void comer();

}
