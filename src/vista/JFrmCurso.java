/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class JFrmCurso extends javax.swing.JInternalFrame {

    /**
     * Creates new form JFrmCurso
     */
    public JFrmCurso() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jBtnGuardar = new javax.swing.JButton();
        jTxtNombre = new javax.swing.JTextField();
        jTxtInicio = new javax.swing.JTextField();
        jTxtFin = new javax.swing.JTextField();
        jTxtJornada = new javax.swing.JTextField();
        jTxtCupo = new javax.swing.JTextField();
        jBtnModificar = new javax.swing.JButton();
        jBtnEstado = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTblCurso = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLblCodigo = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 0, 20)); // NOI18N
        jLabel2.setText("Nombre :");

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 0, 20)); // NOI18N
        jLabel3.setText("Horario de Inicio:");

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 0, 20)); // NOI18N
        jLabel4.setText("Horario de Fin:");

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 0, 20)); // NOI18N
        jLabel5.setText("Jornada:");

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 0, 20)); // NOI18N
        jLabel6.setText("Cupo:");

        jBtnGuardar.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jBtnGuardar.setText("Guardar");

        jTxtNombre.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jTxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtNombreKeyTyped(evt);
            }
        });

        jTxtInicio.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jTxtInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtInicioActionPerformed(evt);
            }
        });

        jTxtFin.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N

        jTxtJornada.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jTxtJornada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtJornadaActionPerformed(evt);
            }
        });
        jTxtJornada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtJornadaKeyTyped(evt);
            }
        });

        jTxtCupo.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jTxtCupo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtCupoKeyTyped(evt);
            }
        });

        jBtnModificar.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jBtnModificar.setText("Modificar");

        jBtnEstado.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jBtnEstado.setText("Cambio Estado");

        jTblCurso.setFont(new java.awt.Font("Bookman Old Style", 0, 13)); // NOI18N
        jTblCurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTblCurso);

        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 1, 48)); // NOI18N
        jLabel7.setText("Ingreso de Cursos");

        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 0, 20)); // NOI18N
        jLabel8.setText("Codigo:");

        jLblCodigo.setFont(new java.awt.Font("Bookman Old Style", 1, 32)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jBtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jBtnEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTxtInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                            .addComponent(jTxtFin, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtJornada, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTxtCupo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtNombre))))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addComponent(jLblCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTxtFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTxtJornada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTxtCupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtInicioActionPerformed
    // TODO add your handling code here:
    }//GEN-LAST:event_jTxtInicioActionPerformed

    private void jTxtJornadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtJornadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtJornadaActionPerformed

    private void jTxtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtNombreKeyTyped
       char c = evt.getKeyChar();
        
        if ((c<'a'|| c>'z' ) && (c<'A'|| c>'Z' ) && (c!=(char)KeyEvent.VK_BACK_SPACE) && (c!=(char)KeyEvent.VK_SPACE)){            
                evt.consume();
                JOptionPane.showMessageDialog(null, "Solo se permiten letras", "validar letras", JOptionPane.INFORMATION_MESSAGE);
        } 

    }//GEN-LAST:event_jTxtNombreKeyTyped

    private void jTxtJornadaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtJornadaKeyTyped
        char c = evt.getKeyChar();
        
        if ((c<'a'|| c>'z' ) && (c<'A'|| c>'Z' ) && (c!=(char)KeyEvent.VK_BACK_SPACE) && (c!=(char)KeyEvent.VK_SPACE)){            
                evt.consume();
                JOptionPane.showMessageDialog(null, "Solo se permiten letras", "validar letras", JOptionPane.INFORMATION_MESSAGE);
        } 

    }//GEN-LAST:event_jTxtJornadaKeyTyped

    private void jTxtCupoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtCupoKeyTyped
        char c = evt.getKeyChar();
        
        if ((c<'0'|| c>'9' ) && (c!=(char)KeyEvent.VK_BACK_SPACE)){
            evt.consume();
             JOptionPane.showMessageDialog(null, "Solo se permiten numeros", "validar numeros", JOptionPane.INFORMATION_MESSAGE);
            
        }
    }//GEN-LAST:event_jTxtCupoKeyTyped

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
            java.util.logging.Logger.getLogger(JFrmCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jBtnEstado;
    public javax.swing.JButton jBtnGuardar;
    public javax.swing.JButton jBtnModificar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLblCodigo;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JTable jTblCurso;
    public javax.swing.JTextField jTxtCupo;
    public javax.swing.JTextField jTxtFin;
    public javax.swing.JTextField jTxtInicio;
    public javax.swing.JTextField jTxtJornada;
    public javax.swing.JTextField jTxtNombre;
    // End of variables declaration//GEN-END:variables
}
