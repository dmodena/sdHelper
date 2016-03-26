/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.model;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Classe utilizada para armazenar os valores da amostra e efetuar os cálculos estatísticos.
 * @author dmodena
 */
public class Amostra {
    private ArrayList<Double> numeros;
    
    /**
     * Cria uma nova instância vazia da classe Amostra.
     */
    public Amostra() {
        numeros = new ArrayList<>();
    }
    
    /**
     * Cria uma nova instância da classe Amostra com valores pré-definidos.
     * @param numeros valores da amostra.
     */
    public Amostra(ArrayList<Double> numeros) {
        this.numeros = numeros;
    }
    
    /**
     * Adiciona o número à lista de valores para cálculo.
     * @param numero valor a ser adicionado.
     */
    public void adicionarNumero(Double numero) {
        numeros.add(numero);
    }
    
    /**
     * Remove o número da lista de valores para cálculo.
     * @param numero valor a ser removido.
     */
    public void removerNumero(Double numero) {
        numeros.remove(numero);
    }
    
    /**
     * Retorna os valores presentes na lista para cálulo.
     * @return valores da lista.
     */
    public ArrayList<Double> getValores() {
        return numeros;
    }
    
    /**
     * Retorna a média aritmética dos valores presentes na lista.
     * @return média aritmética.
     */
    public double getMedia() {
        double media = 0;
        
        for(Double n : numeros) {
            media += n;
        }
        
        return media / numeros.size();
    }
    
    /**
     * Retorna a mediana dos valores presentes na lista.
     * @return mediana.
     */
    public double getMediana() {
        double mediana = 0;
        int tamanho = numeros.size();
        
        // Ordenando números ASC
        Collections.sort(numeros);        
        
        // Se for par
        if(tamanho % 2 == 0) {
            mediana = (numeros.get((tamanho / 2) - 1) + numeros.get(tamanho / 2)) / 2;
        }
        else {
            mediana = numeros.get((int) (tamanho / 2));
        }
        
        return mediana;
    }
    
    /**
     * Retorna a variância dos valores presentes na lista.
     * @return variância.
     */
    public double getVariancia() {
        double soma = 0;
        
        for(Double n : numeros) {
            soma += (n - getMedia()) * (n - getMedia());
        }
        
        return soma / numeros.size();
    }
    
    /**
     * Retorna o desvio padrão dos valores presentes na lista.
     * @return desvio padrão.
     */
    public double getDesvioPadrao() {
        
        return Math.sqrt(getVariancia());
    }
    
    /**
     * Retorna o coeficiente de variação dos valores presentes na lista.
     * @return coeficiente de variação.
     */
    public double getCoeficienteVariacao() {
        return getDesvioPadrao() / getMedia();
    }
    
    /**
     * Retorna o quantil de acordo com fração especificada.
     * @param fracao fração do quantil em número decimal entre 0 e 1.
     * @return quantil.
     */
    public double getQuantil(double fracao) {
        // Ordenando números ASC
        Collections.sort(numeros);
        
        double quantil;
        double ip;
        int porcaoInteiro;
        
        ip = numeros.size() * fracao;
        porcaoInteiro = (int) ip;
        
        if(ip == porcaoInteiro) {
            quantil = (numeros.get((int) (ip - 1)) + numeros.get((int) ip)) / 2;
        }
        else {
            quantil = numeros.get((int) ip);
        }
        
        return quantil;
    }
}
