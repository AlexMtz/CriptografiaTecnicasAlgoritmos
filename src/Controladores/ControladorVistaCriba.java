/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.CribaErastotenes;
import Vistas.VistaAyudaCriba;
import Vistas.VistaCriba;
import Vistas.VistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Yonathan Alexander Martinez Padilla
 */
public class ControladorVistaCriba implements ActionListener{
    //Obtenemos una referencia a la ventan la cual estamos manejando los eventos
    private VistaCriba vistaCriba;
    
    /**
     * Constructor de la clase
     * @param vistaCriba corresponde a la ventana de la cual se están manejando 
     * los eventos
     */
    public ControladorVistaCriba(VistaCriba vistaCriba){
        this.vistaCriba = vistaCriba;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //Obtenemos una referencia al boton del cual se hizo clic
        JButton botonTemporal = (JButton) ae.getSource();
        
        //Identificamos el boton desde el cual se hizo clic
        if(botonTemporal.getText().equalsIgnoreCase("regresar")){
            //Creamos una referencia a la ventana la cual queremos regresar
            VistaPrincipal vistaPrincipal = new VistaPrincipal();
            //Mostramos la ventana
            vistaPrincipal.setVisible(true);
            //Cerramos la ventana actual
            vistaCriba.dispose();
        }
        
        if(botonTemporal.getText().equalsIgnoreCase("limpiar campos")){
            //Obtenemos una referencia a los componentes de la interfaz y
            //los regresamos a su estado original
            vistaCriba.getTxt_numeroCriba().setText("");
            vistaCriba.getTxt_solucionCriba().setText("");
            vistaCriba.getLb_infoCriba().setText("Info:");
        }
        
        if(botonTemporal.getText().equalsIgnoreCase("ayuda")){
            //Creamos una nueva instancia de la ventana de ayuda
            VistaAyudaCriba vistaAyudaCriba = new VistaAyudaCriba();
            //Centrar la ventana
            vistaAyudaCriba.setLocationRelativeTo(null);
            //Mostramos la ventana
            vistaAyudaCriba.setVisible(true);
        }
        
        if(botonTemporal.getText().equalsIgnoreCase("cribar")){
            //Verificamos que no este vacio el campo del numero de Criba
            if(!vistaCriba.getTxt_numeroCriba().getText().equalsIgnoreCase("")){
            //Validamos el numero de Criba
                try {
                    int cribaTemporal;
                    cribaTemporal = Integer.parseInt(vistaCriba.getTxt_numeroCriba().getText());
                    //Generamos una instancia de la clase Criba
                    CribaErastotenes criba = new CribaErastotenes();
                    //Calcular la criba
                    criba.calcularCriba(cribaTemporal);
                    //mostrar el resultado
                    vistaCriba.getTxt_solucionCriba().setText(criba.getProcedimiento());
                } catch (Exception e) {
                    vistaCriba.getLb_infoCriba().setText("Info: el numero de Criba no es valido");
                }
                //Realizamos la Criba
            }else{
                vistaCriba.getLb_infoCriba().setText("Info: el numero de Criba no puede estar vacio");
            }
        }
    }
}
