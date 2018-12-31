/************************************************
 * Main.java
 * 11-16-2018
 * Pete Parkinson
 * 
 * this file instantiates GUI.java 
 * 
 * main class for simple inventory tracking system
 * intended to be used for wife's arts and crafts
 * projects.
 * 
 * each material created tracks cost, ext. cost, 
 * total quantity, quantity available, 
 * quantity dedicated to a project.
 * 
 * each project created tracks materials used, cost
 * of materials used and suggested price charged to
 * customer.
 * 
 ************************************************/

import java.awt.EventQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
    public static void main(String args[]) {

    	//if unable to verify and write file system, close program
        if(!FileControl.init()) {
        	return;
        }
        
        //load materials, customers, projects
        FileControl.loadMaterialsLists();
        FileControl.loadCustomersLists();
        FileControl.loadProjectsLists();
        
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Init GUI
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
		
	}
}
