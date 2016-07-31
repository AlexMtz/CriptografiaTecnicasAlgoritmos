/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author YONATHAN PADILLA
 */
public class ModuloInverso {
    
    public long euclidesExtendido(int n1, int n2){
        long[] array = new long[3];
        long x = 0, y = 0, d = 0, x2 = 1, x1 = 0, y2 = 0, y1 = 1, q = 0;
        if(n2 == 0){
            array[0] = n1;
            array[1] = 1;
            array[2] = 0;
        }else{
            while(n2 > 0){
                q = (n1/n2);
                long r = n1 - q*n2;
                x = x2 - q*x1;
                y = y2 - q*y1;
                n1 = n2;
                n2 = (int) r;
                x2 = x1;
                x1 = x;
                y2 = y1;
                y1 = y;
            }
            array[0] = n1;
            array[1] = x2;
            array[2] = y2;
        }
        return array[2];
    }
}
