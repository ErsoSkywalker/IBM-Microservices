package com.ChristianOntiveros.TiposHerencia.Animals;

import com.ChristianOntiveros.TiposHerencia.Behavior.Animal;
import com.ChristianOntiveros.TiposHerencia.Behavior.FlyingAnimal;

public class Cotorro extends FlyingAnimal implements Animal {
    @Override
    public void comer() {
        System.out.println("Soy un cotorro y yo estoy comiendo galletitas.");
    }

    @Override
    public String toString() {
        return "Cotorro{}";
    }
}
