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

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
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

    	/************************************************
    	 * New Material button
    	 ************************************************/
    	if(e.getSource() == GUI.MTNewBtn) {

			GUI.MTUsingField.setText("0");
            GUI.MTNotesArea.setEnabled(true);
            GUI.MTExtCostField.setEnabled(true);
            GUI.MTCostField.setEnabled(true);
            GUI.MTNameField.setEnabled(true);
            GUI.MTQtyField.setEnabled(true);
            GUI.MTUsingField.setEnabled(true);
            GUI.MTAvailField.setEnabled(true);
            GUI.MTTypeComboBox.setEnabled(true);
            GUI.MTSubmitBtn.setEnabled(true);
            GUI.MTEditBtn.setEnabled(false);
            
    	}

    	/************************************************
    	 * Edit Material button
    	 ************************************************/
    	if(e.getSource() == GUI.MTEditBtn) {

            GUI.MTNotesArea.setEnabled(true);
            GUI.MTExtCostField.setEnabled(true);
            GUI.MTCostField.setEnabled(true);
            GUI.MTNameField.setEnabled(true);
            GUI.MTQtyField.setEnabled(true);
            GUI.MTUsingField.setEnabled(true);
            GUI.MTAvailField.setEnabled(true);
            GUI.MTTypeComboBox.setEnabled(true);
            GUI.MTSubmitBtn.setEnabled(true);
    		GUI.MTNewBtn.setEnabled(false);
    		
    	}

    	/************************************************
    	 * Delete Material button
    	 ************************************************/
    	if(e.getSource() == GUI.MTDeleteBtn) {
    		if(!GUI.MTEditBtn.isEnabled() || !GUI.MTNewBtn.isEnabled()) {
    			resetMT();
    		} else {
    			String name = GUI.MTMaterialsList.getSelectedValue().getName();
    			String message = new String("Are you sure you want to delete " + name);
    		    int reply = JOptionPane.showConfirmDialog(null, message , "Delete?", JOptionPane.YES_NO_OPTION);
    	        if (reply == JOptionPane.YES_OPTION) {
        			FileControl.deleteMatFile(GUI.MTMaterialsList.getSelectedValue());
        			ListData.materials.remove(GUI.MTMaterialsList.getSelectedValue());
        			updateMatList(ListData.materials, GUI.allMaterialsModel);
        			resetMT();
    	        }
    	        else {
    	        	
    	        }
    	        

    		}
    	}
    	
    	/************************************************
    	 * Submit new Material button
    	 ************************************************/
    	if(e.getSource() == GUI.MTSubmitBtn) {
    		if(GUI.MTNameField.getText().length() == 0 ||
    		   GUI.MTQtyField.getText().length() == 0 ||
    		   GUI.MTCostField.getText().length() == 0 ||
    		   GUI.MTNotesArea.getText().length() == 0 ||
    		   GUI.MTTypeComboBox.getSelectedIndex() == 0) {
    			JOptionPane.showMessageDialog(null, "Please enter values in all fields.");
    		} else {
    		submitNewMaterial();
    		}
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
    	/************************************************
    	 * auto calculate extended cost and such on materials tab
    	 ************************************************/
		if(e.getSource() == GUI.MTCostField || e.getSource() == GUI.MTQtyField ) {
			if(GUI.MTCostField.getText().length() != 0 && GUI.MTQtyField.getText().length() != 0 ) {
				GUI.MTExtCostField.setText(String.valueOf(Integer.parseInt(
						GUI.MTQtyField.getText()) * Integer.parseInt(GUI.MTCostField.getText())));
				GUI.MTAvailField.setText(GUI.MTQtyField.getText());
			} else {
				GUI.MTAvailField.setText(GUI.MTQtyField.getText());
				GUI.MTExtCostField.setText("");
			}
		}
	}

	public void keyTyped(KeyEvent e) {

	
	}
    

	private void submitNewMaterial() {
		String name = GUI.MTNameField.getText();
		int qoh = Integer.parseInt(GUI.MTQtyField.getText());
		double cost = Double.parseDouble(GUI.MTCostField.getText());
		String notes = GUI.MTNotesArea.getText();
		int type = GUI.MTTypeComboBox.getSelectedIndex();
    		
		Material m = new Material(ListData.materialSerialNumber, name, qoh, cost, type, notes);
		
		//add material to global list of all materials
		ListData.materials.add(m);
		
		//update on-screen lists
		updateMatList(ListData.materials, GUI.allMaterialsModel);
		
		//write material to file
	    try {
			FileControl.createMaterialFile(m);
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		
	    resetMT();
	}

	public static void updateMatList(ArrayList<Material> list, DefaultListModel<Material> model) {
		model.removeAllElements();
    	for(int i = 0; i < list.size(); i++) {
    		model.addElement(list.get(i));
    	}
		
	}
	
	public void resetMT() {

	    //set all fields and buttons on materials tab to default state
        GUI.MTNotesArea.setEnabled(false);
        GUI.MTNotesArea.setText("");
        GUI.MTExtCostField.setEnabled(false);
        GUI.MTExtCostField.setText("");
        GUI.MTCostField.setEnabled(false);
        GUI.MTCostField.setText("");
        GUI.MTNameField.setEnabled(false);
        GUI.MTNameField.setText("");
        GUI.MTQtyField.setEnabled(false);
        GUI.MTQtyField.setText("");
        GUI.MTUsingField.setEnabled(false);
        GUI.MTUsingField.setText("");
        GUI.MTAvailField.setEnabled(false);
        GUI.MTAvailField.setText("");
        GUI.MTTypeComboBox.setEnabled(false);
        GUI.MTTypeComboBox.setSelectedIndex(0);
        GUI.MTSubmitBtn.setEnabled(false);
        GUI.MTEditBtn.setEnabled(true);
        GUI.MTNewBtn.setEnabled(true);
	}
}
