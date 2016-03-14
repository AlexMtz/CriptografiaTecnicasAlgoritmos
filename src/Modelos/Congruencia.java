/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author ALEX
 */
public class Congruencia {
    private String procedimeinto = "";
    private boolean esCongruente;
    
    public void calcularCongruencia(int a, int b, int m){
        informarCambios("calculando a mod m ");
        double tempA = a % m;
        informarCambios("a mod m = " + tempA);
        informarCambios("calculando b mod m");
        double tempB = b % m;
        informarCambios("b mod m = " + tempB);
        informarCambios("evaluando congruencia entre a y b");
        esCongruente = tempA == tempB;
        informarCambios(a + " es congruente de " + b + " modulo " + m + "  -> " + esCongruente);
    }
    
    public void informarCambios(String text){
        procedimeinto += text;
        procedimeinto += "\n";
    }
    public String getProcedimiento(){
        return procedimeinto;
    }
}
