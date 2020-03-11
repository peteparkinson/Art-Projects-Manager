/************************************************
 * Action.java
 * 3-11-20
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
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Action implements ActionListener, KeyListener, ListSelectionListener, MouseListener, ChangeListener {
	
    public void actionPerformed(ActionEvent e) {

    	/************************************************
    	 * Finish Project button
    	 ************************************************/
    	if(e.getSource() == GUI.ITFinishBtn) {
    		Project p = GUI.ITFinishList.getSelectedValue();
    		try {
				FileControl.createInvoiceFile(p);
				finishProject(p);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
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
    		GUI.custOpenProModel.removeAllElements();
    		GUI.custClosedProModel.removeAllElements();
    		GUI.CTCustomersList.clearSelection();
    		GUI.CTOpenProList.setEnabled(true);
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
    		GUI.MTMaterialsList.clearSelection();
            
    	}
    	
    	/************************************************
    	 * Edit Customer button
    	 ************************************************/
    	if(e.getSource() == GUI.CTEditBtn) {
    		
            if(GUI.CTOpenProList.getModel().getSize() == 0) {
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
    		resetNPT();
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
    			if(GUI.custOpenProModel.getSize() != 0 || GUI.custClosedProModel.getSize() != 0) {
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
    		if(GUI.MTUsedInList.getModel().getSize() != 0) {
    			JOptionPane.showMessageDialog(null, "Cannot delete material that is being used in a project. sry...");
    			return;
    		}
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
    		if(GUI.NPTEditBtn.isEnabled()){
    			return;
    		} else if(GUI.NPTNameField.getText().length() == 0 ||
    		   GUI.NPTNotesArea.getText().length() == 0 ||
               GUI.NPTCustomerComboBox.getSelectedIndex() == 0 ||
    		   GUI.NPTTypeComboBox.getSelectedIndex() == 0 ||
    		   GUI.NPTTypeComboBox.getSelectedIndex() == -1
    		   ) {
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
    		ArrayList<Material> dedicate = new ArrayList<Material>();

    		//create mutable duplicate list of materials to dedicate
    		for(int i = 0; i < GUI.dedicateMatModel.getSize(); i++) {
    			dedicate.add(GUI.dedicateMatModel.getElementAt(i));
    		}
    		
    		//if attempting to dedicate selected material w/ no available qty
    		if(m.getQOH() - m.getQtyInUse() <= Collections.frequency(dedicate, m)) {
    			JOptionPane.showMessageDialog(null, m + " is out of stock!  You'd better go ask your husband to make a run...");
    			return;
    		}

    		//if dedicating last available material of selected type
    		if(m.getQOH() - m.getQtyInUse() - Collections.frequency(dedicate, m) == 1){
    			JOptionPane.showMessageDialog(null, "This is the last of item: " + m + ". There are 0 on hand");
    		}

    		GUI.NPTDedicateList.setEnabled(true);
    		GUI.dedicateMatModel.addElement(m);
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
			GUI.NPTMaterialsList.clearSelection();
			GUI.NPTDedicateList.clearSelection();
			GUI.NPTqtyLabel.setText("");
    	}

    	/************************************************
    	 * Remove Material from Project button
    	 ************************************************/
    	else if(e.getSource() == GUI.NPTRemUsedMatBtn) {
    		Project p = GUI.NPTProjectsList.getSelectedValue();
    		Material m = GUI.NPTUsedMatList.getSelectedValue();
			String message = "Are you sure you would like to remove this material from the project?"
					+ "\nIf you choose yes, the project will be saved with the current on-screen values.";
			int reply = JOptionPane.showConfirmDialog(null, message , "", JOptionPane.YES_NO_OPTION);
	        if (reply == JOptionPane.YES_OPTION) {
	        	if(GUI.NPTNameField.getText().length() == 0 ||
		         		   GUI.NPTNotesArea.getText().length() == 0 ||
		                   GUI.NPTCustomerComboBox.getSelectedIndex() == 0 ||
		         		   GUI.NPTTypeComboBox.getSelectedIndex() == 0 ||
		         		   GUI.NPTTypeComboBox.getSelectedIndex() == -1
		         		   ) {
		         			JOptionPane.showMessageDialog(null, "Please enter values in all fields.");
		        	} else {
			    		p.removeMaterial(m);
			    		m.returnOne();
			    		submitNewProject();
		        	}
	        } else {
	        	return;
	        }
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
			GUI.NPTUsedMatList.setEnabled(true);
    	}
    	/************************************************
    	 * Delete Project button
    	 ************************************************/
    	else if(e.getSource() == GUI.NPTDeleteMenuItem) {
    		Project p = GUI.NPTProjectsList.getSelectedValue();
			String message = "Are you sure you would like to delete this project?"
					+ "\nAll materials dedicated to this project will be returned to stock.";
			int reply = JOptionPane.showConfirmDialog(null, message , "", JOptionPane.YES_NO_OPTION);
	        if (reply == JOptionPane.YES_OPTION) {
	        	deleteProject(p);
	        } else {
	        	return;
	        }
    	}
    	/************************************************
    	 * Close Project button
    	 ************************************************/
    	else if(e.getSource() == GUI.PTCloseBtn) {
    		if(GUI.PTOpenProList.getSelectedIndex() != -1) {
        		closeProject(GUI.PTOpenProList.getSelectedValue());
        		GUI.usedMaterialsModel.removeAllElements();
    		}
    	}    	
    	/************************************************
    	 * Reopen Project button
    	 ************************************************/
    	else if(e.getSource() == GUI.PTReopenBtn) {
	    	if(GUI.PTClosedProList.getSelectedIndex() != -1) {
	    		reopenProject(GUI.PTClosedProList.getSelectedValue());
	    		GUI.usedMaterialsModel.removeAllElements();
	    	}
    	}    	
    	/************************************************
    	 * Auto-charge button
    	 ************************************************/
    	else if(e.getSource() == GUI.PTAutoChargeBtn) {
    		Project p = GUI.PTOpenProList.getSelectedValue();
    		p.resetCharge();
    		GUI.PTChargeField.setText(p.getChargeStr());
    	}    	
    	/************************************************
    	 * Manual charge button
    	 ************************************************/
    	else if(e.getSource() == GUI.PTManChargeBtn) {
    		if(GUI.PTManChargeBtn.getText() == "Save") {
    			//Save behavior
        		//validate entry
        		try {
        		    double num = Double.parseDouble(GUI.PTChargeField.getText());
        			num = Math.round(num * 100.0) / 100.0;
        		    Project p = GUI.PTOpenProList.getSelectedValue();
        		    p.setCharge(num);
        		    overwriteProject(p);
        		    
        		} catch(Exception exception) {
        			JOptionPane.showMessageDialog(null, "Please enter a valid number.");
        			return;
        		}
        		
        		GUI.PTChargeField.setEnabled(false);
        		GUI.PTManChargeBtn.setText("Manual");
        		GUI.PTEditBtn.setEnabled(false);
        		GUI.PTOpenProList.setEnabled(true);
        		GUI.PTClosedProList.setEnabled(true);
        		GUI.PTCloseBtn.setEnabled(true);
        		GUI.PTReopenBtn.setEnabled(true);
    		} else {
    			//manual override behavior
        		GUI.PTChargeField.setEnabled(true);
        		GUI.PTManChargeBtn.setText("Save");
        		GUI.PTAutoChargeBtn.setEnabled(true);
        		GUI.PTEditBtn.setEnabled(false);
        		GUI.PTOpenProList.setEnabled(false);
        		GUI.PTClosedProList.setEnabled(false);
        		GUI.PTCloseBtn.setEnabled(false);
        		GUI.PTReopenBtn.setEnabled(false);
    		}
    	}    	
    	/************************************************
    	 * Edit Project button
    	 ************************************************/
    	else if(e.getSource() == GUI.PTEditBtn) {
			Project p = GUI.PTOpenProList.getSelectedValue();
    		if(GUI.PTHoursSpinner.isEnabled()) {
        		//'save' behavior
    			GUI.PTEditBtn.setText("Edit");
        		GUI.PTOpenProList.setEnabled(true);
        		GUI.PTClosedProList.setEnabled(true);
        		GUI.PTHoursSpinner.setEnabled(false);
        		GUI.PTManChargeBtn.setEnabled(true);
        		try {
        			//in case number was entered manually
					GUI.PTHoursSpinner.commitEdit();
				} catch (ParseException e1) {
					e1.printStackTrace();
				}
        		p.setHours((int) GUI.PTHoursSpinner.getValue());
                GUI.PTTotalField.setText(p.getTotal());
                GUI.PTMatCostField.setText(p.getCOMstr());
                GUI.PTNetField.setText(String.valueOf(Double.parseDouble(GUI.PTChargeField.getText()) 
                		- Double.parseDouble(GUI.PTTotalField.getText())));
                p.resetCharge();
                GUI.PTChargeField.setText(p.getChargeStr());
                GUI.PTNetField.setText(String.valueOf(Double.parseDouble(GUI.PTChargeField.getText()) 
                		- Double.parseDouble(GUI.PTTotalField.getText())));
                
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
        	    GUI.PTOpenProList.setSelectedValue(p, true);
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
    	/************************************************
    	 * Generate Report button
    	 ************************************************/
    	else if(e.getSource() == GUI.RTGenerateBtn) {
			String gen = (String) GUI.RTGenerateComboBox.getModel().getSelectedItem();
			String type = (String) GUI.RTTypeComboBox.getModel().getSelectedItem();

			double COM = 0.0,
				   net = 0.0;
			int produced = 0,
				sold     = 0,
				avgTime  = 0,
				totTime  = 0,
				margin;
			
			if(gen.equals("Projects")) {
				//scan open projects
				for(int i = 0; i < ListData.openProjects.size(); i++) {
					Project p = ListData.openProjects.get(i);
					
					if(ListData.projectTypes[p.getTypeIndex()].equals(type)) {
						net -= p.getCOM();
						COM += p.getCOM();
						produced++;
						totTime += p.getHours();
					}
				}

				//scan closed projects
				for(int i = 0; i < ListData.closedProjects.size(); i++) {
					Project p = ListData.closedProjects.get(i);
					
					if(ListData.projectTypes[p.getTypeIndex()].equals(type)) {
						net += p.getCharge() - p.getCOM();
						COM += p.getCOM();
						produced++;
						totTime += p.getHours();
						sold++;
					}
				}
				
				margin = (int) (((net - COM) / net) * 100);
				if(net < 0) {
					margin *= -1;
				}
				net = Math.round(net * 100.0) / 100.0;
				if(produced > 0) {
					avgTime = totTime / produced;
				}
				
				//set fields
				GUI.RTTotalCostField.setText(String.valueOf(COM));
				GUI.RTProfitField.setText(String.valueOf(net));
				if(net > 0) {
					GUI.RTMarginField.setText(String.valueOf(margin) + " %");
				} else {
					GUI.RTMarginField.setText("0 %");
				}
				GUI.RTProducedField.setText(String.valueOf(produced));
				GUI.RTSoldField.setText(String.valueOf(sold));
				GUI.RTAvgTimeField.setText(String.valueOf(avgTime));
				GUI.RTTotalTimeField.setText(String.valueOf(totTime));
				
			} else if(gen.equals("Materials")) {
				
			} else {
				
			}
			
    	}
    	/************************************************
    	 * Generate for Materials / Projects CBox
    	 ************************************************/
    	else if(e.getSource() == GUI.RTGenerateComboBox) {
    		if(GUI.RTGenerateComboBox.getSelectedIndex() == 1) {

    			GUI.RTTypeComboBox.setEnabled(true);
    			GUI.RTTypeComboBox.setModel(new DefaultComboBoxModel<>(ListData.materialTypes));
    			GUI.RTTypeComboBox.addItem("All");
    			
    		}else if(GUI.RTGenerateComboBox.getSelectedIndex() == 2) {
    			
    			GUI.RTTypeComboBox.setEnabled(true);
    			GUI.RTTypeComboBox.setModel(new DefaultComboBoxModel<>(ListData.projectTypes));
    			GUI.RTTypeComboBox.addItem("All");
    			
    		} else {
    			GUI.RTGenerateBtn.setEnabled(false);
    			GUI.RTTypeComboBox.setEnabled(false);
    			GUI.RTTypeComboBox.setModel(new DefaultComboBoxModel());
    		}
    	}
    	/************************************************
    	 * Report for type of Materials / Project CBox
    	 ************************************************/
    	else if(e.getSource() == GUI.RTTypeComboBox) {
    		if(GUI.RTTypeComboBox.getSelectedIndex() == 0 ||
    				GUI.RTTypeComboBox.getSelectedIndex() == -1) {
    			GUI.RTGenerateBtn.setEnabled(false);
    		} else {
    			GUI.RTGenerateBtn.setEnabled(true);
    		}
    	} 
    }
    
	public void keyPressed(KeyEvent e) {

	}
	
	public void keyReleased(KeyEvent e) {
    	//auto calculate extended cost and qty available on materials tab
		//TODO validate ints
		if(e.getSource() == GUI.MTCostField || e.getSource() == GUI.MTQtyField ) {
			//only 5 characters allowed to be entered in each field
			if(GUI.MTQtyField.getText().length() > 5) {
				GUI.MTQtyField.setText("" + GUI.MTQtyField.getText().substring
						(0, GUI.MTQtyField.getText().length() - 1));
			}
			if(GUI.MTCostField.getText().length() > 5) {
				GUI.MTCostField.setText("" + GUI.MTCostField.getText().substring
						(0, GUI.MTCostField.getText().length() - 1));
			}
			if(GUI.MTCostField.getText().length() != 0 
						&& GUI.MTQtyField.getText().length() != 0 ) {
				try {
					String qty = GUI.MTQtyField.getText();
					String cost = GUI.MTCostField.getText();
					
					GUI.MTExtCostField.setText(String.valueOf((int) Double.parseDouble(cost) 
							* Integer.parseInt(qty)));
					GUI.MTAvailField.setText(String.valueOf(Integer.parseInt(GUI.MTQtyField.getText()) 
							- Integer.parseInt(GUI.MTUsingField.getText())));
				} catch (Exception exp) {
					return;
				}
			} else {
				try {
					if(GUI.MTQtyField.getText().length() != 0) {
						int num = Integer.parseInt(GUI.MTQtyField.getText());
					}
					GUI.MTAvailField.setText(GUI.MTQtyField.getText());
					GUI.MTExtCostField.setText("");
				} catch (Exception exp) {
					return;
				}
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
	    		for(int i = 0; i < ListData.closedProjects.size(); i++) {
	    			if(ListData.closedProjects.get(i).getMaterials().contains(m)) {
		    			GUI.usedInProModel.addElement(ListData.closedProjects.get(i));
	    			}
	    		}
    		}
    	}

    	/************************************************
    	 * NPT Projects List
    	 ************************************************/
    	else if (e.getSource() == GUI.NPTProjectsList){
    		if (GUI.NPTProjectsList.getSelectedIndex() != -1){

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
    			GUI.NPTDedicateList.setEnabled(false);
    			GUI.dedicateMatModel.removeAllElements();
    			GUI.usedMaterialsModel.removeAllElements();
    			
    			//set customer combo-box value
    			for(int i = 1; i < GUI.NPTCustomerComboBox.getModel().getSize(); i++) {
    				String s = GUI.NPTCustomerComboBox.getItemAt(i);
    				if(s.equals(p.getCustomer().getName())) {
    					GUI.NPTCustomerComboBox.setSelectedIndex(i);
    				}
    			}
    			//show materials used
    			for(int i = 0; i < p.getMaterials().size(); i++) {
    				GUI.usedMaterialsModel.addElement(p.getMaterials().get(i));
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
        		
    		} else {
    			GUI.NPTqtyLabel.setText("");
    		}
    	} 

    	/************************************************
    	 * NPT Used Materials List
    	 ************************************************/
    	else if (e.getSource() == GUI.NPTUsedMatList){
    		if (GUI.NPTUsedMatList.getSelectedIndex() != -1){
        		GUI.NPTRemUsedMatBtn.setEnabled(true);
        		GUI.NPTMaterialsList.clearSelection();
        		
    		} else {
    			
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
    	} 
        
    	/************************************************
    	 * PT Open Projects List
    	 ************************************************/
    	else if (e.getSource() == GUI.PTOpenProList){
    		if (GUI.PTOpenProList.getSelectedIndex() != -1){
        		Project p = GUI.PTOpenProList.getSelectedValue();
        		GUI.PTClosedProList.clearSelection();
    			GUI.PTHoursSpinner.setValue(p.getHours());
                GUI.PTChargeField.setText(String.valueOf(p.getChargeStr()));
                GUI.PTTotalField.setText(p.getTotal());
                GUI.PTMatCostField.setText(p.getCOMstr());
                
                double d1 = Double.parseDouble(GUI.PTChargeField.getText());
                double d2 = Double.parseDouble(GUI.PTTotalField.getText());
                double num =  Math.round((d1 - d2) * 100.0) / 100.0;
                GUI.PTNetField.setText(String.valueOf(num));
                
        		GUI.PTEditBtn.setEnabled(true);
                GUI.PTCustomerField.setText(p.getCustomer().getName());
                GUI.PTTypeField.setText(ListData.projectTypes[p.getTypeIndex()]);
    			GUI.usedMaterialsModel.removeAllElements();
    			
        		//populate materials-used-in-project list
        		for(int i = 0; i < p.getMaterials().size(); i++) {
        			GUI.usedMaterialsModel.addElement(p.getMaterials().get(i));
        		}
        		GUI.PTChargeField.setEnabled(false);
        		GUI.PTManChargeBtn.setEnabled(true);
    		}
    		
    	} 
        
    	/************************************************
    	 * PT Closed Projects List
    	 ************************************************/
    	else if (e.getSource() == GUI.PTClosedProList){
    		if (GUI.PTClosedProList.getSelectedIndex() != -1){
    			
        		Project p = GUI.PTClosedProList.getSelectedValue();
        		GUI.PTOpenProList.clearSelection();
    			GUI.PTHoursSpinner.setValue(p.getHours());
                GUI.PTChargeField.setText(String.valueOf(p.getChargeStr()));
                GUI.PTTotalField.setText(p.getTotal());
                GUI.PTMatCostField.setText(p.getCOMstr());

                double d1 = Double.parseDouble(GUI.PTChargeField.getText());
                double d2 = Double.parseDouble(GUI.PTTotalField.getText());
                double num =  Math.round((d1 - d2) * 100.0) / 100.0;
                GUI.PTNetField.setText(String.valueOf(num));
                
        		GUI.PTEditBtn.setEnabled(true);
                GUI.PTCustomerField.setText(p.getCustomer().getName());
                GUI.PTTypeField.setText(ListData.projectTypes[p.getTypeIndex()]);
    			GUI.usedMaterialsModel.removeAllElements();
    			
        		//populate materials-used-in-project list
        		for(int i = 0; i < p.getMaterials().size(); i++) {
        			GUI.usedMaterialsModel.addElement(p.getMaterials().get(i));
        		}
        		GUI.PTChargeField.setEnabled(false);
        		GUI.PTManChargeBtn.setEnabled(true);
    			
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
        		
				GUI.custOpenProModel.removeAllElements();
	    		for(int i = 0; i < ListData.openProjects.size(); i++) {
	    			if(ListData.openProjects.get(i).getCustomer().getName().equals(c.getName())) {
		    			GUI.custOpenProModel.addElement(ListData.openProjects.get(i));
	    			}
	    		}
	    		GUI.custClosedProModel.removeAllElements();
	    		for(int i = 0; i < ListData.closedProjects.size(); i++) {
	    			if(ListData.closedProjects.get(i).getCustomer().getName().equals(c.getName())) {
		    			GUI.custClosedProModel.addElement(ListData.closedProjects.get(i));
	    			}
	    		}
    	    		
    		}
    	}
        
    	/************************************************
    	 * IT 'Needs Finished' List
    	 ************************************************/
    	else if (e.getSource() == GUI.ITFinishList){
    		if (GUI.ITFinishList.getSelectedIndex() != -1){
    			Project p = GUI.ITFinishList.getSelectedValue();
        		GUI.ITNameLabel.setText(p.getCustomer().getName());
        		GUI.ITAddressLabel.setText(p.getCustomer().getAddress());
        		GUI.ITProjectLabel.setText(p.getName());
        		GUI.ITCostLabel.setText("$ " + String.valueOf(p.getChargeStr()));
        	    Date today = Calendar.getInstance().getTime();
        		GUI.ITDateLabel.setText(String.valueOf(today));
        		GUI.ITFinishBtn.setEnabled(true);
    		}
    	} else {
    		
    	}
	}
	

	/**************************************
	 * Mouse events
	 *************************************/
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
	 * Project control functions
	 *************************************/
	private void deleteProject(Project p) {
    	
		//return dedicated materials to stock
		for(int i = 0; i < p.getMaterials().size(); i++) {
			Material m = p.getMaterials().get(i);
			m.returnOne();
			overwriteMaterial(m);
		}

		//delete project
		FileControl.deleteProFile(p);
		ListData.openProjects.remove(p);
		
		//update on-screen lists
		updateProList(GUI.closedProModel, ListData.closedProjects);
		updateProList(GUI.openProModel, ListData.openProjects);
		
		resetNPT();
		
    }
    
	private void closeProject(Project p) {
		//remove used materials from consideration
		for(int i = 0; i < p.getMaterials().size(); i++) {
			Material m = p.getMaterials().get(i);
			m.closeOne();
			overwriteMaterial(m);
			
		}
		
		p.setOpenStatus(false);

		//delete old project
		FileControl.deleteProFile(p);
		ListData.openProjects.remove(p);
		
		//add material to global list of closed projects
		ListData.closedProjects.add(p);

		//update on-screen lists
		updateProList(GUI.closedProModel, ListData.closedProjects);
		updateProList(GUI.openProModel, ListData.openProjects);
		
		//write material to file
	    try {
			FileControl.createProjectFile(p);
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	    
	    resetPT();
		
	}

    private void reopenProject(Project p) {
		//add used materials for consideration
		for(int i = 0; i < p.getMaterials().size(); i++) {
			Material m = p.getMaterials().get(i);
			m.openOne();
			overwriteMaterial(m);
		}
		
		p.setOpenStatus(true);
		p.setFinishedStatus(false);

		//delete old project
		FileControl.deleteProFile(p);
		ListData.closedProjects.remove(p);
		
		//add material to global list of closed projects
		ListData.openProjects.add(p);

		//update on-screen lists
		updateProList(GUI.closedProModel, ListData.closedProjects);
		updateProList(GUI.openProModel, ListData.openProjects);
		
		//write material to file
	    try {
			FileControl.createProjectFile(p);
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	    
	    resetPT();
		
    }

    private void finishProject(Project p) {		
		p.setFinishedStatus(true);
		
		//delete old project
		FileControl.deleteProFile(p);
		ListData.closedProjects.remove(p);
		
		//add material to global list of closed projects
		ListData.closedProjects.add(p);
		
		//update on-screen lists
		updateProList(GUI.closedProModel, ListData.closedProjects);
		GUI.proToFinishModel.removeAllElements();
    	for(int i = 0; i < ListData.closedProjects.size(); i++) {
    		if(!ListData.closedProjects.get(i).getFinishedStatus()) {
        		GUI.proToFinishModel.addElement(ListData.closedProjects.get(i));
    		}
    	}
		
    	//search for pre-existing file
    	
		//write material to file
	    try {
			FileControl.createProjectFile(p);
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	    
	    resetIT();
		
	}

	private void overwriteProject(Project p) {
		p.setCharge(Double.parseDouble(GUI.PTChargeField.getText()));

		//delete old project
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
		for(int i = 0; i < GUI.dedicateMatModel.getSize(); i++) {
			m = GUI.dedicateMatModel.getElementAt(i);
			materials.add(m);
			m.useOne();
		}
		
		//check for duplicate entry if creating new project
		if(FileControl.directoryContainsFile(FileControl.projectsPath, name) && !GUI.NPTCancelBtn.isEnabled()) {
			String message = "A Project containing this name already exists, "
					+ "\nwould you like to continue using this name?";
			int reply = JOptionPane.showConfirmDialog(null, message , "", JOptionPane.YES_NO_OPTION);
	        if (reply == JOptionPane.YES_OPTION) {
	        	name += " " + serial;
	        } else {
	        	return;
	        }

		}
		
		//if editing existing project
		if(GUI.NPTCancelBtn.isEnabled()){
			Project p = GUI.NPTProjectsList.getSelectedValue();
			for(int i = 0; i < p.getMaterials().size(); i++){
				materials.add(p.getMaterials().get(i));
			}
			FileControl.deleteProFile(p);
			ListData.openProjects.remove(p);
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
		
	    resetNPT();
	}

	/**************************************
	 * Material / Customer control functions
	 *************************************/
	private void submitNewCustomer() {
		String serial = ListData.getNewCustSerial();
		String name = GUI.CTNameField.getText();
		String addy = GUI.CTAddressField.getText();
		String phone = GUI.CTPhoneField.getText();
		
		//check for duplicate entry if creating new customer
		if(FileControl.directoryContainsFile(FileControl.customersPath, name) && GUI.CTNewBtn.isEnabled()) {
			String message = "A Customer containing this name already exists, "
					+ "\nwould you like to continue with this name?";
			int reply = JOptionPane.showConfirmDialog(null, message , "", JOptionPane.YES_NO_OPTION);
	        if (reply == JOptionPane.YES_OPTION) {
	        	name += " " + serial;
	        } else {
	        	return;
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
		int qtyInUse = Integer.parseInt(GUI.MTUsingField.getText());
		
		//check for duplicate entry if creating new material
		if(FileControl.directoryContainsFile(FileControl.materialsPath, name) && GUI.MTNewBtn.isEnabled()) {
			String message = "A material containing this name already exists, "
					+ "\nwould you like to continue using this name?";
			int reply = JOptionPane.showConfirmDialog(null, message , "", JOptionPane.YES_NO_OPTION);
	        if (reply == JOptionPane.YES_OPTION) {
	        	name += " " + serial;
	        } else {
	        	return;
	        }

		}
		
		//if editing existing material
		if(!GUI.MTNewBtn.isEnabled()){
			FileControl.deleteMatFile(GUI.MTMaterialsList.getSelectedValue());
			ListData.materials.remove(GUI.MTMaterialsList.getSelectedValue());
		}

		Material m = new Material(serial, name, qoh, cost, type, notes);
		m.setQtyInUse(qtyInUse);
		
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
		
	    //refresh open projects using this material
	    for(int i = 0; i < ListData.openProjects.size(); i++) {
	    	Project p = ListData.openProjects.get(i);
	    	for(int j = 0; j < p.getMaterials().size(); j++) {
	    		Material m1 = p.getMaterials().get(j);
	    		if(m1.getName().equals(name)) {
	    			p.removeMaterial(m1);
	    			p.addMaterial(m);
	    		}
	    	}
	    }	    
	    //refresh closed projects using this material
	    for(int i = 0; i < ListData.closedProjects.size(); i++) {
	    	Project p = ListData.closedProjects.get(i);
	    	for(int j = 0; j < p.getMaterials().size(); j++) {
	    		Material m1 = p.getMaterials().get(j);
	    		if(m1.getName().equals(name)) {
	    			p.removeMaterial(m1);
	    			p.addMaterial(m);
	    		}
	    	}
	    }
	    
	    resetMT();
	}

	
	private void overwriteMaterial(Material m) {

		//delete old material
		FileControl.deleteMatFile(m);
		ListData.materials.remove(m);
		
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

	/**************************************
	 * Update on-screen list functions
	 *************************************/
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

	/**************************************
	 * Reset tab functions
	 *************************************/
	private void resetCT() {
	    //set all fields and buttons on Customers tab to default state
		System.out.println("Reset Customers Tab");
		GUI.CTCustomersList.clearSelection();
		GUI.CTOpenProList.setEnabled(false);
		GUI.CTOpenProList.clearSelection();
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
		GUI.custOpenProModel.removeAllElements();
		GUI.custClosedProModel.removeAllElements();
	}

	public void resetMT() {
	    //set all fields and buttons on materials tab to default state
		System.out.println("Reset Materials Tab");
		GUI.MTMaterialsList.clearSelection();
		GUI.MTUsedInList.clearSelection();
		GUI.usedInProModel.removeAllElements();
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
		System.out.println("Reset New Projects Tab");
		GUI.NPTDedicateList.clearSelection();
		GUI.NPTMaterialsList.clearSelection();
		GUI.NPTProjectsList.clearSelection();
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
		GUI.NPTRemUsedMatBtn.setEnabled(false);
		GUI.NPTMaterialsList.setEnabled(true);
		GUI.NPTProjectsList.setEnabled(true);
		GUI.NPTDedicateList.setEnabled(false);
		GUI.NPTUsedMatList.setEnabled(false);
		GUI.dedicateMatModel.removeAllElements();
		GUI.usedMaterialsModel.removeAllElements();

	}

	public void resetPT() {
	    //set all fields and buttons on project tab to default state
		System.out.println("Reset Projects Tab");
		GUI.PTOpenProList.clearSelection();
		GUI.PTClosedProList.clearSelection();
		GUI.PTEditBtn.setEnabled(false);
		GUI.PTManChargeBtn.setEnabled(false);
		GUI.PTAutoChargeBtn.setEnabled(false);
        GUI.PTChargeField.setEnabled(false);
        GUI.PTChargeField.setText("");
        GUI.PTNetField.setText("");
        GUI.PTCustomerField.setText("");
        GUI.PTTypeField.setText("");
        GUI.PTTotalField.setText("");
        GUI.PTMatCostField.setText("");
        GUI.PTHoursSpinner.setEnabled(false);
        GUI.PTHoursSpinner.setValue(0);
	}

	public void resetIT() {
	    //set all fields and buttons on Invoice tab to default state
		System.out.println("Reset Invoice Tab");
        GUI.ITDateLabel.setText("Today's Date");
        GUI.ITNameLabel.setText("Customer Name");
        GUI.ITAddressLabel.setText("Customer Address");
        GUI.ITProjectLabel.setText("Project Name");
        GUI.ITCostLabel.setText("Cost: ");
		GUI.ITFinishBtn.setEnabled(false);
	}
	
	public void resetRT() {
		System.out.println("Reset Report Tab");
		GUI.RTGenerateComboBox.setSelectedIndex(0);
		GUI.RTTypeComboBox.setEnabled(false);
		GUI.RTGenerateBtn.setEnabled(false);
		GUI.RTTotalCostField.setText("");
		GUI.RTProfitField.setText("");
		GUI.RTMarginField.setText("");
		GUI.RTProducedField.setText("");
		GUI.RTSoldField.setText("");
		GUI.RTAvgTimeField.setText("");
		GUI.RTTotalTimeField.setText("");
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		resetNPT();
		resetPT();
		resetCT();
		resetMT();
		resetIT();
		resetRT();
		
		//populate projects-to-finish list
		if(GUI.jtp.getSelectedIndex() == 4) {
			GUI.proToFinishModel.removeAllElements();
			for(int i = 0; i < ListData.closedProjects.size(); i++) {
				if(!ListData.closedProjects.get(i).getFinishedStatus()) {
					GUI.proToFinishModel.addElement(ListData.closedProjects.get(i));
				}
			}
		}
	}

}
