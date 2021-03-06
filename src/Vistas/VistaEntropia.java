/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controladores.ControladorVistaEntropia;
import Recursos.fuentes.FontBSD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ALEX
 */
public class VistaEntropia extends javax.swing.JFrame {
    //Creamos variables que refencien a las clases encargadas de manejar los eventos 
    //de la interfaz
    private ControladorVistaEntropia manejador = new ControladorVistaEntropia(this);
    private ControladorJRadioButonsEntropia manejadorJRadioButton = new ControladorJRadioButonsEntropia(this);
    
    /**
     * Creates new form VistaEntropia
     */
    public VistaEntropia() {
        initComponents();
        //Agregamos los botones de radio a un grupo de botones
        btngroup_Entropia.add(rdnbtn_noEntropia);
        btngroup_Entropia.add(rdnbtn_siEntropia);
        //centramos la ventana
        this.setLocationRelativeTo(null);
        //Garantizamos el tipo de fuente y estilo que se utilizará en la interfaz
        setFonts();
        //Deshabilitamos la opcion de editar el campo de texto de la solucion
        txt_solucionEntropia.setEditable(false);
        //Agregamos el manejador a cada uno de los botones de la interfaz
        btn_ayudaEntropia.addActionListener(manejador);
        btn_calcularEntropia.addActionListener(manejador);
        btn_limpiarEntropia.addActionListener(manejador);
        btn_regresarEntropia.addActionListener(manejador);
        btn_siguienteEntropia.addActionListener(manejador);
        rdnbtn_noEntropia.addActionListener(manejadorJRadioButton);
        rdnbtn_siEntropia.addActionListener(manejadorJRadioButton);
        //Hacemos clic en el boton de limpiarCampos para el primer uso
        btn_limpiarEntropia.doClick();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngroup_Entropia = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lb_tituloEntropia = new javax.swing.JLabel();
        lb_estadosEntropia = new javax.swing.JLabel();
        txt_estadosEntropia = new javax.swing.JTextField();
        lb_preguntaEntropia = new javax.swing.JLabel();
        rdnbtn_siEntropia = new javax.swing.JRadioButton();
        rdnbtn_noEntropia = new javax.swing.JRadioButton();
        lb_probabilidadEntropia = new javax.swing.JLabel();
        txt_probabilidadEntropia = new javax.swing.JTextField();
        btn_siguienteEntropia = new javax.swing.JButton();
        btn_calcularEntropia = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_solucionEntropia = new javax.swing.JTextArea();
        lb_infoEntropia = new javax.swing.JLabel();
        btn_ayudaEntropia = new javax.swing.JButton();
        btn_limpiarEntropia = new javax.swing.JButton();
        btn_regresarEntropia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(52, 152, 219));

        lb_tituloEntropia.setFont(new java.awt.Font("BSD I Believe In Love", 1, 48)); // NOI18N
        lb_tituloEntropia.setForeground(new java.awt.Color(240, 240, 240));
        lb_tituloEntropia.setText("Entropia de Shannon");

        lb_estadosEntropia.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        lb_estadosEntropia.setForeground(new java.awt.Color(240, 240, 240));
        lb_estadosEntropia.setText("numero de estados:");

        txt_estadosEntropia.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        txt_estadosEntropia.setText("###");

        lb_preguntaEntropia.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        lb_preguntaEntropia.setForeground(new java.awt.Color(240, 240, 240));
        lb_preguntaEntropia.setText("tienen la misma probabilidad?");

        rdnbtn_siEntropia.setBackground(new java.awt.Color(52, 152, 219));
        rdnbtn_siEntropia.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        rdnbtn_siEntropia.setForeground(new java.awt.Color(240, 240, 240));
        rdnbtn_siEntropia.setText("si");

        rdnbtn_noEntropia.setBackground(new java.awt.Color(52, 152, 219));
        rdnbtn_noEntropia.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        rdnbtn_noEntropia.setForeground(new java.awt.Color(240, 240, 240));
        rdnbtn_noEntropia.setText("no");

        lb_probabilidadEntropia.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        lb_probabilidadEntropia.setForeground(new java.awt.Color(240, 240, 240));
        lb_probabilidadEntropia.setText("probabilidad del estado 1:");

        txt_probabilidadEntropia.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        txt_probabilidadEntropia.setText("###");

        btn_siguienteEntropia.setBackground(new java.awt.Color(243, 156, 18));
        btn_siguienteEntropia.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        btn_siguienteEntropia.setForeground(new java.awt.Color(240, 240, 240));
        btn_siguienteEntropia.setText("siguiente");

