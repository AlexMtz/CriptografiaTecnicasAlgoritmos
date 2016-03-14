/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 * @version 1.0
 * @author Yonathan Alexander Martínez PAdilla
 */
public class CribaErastotenes {
    private int i, contador, contadorPruebas, valorPrueba;
    private String procedimiento = "";
    private boolean puedeContinuar = true;
    
    public void calcularCriba(int n){
        setProcedimiento("Generando serie a cribar");
        //Generar arreglo para cribar
        int[] arregloACribar = new int[n-2];
        //Inicializar arreglo a cribar
        for(i = 0; i < arregloACribar.length; i++){
            arregloACribar[i] = i + 2; //Los valores deben ir desde 2 hasta n - 1
        }
        setProcedimiento(arregloACribar);
        //inicializamos el contador de las pruebas en 0
        contadorPruebas = 0;
        do{
            //Se elige el primer valor del arreglo
            valorPrueba = arregloACribar[contadorPruebas];
            setProcedimiento("se elige " + valorPrueba + " para cribar la serie");
            //Se compara con cada uno de los valores del arreglo para encontrar múltiplos
            contador = 0;
            for(i = (contadorPruebas + 1); i < arregloACribar.length; i++){
                if(arregloACribar[i] % valorPrueba == 0){ //Verificamos que sea múltiplo de valorPrueba
                    setProcedimiento(arregloACribar[i] + " es múltiplo de " + valorPrueba + ", se eliminara");
                    arregloACribar[i] = 0; //Lo volvemos 0 para despues eliminarlo del arreglo
                    contador += 1; //contabilizamos los numeros que vamos a eliminar
                }
            }
            //Creamos un arreglo del tamaño del original menos la cantidad de numeros que vamos a eliminar
            int[] arregloTemp = new int[arregloACribar.length - contador];
            contador = 0; //Volvemos 0 el contador para utilizarlo como apuntadoe en nuestro arreglo temporal
            //Pasaremos los valores distintos de 0 al arreglo temporal recorriendo el arreglo original
            for(i = 0; i < arregloACribar.length; i++){
                if(arregloACribar[i] > 0){
                    arregloTemp[contador] = arregloACribar[i];
                    contador += 1;
                 }
            }
            setProcedimiento("múltiplos de " + valorPrueba + " eliminados");
            //Actualizamos el arreglo original asignandole el arreglo temporal
            arregloACribar = arregloTemp;
            setProcedimiento(arregloACribar);
            //Aumentamos el contador de las pruebas para apuntar al siguiente valor de prueba
            contadorPruebas += 1;
        
            //Verificamos que se pueda realizar la siguiente prueba
            if((arregloACribar[contadorPruebas] * arregloACribar[contadorPruebas])
                    > arregloACribar[arregloACribar.length - 1]){
                puedeContinuar = false; //Si el valor de prueba al cuadrado no debe superar el ultimo valor de la criba
                setProcedimiento("el cuadrado del siguiente valor de prueba supera el ultimo valor de la serie");
                setProcedimiento("imposible cribar");
            }
        }while(puedeContinuar);
        setProcedimiento("Serie despues de ser cribada");
        setProcedimiento(arregloACribar);
    }
    
    public void setProcedimiento(String paso){
        procedimiento += paso + "\n";
    }
    
    public void setProcedimiento(int[] criba){
        procedimiento += "[";
        for(int i = 0; i < (criba.length - 1); i++){
            procedimiento += criba[i] + ",";
        }
        procedimiento += criba[criba.length - 1] + "]\n";
    }
    public String getProcedimiento(){
        return procedimiento;
    }
    
}
