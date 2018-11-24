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
import java.io.IOException;

import javax.swing.JOptionPane;

public class Action implements ActionListener, KeyListener{
	
    public void actionPerformed(ActionEvent e) {
    	
    	if(e.getSource() == GUI.MTSubmitBtn) {
    		submitNewMaterial();
    	}
    	
    }
    

	private void submitNewMaterial() {
		String name = GUI.MTNameField.getText();
		int qoh = Integer.parseInt(GUI.MTQtyField.getText());
		double cost = Double.parseDouble(GUI.MTCostField.getText());
		String notes = GUI.MTNotesArea.getText();
    		
		Material m = new Material(name, qoh, cost, notes);
    	    
    	    try {
				FileControl.createMaterialFile(m);
			} catch (IOException exception) {
				exception.printStackTrace();
			}
		
	}


	public void keyPressed(KeyEvent e) {
		
	}

	public void keyReleased(KeyEvent e) {
		
	}

	public void keyTyped(KeyEvent e) {
		
		
	}
    
}
