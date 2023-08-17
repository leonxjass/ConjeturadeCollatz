/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ceutecpracticaslaboratorio;

/**
 *
 * @author leonxjass
 */
public class  ConjeturadeCollatz{
    
    public static int MecanicaDeCollatz(int n){
        /**
         * Este es el dichoso enigma matematico de que cuando un numero es par
         * lo dividimos, si es impar hacemos la ecuacion 3n+1 que resultara par 
         * y se repite el ciclo hasta llegar a su minima expresion en donde 
         * queda un bucle de  1, 4, 2, 1, 4, 2 una y otra vez hasta el infinito
        */
       
        int cont= 0;
        
        while(n != 1){
            if(n%2 == 0)
                n = n/2;
            else
                n = n*3 + 1;
            cont++;
        }
        return cont;
    }
    
    public static int numeroConMasPasos(int limite){
        int pasosMax=0;
        int NumeroMaxPasos=0;
        
        for(int i = 1; i <=limite; i++){
            int pasos=MecanicaDeCollatz(i);
            if(pasos > pasosMax){
                pasosMax = pasos;
                NumeroMaxPasos = i;
            }
        }
        return NumeroMaxPasos;
    }
    
    public static void main(String[] args) {
        
        int limite = 1000;
        int pasos = MecanicaDeCollatz(limite);
        int numero = numeroConMasPasos(limite);
        
        System.out.println("numero con mas pasos entre 0 a : " + limite + " "
        + ": " + numero + " y dio: " + pasos + " pasos");
        
    } 
}
