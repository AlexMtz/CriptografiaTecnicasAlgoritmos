/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Congruencia;
import Vistas.VistaAyudaCongruencia;
import Vistas.VistaCongruencia;
import Vistas.VistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 * Clase que maneja los eventos de la interfaz de Congruencia implementa ActionListener
 * @author Yonathan Alexander Martinez Padilla
 */
public class ControladorVistaCongruencia implements ActionListener{
    private VistaCongruencia vistaCongruencia;
    
    public ControladorVistaCongruencia(VistaCongruencia vistaCongruencia){
        this.vistaCongruencia = vistaCongruencia;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //Obtenemos una referencia al boton del cual se genera el clic
        JButton botonTemporal = (JButton) ae.getSource();
        
        //Identificamos de que boton se genero el evento
        if(botonTemporal.getText().equalsIgnoreCase("ayuda")){
            //Creamos una nueva referencia a la ventana de ayuda
            VistaAyudaCongruencia vistaAyudaCongruencia = new VistaAyudaCongruencia();
            //centramos la ventana
            vistaAyudaCongruencia.setLocationRelativeTo(null);
            //La mostramos
            vistaAyudaCongruencia.setVisible(true);
        }
        
        if(botonTemporal.getText().equalsIgnoreCase("regresar")){
            //Creamos la referencia a la ventana que quewremos regresar
            VistaPrincipal vistaPrincipal = new VistaPrincipal();
            //Centramos la ventana principal
           vistaPrincipal.setLocationRelativeTo(null);
           //Mostramos la ventana
           vistaPrincipal.setVisible(true);
           //Cerramos esta ventana
           vistaCongruencia.dispose();
        }
        
        if(botonTemporal.getText().equalsIgnoreCase("limpiar campos")){
            //Obtenemos una referencia a cxada uno de los componnetes de la interfaz
            //y lo regresamos a su estado original
            vistaCongruencia.getTxt_aCongruencia().setText("");
            vistaCongruencia.getTxt_bCongruencia().setText("");
            vistaCongruencia.getTxt_solucionCongruencia().setText("");
            vistaCongruencia.getLb_infoCongruencia().setText("Info:");
            vistaCongruencia.getTxt_moduloCongruencia().setText("");
        }
        
        if(botonTemporal.getText().equalsIgnoreCase("calcular")){
            //Verificar que los campos de texto no se encuentren vacios
            if(!(vistaCongruencia.getTxt_aCongruencia().getText().equalsIgnoreCase("") &&
                    vistaCongruencia.getTxt_bCongruencia().getText().equalsIgnoreCase("") &&
                    vistaCongruencia.getTxt_moduloCongruencia().getText().equalsIgnoreCase(""))){
                //Verificar que los valores de los campos de texto sean válidos
                int temporalA, temporalB, moduloTemp;
                try {
                    temporalA = Integer.parseInt(vistaCongruencia.getTxt_aCongruencia().getText());
                    temporalB = Integer.parseInt(vistaCongruencia.getTxt_bCongruencia().getText());
                    moduloTemp = Integer.parseInt(vistaCongruencia.getTxt_moduloCongruencia().getText());
                    //Realizar calculos
                    Congruencia congruencia = new Congruencia();
                    congruencia.calcularCongruencia(temporalA, temporalB, moduloTemp);
                    //Mostrar calculos
                    vistaCongruencia.getTxt_solucionCongruencia().setText(congruencia.getProcedimiento());
                    vistaCongruencia.getLb_infoCongruencia().setText("Info: Calculo de Congruencia correcto");
                } catch (Exception e) {
                    vistaCongruencia.getLb_infoCongruencia().setText("Info: el valor de uno de los campos no es válido");
                }
            }
        }
    }
    
    
}
