/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.ModuloInverso;
import Vistas.VistaModuloInverso;
import Vistas.VistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author ALEX
 */
public class ControladorVistaModuloInverso implements ActionListener{
    private VistaModuloInverso vistaModuloInverso;
    
    public ControladorVistaModuloInverso(VistaModuloInverso vistaModuloInverso){
        this.vistaModuloInverso = vistaModuloInverso;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //Obtenemos referencia al boton del cual se genera el clic
        JButton botonTemporal = (JButton) ae.getSource();
        
        //Identificamos desde que boton se genero el evento
        if(botonTemporal.getText().equalsIgnoreCase("ayuda")){
            vistaModuloInverso.getLb_infoModuloInverso().setText("Info: Ups, disculpa, aun no esta implementado");
        }
        
        if(botonTemporal.getText().equalsIgnoreCase("limpiar campos")){
            //Obtenemos una referencia a los componentes de la interfaz y los
            //Regresamos a su estado original
            vistaModuloInverso.getTxt_aModuloInverso().setText("");
            vistaModuloInverso.getTxt_bModuloInverso().setText("");
            vistaModuloInverso.getTxt_resultadoModuloInverso().setText("");
            vistaModuloInverso.getLb_infoModuloInverso().setText("Info:");
        }
        
        if(botonTemporal.getText().equalsIgnoreCase("regresar")){
            //Creamos una referencia a la ventana que deseamos regresar
            VistaPrincipal vistaPrincipal = new VistaPrincipal();
            //Centramos la ventana
            vistaPrincipal.setLocationRelativeTo(null);
            //mostramos la ventana
            vistaPrincipal.setVisible(true);
            //Cerramos esta ventana
            vistaModuloInverso.dispose();
        }
        
        if(botonTemporal.getText().equalsIgnoreCase("calcular")){
            //Verificamos que los campos no esten vacios
            if(!(vistaModuloInverso.getTxt_aModuloInverso().getText().equalsIgnoreCase("")
                    && vistaModuloInverso.getTxt_bModuloInverso().getText().equalsIgnoreCase(""))){
                //Verificamos que los valores ingresados sean validos
                try {
                    int temporalA, temporalB;
                    temporalA = Integer.parseInt(vistaModuloInverso.getTxt_aModuloInverso().getText());
                    temporalB = Integer.parseInt(vistaModuloInverso.getTxt_bModuloInverso().getText());
                    //Calculamos el modulo inverso
                    Modelos.ModuloInverso moduloInverso = new ModuloInverso();
                    //Mostramos el resultado
                    vistaModuloInverso.getTxt_resultadoModuloInverso().setText("" + moduloInverso.euclidesExtendido(temporalA, temporalB));
                } catch (Exception e) {
                    vistaModuloInverso.getLb_infoModuloInverso().setText("Info: los numeros ingresados no son validos");
                }
            }else{
                vistaModuloInverso.getLb_infoModuloInverso().setText("Info: los dos primeros campos no deben estar vacios");
            }
        }
    }
    
}