        btn_calcularEntropia.setBackground(new java.awt.Color(243, 156, 18));
        btn_calcularEntropia.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        btn_calcularEntropia.setForeground(new java.awt.Color(240, 240, 240));
        btn_calcularEntropia.setText("calcular");

        txt_solucionEntropia.setColumns(20);
        txt_solucionEntropia.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        txt_solucionEntropia.setRows(5);
        jScrollPane1.setViewportView(txt_solucionEntropia);

        lb_infoEntropia.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        lb_infoEntropia.setForeground(new java.awt.Color(240, 240, 240));
        lb_infoEntropia.setText("Info:");

        btn_ayudaEntropia.setBackground(new java.awt.Color(243, 156, 18));
        btn_ayudaEntropia.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        btn_ayudaEntropia.setForeground(new java.awt.Color(240, 240, 240));
        btn_ayudaEntropia.setText("ayuda");

        btn_limpiarEntropia.setBackground(new java.awt.Color(243, 156, 18));
        btn_limpiarEntropia.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        btn_limpiarEntropia.setForeground(new java.awt.Color(240, 240, 240));
        btn_limpiarEntropia.setText("limpiar campos");

        btn_regresarEntropia.setBackground(new java.awt.Color(243, 156, 18));
        btn_regresarEntropia.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        btn_regresarEntropia.setForeground(new java.awt.Color(240, 240, 240));
        btn_regresarEntropia.setText("regresar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(lb_probabilidadEntropia, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_probabilidadEntropia, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(442, 442, 442)
                        .addComponent(btn_calcularEntropia))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lb_estadosEntropia)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_tituloEntropia)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_estadosEntropia, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lb_preguntaEntropia)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_siguienteEntropia)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rdnbtn_siEntropia)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdnbtn_noEntropia))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lb_infoEntropia)))
                .addContainerGap(142, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_regresarEntropia)
                .addGap(18, 18, 18)
                .addComponent(btn_limpiarEntropia)
                .addGap(18, 18, 18)
                .addComponent(btn_ayudaEntropia)
                .addGap(119, 119, 119))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_tituloEntropia)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_estadosEntropia)
                    .addComponent(txt_estadosEntropia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_preguntaEntropia)
                    .addComponent(rdnbtn_siEntropia)
                    .addComponent(rdnbtn_noEntropia))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_probabilidadEntropia)
                    .addComponent(txt_probabilidadEntropia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_siguienteEntropia))
                .addGap(18, 18, 18)
                .addComponent(btn_calcularEntropia)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ayudaEntropia)
                    .addComponent(btn_limpiarEntropia)
                    .addComponent(btn_regresarEntropia))
                .addGap(29, 29, 29)
                .addComponent(lb_infoEntropia)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
            java.util.logging.Logger.getLogger(VistaEntropia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaEntropia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaEntropia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaEntropia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaEntropia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ayudaEntropia;
    private javax.swing.JButton btn_calcularEntropia;
    private javax.swing.JButton btn_limpiarEntropia;
    private javax.swing.JButton btn_regresarEntropia;
    private javax.swing.JButton btn_siguienteEntropia;
    private javax.swing.ButtonGroup btngroup_Entropia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_estadosEntropia;
    private javax.swing.JLabel lb_infoEntropia;
    private javax.swing.JLabel lb_preguntaEntropia;
    private javax.swing.JLabel lb_probabilidadEntropia;
    private javax.swing.JLabel lb_tituloEntropia;
    private javax.swing.JRadioButton rdnbtn_noEntropia;
    private javax.swing.JRadioButton rdnbtn_siEntropia;
    private javax.swing.JTextField txt_estadosEntropia;
    private javax.swing.JTextField txt_probabilidadEntropia;
    private javax.swing.JTextArea txt_solucionEntropia;
    // End of variables declaration//GEN-END:variables
    
    /**
     * Metodo que permite garantizar el tipo de fuente y estilo que se utilizara
     * en la interfaz de la ventana sin importar el sistema operativo
     */
    private void setFonts() {
        FontBSD fonts = new FontBSD();
        lb_tituloEntropia.setFont(fonts.getMyFont(1, 48));
        lb_estadosEntropia.setFont(fonts.getMyFont(1, 18));
        lb_preguntaEntropia.setFont(fonts.getMyFont(1, 18));
        lb_probabilidadEntropia.setFont(fonts.getMyFont(1, 18));
        lb_infoEntropia.setFont(fonts.getMyFont(1, 14));
        txt_estadosEntropia.setFont(fonts.getMyFont(1, 18));
        txt_probabilidadEntropia.setFont(fonts.getMyFont(1, 18));
        txt_solucionEntropia.setFont(fonts.getMyFont(1, 18));
        btn_calcularEntropia.setFont(fonts.getMyFont(1, 18));
        btn_regresarEntropia.setFont(fonts.getMyFont(1, 18));
        btn_siguienteEntropia.setFont(fonts.getMyFont(1, 18));
        btn_limpiarEntropia.setFont(fonts.getMyFont(1, 18));
        btn_ayudaEntropia.setFont(fonts.getMyFont(1, 18));
        rdnbtn_siEntropia.setFont(fonts.getMyFont(1, 18));
        rdnbtn_noEntropia.setFont(fonts.getMyFont(1, 18));
    }
    /**
     * Metodo que devuelve el boton calcular
     * @return un objeto de tipo JButton
     */
    public JButton getBtn_calcularEntropia() {
        return btn_calcularEntropia;
    }
    /**
     * Metodo que devuelve el boton siguiente
     * @return un objeto de tipo JButton
     */
    public JButton getBtn_siguienteEntropia() {
        return btn_siguienteEntropia;
    }
    /**
     * Metodo que devuelve la etiqueta de la informacion
     * @return un objeto de tipo JLabel
     */
    public JLabel getLb_infoEntropia() {
        return lb_infoEntropia;
    }
    /**
     * Metodo que devuelve el radio buton no
     * @return un objeto de tipo JRadioButton
     */
    public JRadioButton getRdnbtn_noEntropia() {
        return rdnbtn_noEntropia;
    }
    /**
     * Metodo que devuelve el radio buton si
     * @return un objeto de tipo JRadioButton
     */
    public JRadioButton getRdnbtn_siEntropia() {
        return rdnbtn_siEntropia;
    }
    /**
     * Metodo que devuelve el campo de texto estados
     * @return un objeto de tipo JTextField
     */
    public JTextField getTxt_estadosEntropia() {
        return txt_estadosEntropia;
    }
    /**
     * Metodo que devuelve el campo de texto probabilidad
     * @return un objeto de tipo JTextField
     */
    public JTextField getTxt_probabilidadEntropia() {
        return txt_probabilidadEntropia;
    }
    /**
     * Metodo que devuelve el campo de texto solucion
     * @return un objeto de tipo JTextArea
     */
    public JTextArea getTxt_solucionEntropia() {
        return txt_solucionEntropia;
    }
    /**
     * Metodo que devuleve la etiqueta de probabilidad
     * @return un objeto de tipo JLabel
     */
    public JLabel getLb_probabilidadEntropia() {
        return lb_probabilidadEntropia;
    }
    
}
/**
 * Clase que maneja los eventos de los JRadioButton´s de la interfaz implementa
 * ActionListener
 * @author Yonathan Alexander Martínez Padilla
 */
