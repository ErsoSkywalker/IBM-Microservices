package com.ChristianOntiveros.TiposHerencia.Animals;

import com.ChristianOntiveros.TiposHerencia.Behavior.Animal;

public class Gato implements Animal {
    @Override
    public void comer() {
        System.out.println("Soy un gato y estoy comiendo atún.");
    }
}
