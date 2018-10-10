/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dcentroeduc;

import com.centroeduc.controller.AdminControlador;
import com.centroeduc.controller.InicioSesionControlador;
import javax.swing.JFrame;
import org.jvnet.substance.SubstanceLookAndFeel;
import vista.JFrmAdmin;
import vista.JFrmEncargado;
import vista.JFrmIniciodeSesion;

/**
 *
 * @author Usuario
 */
public class DCentroEduc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         java.awt.EventQueue.invokeLater(new Runnable() {
             @Override
             public void run() {
                 //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            JFrame.setDefaultLookAndFeelDecorated(true);
            SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.BusinessBlueSteelSkin");
            SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceSaturatedTheme");
            JFrmIniciodeSesion sesion = new JFrmIniciodeSesion();
            InicioSesionControlador controlado = new InicioSesionControlador(sesion);
            sesion.setVisible(true);
             }
         }); 
        // TODO code application logic here
        //JFrmIniciodeSesion login = new JFrmIniciodeSesion();
        //InicioSesionControlador controlador = new InicioSesionControlador(login);
        //login.setVisible(true);
        
          
        
        //ESTO EN EL LA AUTENTICACION
//        JFrmAdmin frmadmin = new JFrmAdmin();
//        AdminControlador admincontrol = new AdminControlador(frmadmin);
//        frmadmin.setVisible(true);
    }
    
}
