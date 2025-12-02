/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ejercicio3_junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author PC214
 */
public class GestorDescuentosTest {

    @Test
    public void testDescuentoNuevo() {
        Cliente c = new Cliente("Andres", 4);
        assertEquals(0,GestorDescuentos.calcularDescuento(c), "Se esperaba que con 5 años de de antiguedad no tenga un descuento");
    }
    
    
    
      @Test
    public void testDescuentoVeterano() {
        Cliente c = new Cliente("Andres", 6);
        assertEquals(10,GestorDescuentos.calcularDescuento(c), "Se esperaba que con 6 años de de antiguedad tenga un descuesto de 10%");
    }
    
    
    

}
