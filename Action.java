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
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;

public class Action implements ActionListener, KeyListener{
	
    public void actionPerformed(ActionEvent e) {
    	
    	if(e.getSource() == GUI.CTNewBtn) {

    	}    	
    	if(e.getSource() == GUI.CTSubmitBtn) {

    	}    	
    	if(e.getSource() == GUI.ITFinishBtn) {

    	}    	
    	if(e.getSource() == GUI.MTNewBtn) {

            GUI.MTNotesArea.setEnabled(true);
            GUI.MTExtCostField.setEnabled(true);
            GUI.MTCostField.setEnabled(true);
            GUI.MTNameField.setEnabled(true);
            GUI.MTQtyField.setEnabled(true);
            GUI.MTUsingField.setEnabled(true);
            GUI.MTAvailField.setEnabled(true);
            GUI.MTTypeComboBox.setEnabled(true);
            GUI.MTSubmitBtn.setEnabled(true);
            GUI.MTDeleteBtn.setEnabled(false);
            
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
    
	public void keyPressed(KeyEvent e) {
		
	}

	public void keyReleased(KeyEvent e) {
		
	}

	public void keyTyped(KeyEvent e) {
		
	}
    

	private void submitNewMaterial() {
		String name = GUI.MTNameField.getText();
		int qoh = Integer.parseInt(GUI.MTQtyField.getText());
		double cost = Double.parseDouble(GUI.MTCostField.getText());
		String notes = GUI.MTNotesArea.getText();
		int type = GUI.MTTypeComboBox.getSelectedIndex();
    		
		Material m = new Material(name, qoh, cost, type, notes);
		
		//add material to global list of all materials
		ListData.materials.add(m);
		
		//update on-screen lists
		updateList(ListData.materials);
		
		//write material to file
	    try {
			FileControl.createMaterialFile(m);
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		
	}

	private void updateList(ArrayList<Material> materials) {
		
		
	}
	
	
}
