/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Classe utilizada para validação dos dados inseridos pelo usuário.
 * @author dmodena
 */
public class NumberValidator {
    private Pattern pattern;
    private Matcher matcher;
    
    /**
     * Cria uma nova instância da classe NumberValidator.
     */
    public NumberValidator() {
        pattern = Pattern.compile(getPattern());
    }
    
    /**
     * Cria uma nova instância da classe NumberValidator usada para frações.
     * @param fracao especifica se o valor é fração.
     */
    public NumberValidator(boolean fracao) {
        pattern = Pattern.compile(getPattern(fracao));
    }
    
    /**
     * Retorna a regex para números gerais.
     * @return Regular Expression.
     */
    private String getPattern() {
        return "[\\d]*(\\.\\d*)?";
    }
    
    /**
     * Retorna a regex para números gerais ou frações.
     * @param fracao especifica se o valor é fração.
     * @return Regular Expression.
     */
    private String getPattern(boolean fracao) {
        String myPattern;
        
        if(fracao) myPattern = "0*\\.\\d+";
        else myPattern = getPattern();
        
        return myPattern;
    }
    
    /**
     * Valida a string de acordo com a regex.
     * @param hex valor a ser validado.
     * @return se o valor é valido.
     */
    public boolean validate(String hex) {
        matcher = pattern.matcher(hex);
        return matcher.matches();
    }
}
