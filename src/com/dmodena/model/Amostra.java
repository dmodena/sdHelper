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
        double mediana;
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
    
    public ArrayList<Double> getModa() {
        // Ordenando números ASC
        Collections.sort(numeros);
        
        ArrayList<Double> moda = new ArrayList<>();
        ArrayList<Integer> repeticoes = new ArrayList<>();
        
        // Criando ArrayList zerado com mesma quantidade de valores de numeros
        for(Double n : numeros) {
            repeticoes.add(0);
        }
        
        // Atualizando ArrayList com quantidade de repeticoes de cada numero
        for(int i = 0; i < numeros.size(); i++) {
            Double aux = numeros.get(i);
            int count = Collections.frequency(numeros, aux);
            repeticoes.set(i, count);
        }
        
        // Verificando maior repetição do ArrayList
        int max = Collections.max(repeticoes);
        
        // Verificando quantidade de vezes que o número que mais se repete aparece
        int count = Collections.frequency(repeticoes, max);
        
        // Caso seja amodal
        if(count == repeticoes.size()) {
            moda = new ArrayList<>();
        }
        // Caso exista moda
        else {
            double aux = 0d;
            int k = 0;
            boolean firstNumberFound = false;
            
            // Gravando primeiro valor da moda;
            do {
                if(max == repeticoes.get(k)) {
                    moda.add(numeros.get(k));
                    aux = numeros.get(k);
                    firstNumberFound = true;
                }
            }while(!firstNumberFound);
                  
            // Gravando outros valores na moda, se não forem repetidos
            for(int i = 0; i < repeticoes.size(); i++) {
                if(max == repeticoes.get(i)) {
                    if(aux != numeros.get(i)) {
                        moda.add(numeros.get(i));
                        aux = numeros.get(i);
                    }                    
                }
            }
            
            // Ordenando resultados
            Collections.sort(moda);
        }
        
        return moda;
    }
}
