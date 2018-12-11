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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

public class Action implements ActionListener, KeyListener, ListSelectionListener, MouseListener {
	
    public void actionPerformed(ActionEvent e) {
    	

    	if(e.getSource() == GUI.ITFinishBtn) {

    	}

    	/************************************************
    	 * New Customer button
    	 ************************************************/
    	if(e.getSource() == GUI.CTNewBtn) {
    		GUI.CTSubmitBtn.setEnabled(true);
    		GUI.CTEditBtn.setEnabled(false);
    		GUI.CTDeleteBtn.setEnabled(true);
    		GUI.CTNameField.setEnabled(true);
    		GUI.CTAddressField.setEnabled(true);
    		GUI.CTPhoneField.setEnabled(true);
    		GUI.custProModel.removeAllElements();
    		GUI.CTCustomersList.clearSelection();
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
    		GUI.MTMaterialsList.setEnabled(false);
            
    	}
    	
    	/************************************************
    	 * Edit Material button
    	 ************************************************/
    	if(e.getSource() == GUI.CTEditBtn) {
    		
            GUI.CTNameField.setEnabled(true);
            GUI.CTAddressField.setEnabled(true);
            GUI.CTPhoneField.setEnabled(true);
            GUI.CTSubmitBtn.setEnabled(true);
    		GUI.CTNewBtn.setEnabled(false);
    		GUI.CTCustomersList.setEnabled(false);
    	}
    	
    	/************************************************
    	 * Edit Project button
    	 ************************************************/
    	if(e.getSource() == GUI.NPTCancelBtn) {
    		resetNPT();
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
    		GUI.MTMaterialsList.setEnabled(false);
    	}
    	
    	/************************************************
    	 * Delete Customer button
    	 ************************************************/
    	if(e.getSource() == GUI.CTDeleteBtn) {
    		if(!GUI.CTEditBtn.isEnabled() || !GUI.CTNewBtn.isEnabled()) {
    			resetCT();
    		} else {
    			String name = GUI.CTCustomersList.getSelectedValue().getName();
    			String message = new String("Are you sure you want to delete " + name);
    		    int reply = JOptionPane.showConfirmDialog(null, message , "", JOptionPane.YES_NO_OPTION);
    	        if (reply == JOptionPane.YES_OPTION) {
        			FileControl.deleteCustFile(GUI.CTCustomersList.getSelectedValue());
        			ListData.customers.remove(GUI.CTCustomersList.getSelectedValue());
        			updateCustList(GUI.customersModel, ListData.customers);
        			resetCT();
    	        }
    		}
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
        			updateMatList(GUI.allMaterialsModel, ListData.materials);
        			resetMT();
    	        }
    		}
    	}
    	/************************************************
    	 * Submit new Customer button
    	 ************************************************/
    	if(e.getSource() == GUI.CTSubmitBtn) {
    		if(GUI.CTNameField.getText().length() == 0 ||
    		   GUI.CTAddressField.getText().length() == 0 ||
    		   GUI.CTPhoneField.getText().length() == 0) {
    			JOptionPane.showMessageDialog(null, "Please enter values in all fields.");
    		} else {
        		submitNewCustomer();
    		}
    	}    
    	
    	/************************************************
    	 * Submit new Material button
    	 ************************************************/
    	if(e.getSource() == GUI.MTSubmitBtn) {
    		if(GUI.MTNameField.getText().length() == 0 ||
    		   GUI.MTQtyField.getText().length()  == 0 ||
    		   GUI.MTCostField.getText().length() == 0 ||
    		   GUI.MTNotesArea.getText().length() == 0 ||
    		   GUI.MTTypeComboBox.getSelectedIndex() == 0) {
    			JOptionPane.showMessageDialog(null, "Please enter values in all fields.");
    		} else {
        		submitNewMaterial();
    		}
    		
    	}

    	/************************************************
    	 * Submit new Project button
    	 ************************************************/
    	if(e.getSource() == GUI.NPTSubmitBtn) {
    		if(GUI.NPTNameField.getText().length() == 0 ||
    		   GUI.NPTNotesArea.getText().length() == 0 ||
               GUI.NPTCustomerComboBox.getSelectedIndex() == 0 ||
    		   GUI.NPTTypeComboBox.getSelectedIndex() == 0) {
    			JOptionPane.showMessageDialog(null, "Please enter values in all fields.");
    		} else {
    			if(GUI.NPTProjectsList.getSelectedIndex() == -1) {
    				//submit new project
            		submitNewProject();
    			} else {
    				//edit existing project
    			}
    		}
    		
    	}	

    	/************************************************
    	 * Add Material to Project button
    	 ************************************************/
    	if(e.getSource() == GUI.NPTAddBtn) {
    		GUI.NPTDedicateList.setEnabled(true);
    	}

    	/************************************************
    	 * Remove Material from Project button
    	 ************************************************/
    	if(e.getSource() == GUI.NPTRemoveBtn) {
    		
    	}

    	/************************************************
    	 * Edit Project button
    	 ************************************************/
    	if(e.getSource() == GUI.NPTEditBtn) {
    		GUI.NPTNameField.setEnabled(true);
    		GUI.NPTTypeComboBox.setEnabled(true);
    		GUI.NPTCustomerComboBox.setEnabled(true);
    		GUI.NPTNotesArea.setEnabled(true);
    		GUI.NPTProjectsList.setEnabled(true);
    	}
    	
    	/************************************************
    	 * Delete Project button
    	 ************************************************/
    	if(e.getSource() == GUI.NPTDeleteMenuItem) {
    		
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
    	//auto calculate extended cost and such on materials tab
		if(e.getSource() == GUI.MTCostField || e.getSource() == GUI.MTQtyField ) {
			if(GUI.MTCostField.getText().length() != 0 && GUI.MTQtyField.getText().length() != 0 ) {
				
				String qty = GUI.MTQtyField.getText();
				String cost = GUI.MTCostField.getText();
				
				GUI.MTExtCostField.setText(String.valueOf((int) Double.parseDouble(cost) * Integer.parseInt(qty)));
				GUI.MTAvailField.setText(GUI.MTQtyField.getText());
			} else {
				GUI.MTAvailField.setText(GUI.MTQtyField.getText());
				GUI.MTExtCostField.setText("");
			}
		}
	}

	public void keyTyped(KeyEvent e) {

	
	}
	
	
	
	
	
	/**************************************
	 * List Selection Events
	 *************************************/
	@Override
	public void valueChanged(ListSelectionEvent e) {
		

    	/************************************************
    	 * MT Materials List
    	 ************************************************/
    	if(e.getSource() == GUI.MTMaterialsList) {
    		if (GUI.MTMaterialsList.getSelectedIndex() != -1){

    			Material m = GUI.MTMaterialsList.getSelectedValue();

    			GUI.MTEditBtn.setEnabled(true);
    			GUI.MTDeleteBtn.setEnabled(true);
    			GUI.MTNameField.setText(m.getName());
    			GUI.MTQtyField.setText(String.valueOf(m.getQOH()));
    			GUI.MTCostField.setText(String.valueOf(m.getCost()));
    			GUI.MTExtCostField.setText(String.valueOf(m.getQOH() * m.getCost()));
    			GUI.MTAvailField.setText(String.valueOf(m.getQOH()));
    			GUI.MTTypeComboBox.setSelectedItem(ListData.materialTypes[m.getTypeIndex()]);
    			GUI.MTUsingField.setText("0");
    			GUI.MTNotesArea.setText(m.getNotes());
        		
        		//TODO
        		//Action.updateProList(usedInProModel, m.getRelatedProjects());
    		}
    	}

    	/************************************************
    	 * NPT Projects List
    	 ************************************************/
    	else if (e.getSource() == GUI.NPTProjectsList){
    		if (GUI.NPTProjectsList.getSelectedIndex() != -1){
    			Project p = GUI.NPTProjectsList.getSelectedValue();
    			GUI.NPTCancelBtn.setEnabled(true);
    			GUI.NPTEditBtn.setEnabled(true);
    			GUI.NPTNameField.setEnabled(false);
    			GUI.NPTTypeComboBox.setEnabled(false);
    			GUI.NPTCustomerComboBox.setEnabled(false);
    			GUI.NPTNotesArea.setEnabled(false);
    			GUI.NPTNameField.setText(p.getName());
    			GUI.NPTTypeComboBox.setSelectedIndex(p.getTypeIndex());
    			GUI.NPTCustomerComboBox.setSelectedIndex(ListData.customers.indexOf(p.getCustomer()));
    			GUI.NPTNotesArea.setText(p.getNotes());
        		//TODO
    			
    		}
    	} 

    	/************************************************
    	 * NPT Materials List
    	 ************************************************/
    	else if (e.getSource() == GUI.NPTMaterialsList){
    		if (GUI.NPTMaterialsList.getSelectedIndex() != -1){

    			Material m = GUI.MTMaterialsList.getSelectedValue();
    			
    			GUI.NPTAddBtn.setEnabled(true);
        		
        		//TODO
    			
    		}
    	} 

    	/************************************************
    	 * NPT Dedicate List
    	 ************************************************/
    	else if (e.getSource() == GUI.NPTDedicateList){
    		if (GUI.NPTDedicateList.getSelectedIndex() != -1){

        		//TODO
    			
    		}
    	} 
        
    	/************************************************
    	 * PT Open Projects List
    	 ************************************************/
    	else if (e.getSource() == GUI.PTOpenProList){
    		if (GUI.PTOpenProList.getSelectedIndex() != -1){

        		//TODO
    			
    		}
    	} 
        
    	/************************************************
    	 * PT Closed Projects List
    	 ************************************************/
    	else if (e.getSource() == GUI.PTClosedProList){
    		if (GUI.PTClosedProList.getSelectedIndex() != -1){

        		//TODO
    			
    		}
    	} 
    	
    	/************************************************
    	 * CT Customers List
    	 ************************************************/
    	else if (e.getSource() == GUI.CTCustomersList){
    		if (GUI.CTCustomersList.getSelectedIndex() != -1){

    			Customer c = GUI.CTCustomersList.getSelectedValue();
    			
    			GUI.CTNameField.setText(c.getName());
    			GUI.CTAddressField.setText(c.getAddress());
    			GUI.CTPhoneField.setText(c.getPhone());
    			GUI.CTDeleteBtn.setEnabled(true);
    			GUI.CTEditBtn.setEnabled(true);
        		

        		//TODO
        		//Action.updateProList(custProModel, c.getProjects());
    		}
    	}
        
    	/************************************************
    	 * IT 'Needs Finished' List
    	 ************************************************/
    	else if (e.getSource() == GUI.ITFinishList){
    		if (GUI.ITFinishList.getSelectedIndex() != -1){

        		//TODO
    			
    		}
    	} else {
    		
    	}
    	
		
	}
	


	/**************************************
	 * Mouse events
	 *************************************/
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		//Right clicks
		/*
	    if (e.isPopupTrigger()) {
	    
	    }
		*/
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		check(e);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		check(e);
		
	}
	
    public void check(MouseEvent e) {
        if (e.isPopupTrigger()) {
        	GUI.NPTProjectsList.setSelectedIndex(GUI.NPTProjectsList.locationToIndex(e.getPoint()));	//select the item
        	GUI.NPTPopup.show(GUI.NPTProjectsList, e.getX(), e.getY());									//and show the menu
        }
    }

	/**************************************
	 * Various functions
	 *************************************/
	private void submitNewCustomer() {
		String serial = ListData.getNewCustSerial();
		String name = GUI.CTNameField.getText();
		String addy = GUI.CTAddressField.getText();
		String phone = GUI.CTPhoneField.getText();
		
		//check for duplicate entry if creating new material
		if(FileControl.directoryContainsFile(FileControl.customersPath, name) && GUI.CTNewBtn.isEnabled()) {
			String message = "There is already a Customer with this name, would you like to make a duplicate record?";
			int reply = JOptionPane.showConfirmDialog(null, message , "", JOptionPane.YES_NO_OPTION);
	        if (reply == JOptionPane.NO_OPTION) {
	        	return;
	        } else {
	        	name += " " + serial;
	        }
		}
		
		//if editing existing material
		if(!GUI.CTNewBtn.isEnabled()){
			FileControl.deleteCustFile(GUI.CTCustomersList.getSelectedValue());
			ListData.customers.remove(GUI.CTCustomersList.getSelectedValue());
		}

		Customer c = new Customer(serial, name, addy, phone);
		
		//add customer to global list
		ListData.customers.add(c);	
		
		//update on-screen lists
		updateCustList(GUI.customersModel, ListData.customers);
    	GUI.NPTCustomerComboBox.setModel(new DefaultComboBoxModel(ListData.getcustomerNames()));
		
		//write customer to file
	    try {
			FileControl.createCustomerFile(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	    resetCT();
	}
	
	private void submitNewMaterial() {
		String name = GUI.MTNameField.getText();
		String notes = GUI.MTNotesArea.getText();
		String serial = ListData.getNewMatSerial();
		int qoh = Integer.parseInt(GUI.MTQtyField.getText());
		int type = GUI.MTTypeComboBox.getSelectedIndex();
		double cost = Double.parseDouble(GUI.MTCostField.getText());
		
		//check for duplicate entry if creating new material
		if(FileControl.directoryContainsFile(FileControl.materialsPath, name) && GUI.MTNewBtn.isEnabled()) {
			String message = "There is already a material with this name, would you like to make a duplicate?";
			int reply = JOptionPane.showConfirmDialog(null, message , "", JOptionPane.YES_NO_OPTION);
	        if (reply == JOptionPane.NO_OPTION) {
	        	return;
	        } else {
	        	name += " " + serial;
	        }

		}
		
		//if editing existing material
		if(!GUI.MTNewBtn.isEnabled()){
			FileControl.deleteMatFile(GUI.MTMaterialsList.getSelectedValue());
			ListData.materials.remove(GUI.MTMaterialsList.getSelectedValue());
		}

		Material m = new Material(serial, name, qoh, cost, type, notes);
		
		//add material to global list of all materials
		ListData.materials.add(m);	
		
		//update on-screen lists
		updateMatList(GUI.allMaterialsModel, ListData.materials);
		
		//write material to file
	    try {
			FileControl.createMaterialFile(m);
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		
	    resetMT();
	}
	
	private void submitNewProject() {
		String name = GUI.NPTNameField.getText();
		String notes = GUI.NPTNotesArea.getText();
		String serial = ListData.getNewProSerial();
		Customer customer = ListData.customers.get(GUI.NPTCustomerComboBox.getSelectedIndex());
		int typeIndex = GUI.NPTTypeComboBox.getSelectedIndex();
		ArrayList<Material> materials = new ArrayList<Material>();
		
		//populate materials list
		for(int i = 0; i < GUI.NPTDedicateList.getModel().getSize(); i++) {
			 materials.add(GUI.NPTDedicateList.getModel().getElementAt(i));
		}
		
		//check for duplicate entry if creating new project
		if(FileControl.directoryContainsFile(FileControl.projectsPath, name)) {
			String message = "There is already a project with this name, would you like to make a duplicate?";
			int reply = JOptionPane.showConfirmDialog(null, message , "", JOptionPane.YES_NO_OPTION);
	        if (reply == JOptionPane.NO_OPTION) {
	        	return;
	        } else {
	        	name += " " + serial;
	        }

		}
		

		Project p = new Project(serial, name, typeIndex, customer, notes, materials);
		
		//add material to global list of all materials
		ListData.openProjects.add(p);	
		
		//write material to file
	    try {
			FileControl.createProjectFile(p);
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		
	    resetNPT();
	}

	public static void updateMatList(DefaultListModel<Material> model, ArrayList<Material> list) {
		model.removeAllElements();
    	for(int i = 0; i < list.size(); i++) {
    		model.addElement(list.get(i));
    	}
	}

	public static void updateProList(DefaultListModel<Project> model, ArrayList<Project> list) {
		model.removeAllElements();
    	for(int i = 0; i < list.size(); i++) {
    		model.addElement(list.get(i));
    	}
	}

	public static void updateCustList(DefaultListModel<Customer> model, ArrayList<Customer> list) {
		model.removeAllElements();
    	for(int i = 0; i < list.size(); i++) {
    		model.addElement(list.get(i));
    	}
	}

	private void resetCT() {
		GUI.CTCustomersList.clearSelection();
		GUI.CTProjectsList.clearSelection();
		GUI.CTNameField.setEnabled(false);
		GUI.CTNameField.setText("");
		GUI.CTAddressField.setEnabled(false);
		GUI.CTAddressField.setText("");
		GUI.CTPhoneField.setEnabled(false);
		GUI.CTPhoneField.setText("");
		GUI.CTDeleteBtn.setEnabled(false);
		GUI.CTSubmitBtn.setEnabled(false);
		GUI.CTEditBtn.setEnabled(false);
		GUI.CTNewBtn.setEnabled(true);
		GUI.CTCustomersList.clearSelection();
		GUI.CTCustomersList.setEnabled(true);
	}

	public void resetMT() {

	    //set all fields and buttons on materials tab to default state
		GUI.MTMaterialsList.clearSelection();
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
        GUI.MTDeleteBtn.setEnabled(false);
        GUI.MTEditBtn.setEnabled(false);
        GUI.MTNewBtn.setEnabled(true);
		GUI.MTMaterialsList.setEnabled(true);
	}
	
	public void resetNPT() {

	    //set all fields and buttons on new project tab to default state
		GUI.NPTDedicateList.clearSelection();
		GUI.NPTMaterialsList.clearSelection();
		GUI.NPTProjectsList.clearSelection();
		GUI.NPTNameField.setText("");
		GUI.NPTNameField.setEnabled(true);
		GUI.NPTTypeComboBox.setSelectedIndex(0);
		GUI.NPTTypeComboBox.setEnabled(true);
		GUI.NPTCustomerComboBox.setSelectedIndex(0);
		GUI.NPTCustomerComboBox.setEnabled(true);
		GUI.NPTNotesArea.setText("");
		GUI.NPTNotesArea.setEnabled(true);
		GUI.NPTCancelBtn.setEnabled(false);
		GUI.NPTEditBtn.setEnabled(false);
		GUI.NPTAddBtn.setEnabled(false);
		GUI.NPTRemoveBtn.setEnabled(false);
	}



	
}
