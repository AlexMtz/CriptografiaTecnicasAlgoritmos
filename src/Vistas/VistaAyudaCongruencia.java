/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Recursos.fuentes.FontBSD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author ALEX
 */
public class VistaAyudaCongruencia extends javax.swing.JFrame {

    /**
     * Creates new form VistaAyudaCongruencia
     */
    public VistaAyudaCongruencia() {
        initComponents();
        //centrar la ventana
        this.setLocationRelativeTo(null);
        //Garantizar la fuente y el estilo
        setFont();
        //Agregamos el manejador al boton
        btn_cerrarAyudaCongruencia.addActionListener(new ControladorVistaAyudaCongruencia(this));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_cerrarAyudaCongruencia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(585, 380));

        jLabel1.setFont(new java.awt.Font("BSD I Believe In Love", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Ayuda");

        jLabel2.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("En matematicas, la congruencia es un expresion algebraica");

        jLabel3.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("que expresa la igualdad de los restos de las divisiones");

        jLabel4.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("de dos numeros congruentes por su modulo (un numero");

        jLabel5.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("natural distinto de cero).");

        jLabel6.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Esta expresion se representa con tres rayas horizontales");

        jLabel7.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("entre los numeros y, si les asignamos las variables a y b,");

        jLabel8.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("se lee a es congruente con b modulo m.");

        btn_cerrarAyudaCongruencia.setBackground(new java.awt.Color(243, 156, 18));
        btn_cerrarAyudaCongruencia.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        btn_cerrarAyudaCongruencia.setForeground(new java.awt.Color(240, 240, 240));
        btn_cerrarAyudaCongruencia.setText("cerrar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))))))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_cerrarAyudaCongruencia)
                .addGap(250, 250, 250))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(29, 29, 29)
                .addComponent(btn_cerrarAyudaCongruencia)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaAyudaCongruencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAyudaCongruencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAyudaCongruencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAyudaCongruencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAyudaCongruencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cerrarAyudaCongruencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    /**
     * Metodo que garantiza el tipo de fuente y estilo que se usa en la interfaz
     * de la ventana sin importar el sistema operativo en el cual se utilize
     */
    private void setFont() {
        FontBSD fonts = new FontBSD();
        jLabel1.setFont(fonts.getMyFont(1, 30));
        jLabel2.setFont(fonts.getMyFont(1, 18));
        jLabel3.setFont(fonts.getMyFont(1, 18));
        jLabel4.setFont(fonts.getMyFont(1, 18));
        jLabel5.setFont(fonts.getMyFont(1, 18));
        jLabel6.setFont(fonts.getMyFont(1, 18));
        jLabel7.setFont(fonts.getMyFont(1, 18));
        jLabel8.setFont(fonts.getMyFont(1, 18));
        btn_cerrarAyudaCongruencia.setFont(fonts.getMyFont(1, 18));
    }
}

/**
 * Clase que controla los eventos de la ventana de ayuda de la Entropia
 * @author Yonathan Alexander Martinez Padilla
 */
class ControladorVistaAyudaCongruencia implements ActionListener{
    //Variable que hace referencia a la interfaz de la ayuda de la Entropia
    private VistaAyudaCongruencia vistaAyudaCongruencia;
    
    /**
     * Constructor de la clase de Ayuda de Entropia de Shannon
     * @param vistaAyudaEntropia hace referencia a la ventana de la cual manejara 
     * sus eventos
     */
    public ControladorVistaAyudaCongruencia(VistaAyudaCongruencia vistaAyudaCongruencia){
        this.vistaAyudaCongruencia = vistaAyudaCongruencia;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //Obtenemos una referencia al boton del cual se genero el evento
        JButton botonTemporal = (JButton) ae.getSource();
        
        //Identificamos el boton del cual se genero el evento
        if(botonTemporal.getText().equalsIgnoreCase("cerrar")){
            //Cerramos ésta ventana
            vistaAyudaCongruencia.dispose();
        }
    }
    
}
