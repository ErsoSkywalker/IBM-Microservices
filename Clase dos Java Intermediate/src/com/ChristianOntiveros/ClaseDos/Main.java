package com.ChristianOntiveros.ClaseDos;



import java.util.ArrayList;
import com.ChristianOntiveros.ClaseDos.Implementation.ImplementacionClases;

public class Main {

    private static ArrayList<Double> numeros;

    static {

        numeros = new ArrayList<Double>();
        numeros.add(Math.random());
        numeros.add(Math.random());
        numeros.add(Math.random());
        numeros.add(Math.random());
        numeros.add(Math.random());
        numeros.add(Math.random());
        numeros.add(Math.random());
        numeros.add(Math.random());
        numeros.add(Math.random());

    }


    public static void main(String[] args) {
        //Recordemos que usamos numeros aleatorios, puede que salta vacio.
        numeros.stream().filter(n -> n<0.5).sorted().forEach(n -> System.out.println(ImplementacionClases.funcional.multiplicarPorPi(n)));

    }
}
