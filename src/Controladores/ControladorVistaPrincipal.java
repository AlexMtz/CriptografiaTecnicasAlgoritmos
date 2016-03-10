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
 *
 * @author ALEX
 */
public class ControladorVistaPrincipal implements ActionListener{
    private VistaPrincipal vistaPrincipal;
    
    public ControladorVistaPrincipal(VistaPrincipal vistaPrincipal){
        this.vistaPrincipal = vistaPrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        JButton botonClic = (JButton) ae.getSource();
        
        if(botonClic.getText().equalsIgnoreCase("Algoritmo Extendido de Euler")){
            //Abrimos la ventana del algoritmo extendido
            VistaAlgoritmo algoritmo = new VistaAlgoritmo();
            algoritmo.setVisible(true);
        }
        
        if(botonClic.getText().equalsIgnoreCase("Congruencia")){
            //Abrimos la ventana de la congruencia
            VistaCongruencia congruencia = new VistaCongruencia();
            congruencia.setVisible(true);
        }
        
        if(botonClic.getText().equalsIgnoreCase("Criba de Erastotenes")){
            //Abrimos la ventana de la criba de erastotenes
            VistaCriba criba = new VistaCriba();
            criba.setVisible(true);
        }
        
        if(botonClic.getText().equalsIgnoreCase("Entropia de Shannon")){
            //Abrimos la ventana de la entropia de shannon
            VistaEntropia entropia = new VistaEntropia();
            entropia.setVisible(true);
        }
        
        if(botonClic.getText().equalsIgnoreCase("Exponenciacion Modular")){
            //Abrimos la ventana de la exponenciacion
            VistaExponenciacion exponenciacion = new VistaExponenciacion();
            exponenciacion.setVisible(true);
        }
        
        if(botonClic.getText().equalsIgnoreCase("Minimo Comun Divisor (M.C.D.)")){
            //Abrimos la ventana del minimo comun multiplo
            VistaMinimo minimo = new VistaMinimo();
            minimo.setVisible(true);
        }
        
        if(botonClic.getText().equalsIgnoreCase("acerca de...")){
            //Abrimos la ventana de ayuda
            VistaAyudaPrincipal ayuda = new VistaAyudaPrincipal();
            ayuda.setVisible(true);
        }
        
        if(botonClic.getText().equalsIgnoreCase("salir")){
            System.exit(0);
        }
        vistaPrincipal.dispose();
    }
    
}
