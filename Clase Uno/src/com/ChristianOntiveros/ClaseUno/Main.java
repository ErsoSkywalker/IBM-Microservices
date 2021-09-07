package com.ChristianOntiveros.ClaseUno;

import com.ChristianOntiveros.ClaseUno.Actors.Batallon;
import com.ChristianOntiveros.ClaseUno.Actors.Guerrero;
import com.ChristianOntiveros.ClaseUno.Actors.Orco;

/*
*
* Christian Ontiveros
* Apunte de Primera Clase
* 6 de Septiembre del 2021
*
* */

public class Main {

    public static void main(String[] args) {
        /*
        *
        * Checar la herencia única, multi nivel, múltiple, jerárquica e híbrida
        *
        * */

        Guerrero guerrero = new Guerrero(1.75, "Azul", 100, 100, 100, 100);
        System.out.println(guerrero);

        Batallon batallon = new Batallon("IBM");
        batallon.setGuerrero(guerrero);
        System.out.println(batallon);

        /*
            Como podemos ver, tenemos la opción de generar un objeto haciendo uso
            de una clase hija. Podemos ver dentro de la definición de Orco, un extends Guerrero
            por lo que podemos decir que Orco, es una clase hija de Guerrero, sin embargo, hay que considerar
            que al crear con una clase hija, aplicarán todas las restricciones definidas en ella.
            Por ejemplo, el @Override que se le aplica al método bailaGuerrero.
         */
        Guerrero orco = new Orco(1.75, "Verde", 100, 100, 100, 100);
        orco.bailaGuerrero();

        /*
        *
        *   Acá dejo una forma de convertir, de una clase hija a una clase padre.
        *   Esto nos puede ser de mucha utilidad más adelante (:
        *
        * */

        Orco ejemploOrcoDos = new Orco(1.75, "Gris", 100, 100, 100, 100);
        Guerrero orcoCasteado = (Guerrero) ejemploOrcoDos;
        orcoCasteado.bailaGuerrero();



    }
}
