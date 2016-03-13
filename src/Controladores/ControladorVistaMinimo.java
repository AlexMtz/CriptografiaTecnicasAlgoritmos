/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.MinimoComunDivisor;
import Vistas.VistaAyudaMínimo;
import Vistas.VistaMinimo;
import Vistas.VistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 * Clase que maneja los eventos de la interfaz VistaMinimo, implementa 
 * ActionListener
 * @author Yonathan Alexander Martínez Padilla
 */
public class ControladorVistaMinimo implements ActionListener{
    //Creamos una variable que haga referencia a la interfaz de la cual se 
    //manejaran los eventos
    private VistaMinimo vistaMinimo;
    
    /**
     * Constructor de la clase
     * @param vistaMinimo hace referencia a la interfaz de la cual se está 
     * manejando los eventos de la interfaz
     */
    public ControladorVistaMinimo(VistaMinimo vistaMinimo){
        this.vistaMinimo = vistaMinimo;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        //Obtenemos una referencia al boton del cual se está generando el evento
        JButton botonTemporal = (JButton) ae.getSource();
        
        //Identificamos el boton del cual se genero el evento y le agregamos las
        //Acciones correspondientes
        if(botonTemporal.getText().equalsIgnoreCase("regresar")){
            //generamos una nueva variable que referencia a la interfaz a la que
            //queremos regresar
            VistaPrincipal vistaPrincipal = new VistaPrincipal();
            //Centramos la interfaz
            vistaPrincipal.setLocationRelativeTo(null);
            //La hacemos visible
            vistaPrincipal.setVisible(true);
            //ocultamos la interfaz actual
            vistaMinimo.dispose();
        }
        
        if(botonTemporal.getText().equalsIgnoreCase("limpiar campos")){
            limpiarCampos();
        }
        
        if(botonTemporal.getText().equalsIgnoreCase("ayuda")){
            //mostramos la ventana de ayuda
            VistaAyudaMínimo vistaAyudaMinimo = new VistaAyudaMínimo();
            //Lo centralizamos
            vistaAyudaMinimo.setLocationRelativeTo(null);
            //Lo hacemos visible
            vistaAyudaMinimo.setVisible(true);
        }
        
        if(botonTemporal.getText().equalsIgnoreCase("calcular")){
            //Verificamos que los campos no se encuentren vacios
            if(!(vistaMinimo.getTxt_aMinimo().getText().equalsIgnoreCase("") && 
                    vistaMinimo.getTxt_bMinimo().getText().equalsIgnoreCase(""))){
                //Verificamos que los datos ingresados sean validos (numeros enteros)
                try {
                    int temporalA, temporalB;
                    temporalA = Integer.parseInt(vistaMinimo.getTxt_aMinimo().getText());
                    temporalB = Integer.parseInt(vistaMinimo.getTxt_bMinimo().getText());
                    //verificamos que a sea mayor que b
                    if(temporalA > temporalB){
                        //Calculamos el resultado
                        MinimoComunDivisor mcd = new MinimoComunDivisor();
                        mcd.calcularMCD(temporalA, temporalB);
                        //Lo asignamos al campo de resultado
                        vistaMinimo.getTxt_resultadoMinimo().setText(mcd.getProcedieminto());
                        vistaMinimo.getLb_infoMinimo().setText("Info: Minimo Comun Divisor encontrado");
                    }else{
                        vistaMinimo.getLb_infoMinimo().setText("Info: a no puede ser menor que b");
                    }
                } catch (Exception e) {
                    //Como uno de los valores ingresados no es válido, se lo notificamos 
                    //al usuario
                    vistaMinimo.getLb_infoMinimo().setText("Info: uno de los valores ingresados no es válido");
                }
            }else{
                //Como uno de los campos está vacio se lo notificamos al usuario
                vistaMinimo.getLb_infoMinimo().setText("Info: uno de los campos es encuentra vacío");
            }
        }
    }
    /**
     * Este método nos permite limpiar los campos de la intetrfaz, permitiendonos
     * regresarlos a su estado original
     */
    public void limpiarCampos(){
        //Obtenemos cada uno de los componentes de la interfaz y lo regresamos
        //a su estado inicial
        vistaMinimo.getTxt_aMinimo().setText("");
        vistaMinimo.getTxt_bMinimo().setText("");
        vistaMinimo.getTxt_resultadoMinimo().setText("");
        vistaMinimo.getLb_infoMinimo().setText("Info:");
    }
}
