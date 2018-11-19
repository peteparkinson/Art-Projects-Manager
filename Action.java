/************************************************
 * Action.java
 * 11-17-2018
 * Pete Parkinson
 * 
 * defines button behavior for Inventory System
 * 
 ************************************************/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;

public class Action implements ActionListener, KeyListener{
	
    public void actionPerformed(ActionEvent e) {
    	if(e.getSource() == GUI.submitMatBtn) {
    		
    		String name = GUI.nameField.getText();
    		String desc = GUI.descField.getText();
    		
    		int qoh = Integer.parseInt(GUI.QOHField.getText());
    		
    		double cost = Double.parseDouble(GUI.costField.getText());
    	    double extCost = Double.parseDouble(GUI.extCostField.getText());
    	    
    	    Material m = new Material(name, desc, qoh, 0, qoh, cost, extCost);
    	    
    	}
    }
    

	public void keyPressed(KeyEvent e) {
		
	}

	public void keyReleased(KeyEvent e) {
		
	}

	public void keyTyped(KeyEvent arg0) {
		
		
	}
    
}



