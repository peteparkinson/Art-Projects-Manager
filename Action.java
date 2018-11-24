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
    	
    	if(e.getSource() == GUI.CTNewBtn) {

    	}    	
    	if(e.getSource() == GUI.CTSubmitBtn) {

    	}    	
    	if(e.getSource() == GUI.ITFinishBtn) {

    	}    	
    	if(e.getSource() == GUI.MTNewBtn) {

    	}    	
    	if(e.getSource() == GUI.MTEditBtn) {

    	}    	
    	if(e.getSource() == GUI.MTDeleteBtn) {

    	}    	
    	if(e.getSource() == GUI.MTSubmitBtn) {
    		submitNewMaterial();
    	}    	
    	if(e.getSource() == GUI.NPTAddBtn) {

    	}    	
    	if(e.getSource() == GUI.NPTRemoveBtn) {

    	}    	
    	if(e.getSource() == GUI.NPTEditProBtn) {

    	}    	
    	if(e.getSource() == GUI.NPTSubmitBtn) {

    	}    	
    	if(e.getSource() == GUI.PTCloseBtn) {

    	}    	
    	if(e.getSource() == GUI.PTReopenBtn) {

    	}    	
    	if(e.getSource() == GUI.PTAutoChargeBtn) {

    	}    	
    	if(e.getSource() == GUI.PTManChargeBtn) {

    	}    	
    	if(e.getSource() == GUI.RTGenerateBtn) {

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
