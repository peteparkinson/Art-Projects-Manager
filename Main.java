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

        //Init GUI
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
		
		/**
		 * Things to add
		 * 
		 * reorder points in the future
		 * 
		 * reports page
		 * 	per type of project - cost / income, total time, average time, quantity sold
		 *  per medium
		 * 	per type of material - same
		 * 
		 * "customer" tab with buyer info
		 * 
		 * invoice tab
		 * 
		 * company name
		 * date
		 * customer
		 * customer's address
		 * project name
		 * quantity
		 * cost
		 * message
		 * 
		 */
        
        /*
	      //get current date time with Date()
	        Date date = new Date();
	        System.out.println(dateFormat.format(date));
	        jTextField3.setText(dateFormat.format(date));
	     get current date time with Calendar()
	
	     //get current date time with Calendar()
	        Calendar cal = Calendar.getInstance();
	        jTextField3.setText(dateFormat.format(cal.getTime()));
	    */
		
	}
}