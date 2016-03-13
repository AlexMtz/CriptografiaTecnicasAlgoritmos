/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.EntropiaShannon;
import Vistas.VistaAyudaEntropia;
import Vistas.VistaEntropia;
import Vistas.VistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Yonathan Alexander Martinez Padilla
 */
public class ControladorVistaEntropia implements ActionListener{
    //Creamos una variable para referenciar a la ventana de la cual vamos a 
    //manejar los eventos
    private VistaEntropia vistaEntropia;
    
    private boolean esPrimeraVez = true;
    EntropiaShannon entropia;
    
    /**
     * Constructor de la clase
     * @param vistaEntropia hace referencia a la ventana de la cual se manejan 
     * los eventos
     */
    public ControladorVistaEntropia(VistaEntropia vistaEntropia){
        this.vistaEntropia = vistaEntropia;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //Obtenemos el boton del cual se genero el evento
        JButton botonTemporal = (JButton) ae.getSource();
        
        double probabilidadTemp = 0d;
        
        //Identificamos desde que boton se genero el evento
        
        if(botonTemporal.getText().equalsIgnoreCase("regresar")){
            //Creamos una variable de la vista a la cual vamos a regresar
            VistaPrincipal vistaPrincipal = new VistaPrincipal();
            //La centramos
            vistaPrincipal.setLocationRelativeTo(null);
            //La hacemos visible
            vistaPrincipal.setVisible(true);
            //Cerramos la vista actual
            vistaEntropia.dispose();
        }
        
        if(botonTemporal.getText().equalsIgnoreCase("limpiar campos")){
            //Obtenemos una referencia a cada uno de los componnetes de la interfaz
            //y los reiniciamos a su forma original
            vistaEntropia.getTxt_estadosEntropia().setText("");
            vistaEntropia.getTxt_probabilidadEntropia().setText("");
            vistaEntropia.getTxt_probabilidadEntropia().setVisible(false);
            vistaEntropia.getTxt_solucionEntropia().setText("");
            vistaEntropia.getBtn_siguienteEntropia().setVisible(false);
            vistaEntropia.getBtn_calcularEntropia().setEnabled(false);
            vistaEntropia.getLb_probabilidadEntropia().setVisible(false);
            vistaEntropia.getRdnbtn_noEntropia().setEnabled(true);
            vistaEntropia.getRdnbtn_siEntropia().setEnabled(true);
            vistaEntropia.getTxt_estadosEntropia().setEditable(true);
            vistaEntropia.getTxt_probabilidadEntropia().setEditable(true);
            vistaEntropia.getLb_infoEntropia().setText("Info:");
        }
        
        if(botonTemporal.getText().equalsIgnoreCase("ayuda")){
            //Abrimos la ventana de la ayuda de la Entropia
            VistaAyudaEntropia vistaAyuda = new VistaAyudaEntropia();
            //centramos la ventana
            vistaAyuda.setLocationRelativeTo(null);
            //La mostramos
            vistaAyuda.setVisible(true);
        }
        
        if(botonTemporal.getText().equalsIgnoreCase("siguiente")){
            //primera vez
            if(esPrimeraVez){
                //Verificamos que exista un numero de estados
                if(!vistaEntropia.getTxt_estadosEntropia().getText().equalsIgnoreCase("")){
                    //Verificamos que el numero de estados sea válido
                    try {
                        int numEstados;
                        numEstados = Integer.parseInt(vistaEntropia.getTxt_estadosEntropia().getText());
                        //Guardamos el numero de estados
                        entropia = new EntropiaShannon(numEstados);
                        //Indicamos que ya no es primera vez
                        esPrimeraVez = false;
                        //Desactivamos el campo de los estados
                        vistaEntropia.getTxt_estadosEntropia().setEditable(false);
                    } catch (Exception e) {
                        vistaEntropia.getLb_infoEntropia().setText("Info: el numero de estados no es valido");
                    }
                    //Verificar si ya ingreso la primer probabilidad
                    if(!vistaEntropia.getTxt_probabilidadEntropia().getText().equalsIgnoreCase("")){
                        //Validar la primer probabilidad
                        try {
                            probabilidadTemp = Double.parseDouble(vistaEntropia.getTxt_probabilidadEntropia().getText());
                        } catch (Exception e) {
                            vistaEntropia.getLb_infoEntropia().setText("Info: el valor de la probabilidad no es valido");
                        }
                        //Verificamos que no supere los limites
                        if(probabilidadTemp > 0.0 && probabilidadTemp < 1.0){
                            //Guardamos la primer probabilidad
                            entropia.siguinteProbabilidad(probabilidadTemp);
                            //Limpiamos el campo de la probabilidad
                            vistaEntropia.getTxt_probabilidadEntropia().setText("");
                            //Indicamos al usuario que introduzca siguiente probabilidad
                            vistaEntropia.getLb_probabilidadEntropia().setText("Probabilidad del estado 2:");
                            vistaEntropia.getLb_infoEntropia().setText("Info: siguiente probabilidad");
                        }else{
                            vistaEntropia.getLb_infoEntropia().setText("Info: el valor de la probabilidad es mayor a uno o menor a 0");
                        }
                    }
                }else{
                    vistaEntropia.getLb_infoEntropia().setText("Info: por favor indica un numero de estados");
                }
            }else{
                //veces subsecuentes
                //Verificamos si aun faltan probabilidades
                if(entropia.faltanProbabilidades()){
                    //Verificamos que haya introducido algo
                    if(!vistaEntropia.getTxt_probabilidadEntropia().getText().equalsIgnoreCase("")){
                        //Verificamos que sea válido
                        try {
                            probabilidadTemp = 
                                    Double.parseDouble(vistaEntropia.getTxt_probabilidadEntropia().getText());
                        } catch (Exception e) {
                            vistaEntropia.getLb_infoEntropia().setText("Info: el valor de la probabilidad es un numero no valido");
                        }
                        //Verificamos que se encuentre dentro de los límites
                        if(probabilidadTemp < 1.0 && probabilidadTemp > 0.0){
                            //Guardamos la probabilidad
                            entropia.siguinteProbabilidad(probabilidadTemp);
                            //Modificamos la etiqueta de probabilidad
                            vistaEntropia.getLb_probabilidadEntropia().setText("Probabilidad del estado " + entropia.probabilidadesHastaAhora() + ":");
                            //Solicitamos la siguiente probabilidad
                            vistaEntropia.getLb_infoEntropia().setText("Info: siguiente probabilidad");
                            //Limpiamos el campo de la siguiente probabilidad
                            vistaEntropia.getTxt_probabilidadEntropia().setText("");
                        }else{
                            vistaEntropia.getLb_infoEntropia().setText("Info: la probabilidad no puede ser mayor a 1 o menor a 0");
                        }
                    }else{
                        vistaEntropia.getLb_infoEntropia().setText("Info: el campo de la probabilidad esta vacio");
                    }
                }
                if(!entropia.faltanProbabilidades()){
                    //Si no faltan, desactivamos el boton de siguiente y el campo de probabilidad y activamos el boton de calcular
                    vistaEntropia.getBtn_siguienteEntropia().setEnabled(false);
                    vistaEntropia.getBtn_calcularEntropia().setEnabled(true);
                    vistaEntropia.getTxt_probabilidadEntropia().setEditable(false);
                    vistaEntropia.getLb_infoEntropia().setText("Info: ya puedes calcular la entropia");
                }
            }
        }
        
        if(botonTemporal.getText().equalsIgnoreCase("calcular")){
            //Verificamos que opcion se selecciono
            
            if(vistaEntropia.getRdnbtn_noEntropia().isSelected()){
                //Verificamos que la probabilidad total no sea mayor a uno
                if(entropia.probabilidadTotalEsValida()){
                    //calculamos la entropia
                    entropia.calcularEntropia();
                    //Mostramos la entropia
                    vistaEntropia.getTxt_solucionEntropia().setText("\tEntropia de Shannon\n\t" + entropia.getResultado());
                    //Notificar al usuario
                    vistaEntropia.getLb_infoEntropia().setText("Info: entropia calculada");
                    //Desactivar el boton de calcular
                    vistaEntropia.getBtn_calcularEntropia().setEnabled(false);
                }else{
                    vistaEntropia.getLb_infoEntropia().setText("Info: ups, parece ser que la probabilidad total es diferente de 1");
                }
            }
            
            if(vistaEntropia.getRdnbtn_siEntropia().isSelected()){
                //verificamos que el numero de estados no esté vacio
                if(!vistaEntropia.getTxt_estadosEntropia().getText().equalsIgnoreCase("")){
                    //Validamos el numero de estados
                    try {
                        int numEstadosTemp;
                        numEstadosTemp = Integer.parseInt(vistaEntropia.getTxt_estadosEntropia().getText());
                        //Desactivamos el campo de los estados
                        vistaEntropia.getTxt_estadosEntropia().setEditable(false);
                        //creamos el objeto entropia con los estados asignados
                        entropia = new EntropiaShannon(numEstadosTemp);
                        //calculamos la entropia
                        entropia.calcularEntropia();
                        //Mostramos la entropia
                        vistaEntropia.getTxt_solucionEntropia().setText("\tEntropia de Shannon\n\t" + entropia.getResultado());
                        //Notificar al usuario
                        vistaEntropia.getLb_infoEntropia().setText("Info: entropia calculada");
                        //Desactivar el boton de calcular
                        vistaEntropia.getBtn_calcularEntropia().setEnabled(false);
                    } catch (Exception e) {
                        vistaEntropia.getLb_infoEntropia().setText("Info: el numero de estados no es valido");
                    }
                }else{
                    vistaEntropia.getLb_infoEntropia().setText("Info: el numero de estados no puede estar vacio");
                }
            }
        }
    }
    
}
