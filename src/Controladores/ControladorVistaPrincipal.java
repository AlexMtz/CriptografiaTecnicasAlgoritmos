/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author ALEX
 */
public class ControladorVistaPrincipal implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent ae) {
        JButton botonClic = (JButton) ae.getSource();
        
        if(botonClic.getText().equalsIgnoreCase("Algoritmo Extendido de Euler")){
            
        }
        
        if(botonClic.getText().equalsIgnoreCase("Congruencia")){
            
        }
        
        if(botonClic.getText().equalsIgnoreCase("Criba de Erastotenes")){
            
        }
        
        if(botonClic.getText().equalsIgnoreCase("Entropia de Shannon")){
            
        }
        
        if(botonClic.getText().equalsIgnoreCase("Exponenciacion Modular")){
            
        }
        
        if(botonClic.getText().equalsIgnoreCase("Minimo Comun Divisor (M.C.D.)")){
            
        }
        
        if(botonClic.getText().equalsIgnoreCase("acerca de...")){
            
        }
        
        if(botonClic.getText().equalsIgnoreCase("salir")){
            System.exit(0);
        }
    }
    
}
