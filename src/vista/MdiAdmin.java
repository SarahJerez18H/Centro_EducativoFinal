/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.centroeduc.controller.AdminControlador;
import com.centroeduc.controller.AlumnoControlador;

import com.centroeduc.controller.GradoControlador;

import com.centroeduc.controller.AlumnoGradoControlador;
import com.centroeduc.controller.CursoControlador;
import com.centroeduc.controller.EncargadoControlador;

import com.centroeduc.controller.MaestroControlador;
import com.centroeduc.controller.NotasControlador;
import com.centroeduc.controller.SeccionControlador;
import com.centroeduc.controller.SecreControlador;
import com.centroeduc.controller.UnidadControlador;
import javax.swing.JFrame;
import org.jvnet.substance.SubstanceLookAndFeel;

/**
 *
 * @author javam2018
 */
public class MdiAdmin extends javax.swing.JFrame {

    /**
     * Creates new form MdiAdmin
     */
    public MdiAdmin() {
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

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        jCbMaestro = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        Alumno = new javax.swing.JMenuItem();
        AlumnoGrado = new javax.swing.JMenuItem();
        Curso = new javax.swing.JMenuItem();
        exitMenuItem1 = new javax.swing.JMenuItem();
        exitMenuItem2 = new javax.swing.JMenuItem();
        exitMenuItem3 = new javax.swing.JMenuItem();
        jMSecretaria = new javax.swing.JMenuItem();
        jMEncargado = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(204, 204, 204));

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Administrador");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        jCbMaestro.setMnemonic('o');
        jCbMaestro.setText("Maestro");
        jCbMaestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbMaestroActionPerformed(evt);
            }
        });
        fileMenu.add(jCbMaestro);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Seccion");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        Alumno.setMnemonic('x');
        Alumno.setText("Alumno");
        Alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumnoActionPerformed(evt);
            }
        });
        fileMenu.add(Alumno);

        AlumnoGrado.setMnemonic('x');
        AlumnoGrado.setText("AlumnoGrado");
        AlumnoGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumnoGradoActionPerformed(evt);
            }
        });
        fileMenu.add(AlumnoGrado);

        Curso.setMnemonic('x');
        Curso.setText("Curso");
        Curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CursoActionPerformed(evt);
            }
        });
        fileMenu.add(Curso);

        exitMenuItem1.setMnemonic('x');
        exitMenuItem1.setText("Grado");
        exitMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem1);

        exitMenuItem2.setMnemonic('x');
        exitMenuItem2.setText("Unidad");
        exitMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItem2ActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem2);

        exitMenuItem3.setMnemonic('x');
        exitMenuItem3.setText("Notas");
        exitMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItem3ActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem3);

        jMSecretaria.setText("Secretaria");
        jMSecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSecretariaActionPerformed(evt);
            }
        });
        fileMenu.add(jMSecretaria);

        jMEncargado.setText("Encargado");
        jMEncargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMEncargadoActionPerformed(evt);
            }
        });
        fileMenu.add(jMEncargado);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1044, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItem3ActionPerformed
        // TODO add your handling code here:
        JFrmNotas frmnotas = new JFrmNotas();
        this.desktopPane.add(frmnotas);
        frmnotas.setVisible(true);
        NotasControlador contro = new NotasControlador(frmnotas);
    }//GEN-LAST:event_exitMenuItem3ActionPerformed

    private void exitMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItem2ActionPerformed
        // TODO add your handling code here:
        JFrmUnidad frmunidad = new JFrmUnidad();
        this.desktopPane.add(frmunidad);
        frmunidad.setVisible(true);
        UnidadControlador contro = new UnidadControlador(frmunidad);
    }//GEN-LAST:event_exitMenuItem2ActionPerformed

    private void exitMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItem1ActionPerformed
        JFrmGrado frmgrado = new JFrmGrado();
        this.desktopPane.add(frmgrado);
        frmgrado.setVisible(true);
        GradoControlador contro = new GradoControlador(frmgrado);
    }//GEN-LAST:event_exitMenuItem1ActionPerformed

    private void CursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CursoActionPerformed
        JFrmCurso frmcurso = new JFrmCurso();
        this.desktopPane.add(frmcurso);
        frmcurso.setVisible(true);
        CursoControlador control = new CursoControlador(frmcurso);
    }//GEN-LAST:event_CursoActionPerformed

    private void AlumnoGradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumnoGradoActionPerformed

        JFrmAlumnoGrado frmalumgrad = new JFrmAlumnoGrado();
        this.desktopPane.add(frmalumgrad);
        frmalumgrad.setVisible(true);
        AlumnoGradoControlador controlador = new AlumnoGradoControlador(frmalumgrad);
    }//GEN-LAST:event_AlumnoGradoActionPerformed

    private void AlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumnoActionPerformed
        JFrmAlumno frmalumno = new JFrmAlumno();
        this.desktopPane.add(frmalumno);
        frmalumno.setVisible(true);
        AlumnoControlador alumno = new AlumnoControlador(frmalumno);
    }//GEN-LAST:event_AlumnoActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        // TODO add your handling code here:
        JFrmSeccion frmseccion = new JFrmSeccion();
        this.desktopPane.add(frmseccion);
        frmseccion.setVisible(true);
        SeccionControlador contro = new SeccionControlador(frmseccion);

    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void jCbMaestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbMaestroActionPerformed
        JFrmMaestro frmmaestro = new JFrmMaestro();
        this.desktopPane.add(frmmaestro);
        frmmaestro.setVisible(true);
        MaestroControlador contro = new MaestroControlador(frmmaestro);
    }//GEN-LAST:event_jCbMaestroActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        JFrmAdmin frmadmin = new JFrmAdmin();
        this.desktopPane.add(frmadmin);
        frmadmin.setVisible(true);
        AdminControlador admincontrol = new AdminControlador(frmadmin);
    }//GEN-LAST:event_openMenuItemActionPerformed


    private void jMSecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSecretariaActionPerformed
        // TODO add your handling code here:
        JFrmSecre frmsecre = new JFrmSecre();
        this.desktopPane.add(frmsecre);
        frmsecre.setVisible(true);
        SecreControlador controlador = new SecreControlador(frmsecre);
    }//GEN-LAST:event_jMSecretariaActionPerformed

    private void jMEncargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMEncargadoActionPerformed
        // TODO add your handling code here:
        JFrmEncargado encargado = new JFrmEncargado();
        this.desktopPane.add(encargado);
        encargado.setVisible(true);
        EncargadoControlador controlador = new EncargadoControlador(encargado);
    }//GEN-LAST:event_jMEncargadoActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         java.awt.EventQueue.invokeLater(new Runnable() {
         
            public void run() {
                
            JFrame.setDefaultLookAndFeelDecorated(true);
            SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.BusinessBlueSteelSkin");
            SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceSaturatedTheme");
            //JFrmEncargado E = new JFrmEncargado();
            //E.setVisible(true);
            }
        });
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
            java.util.logging.Logger.getLogger(MdiAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MdiAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MdiAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MdiAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MdiAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Alumno;
    private javax.swing.JMenuItem AlumnoGrado;
    private javax.swing.JMenuItem Curso;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem1;
    private javax.swing.JMenuItem exitMenuItem2;
    private javax.swing.JMenuItem exitMenuItem3;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem jCbMaestro;
    private javax.swing.JMenuItem jMEncargado;
    private javax.swing.JMenuItem jMSecretaria;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}