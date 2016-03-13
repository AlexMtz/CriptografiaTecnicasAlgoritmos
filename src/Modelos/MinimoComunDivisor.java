/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 * Clase del Minimo Comun Divisor
 * Esta clase encuentra el minimo comun divisor entre dos numeros
 * @author Yonathan Alexander Martinez Padilla
 */
public class MinimoComunDivisor {
    private String procedimiento = "";
    
    public void calcularMCD(int a, int b){
        int residuoTemp, dividendoTemp, divisorTemp, cocienteTemp;
        setProcedimiento("minimo comun multiplo entre " + a + " y " + b);
        dividendoTemp = a;
        divisorTemp = b;
        do {
            cocienteTemp = dividendoTemp/divisorTemp;
            residuoTemp = dividendoTemp%divisorTemp;
            setProcedieminto(cocienteTemp, divisorTemp, dividendoTemp, residuoTemp);
            if(residuoTemp > 0){
                dividendoTemp = divisorTemp;
                divisorTemp = residuoTemp;
            }
        } while (residuoTemp > 0);
        setProcedimiento("el minimo comun divisor es " + divisorTemp);
    }
    
    public void setProcedimiento(String text){
        procedimiento += text;
        procedimiento += "\n";
    }
    
    public void setProcedieminto(int cociente, int divisor, int dividendo, int residuo){
        String tamanioCociente, tamanioDivisor, tamanioDividendo, tamanioResiduo;
        int i = 0;
        
        tamanioCociente = cociente + "";
        tamanioDivisor = divisor + "";
        tamanioDividendo = dividendo + "";
        tamanioResiduo = residuo + "";
        procedimiento += "\t";
        for(i = 0; i < (tamanioDivisor.length() + 1 + tamanioDividendo.length() - tamanioCociente.length()); i++){
            procedimiento += " ";
        }
        
        procedimiento += cociente + "\n";
        procedimiento += "\t";
        
        for(i = 0; i < tamanioDivisor.length(); i++){
            procedimiento += " ";
        }
        for(i = 0; i < tamanioDividendo.length() + 1; i++){
            procedimiento += "-";
        
        }
        procedimiento += "\n";
        procedimiento += "\t";
        
        procedimiento += divisor + "|" + dividendo;
        procedimiento += "\n";
        procedimiento += "\t";
        for(i = 0; i < tamanioDivisor.length(); i++){
            procedimiento += " ";
        }
        procedimiento += "-" + (divisor * cociente) + "\n";
        procedimiento += "\t";
        for(i = 0; i < tamanioDivisor.length(); i++){
            procedimiento += " ";
        }
        for(i = 0; i < (tamanioDividendo.length() + 1); i++){
            procedimiento += "-";
        }
        procedimiento += "\n";
        procedimiento += "\t";
        for(i = 0; i < (tamanioDivisor.length() + 1 + tamanioDividendo.length() - tamanioResiduo.length()); i++){
            procedimiento += " ";
        }
        procedimiento += residuo + "\n";
        procedimiento += "\t";
        for(i = 0; i < (tamanioDivisor.length() + 1 + tamanioDividendo.length()); i++){
            procedimiento += "*";
        }
        procedimiento += "\n";
    }
    
    public String getProcedieminto(){
        return procedimiento;
    }
}
