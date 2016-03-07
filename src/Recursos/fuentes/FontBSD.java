/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos.fuentes;

import java.awt.Font;
import java.io.InputStream;

/**
 *
 * @author Yonathan A. Martínez Padilla
 */
public class FontBSD {
    private Font font = null;

    public FontBSD() {
        String fontName = "BSD.ttf" ;
        try {
            //Se carga la fuente
            InputStream is =  getClass().getResourceAsStream(fontName);
            font = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (Exception ex) {
            //Si existe un error se carga fuente por defecto ARIAL
            System.err.println(fontName + " No se cargo la fuente");
            font = new Font("Arial", Font.PLAIN, 14);            
        }
    }
    
    public Font getMyFont( int estilo, float tamanio){
        Font tfont = font.deriveFont(estilo, tamanio);
        return tfont;
    }
}
