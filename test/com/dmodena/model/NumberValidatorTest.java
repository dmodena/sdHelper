/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dmodena
 */
public class NumberValidatorTest {
    
    public NumberValidatorTest() {
    }

    /**
     * Tests of validate method, of class NumberValidator.
     */
    @Test
    public void testValidate1() {
        System.out.println("validate");
        String hex = "foo123.45";
        NumberValidator instance = new NumberValidator();
        boolean expResult = false;
        boolean result = instance.validate(hex);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidate2() {
        System.out.println("validate");
        String hex = "45,32";
        NumberValidator instance = new NumberValidator();
        boolean expResult = false;
        boolean result = instance.validate(hex);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidate3() {
        System.out.println("validate");
        String hex = "12.34";
        NumberValidator instance = new NumberValidator();
        boolean expResult = true;
        boolean result = instance.validate(hex);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidate4() {
        System.out.println("validate");
        String hex = ".5";
        NumberValidator instance = new NumberValidator();
        boolean expResult = true;
        boolean result = instance.validate(hex);
        assertEquals(expResult, result);
    }
    
}
