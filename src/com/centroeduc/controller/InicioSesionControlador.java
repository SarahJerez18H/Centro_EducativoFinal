package com.centroeduc.controller;

import com.centroeduc.dao.AdminDAO;
import com.centroeduc.dao.MaestroDAO;
import com.centroeduc.dao.SecreDAO;
import com.centroeduc.model.Administrador;
import com.centroeduc.model.Maestro;
import com.centroeduc.model.Secretaria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.JFrmIniciodeSesion;
import vista.MdiAdmin;
import vista.MdiMaestro;
import vista.MdiSecretaria;

public class InicioSesionControlador implements ActionListener {

    JFrmIniciodeSesion logica = new JFrmIniciodeSesion();
    String usuario;
    String contra;

    public InicioSesionControlador(JFrmIniciodeSesion login) {
        logica = login;
        logica.jBtnIniciarSesion.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.logica.jBtnIniciarSesion) {
            obtenerDatos();
        }
    }

    public void obtenerDatos() {
        this.usuario = logica.jTxtUsuario.getText();
        this.contra = logica.jTxtContra.getText();
        
        //BUSCAR EN SECRETARIA
        SecreDAO secredao = new SecreDAO();
        Secretaria secre = new Secretaria();
        secre = secredao.buscarUsuario(usuario, contra);

        //BUSCAR PROFESOR
        MaestroDAO maestrodao = new MaestroDAO();
        Maestro maestro = new Maestro();
        maestro = maestrodao.buscarUsuario(usuario, contra);

        //BUSCAR ADMINISTRADOR  
        AdminDAO admindao = new AdminDAO();
        Administrador administrador = new Administrador();
        administrador = admindao.searchUser(usuario, contra);
         
        //JOptionPane.showMessageDialog(null, administrador.toString());
        if (secre.getEmail() != null) {
            if (secre.getEmail().equals(this.usuario) && (secre.getPass().equals(this.contra))) {
                JOptionPane.showMessageDialog(null, "Bienvenida secretaria");

                MdiSecretaria mdisecre = new MdiSecretaria();
                mdisecre.setVisible(true);
            }
        }

        if (maestro.getEmail() != null) {
            if (maestro.getEmail().equals(this.usuario) && (maestro.getPass().equals(this.contra))) {
                JOptionPane.showMessageDialog(null, "Bienvenido maestro");
                
                MdiMaestro mdimaestro = new MdiMaestro();
                mdimaestro.setVisible(true);
            }

        }
        if (administrador.getEmail() != null) {
            if (administrador.getEmail().equals(this.usuario)) {
                JOptionPane.showMessageDialog(null, "Bienvenido Administrador");
                
                MdiAdmin mdiadmin = new MdiAdmin();
                mdiadmin.setVisible(true);
            }
        }

        //JOptionPane.showMessageDialog(null, "Usuario: " + this.usuario + ", contraseña: " + this.contra );
    }
}
