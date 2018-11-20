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

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
		
		/**
		 * Things to add
		 * 
		 * tag for finished product such as "owl burning 8x10",  qty
		 * keep track of duplicates of finished projects 
		 * 
		 ***** track cost / income
		 * 
		 * reorder points in the future
		 * 
		 * track time for projects
		 * 
		 * reports page
		 * 	per type of project - cost / income, total time, average time, quantity sold
		 *  per medium
		 * 	per type of material - same
		 * 
		 * 
		 */
		
	}
}
