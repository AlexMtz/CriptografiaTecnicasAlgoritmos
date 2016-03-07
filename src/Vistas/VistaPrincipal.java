/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controladores.ControladorVistaPrincipal;

/**
 *
 * @author Yonathan A. Martínez Padilla
 */
public class VistaPrincipal extends javax.swing.JFrame {
    private ControladorVistaPrincipal controlador = 
            new ControladorVistaPrincipal(this);

    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        btn_algoritmoPrincipal.addActionListener(controlador);
        btn_congruenciaPrincipal.addActionListener(controlador);
        btn_cribaPrincipal.addActionListener(controlador);
        btn_entropiaPrincipal.addActionListener(controlador);
        btn_minimoPrincipal.addActionListener(controlador);
        setFonts();
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
        lb_tituloPrincipal = new javax.swing.JLabel();
        btn_algoritmoPrincipal = new javax.swing.JButton();
        btn_congruenciaPrincipal = new javax.swing.JButton();
        btn_cribaPrincipal = new javax.swing.JButton();
        btn_entropiaPrincipal = new javax.swing.JButton();
        btn_exponenciacionPrincipal = new javax.swing.JButton();
        btn_minimoPrincipal = new javax.swing.JButton();
        btn_acercaPrincipal = new javax.swing.JButton();
        btn_salirPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(52, 152, 219));

        lb_tituloPrincipal.setFont(new java.awt.Font("BSD I Believe In Love", 1, 48)); // NOI18N
        lb_tituloPrincipal.setForeground(new java.awt.Color(240, 240, 240));
        lb_tituloPrincipal.setText("Criptografia");

        btn_algoritmoPrincipal.setBackground(new java.awt.Color(243, 156, 18));
        btn_algoritmoPrincipal.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        btn_algoritmoPrincipal.setForeground(new java.awt.Color(240, 240, 240));
        btn_algoritmoPrincipal.setText("Algoritmo Extendido de Euler");

        btn_congruenciaPrincipal.setBackground(new java.awt.Color(243, 156, 18));
        btn_congruenciaPrincipal.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        btn_congruenciaPrincipal.setForeground(new java.awt.Color(240, 240, 240));
        btn_congruenciaPrincipal.setText("Congruencia");

        btn_cribaPrincipal.setBackground(new java.awt.Color(243, 156, 18));
        btn_cribaPrincipal.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        btn_cribaPrincipal.setForeground(new java.awt.Color(240, 240, 240));
        btn_cribaPrincipal.setText("Criba de Erastotenes");

        btn_entropiaPrincipal.setBackground(new java.awt.Color(243, 156, 18));
        btn_entropiaPrincipal.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        btn_entropiaPrincipal.setForeground(new java.awt.Color(240, 240, 240));
        btn_entropiaPrincipal.setText("Entropia de Shannon");

        btn_exponenciacionPrincipal.setBackground(new java.awt.Color(243, 156, 18));
        btn_exponenciacionPrincipal.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        btn_exponenciacionPrincipal.setForeground(new java.awt.Color(240, 240, 240));
        btn_exponenciacionPrincipal.setText("Exponenciacion Modular");

        btn_minimoPrincipal.setBackground(new java.awt.Color(243, 156, 18));
        btn_minimoPrincipal.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        btn_minimoPrincipal.setForeground(new java.awt.Color(240, 240, 240));
        btn_minimoPrincipal.setText("Minimo Comun Divisor (M.C.D.)");

        btn_acercaPrincipal.setBackground(new java.awt.Color(243, 156, 18));
        btn_acercaPrincipal.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        btn_acercaPrincipal.setForeground(new java.awt.Color(240, 240, 240));
        btn_acercaPrincipal.setText("acerca de...");

        btn_salirPrincipal.setBackground(new java.awt.Color(243, 156, 18));
        btn_salirPrincipal.setFont(new java.awt.Font("BSD I Believe In Love", 1, 18)); // NOI18N
        btn_salirPrincipal.setForeground(new java.awt.Color(240, 240, 240));
        btn_salirPrincipal.setText("salir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(465, 465, 465)
                        .addComponent(btn_congruenciaPrincipal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(btn_exponenciacionPrincipal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb_tituloPrincipal)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_algoritmoPrincipal)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btn_entropiaPrincipal)
                                        .addComponent(btn_cribaPrincipal)))))))
                .addContainerGap(392, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_minimoPrincipal)
                        .addGap(379, 379, 379))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_acercaPrincipal)
                        .addGap(18, 18, 18)
                        .addComponent(btn_salirPrincipal)
                        .addGap(26, 26, 26))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_tituloPrincipal)
                .addGap(30, 30, 30)
                .addComponent(btn_algoritmoPrincipal)
                .addGap(18, 18, 18)
                .addComponent(btn_congruenciaPrincipal)
                .addGap(18, 18, 18)
                .addComponent(btn_cribaPrincipal)
                .addGap(18, 18, 18)
                .addComponent(btn_entropiaPrincipal)
                .addGap(18, 18, 18)
                .addComponent(btn_exponenciacionPrincipal)
                .addGap(18, 18, 18)
                .addComponent(btn_minimoPrincipal)
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salirPrincipal)
                    .addComponent(btn_acercaPrincipal))
                .addContainerGap(16, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_acercaPrincipal;
    private javax.swing.JButton btn_algoritmoPrincipal;
    private javax.swing.JButton btn_congruenciaPrincipal;
    private javax.swing.JButton btn_cribaPrincipal;
    private javax.swing.JButton btn_entropiaPrincipal;
    private javax.swing.JButton btn_exponenciacionPrincipal;
    private javax.swing.JButton btn_minimoPrincipal;
    private javax.swing.JButton btn_salirPrincipal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_tituloPrincipal;
    // End of variables declaration//GEN-END:variables

    private void setFonts() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
