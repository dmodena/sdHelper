/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author dmodena
 */
public class NumberValidator {
    private Pattern pattern;
    private Matcher matcher;
    
    public NumberValidator() {
        pattern = Pattern.compile(getPattern());
    }
    
    public NumberValidator(boolean fracao) {
        pattern = Pattern.compile(getPattern(fracao));
    }
    
    private String getPattern() {
        return "[\\d]*(\\.\\d*)?";
    }
    
    private String getPattern(boolean fracao) {
        String myPattern;
        
        if(fracao) myPattern = "0*\\.\\d+";
        else myPattern = getPattern();
        
        return myPattern;
    }
    
    public boolean validate(String hex) {
        matcher = pattern.matcher(hex);
        return matcher.matches();
    }
}
