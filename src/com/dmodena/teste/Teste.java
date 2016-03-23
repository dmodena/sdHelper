/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.teste;

import com.dmodena.model.Amostra;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Uma classe simples com testes feitos no console para validação dos valores.
 * 
 * @author dmodena
 */
public class Teste {
    public static void main(String Args[]) {
        // Amostra amostra = new Amostra();
        // double[] valores = {83, 92, 100, 57, 85, 88, 84, 82, 94, 93, 91, 95};
        // double[] valores = {2.59, 2.55, 2.64, 2.61, 2.60, 2.50, 2.62, 2.63, 2.57, 2.64};
        
        // for(int i = 0; i < valores.length; i++) {
        //     amostra.adicionarNumero(valores[i]);
        // }
        
        // System.out.println("Media: " + amostra.getMedia());
        // System.out.println("Mediana: " + amostra.getMediana());
        // System.out.println("Variancia: " + amostra.getVariancia());
        // System.out.println("Desvio Padrao: " + amostra.getDesvioPadrao());
        // System.out.println("Coeficiente de Variacao: " + amostra.getCoeficienteVariacao());       
        // System.out.println("Terceiro decil: " + amostra.getQuantil(0.3));
        // System.out.println("Primeiro quartil: " + amostra.getQuantil(0.25));
        // System.out.println("Quarto quintil: " + amostra.getQuantil(0.8));
        // System.out.println("Trigesimo segundo percentil: " + amostra.getQuantil(0.32));
        
        // Testando quantis        
        ArrayList<Double> valoresA = new ArrayList<>(Arrays.asList(1.53, 1.67, 2.09, 1.85, 1.88, 1.57, 1.80, 1.95, 1.53, 1.73, 1.92, 1.58, 2.11, 2.01, 1.92));
        Amostra a = new Amostra(valoresA);
        System.out.println(a.getQuantil(0.3));
        System.out.println(a.getQuantil(0.25));
        System.out.println(a.getQuantil(0.8));
        System.out.println(a.getQuantil(0.32));
        
        System.out.println();
        
        ArrayList<Double> valoresB = new ArrayList<>(Arrays.asList(69d, 65d, 91d, 98d, 71d, 82d, 95d, 76d, 102d, 84d, 107d, 73d, 78d, 99d, 70d, 73d, 76d, 70d, 91d, 108d));
        Amostra b = new Amostra(valoresB);
        System.out.println(b.getQuantil(0.2));
        System.out.println(b.getQuantil(0.7));
        System.out.println(b.getQuantil(0.4));
        
        System.out.println();
        
        ArrayList<Double> valoresC = new ArrayList<>(Arrays.asList(15d, 7d, 0d, 11d, 4d, 6d, 7d, 3d, 2d));
        Amostra c = new Amostra(valoresC);
        System.out.println(c.getQuantil(0.25));
        System.out.println(c.getQuantil(0.02));
        System.out.println(c.getQuantil(0.75));
        System.out.println(c.getQuantil(0.2));
    }
}
