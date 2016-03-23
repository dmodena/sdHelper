/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.teste;

import com.dmodena.model.Amostra;

/**
 * Uma classe simples com testes feitos no console para validação dos valores.
 * 
 * @author dmodena
 */
public class Teste {
    public static void main(String Args[]) {
        Amostra amostra = new Amostra();
        double[] valores = {83, 92, 100, 57, 85, 88, 84, 82, 94, 93, 91, 95};
        // double[] valores = {2.59, 2.55, 2.64, 2.61, 2.60, 2.50, 2.62, 2.63, 2.57, 2.64};
        
        for(int i = 0; i < valores.length; i++) {
            amostra.adicionarNumero(valores[i]);
        }
        
        System.out.println("Media: " + amostra.getMedia());
        System.out.println("Mediana: " + amostra.getMediana());
        System.out.println("Variancia: " + amostra.getVariancia());
        System.out.println("Desvio Padrao: " + amostra.getDesvioPadrao());
        System.out.println("Coeficiente de Variacao: " + amostra.getCoeficienteVariacao());       
        System.out.println("Terceiro decil: " + amostra.getQuantil(0.3));
        System.out.println("Primeiro quartil: " + amostra.getQuantil(0.25));
        System.out.println("Quarto quintil: " + amostra.getQuantil(0.8));
        System.out.println("Trigesimo segundo percentil: " + amostra.getQuantil(0.32));
    }
}
