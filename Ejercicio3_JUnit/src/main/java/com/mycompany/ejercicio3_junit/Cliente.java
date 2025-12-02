/*
Proyecto desarrollado por Andrés González Pérez 1ºDAM
*/

package com.mycompany.ejercicio3_junit;


public class Cliente {
    
    private String nombre;
    private int antiguedad;

    public Cliente(String nombre, int antiguedad) {
        this.nombre = nombre;
        this.antiguedad = antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }


    
    

}
