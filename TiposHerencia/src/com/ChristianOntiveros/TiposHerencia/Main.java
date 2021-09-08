package com.ChristianOntiveros.TiposHerencia;

import com.ChristianOntiveros.TiposHerencia.Animals.Cotorro;
import com.ChristianOntiveros.TiposHerencia.Animals.Gato;
import com.ChristianOntiveros.TiposHerencia.Behavior.Animal;
import com.ChristianOntiveros.TiposHerencia.Behavior.Ente;
import com.ChristianOntiveros.TiposHerencia.Behavior.FlyingAnimal;

public class Main {

    public static void main(String[] args) {

        Cotorro chocotorro = new Cotorro();
        chocotorro.volar();

        Gato gato = new Gato();
        gato.existir();

        gato.holaMundo(chocotorro);

    }
}
