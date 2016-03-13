/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Vistas.VistaAlgoritmo;
import Vistas.VistaAyudaPrincipal;
import Vistas.VistaCongruencia;
import Vistas.VistaCriba;
import Vistas.VistaEntropia;
import Vistas.VistaExponenciacion;
import Vistas.VistaMinimo;
import Vistas.VistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 * Clase ControladorVistaPrincipal
 * permite controlar los eventos generados por los botones de la interfaz 
 * VistaPrincipal
 * @author Yonathan A. Martinez Padilla
 */
public class ControladorVistaPrincipal implements ActionListener{
    //Variable que referencia a la interfaz de la cual se manejan sus eventos
    private VistaPrincipal vistaPrincipal;
    
    /**
     * Contrusctor de la clase
     * @param vistaPrincipal hace referencia a la interfaz de la cual se estan 
     * manejando sus eventos
     */
    public ControladorVistaPrincipal(VistaPrincipal vistaPrincipal){
        this.vistaPrincipal = vistaPrincipal;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        //Instanciamos el boton del cual se genero el evento
        JButton botonClic = (JButton) ae.getSource();
        
        //Identificamos desde que boton se genero el evento
        
        if(botonClic.getText().equalsIgnoreCase("Algoritmo Extendido de Euler")){
            //Abrimos la ventana del algoritmo extendido
            VistaAlgoritmo algoritmo = new VistaAlgoritmo();
            //la hacemos visible
            algoritmo.setVisible(true);
        }
        
        if(botonClic.getText().equalsIgnoreCase("Congruencia")){
            //Abrimos la ventana de la congruencia
            VistaCongruencia congruencia = new VistaCongruencia();
            //la hacemos visible
            congruencia.setVisible(true);
        }
        
        if(botonClic.getText().equalsIgnoreCase("Criba de Erastotenes")){
            //Abrimos la ventana de la criba de erastotenes
            VistaCriba criba = new VistaCriba();
            //la hacemos visible
            criba.setVisible(true);
        }
        
        if(botonClic.getText().equalsIgnoreCase("Entropia de Shannon")){
            //Abrimos la ventana de la entropia de shannon
            VistaEntropia entropia = new VistaEntropia();
            //la hacemos visible
            entropia.setVisible(true);
        }
        
        if(botonClic.getText().equalsIgnoreCase("Exponenciacion Modular")){
            //Abrimos la ventana de la exponenciacion
            VistaExponenciacion exponenciacion = new VistaExponenciacion();
            //la hacemos visible
            exponenciacion.setVisible(true);
        }
        
        if(botonClic.getText().equalsIgnoreCase("Minimo Comun Divisor (M.C.D.)")){
            //Abrimos la ventana del minimo comun multiplo
            VistaMinimo minimo = new VistaMinimo();
            //la hacemos visible
            minimo.setVisible(true);
        }
        
        if(botonClic.getText().equalsIgnoreCase("acerca de...")){
            //Abrimos la ventana de ayuda
            VistaAyudaPrincipal ayuda = new VistaAyudaPrincipal();
            //la hacemos visible
            ayuda.setVisible(true);
        }
        
        if(botonClic.getText().equalsIgnoreCase("salir")){
            //Cerramos el programa
            System.exit(0);
        }
        //Ocultamos la ventana principal para dar paso a la nueva interfaz solicitada
        vistaPrincipal.dispose();
    }
}
