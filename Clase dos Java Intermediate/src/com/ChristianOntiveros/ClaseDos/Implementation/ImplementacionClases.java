package com.ChristianOntiveros.ClaseDos.Implementation;

import com.ChristianOntiveros.ClaseDos.Interfaces.IFunctionalInterfaceExample;

public class ImplementacionClases {

    public static IFunctionalInterfaceExample funcional = (double number) ->{
        return number * Math.PI;
    };

}
