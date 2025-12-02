/*
Proyecto desarrollado por Andrés González Pérez 1ºDAM
*/

package com.mycompany.ejercicio3_junit;


public class GestorDescuentos {
    
    
    public static int calcularDescuento(Cliente c){
        if(c.getAntiguedad() > 5){
            return 10;
        }
        return 0;
    }

}
