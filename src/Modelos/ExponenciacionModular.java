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
public class ExponenciacionModular {
    private String procesoClasico = "", procesoBinario = "";
    private String binarioTxt = "";
    private int binarioInt, numeroBits;
    
    public void metodoClasico(int base, int exponente, int modulo){
        int temporal = base, contador = 0, resultado = 0;
        for(int i = 0; i < exponente; i++){
            setInfoClasico("calculando exponente -> " + temporal + " * " + base 
                    + " = " + (temporal * base));
            setInfoClasico("calculando módulo -> " + (temporal * base) + " mod " 
                    + modulo + " = " + ((temporal * base) % modulo));
            temporal = (temporal * base) % modulo;
            contador += 2;
        }
        resultado = temporal;
        setInfoClasico("exponenciacion clásica concluida");
        setInfoClasico("resultado -> " + resultado);
        setInfoClasico("contador de acciones: " + contador);
    }
    
    public void metodoBinario(int base, int exponente, int modulo){
        int temporal = base, resultado = 0, contador = 0;
        numeroBits(exponente);
        contador += 1;
        setInfoBinario("transformando exponente " + exponente + " -> " + binarioTxt);
        for (int i = numeroBits-1; i > 0; i--) {
            setInfoBinario("calculando exponente " + temporal + " -> " + 
                    (temporal * base));
            temporal = (temporal * base);
            contador += 1;
            if (getBit(i) == 1){
                setInfoBinario("bit activo (1)," + temporal + " -> " + (temporal * base));
                temporal = temporal * base;
                contador += 1;
            }
            setInfoBinario("calculando modulo " + temporal + " mod " + modulo + " = " + (temporal % modulo));
            temporal = temporal % modulo;
            contador += 1;
        }
        setInfoBinario("algoritmo finalizado");
        resultado = temporal;
        setInfoBinario("resultado -> " + resultado);
        setInfoBinario("numero de acciones: " + contador);
    }
    
    public void numeroBits(int exponente){
        int digito, exp = 0;
        int binario = 0;
        while(exponente!=0){
                digito = exponente % 2;           
                binario = binario + (int)(digito * Math.pow(10, exp));  
                exp++;
                exponente = exponente/2;
                numeroBits += 1;
        }
        binarioTxt = "" + binario;
        binarioInt = binario;
    }
    
    public int getBit(int indice){
        char[] temp = binarioTxt.toCharArray();
        return Integer.parseInt(temp[indice] + "");
    }
    
    public void setInfoClasico(String info){
        procesoClasico += info + "\n";
    }
    
    public String getInfoClasico(){
        return procesoClasico;
    }
    
    public void setInfoBinario(String info){
        procesoBinario += info + "\n";
    }
    
    public String getInfoBinario(){
        return procesoBinario;
    }
    
    public void reset(){
        numeroBits = 0;
        binarioTxt = "";
        procesoBinario = "";
        procesoClasico = "";
    }
}
