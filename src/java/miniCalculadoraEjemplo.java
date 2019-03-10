/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irene
 */
public class miniCalculadoraEjemplo {
    
    /**
     * Calcula el valor asbsoluto de un número
     * 
     * @param numero double
     * @return double 
     */
    public double valorAbsoluto(double numero){
        double numX = Math.abs(numero);
        return numX;
        
    }
    
    /**
     * Calcula la raiz cuadrada de un número
     * 
     * @param numero double
     * @return double
     */
    public double raizCuadrada(double numero){
        double x = Math.sqrt(numero);
        return x;
    }
}
