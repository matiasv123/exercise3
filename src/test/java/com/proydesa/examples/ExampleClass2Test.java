/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proydesa.examples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author matia
 */
public class ExampleClass2Test {
    
    @Test
    public void agregaContador() {
        ExampleClass2 e2 = new ExampleClass2();
        assertEquals(30, e2.agregaContador(20));
    }
}