package competicion;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Seba Garcia
 */
public class principal extends javax.swing.JFrame {

    private Competicion competicion;
    private ArrayList<Jugador> jugadores;
    
    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        labelTipoCompeti = new javax.swing.JLabel();
        rb_liga = new javax.swing.JRadioButton();
        rb_torneo = new javax.swing.JRadioButton();
        labelNumJug = new javax.swing.JLabel();
        tf_numJug = new javax.swing.JTextField();
        boton_creaCompeti = new javax.swing.JButton();
        button_creaJug = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTipoCompeti.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelTipoCompeti.setText("Elegir tipo competición:");

        buttonGroup1.add(rb_liga);
        rb_liga.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rb_liga.setText("Liga");

        buttonGroup1.add(rb_torneo);
        rb_torneo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rb_torneo.setText("Torneo");

        labelNumJug.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelNumJug.setText("Elegir número jugadores:");

        boton_creaCompeti.setText("Crear competición >>");
        boton_creaCompeti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_creaCompetiActionPerformed(evt);
            }
        });

        button_creaJug.setText("Crear jugadores");
        button_creaJug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_creaJugActionPerformed(evt);
            }
        });

        jLabel1.setText("Restricciones: En caso de elegir torneo, el número de jugadores debe ser 2, 4, 8 ó 16");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(633, Short.MAX_VALUE)
                        .addComponent(boton_creaCompeti))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(rb_liga)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rb_torneo))
                                .addComponent(labelTipoCompeti))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelNumJug)
                                        .addGap(27, 27, 27)
                                        .addComponent(tf_numJug, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(button_creaJug)))
                        .addGap(32, 32, 32)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_numJug, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button_creaJug))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelTipoCompeti)
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_liga)
                            .addComponent(rb_torneo))
                        .addGap(70, 70, 70)
                        .addComponent(labelNumJug)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(boton_creaCompeti, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_creaCompetiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_creaCompetiActionPerformed
        if(rb_liga.isSelected())
        {
            competicion = new Liga(jugadores);
            competicion.GenerarPartidos(jugadores);
            encurso ec = new encurso(competicion);
            ec.setVisible(true);
            this.setVisible(false);
        }
        else
        {
            competicion = new Torneo(jugadores);
            competicion.GenerarPartidos(jugadores);
            encurso2 ec2 = new encurso2(competicion);
            ec2.setVisible(true);
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_boton_creaCompetiActionPerformed

    private void button_creaJugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_creaJugActionPerformed
        String nombre;
        jugadores = new ArrayList<>();
        Jugador j;
        
        for(int i = 0; i < Integer.parseInt(tf_numJug.getText()); i++)
        {
            nombre = JOptionPane.showInputDialog("Introduce nombre del jugador "+(i+1)+":");
            j = new Jugador(nombre);
            jugadores.add(j);
        }
    }//GEN-LAST:event_button_creaJugActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_creaCompeti;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton button_creaJug;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelNumJug;
    private javax.swing.JLabel labelTipoCompeti;
    private javax.swing.JRadioButton rb_liga;
    private javax.swing.JRadioButton rb_torneo;
    private javax.swing.JTextField tf_numJug;
    // End of variables declaration//GEN-END:variables
}
