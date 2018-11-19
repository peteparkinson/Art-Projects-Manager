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
		 * change desc to notes
		 * 
		 */
 ************************************************/

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args){
		
		//opens GUI
		GUI openGUI = new GUI();
		openGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		openGUI.setSize(400, 300);
		openGUI.setVisible(true);
		//openGUI.setJMenuBar(GUI.menuBar);
		
	}
}
