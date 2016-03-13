/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.ExponenciacionModular;
import Vistas.VistaAyudaExponenciacion;
import Vistas.VistaExponenciacion;
import Vistas.VistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 * Clase que maneja los eventos de la interfaz de la Exponenciacion
 * implementa ActionListener
 * @author Yonathan Alexander Martinez Padilla
 */
public class ControladorVistaExponenciacion implements ActionListener{
    //Creamos una variable que referencia a la interfaz de la cual manejamos sus
    //eventos
    private VistaExponenciacion vistaExponenciacion;
    
    /**
     * Constructor de la clase
     * @param vistaExponenciacion hace referencia a la interfaz de la cual se 
     * estan manejando sus eventos
     */
    public ControladorVistaExponenciacion(VistaExponenciacion vistaExponenciacion){
        this.vistaExponenciacion = vistaExponenciacion;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        //Obtenemos el objeto boton del cual se hizo el clic
        JButton botonTemporal = (JButton) ae.getSource();
        
        //Identificamos el boton y asignamos acciones
        if(botonTemporal.getText().equalsIgnoreCase("regresar")){
            //Creamos una variable que referencie a la interfaz a la cual
            //deseamos regresar
            VistaPrincipal vistaPrincipal = new VistaPrincipal();
            vistaPrincipal.setLocationRelativeTo(null);
            vistaPrincipal.setVisible(true);
            //Cerramos está ventana
            vistaExponenciacion.dispose();
        }
        
        if(botonTemporal.getText().equalsIgnoreCase("ayuda")){
            //creamos una referncia a la interfaz de ayuda la mostramos
            VistaAyudaExponenciacion vistaAyuda = new VistaAyudaExponenciacion();
            //centramos la ventana
            vistaAyuda.setLocationRelativeTo(null);
            //La mostramos
            vistaAyuda.setVisible(true);
        }
        
        if(botonTemporal.getText().equalsIgnoreCase("limpiar campos")){
            //Obtenemos referencia a cada uno de los componentes de la interfaz y lo
            //reegresamos a su estado original
            vistaExponenciacion.getTxt_baseExponenciacion().setText("");
            vistaExponenciacion.getTxt_exponenciacionExponenciacion().setText("");
            vistaExponenciacion.getTxt_moduloExponenciacion().setText("");
            vistaExponenciacion.getLb_infoExponenciacion().setText("Info:");
            vistaExponenciacion.getTxt_solucionExponenciacion().setText("");
        }
        
        if(botonTemporal.getText().equalsIgnoreCase("calcular")){
            //Verificamos que ningun campo se encuentre vacio
            if(!(vistaExponenciacion.getTxt_baseExponenciacion().getText().equalsIgnoreCase("")
                    && vistaExponenciacion.getTxt_exponenciacionExponenciacion().getText().equalsIgnoreCase("")
                    && vistaExponenciacion.getTxt_moduloExponenciacion().getText().equalsIgnoreCase(""))){
                //Verificamos que se haya selecionado un metodo de solucion
                if(vistaExponenciacion.getRdnbtn_binarioExponenciacion().isSelected() ||
                        vistaExponenciacion.getRdnbtn_clasicoExponenciacion().isSelected()){
                //Validamos que cada campo contenga un numero entero y válido
                    try {
                        int temporalBase, temporalExponente, temporalModulo;
                        temporalBase = 
                                Integer.parseInt(vistaExponenciacion.getTxt_baseExponenciacion().getText());
                        temporalExponente = 
                                Integer.parseInt(vistaExponenciacion.getTxt_exponenciacionExponenciacion().getText());
                        temporalModulo = 
                                Integer.parseInt(vistaExponenciacion.getTxt_moduloExponenciacion().getText());
                        //Calculamos el modulo exponencial
                        ExponenciacionModular exponenciacion = new ExponenciacionModular();
                        //El metodo clásico fue seleccionado
                        if(vistaExponenciacion.getRdnbtn_clasicoExponenciacion().isSelected()){
                            exponenciacion.metodoClasico(temporalBase, temporalExponente, temporalModulo);
                            //mostramos el resultado
                            vistaExponenciacion.getTxt_solucionExponenciacion().setText(exponenciacion.getInfoClasico());
                        }
                        //El metodo binario fue seleccionado
                        if(vistaExponenciacion.getRdnbtn_binarioExponenciacion().isSelected()){
                            exponenciacion.metodoBinario(temporalBase, temporalExponente, temporalModulo);
                            //mostramos el resultado
                            vistaExponenciacion.getTxt_solucionExponenciacion().setText(exponenciacion.getInfoBinario());
                        }
                        vistaExponenciacion.getLb_infoExponenciacion().setText("Info: Exponenciacion calculada exitosamente");
                    } catch (Exception e) {
                        vistaExponenciacion.getLb_infoExponenciacion().setText("Info: uno de los valores no es valido");
                    }
                }else{
                    vistaExponenciacion.getLb_infoExponenciacion().setText("Info: Por favor selecciona un metodo de exponenciacion");
                }
            }else{
                vistaExponenciacion.getLb_infoExponenciacion().setText("Info: Ningun campo puede estar vacio");
            }
        }
    }        
}
