/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Yonathan Alexander Martinez Padilla
 */
public class EntropiaShannon {
    private int numEstados, contadorEstados;
    private double[] probabilidadEstados;
    private double resultado, probabilidadTotal;
    
    public EntropiaShannon(int numEstados){
        this.numEstados = numEstados;
        resultado = 0d;
        contadorEstados = 0;
        probabilidadEstados = new double[numEstados];
        probabilidadTotal = 0d;
    }

    public double getResultado() {
        return resultado;
    }
    //Aun faltan estados
    public boolean faltanProbabilidades(){
        return contadorEstados < numEstados;
    }
    //Cuantos estados hay
    public int getNumEstados() {
        return numEstados;
    }
    //calcular la entropia cuando la probabilidad es igual para todos
    public void calcularEntropia(){
        //Verificamos si será con la misma probabilida o con probabilidad
        //especifica
        if(contadorEstados == 0){
            //Significa que será con la misma probabilidad por lo que nosotros
            //calcularemos las probabilidades individuales
            for(int i = 0; i < numEstados; i++){
                probabilidadEstados[i] = 1.0 / numEstados;
            }
        }
        for(int i = 0; i < numEstados; i++){
            double logEstado = Math.log10(probabilidadEstados[i]);
            logEstado = logEstado * (-1);
            double logDos = Math.log10(2);
            double divisionLog = logEstado / logDos;
            double entropiaTmp = probabilidadEstados[i] * divisionLog;
            resultado += entropiaTmp;
        }
    }
    //agregar la probabilidad de cada estado
    public void siguinteProbabilidad(double probabilidad){
        probabilidadEstados[contadorEstados] = probabilidad;
        probabilidadTotal += probabilidad;
        contadorEstados += 1;
    }
    //Conocer la probabilidad total
    public double probabilidadTotal(){
        return  probabilidadTotal;
    }
    
    //Conocer el numero de probabilidad hasta ahora
    public int probabilidadesHastaAhora(){
        return  contadorEstados + 1;
    }
    
    //Saber si la probabilidad total es valida
    public boolean probabilidadTotalEsValida(){
        return probabilidadTotal == 1.0;
    }
}
