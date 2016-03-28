/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.model;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dmodena
 */
public class AmostraTest {
    
    public AmostraTest() {
    }

    /**
     * Test of adicionarNumero method, of class Amostra.
     */
    @Test
    public void testAdicionarNumero() {
        System.out.println("adicionarNumero");
        Double numero = 2d;
        Double expResult = 2d;
        Amostra instance = new Amostra();
        instance.adicionarNumero(numero);
        Double result = instance.getValores().get(instance.getValores().size() - 1);
        assertEquals(expResult, result);
    }

    /**
     * Test of removerNumero method, of class Amostra.
     */
    @Test
    public void testRemoverNumero() {
        System.out.println("removerNumero");
        Double numero = 2d;
        ArrayList<Double> lista = new ArrayList<>();
        lista.add(2d);
        lista.add(5d);
        Amostra instance = new Amostra(lista);
        instance.removerNumero(numero);
        boolean expResult = false;
        boolean result = instance.getValores().contains(numero);
        assertEquals(expResult, result);
    }

    /**
     * Test of getValores method, of class Amostra.
     */
    @Test
    public void testGetValores() {
        System.out.println("getValores");
        ArrayList<Double> expResult = new ArrayList<>();
        expResult.add(2d);
        expResult.add(5d);
        Amostra instance = new Amostra(expResult);        
        ArrayList<Double> result = instance.getValores();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMedia method, of class Amostra.
     */
    @Test
    public void testGetMedia() {
        System.out.println("getMedia");
        Amostra instance = new Amostra();
        instance.adicionarNumero(2d);
        instance.adicionarNumero(2d);
        instance.adicionarNumero(2d);
        instance.adicionarNumero(3d);
        instance.adicionarNumero(3d);
        instance.adicionarNumero(3d);
        double expResult = 2.5;
        double result = instance.getMedia();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getMediana method, of class Amostra.
     */
    @Test
    public void testGetMediana() {
        System.out.println("getMediana");
        Amostra instance = new Amostra();
        instance.adicionarNumero(2d);
        instance.adicionarNumero(2d);
        instance.adicionarNumero(2d);
        instance.adicionarNumero(3d);
        instance.adicionarNumero(3d);
        instance.adicionarNumero(3d);
        double expResult = 2.5;
        double result = instance.getMediana();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getVariancia method, of class Amostra.
     */
    @Test
    public void testGetVariancia() {
        System.out.println("getVariancia");
        Amostra instance = new Amostra();
        instance.adicionarNumero(2d);
        instance.adicionarNumero(2d);
        instance.adicionarNumero(2d);
        instance.adicionarNumero(3d);
        instance.adicionarNumero(3d);
        instance.adicionarNumero(3d);
        double expResult = 0.25;
        double result = instance.getVariancia();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getDesvioPadrao method, of class Amostra.
     */
    @Test
    public void testGetDesvioPadrao() {
        System.out.println("getDesvioPadrao");
        Amostra instance = new Amostra();
        instance.adicionarNumero(2d);
        instance.adicionarNumero(2d);
        instance.adicionarNumero(2d);
        instance.adicionarNumero(3d);
        instance.adicionarNumero(3d);
        instance.adicionarNumero(3d);
        double expResult = 0.5;
        double result = instance.getDesvioPadrao();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getCoeficienteVariacao method, of class Amostra.
     */
    @Test
    public void testGetCoeficienteVariacao() {
        System.out.println("getCoeficienteVariacao");
        Amostra instance = new Amostra();
        instance.adicionarNumero(2d);
        instance.adicionarNumero(2d);
        instance.adicionarNumero(2d);
        instance.adicionarNumero(3d);
        instance.adicionarNumero(3d);
        instance.adicionarNumero(3d);
        double expResult = 0.2;
        double result = instance.getCoeficienteVariacao();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getQuantil method, of class Amostra.
     */
    @Test
    public void testGetQuantil() {
        System.out.println("getQuantil");
        double fracao = 0.5;
        Amostra instance = new Amostra();
        instance.adicionarNumero(2d);
        instance.adicionarNumero(2d);
        instance.adicionarNumero(2d);
        instance.adicionarNumero(3d);
        instance.adicionarNumero(3d);
        instance.adicionarNumero(3d);
        double expResult = 2.5;
        double result = instance.getQuantil(fracao);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Tests of getModa method, of class Amostra.
     */
    @Test
    public void testGetModa1() {
        System.out.println("getModa");
        ArrayList<Double> valores = new ArrayList<>();
        valores.add(2d);
        valores.add(2d);
        valores.add(2d);
        valores.add(3d);
        valores.add(3d);
        valores.add(5d);
        Amostra instance = new Amostra(valores);
        ArrayList<Double> expResult = new ArrayList<>();
        expResult.add(2d);
        ArrayList<Double> result = instance.getModa();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetModa2() {
        System.out.println("getModa");
        ArrayList<Double> valores = new ArrayList<>();
        valores.add(1.1);
        valores.add(2.2);
        valores.add(2.2);
        valores.add(3.3);
        valores.add(3.4);
        valores.add(4.4);
        valores.add(4.4);
        valores.add(5.6);
        valores.add(6.7);
        Amostra instance = new Amostra(valores);
        ArrayList<Double> expResult = new ArrayList<>();
        expResult.add(2.2);
        expResult.add(4.4);
        ArrayList<Double> result = instance.getModa();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetModa3() {
        System.out.println("getModa");
        ArrayList<Double> valores = new ArrayList<>();
        valores.add(1d);
        valores.add(2d);
        valores.add(3d);
        valores.add(4d);
        valores.add(5d);
        valores.add(6d);
        valores.add(7d);
        valores.add(8d);
        valores.add(9d);
        Amostra instance = new Amostra(valores);
        ArrayList<Double> expResult = new ArrayList<>();
        ArrayList<Double> result = instance.getModa();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetModa4() {
        System.out.println("getModa");
        ArrayList<Double> valores = new ArrayList<>();
        valores.add(1.2);
        valores.add(1.2);
        valores.add(2.3);
        valores.add(2.3);
        valores.add(3.4);
        valores.add(3.4);
        valores.add(4.5);
        valores.add(4.5);
        valores.add(5.7);
        valores.add(5.7);
        Amostra instance = new Amostra(valores);
        ArrayList<Double> expResult = new ArrayList<>();
        expResult.add(0d);
        expResult.add(3d);
        ArrayList<Double> result = instance.getModa();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetModa5() {
        System.out.println("getModa");
        ArrayList<Double> valores = new ArrayList<>();
        valores.add(2d);
        valores.add(3d);
        valores.add(2d);
        valores.add(0d);
        valores.add(0d);
        valores.add(4d);
        valores.add(3d);
        valores.add(0d);
        valores.add(5d);
        valores.add(3d);
        Amostra instance = new Amostra(valores);
        ArrayList<Double> expResult = new ArrayList<>();
        ArrayList<Double> result = instance.getModa();
        assertEquals(expResult, result);
    }
}