class ControladorJRadioButonsEntropia implements ActionListener{
    //Creamos una variable para guardar la referencia a la clase de la que estamos
    //manejando sus eventos
    private VistaEntropia vistaEntropia;
    
    /**
     * Constructor de la clase
     * @param vistaEntropia corresponde a la ventana de la cual se manejan los
     * eventos
     */
    public ControladorJRadioButonsEntropia(VistaEntropia vistaEntropia){
        this.vistaEntropia = vistaEntropia;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //Obtenemos la referencia al radio buton que se hizo clic
        JRadioButton botonTemporal = (JRadioButton) ae.getSource();
        
        //Identificamos desde cual boton se genero el evento
        if(botonTemporal.getText().equalsIgnoreCase("si")){
            //Activamos el boton de calcular
            vistaEntropia.getBtn_calcularEntropia().setEnabled(true);
            //Desactivamos las opciones de probabilidad
            vistaEntropia.getRdnbtn_noEntropia().setEnabled(false);
            vistaEntropia.getRdnbtn_siEntropia().setEnabled(false);
        }
        
        if(botonTemporal.getText().equalsIgnoreCase("no")){
            //Hacemos visible el boton de siguiente, la etiqueta de probabilidad
            //y el campo de texto de probabilidad
            vistaEntropia.getBtn_siguienteEntropia().setVisible(true);
            vistaEntropia.getTxt_probabilidadEntropia().setVisible(true);
            vistaEntropia.getLb_probabilidadEntropia().setVisible(true);
            //Deshabilitamos los botones del grupo
            vistaEntropia.getRdnbtn_noEntropia().setEnabled(false);
            vistaEntropia.getRdnbtn_siEntropia().setEnabled(false);
        }
    }
    
}
