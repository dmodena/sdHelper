/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.model;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author dmodena
 */
public class Amostra {
    private ArrayList<Double> numeros;
    
    public Amostra() {
        numeros = new ArrayList<>();
    }
    
    public Amostra(ArrayList<Double> numeros) {
        this.numeros = numeros;
    }
    
    public void adicionarNumero(Double numero) {
        numeros.add(numero);
    }
    
    public void removerNumero(Double numero) {
        numeros.remove(numero);
    }
    
    public ArrayList<Double> getValores() {
        return numeros;
    }
    
    public double getMedia() {
        double media = 0;
        
        for(Double n : numeros) {
            media += n;
        }
        
        return media / numeros.size();
    }
    
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
    
    public double getVariancia() {
        double soma = 0;
        
        for(Double n : numeros) {
            soma += (n - getMedia()) * (n - getMedia());
        }
        
        return soma / numeros.size();
    }
    
    public double getDesvioPadrao() {
        
        return Math.sqrt(getVariancia());
    }
    
    public double getCoeficienteVariacao() {
        return getDesvioPadrao() / getMedia();
    }
    
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
