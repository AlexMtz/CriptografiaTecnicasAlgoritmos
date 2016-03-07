/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

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
        }
        
        if(botonClic.getText().equalsIgnoreCase("Congruencia")){
            //Abrimos la ventana de la congruencia
        }
        
        if(botonClic.getText().equalsIgnoreCase("Criba de Erastotenes")){
            //Abrimos la ventana de la criba de erastotenes
        }
        
        if(botonClic.getText().equalsIgnoreCase("Entropia de Shannon")){
            //Abrimos la ventana de la entropia de shannon
        }
        
        if(botonClic.getText().equalsIgnoreCase("Exponenciacion Modular")){
            //Abrimos la ventana de la exponenciacion
        }
        
        if(botonClic.getText().equalsIgnoreCase("Minimo Comun Divisor (M.C.D.)")){
            //Abrimos la ventana del minimo comun multiplo
        }
        
        if(botonClic.getText().equalsIgnoreCase("acerca de...")){
            //Abrimos la ventana de acerca de
        }
        
        if(botonClic.getText().equalsIgnoreCase("salir")){
            System.exit(0);
        }
        vistaPrincipal.dispose();
    }
    
}
