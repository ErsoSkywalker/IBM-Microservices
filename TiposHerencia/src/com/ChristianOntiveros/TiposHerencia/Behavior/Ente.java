package com.ChristianOntiveros.TiposHerencia.Behavior;

public interface Ente {

    public default void existir(){
        System.out.println("Soy un ente y existo");
    }

}
