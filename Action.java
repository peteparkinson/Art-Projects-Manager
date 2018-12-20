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
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Action implements ActionListener, KeyListener, ListSelectionListener, MouseListener, ChangeListener {
	
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
    		GUI.CTProjectsList.setEnabled(true);
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
            GUI.MTDeleteBtn.setEnabled(true);
    		GUI.MTMaterialsList.setEnabled(false);
            
    	}
    	
    	/************************************************
    	 * Edit Customer button
    	 ************************************************/
    	if(e.getSource() == GUI.CTEditBtn) {
    		
            if(GUI.CTProjectsList.getModel().getSize() == 0) {
            	GUI.CTNameField.setEnabled(true);
            }
            GUI.CTAddressField.setEnabled(true);
            GUI.CTPhoneField.setEnabled(true);
            GUI.CTSubmitBtn.setEnabled(true);
    		GUI.CTNewBtn.setEnabled(false);
    		GUI.CTCustomersList.setEnabled(false);
    	}
    	
    	/************************************************
    	 * Cancel edit project button
    	 ************************************************/
    	if(e.getSource() == GUI.NPTCancelBtn) {
    		resetNPT(false);
    	}    	
    	
    	/************************************************
    	 * Edit Material button
    	 ************************************************/
    	else if(e.getSource() == GUI.MTEditBtn) {
    		
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
    	else if(e.getSource() == GUI.CTDeleteBtn) {
    		if(!GUI.CTEditBtn.isEnabled() || !GUI.CTNewBtn.isEnabled()) {
    			//cancel function
    			resetCT();
    		} else {
    			Customer c = GUI.CTCustomersList.getSelectedValue();
    			if(GUI.custProModel.getSize() != 0) {
        			JOptionPane.showMessageDialog(null, c + " has an open project, and cannot be deleted.");
    				return;
    			}
    			String name = GUI.CTCustomersList.getSelectedValue().getName();
    			String message = new String("Are you sure you want to delete " + name);
    		    int reply = JOptionPane.showConfirmDialog(null, message , "", JOptionPane.YES_NO_OPTION);
    	        if (reply == JOptionPane.YES_OPTION) {
        			FileControl.deleteCustFile(c);
        			ListData.customers.remove(c);
        			updateCustList(GUI.customersModel, ListData.customers);
        			resetCT();
    	        }
    		}
    	}
    	
    	/************************************************
    	 * Delete Material button
    	 ************************************************/
    	else if(e.getSource() == GUI.MTDeleteBtn) {
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
    	else if(e.getSource() == GUI.CTSubmitBtn) {
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
    	else if(e.getSource() == GUI.MTSubmitBtn) {
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
    	else if(e.getSource() == GUI.NPTSubmitBtn) {
    		if(GUI.NPTNameField.getText().length() == 0 ||
    		   GUI.NPTNotesArea.getText().length() == 0 ||
               GUI.NPTCustomerComboBox.getSelectedIndex() == 0 ||
    		   GUI.NPTTypeComboBox.getSelectedIndex() == 0) {
    			JOptionPane.showMessageDialog(null, "Please enter values in all fields.");
    		} else {
            	submitNewProject();
    		}
    		
    	}	

    	/************************************************
    	 * Add Material to Project button
    	 ************************************************/
    	else if(e.getSource() == GUI.NPTAddBtn) {
			GUI.NPTAddBtn.setEnabled(false);
    		Material m = GUI.NPTMaterialsList.getSelectedValue();
    		if(m.getQOH() - m.getQtyInUse() <= 0) {
    			JOptionPane.showMessageDialog(null, m + " is out of stock!  You'd better go ask your husband to make a run...");
    			return;
    		} 
    		if(m.getQOH() - m.getQtyInUse() == 1){
    			JOptionPane.showMessageDialog(null, "This is the last of item: " + m + ". There are 0 on hand");
    		}
			m.useOne();
    		GUI.NPTDedicateList.setEnabled(true);
    		GUI.dedicateMatModel.addElement(m);
			GUI.NPTqtyLabel.setText(String.valueOf(m.getQOH() - m.getQtyInUse()));
			GUI.NPTMaterialsList.clearSelection();
			GUI.NPTDedicateList.clearSelection();
    	}

    	/************************************************
    	 * Remove Material from Project button
    	 ************************************************/
    	else if(e.getSource() == GUI.NPTRemoveBtn) {
			GUI.NPTRemoveBtn.setEnabled(false);
    		Material m = GUI.NPTDedicateList.getSelectedValue();
    		GUI.dedicateMatModel.removeElement(m);
    		m.ignoreUse();
			GUI.NPTqtyLabel.setText(String.valueOf(m.getQOH() - m.getQtyInUse()));
			GUI.NPTMaterialsList.clearSelection();
			GUI.NPTDedicateList.clearSelection();
			GUI.NPTqtyLabel.setText("");
    	}

    	/************************************************
    	 * Edit Project button
    	 ************************************************/
    	else if(e.getSource() == GUI.NPTEditBtn) {
    		GUI.NPTEditBtn.setEnabled(false);
    		GUI.NPTNameField.setEnabled(true);
    		GUI.NPTTypeComboBox.setEnabled(true);
    		GUI.NPTCustomerComboBox.setEnabled(true);
    		GUI.NPTNotesArea.setEnabled(true);
    		GUI.NPTProjectsList.setEnabled(false);
    		GUI.NPTDedicateList.setEnabled(true);
    		GUI.NPTMaterialsList.setEnabled(true);
    		
    		//TODO
    		/*
    		 * if editing an existing project then cancel, don't ignore pre-dedicated materials
    		 */
    	}
    	
    	/************************************************
    	 * Delete Project button
    	 ************************************************/
    	else if(e.getSource() == GUI.NPTDeleteMenuItem) {
    		
    	}
    	else if(e.getSource() == GUI.PTCloseBtn) {
    		closeProject(GUI.PTOpenProList.getSelectedValue());
    		
    	}    	
    	else if(e.getSource() == GUI.PTReopenBtn) {

    	}    	
    	else if(e.getSource() == GUI.PTAutoChargeBtn) {

    	}    	
    	else if(e.getSource() == GUI.PTManChargeBtn) {

    	}    	
    	else if(e.getSource() == GUI.PTEditBtn) {
			Project p = GUI.PTOpenProList.getSelectedValue();
    		if(GUI.PTHoursSpinner.isEnabled()) {
        		//'save' behavior
    			GUI.PTEditBtn.setText("Edit");
        		GUI.PTOpenProList.setEnabled(true);
        		GUI.PTClosedProList.setEnabled(true);
        		GUI.PTHoursSpinner.setEnabled(false);
        		GUI.PTAutoChargeBtn.setEnabled(true);
        		GUI.PTManChargeBtn.setEnabled(true);
        		try {
        			//in case number was entered manually
					GUI.PTHoursSpinner.commitEdit();
				} catch (ParseException e1) {
					e1.printStackTrace();
				}
        		p.setHours((int) GUI.PTHoursSpinner.getValue());
                GUI.PTChargeField.setText(String.valueOf(p.getCharge()));
                GUI.PTTotalField.setText(p.getTotal());
                GUI.PTMatCostField.setText(p.getCOM());
                GUI.PTNetField.setText(p.getNet());
                
                //update file
    			FileControl.deleteProFile(p);
    			ListData.openProjects.remove(p);
        		
        		//add material to global list of all materials
        		ListData.openProjects.add(p);	

        		//update on-screen lists
        		updateProList(GUI.openProModel, ListData.openProjects);
        		
        		//write material to file
        	    try {
        			FileControl.createProjectFile(p);
        		} catch (IOException exception) {
        			exception.printStackTrace();
        		}
        		
        	    resetPT();
        		
    		} else {
        		//'edit' behavior
    			GUI.PTEditBtn.setText("Save");
        		GUI.PTOpenProList.setEnabled(false);
        		GUI.PTClosedProList.setEnabled(false);
        		GUI.PTHoursSpinner.setEnabled(true);
        		GUI.PTAutoChargeBtn.setEnabled(false);
        		GUI.PTManChargeBtn.setEnabled(false);
    		}
    	}    	
    	else if(e.getSource() == GUI.RTGenerateBtn) {

    	}
    	
    }

	private void closeProject(Project p) {
		
		//TODO
		
		p.setOpenStatus(false);
		FileControl.closeProFile(p);
		ListData.openProjects.remove(p);
		ListData.closedProjects.add(p);
		Action.updateProList(GUI.openProModel, ListData.openProjects);
		Action.updateProList(GUI.closedProModel, ListData.closedProjects);
		
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
    			GUI.MTAvailField.setText(String.valueOf(m.getQOH() - m.getQtyInUse()));
    			GUI.MTTypeComboBox.setSelectedItem(ListData.materialTypes[m.getTypeIndex()]);
    			GUI.MTUsingField.setText(String.valueOf(m.getQtyInUse()));
    			GUI.MTNotesArea.setText(m.getNotes());
        		
    			GUI.usedInProModel.removeAllElements();
	    		for(int i = 0; i < ListData.openProjects.size(); i++) {
	    			if(ListData.openProjects.get(i).getMaterials().contains(m)) {
		    			GUI.usedInProModel.addElement(ListData.openProjects.get(i));
	    			}
	    		}
    		}
    	}

    	/************************************************
    	 * NPT Projects List
    	 ************************************************/
    	else if (e.getSource() == GUI.NPTProjectsList){
    		if (GUI.NPTProjectsList.getSelectedIndex() != -1){
    			if(GUI.dedicateMatModel.size() != 0) {
    				clearDedicateList();
    			}
    			Project p = GUI.NPTProjectsList.getSelectedValue();
    			GUI.NPTCancelBtn.setEnabled(true);
    			GUI.NPTAddBtn.setEnabled(false);
    			GUI.NPTEditBtn.setEnabled(true);
    			GUI.NPTNameField.setEnabled(false);
    			GUI.NPTTypeComboBox.setEnabled(false);
    			GUI.NPTCustomerComboBox.setEnabled(false);
    			GUI.NPTNotesArea.setEnabled(false);
    			GUI.NPTNameField.setText(p.getName());
    			GUI.NPTTypeComboBox.setSelectedIndex(p.getTypeIndex());
    			GUI.NPTNotesArea.setText(p.getNotes());
    			GUI.NPTMaterialsList.setEnabled(false);
    			GUI.NPTMaterialsList.clearSelection();
    			GUI.dedicateMatModel.removeAllElements();
				GUI.NPTDedicateList.setEnabled(false);
    			if(p.getMaterials().size() > 0) {
        			for(int i = 0; i < p.getMaterials().size(); i++) {
            			GUI.dedicateMatModel.addElement(p.getMaterials().get(i));
        			}
    			}
    			//set customer combo-box value
    			for(int i = 1; i < GUI.NPTCustomerComboBox.getModel().getSize(); i++) {
    				String s = GUI.NPTCustomerComboBox.getItemAt(i);
    				if(s.equals(p.getCustomer().getName())) {
    					GUI.NPTCustomerComboBox.setSelectedIndex(i);
    				}
    			}
    			
    		}
    	} 

    	/************************************************
    	 * NPT Materials List
    	 ************************************************/
    	else if (e.getSource() == GUI.NPTMaterialsList){
    		if (GUI.NPTMaterialsList.getSelectedIndex() != -1){

    			Material m = GUI.NPTMaterialsList.getSelectedValue();
    			GUI.NPTqtyLabel.setText(String.valueOf(m.getQOH() - m.getQtyInUse()));
    			GUI.NPTAddBtn.setEnabled(true);
    			GUI.NPTDedicateList.clearSelection();
        		
        		//TODO
    			
    		} else {
    			GUI.NPTqtyLabel.setText("");
    		}
    	} 

    	/************************************************
    	 * NPT Dedicate List
    	 ************************************************/
    	else if (e.getSource() == GUI.NPTDedicateList){
    		if (GUI.NPTDedicateList.getSelectedIndex() != -1){

        		GUI.NPTRemoveBtn.setEnabled(true);
    			
    		} else {
    			GUI.NPTRemoveBtn.setEnabled(false);
    		}
			GUI.NPTMaterialsList.clearSelection();
    	} 
        
    	/************************************************
    	 * PT Open Projects List
    	 ************************************************/
    	else if (e.getSource() == GUI.PTOpenProList){
    		if (GUI.PTOpenProList.getSelectedIndex() != -1){
        		Project p = GUI.PTOpenProList.getSelectedValue();
        		GUI.PTClosedProList.clearSelection();
    			GUI.PTHoursSpinner.setValue(p.getHours());
                GUI.PTChargeField.setText(String.valueOf(p.getCharge()));
                GUI.PTTotalField.setText(p.getTotal());
                GUI.PTMatCostField.setText(p.getCOM());
                GUI.PTNetField.setText(p.getNet());
        		GUI.PTEditBtn.setEnabled(true);
                GUI.PTCustomerField.setText(p.getCustomer().getName());
    			GUI.usedMaterialsModel.removeAllElements();
        		//populate materials-used-in-project list
        		for(int i = 0; i < p.getMaterials().size(); i++) {
        			GUI.usedMaterialsModel.addElement(p.getMaterials().get(i));
        		}
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
        		
				GUI.custProModel.removeAllElements();
	    		for(int i = 0; i < ListData.openProjects.size(); i++) {
	    			if(ListData.openProjects.get(i).getCustomer().getName().equals(c.getName())) {
		    			GUI.custProModel.addElement(ListData.openProjects.get(i));
	    			}
	    		}
    	    		
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
    	if(e.getSource() == GUI.NPTProjectsList && GUI.NPTProjectsList.isEnabled()) {
			//right-click delete project
			check(e);
		}
		
	}
	
	public void check(MouseEvent e) {
    	//delete project
        if (e.isPopupTrigger()) {
        	GUI.NPTProjectsList.setSelectedIndex(GUI.NPTProjectsList.locationToIndex(e.getPoint()));	//select the item
        	GUI.NPTPopup.show(GUI.NPTProjectsList, e.getX(), e.getY());									//and show the menu
        }
    }

	/**************************************
	 * Various functions
	 *************************************/

	private void clearDedicateList() {
		/*
		 * this compares the materials already dedicated to a project, and the materials on the 
		 * dediate list.  if there are materials on the dedicate list that are not dedicated to
		 * the project, those materials' need their usage ignored
		 */
		
		
		//TODO fix qty when toggling projects
		
		
		if(GUI.dedicateMatModel.getSize() != 0 ) {
			
			//if a project has not been edited
			if(GUI.NPTProjectsList.getSelectedIndex() == -1) {
				for(int i = 0; i < GUI.dedicateMatModel.size(); i++) {
					Material m = GUI.dedicateMatModel.getElementAt(i);
					m.ignoreUse();
				}
			} else {
				ArrayList<Material> materials = new ArrayList<Material>();
				
				//create mutable clone of materials already dedicated to project
				for(int i = 0; i < GUI.NPTProjectsList.getSelectedValue().getMaterials().size(); i++) {
					materials.add(GUI.NPTProjectsList.getSelectedValue().getMaterials().get(i));
				}
				
				//if the material has been removed from the project, but hasn't been committed
				for(int i = 0; i < materials.size(); i++) {
					if(!GUI.dedicateMatModel.contains(materials.get(i))) {
						materials.get(i).useOne();
						System.out.println(materials.get(i) + " returned to project");
					}
				}
				
				//if material is on dedicate list but hasn't been committed
				for(int i = 0; i < GUI.dedicateMatModel.getSize(); i++) {
					Material m = GUI.dedicateMatModel.getElementAt(i);
					if(materials.contains(m)) {
						materials.remove(m);
					} else {
						m.ignoreUse();
						System.out.println(m + " ignored");
					}
				}
			}
			GUI.dedicateMatModel.removeAllElements();
		}
	}

	private void submitNewCustomer() {
		String serial = ListData.getNewCustSerial();
		String name = GUI.CTNameField.getText();
		String addy = GUI.CTAddressField.getText();
		String phone = GUI.CTPhoneField.getText();
		
		//check for duplicate entry if creating new customer
		if(FileControl.directoryContainsFile(FileControl.customersPath, name) && GUI.CTNewBtn.isEnabled()) {
			String message = "There is already a Customer with this name, would you like to make a duplicate record?";
			int reply = JOptionPane.showConfirmDialog(null, message , "", JOptionPane.YES_NO_OPTION);
	        if (reply == JOptionPane.NO_OPTION) {
	        	return;
	        } else {
	        	name += " " + serial;
	        }
		}
		
		//if editing existing customer
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
		String s = (String) GUI.NPTCustomerComboBox.getSelectedItem();
		Customer customer = new Customer();
		for(int i = 0; i < ListData.customers.size(); i++) {
			if(ListData.customers.get(i).getName().equals(s)) {
				customer = ListData.customers.get(i);
			}
		}
		
		int typeIndex = GUI.NPTTypeComboBox.getSelectedIndex();
		ArrayList<Material> materials = new ArrayList<Material>();
		Material m;
		
		//populate materials list
		for(int i = 0; i < GUI.NPTDedicateList.getModel().getSize(); i++) {
			m = GUI.NPTDedicateList.getModel().getElementAt(i);
			materials.add(m);
		}
		
		//check for duplicate entry if creating new project
		if(FileControl.directoryContainsFile(FileControl.projectsPath, name) && !GUI.NPTCancelBtn.isEnabled()) {
			String message = "There is already a project with this name, would you like to make a duplicate?";
			int reply = JOptionPane.showConfirmDialog(null, message , "", JOptionPane.YES_NO_OPTION);
	        if (reply == JOptionPane.NO_OPTION) {
	        	return;
	        } else {
	        	name += " " + serial;
	        }

		}
		
		//if editing existing project
		if(GUI.NPTCancelBtn.isEnabled()){
			FileControl.deleteProFile(GUI.NPTProjectsList.getSelectedValue());
			ListData.openProjects.remove(GUI.NPTProjectsList.getSelectedValue());
		}

		Project p = new Project(serial, name, typeIndex, customer, notes, materials);
		
		//add material to global list of all materials
		ListData.openProjects.add(p);	

		//update on-screen lists
		updateProList(GUI.openProModel, ListData.openProjects);
		
		//write material to file
	    try {
			FileControl.createProjectFile(p);
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		
	    resetNPT(true);
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
		GUI.CTProjectsList.setEnabled(false);
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
	
	public void resetNPT(boolean dedicate) {
		if(dedicate) {
			System.out.println("materials dedicated");
			//if dedicating materials to project
			GUI.NPTDedicateList.setEnabled(false);
			GUI.dedicateMatModel.removeAllElements();
		} else {
			//if list is cleared while not dedicating materials
			clearDedicateList();
		}
	    //set all fields and buttons on new project tab to default state
		GUI.NPTDedicateList.clearSelection();
		GUI.NPTMaterialsList.clearSelection();
		GUI.NPTProjectsList.clearSelection();
		//remove materials added to dedicate list
		GUI.NPTNameField.setText("");
		GUI.NPTqtyLabel.setText("");
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
		GUI.NPTMaterialsList.setEnabled(true);
		GUI.NPTProjectsList.setEnabled(true);
		GUI.NPTDedicateList.setEnabled(false);

	}

	public void resetPT() {
		GUI.PTOpenProList.setSelectedIndex(-1);
		GUI.PTClosedProList.setSelectedIndex(-1);
		GUI.PTEditBtn.setEnabled(false);
		GUI.PTManChargeBtn.setEnabled(false);
		GUI.PTAutoChargeBtn.setEnabled(false);
        GUI.PTChargeField.setEnabled(false);
        GUI.PTChargeField.setText("");
        GUI.PTNetField.setEnabled(false);
        GUI.PTNetField.setText("");
        GUI.PTCustomerField.setEnabled(false);
        GUI.PTCustomerField.setText("");
        GUI.PTTotalField.setEnabled(false);
        GUI.PTTotalField.setText("");
        GUI.PTMatCostField.setEnabled(false);
        GUI.PTMatCostField.setText("");
        GUI.PTHoursSpinner.setEnabled(false);
        GUI.PTHoursSpinner.setValue(0);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		//if materials are dedicated to a project but the project isn't submitted, reset qty-In-Use
		int index = GUI.jtp.getSelectedIndex();
		if(index != 2) {
			resetNPT(false);
		}
		
	}

	
}
