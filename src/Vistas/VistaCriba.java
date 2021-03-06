/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controladores.ControladorVistaCriba;
import Recursos.fuentes.FontBSD;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ALEX
 */
public class VistaCriba extends javax.swing.JFrame {
    //Creamos una variable que referencie al manejador de la interfaz
    ControladorVistaCriba manejador = new ControladorVistaCriba(this);

    /**
     * Creates new form VistaCriba
     */
    public VistaCriba() {
        initComponents();
        //Centramos la ventana
        this.setLocationRelativeTo(null);
        //Garantizamos el estilo y el tipo de fuente de la interfaz
        setFonts();
        //Deshabilitamos la edicion del area de texto de la solucion
        txt_solucionCriba.setEditable(false);
        //agregamos el manejador de eventos a los botones de la interfaz
        btn_cribarCriba.addActionListener(manejador);
        btn_limpiarCriba.addActionListener(manejador);
        btn_regresarCriba.addActionListener(manejador);
        btn_ayudaCriba.addActionListener(manejador);
        //Hacemos clic en el boton de limpiar
        btn_limpiarCriba.doClick();
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
        lb_tituloCriba = new javax.swing.JLabel();
        lb_numeroCriba = new javax.swing.JLabel();
        txt_numeroCriba = new javax.swing.JTextField();
        btn_cribarCriba = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_solucionCriba = new javax.swing.JTextArea();
        lb_infoCriba = new javax.swing.JLabel();
        btn_ayudaCriba = new javax.swing.JButton();
        btn_limpiarCriba = new javax.swing.JButton();
        btn_regresarCriba = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(52, 152, 219));

        lb_tituloCriba.setFont(new java.awt.Font("BSD I Believe In Love", 1, 48)); // NOI18N
        lb_tituloCriba.setForeground(new java.awt.Color(240, 240, 240));
        lb_tituloCriba.setText("Criba de Erastotenes");

        lb_numeroCriba.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        lb_numeroCriba.setForeground(new java.awt.Color(240, 240, 240));
        lb_numeroCriba.setText("numero de elemeentos a cribar:");

        txt_numeroCriba.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        txt_numeroCriba.setText("###");

        btn_cribarCriba.setBackground(new java.awt.Color(243, 156, 18));
        btn_cribarCriba.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        btn_cribarCriba.setForeground(new java.awt.Color(240, 240, 240));
        btn_cribarCriba.setText("cribar");

        txt_solucionCriba.setColumns(20);
        txt_solucionCriba.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        txt_solucionCriba.setRows(5);
        jScrollPane1.setViewportView(txt_solucionCriba);

        lb_infoCriba.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        lb_infoCriba.setForeground(new java.awt.Color(240, 240, 240));
        lb_infoCriba.setText("Info:");

        btn_ayudaCriba.setBackground(new java.awt.Color(243, 156, 18));
        btn_ayudaCriba.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        btn_ayudaCriba.setForeground(new java.awt.Color(240, 240, 240));
        btn_ayudaCriba.setText("ayuda");

        btn_limpiarCriba.setBackground(new java.awt.Color(243, 156, 18));
        btn_limpiarCriba.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        btn_limpiarCriba.setForeground(new java.awt.Color(240, 240, 240));
        btn_limpiarCriba.setText("limpiar campos");

        btn_regresarCriba.setBackground(new java.awt.Color(243, 156, 18));
        btn_regresarCriba.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        btn_regresarCriba.setForeground(new java.awt.Color(240, 240, 240));
        btn_regresarCriba.setText("regresar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(lb_tituloCriba))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(lb_numeroCriba)
                        .addGap(18, 18, 18)
                        .addComponent(txt_numeroCriba, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(451, 451, 451)
                        .addComponent(btn_cribarCriba))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lb_infoCriba)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 101, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_regresarCriba)
                        .addGap(18, 18, 18)
                        .addComponent(btn_limpiarCriba)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ayudaCriba)
                        .addGap(58, 58, 58))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_tituloCriba)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_numeroCriba)
                    .addComponent(txt_numeroCriba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_cribarCriba)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ayudaCriba)
                    .addComponent(btn_limpiarCriba)
                    .addComponent(btn_regresarCriba))
                .addGap(13, 13, 13)
                .addComponent(lb_infoCriba)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(VistaCriba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCriba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCriba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCriba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCriba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ayudaCriba;
    private javax.swing.JButton btn_cribarCriba;
    private javax.swing.JButton btn_limpiarCriba;
    private javax.swing.JButton btn_regresarCriba;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_infoCriba;
    private javax.swing.JLabel lb_numeroCriba;
    private javax.swing.JLabel lb_tituloCriba;
    private javax.swing.JTextField txt_numeroCriba;
    private javax.swing.JTextArea txt_solucionCriba;
    // End of variables declaration//GEN-END:variables

    private void setFonts() {
        FontBSD fonts = new FontBSD();
        lb_tituloCriba.setFont(fonts.getMyFont(1, 48));
        lb_numeroCriba.setFont(fonts.getMyFont(1, 18));
        lb_infoCriba.setFont(fonts.getMyFont(1, 14));
        txt_numeroCriba.setFont(fonts.getMyFont(1, 18));
        txt_solucionCriba.setFont(fonts.getMyFont(1, 18));
        btn_cribarCriba.setFont(fonts.getMyFont(1, 18));
        btn_regresarCriba.setFont(fonts.getMyFont(1, 18));
        btn_limpiarCriba.setFont(fonts.getMyFont(1, 18));
        btn_ayudaCriba.setFont(fonts.getMyFont(1, 18));
    }
    /**
     * Metodo que devuelve la etiqueta de la info
     * @return un objeto de tipo JLabel
     */
    public JLabel getLb_infoCriba() {
        return lb_infoCriba;
    }
    /**
     * Metodo que devuelve el campo de texto del numero de Criba
     * @return un objeto de JTextField
     */
    public JTextField getTxt_numeroCriba() {
        return txt_numeroCriba;
    }
    /**
     * Metodo que devuelve el campo de texto de la solucion
     * @return un objeto de tipo JTextField
     */
    public JTextArea getTxt_solucionCriba() {
        return txt_solucionCriba;
    }
}
