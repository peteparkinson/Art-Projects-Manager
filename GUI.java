/************************************************
 * GUI.java
 * 11-16-2018
 * Pete Parkinson
 * 
 * draws GUI for simple inventory tracking system
 * 
 ************************************************/

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class GUI extends JFrame{
	
	static JButton submitMatBtn = new JButton("Submit");

	static JTextField nameField = new JTextField(15);
	static JTextField descField = new JTextField(15);
	static JTextField QOHField  = new JTextField(15);
	static JTextField costField = new JTextField(15);
	static JTextField extCostField = new JTextField(15);

	JLabel nameLabel = new JLabel("Name: ");
	JLabel descLabel = new JLabel("Description: ");
	JLabel QOHLabel  = new JLabel("Qty on hand: ");
	JLabel costLabel = new JLabel("Cost: ");
	JLabel extCostLabel = new JLabel("Extended Cost: ");
	
	JPanel VMPBottom= new JPanel();

	JPanel blankPanel1 = new JPanel();
	JPanel blankPanel2 = new JPanel();
	JPanel blankPanel3 = new JPanel();
	
	JLabel placeHolder6 = new JLabel("");
	
	//to be verified by user then submitted to DB
	JLabel finalNameLabel   = new JLabel("");
	
	JRadioButton radioButton = new JRadioButton("text here");
	
	ButtonGroup btnGroup = new ButtonGroup();
	
	JTabbedPane jtp = new JTabbedPane();
	JScrollPane jsp = new JScrollPane();

	JPanel newMaterialTab = new JPanel();
	JPanel projectsTab = new JPanel();
	JPanel newProjectTab = new JPanel();
	JPanel closedProjectsTab = new JPanel();

	
	JList<Project> ordersList = new JList<>();
	DefaultListModel<Project> orderModel = new DefaultListModel<Project>();
	
	Font font1 = new Font("",Font.BOLD,16);
	



	
	public GUI() {
		super("Art Projects Manager");
		//setLayout(new GridLayout(0,2,5,5));
		newMaterialTab.setLayout (new GridLayout(0,2,5,5));
		
		extCostField.setEditable(false);
		
        //customerLabel.setFont(font1);
        
		radioButton.setVisible(false);
		
		ordersList.setPreferredSize(new Dimension(150,140));

		ordersList.setModel(orderModel);
		ordersList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				
		//test data for JList
		orderModel.addElement(new Project(/* enter parameters here */));
		
		btnGroup.add(radioButton);	

		VMPBottom.add(submitMatBtn);
		
		newMaterialTab.add(nameLabel);
		newMaterialTab.add(nameField);
		newMaterialTab.add(descLabel);
		newMaterialTab.add(descField);
		newMaterialTab.add(QOHLabel);
		newMaterialTab.add(QOHField);
		newMaterialTab.add(costLabel);
		newMaterialTab.add(costField);
		newMaterialTab.add(extCostLabel);
		newMaterialTab.add(extCostField);
		newMaterialTab.add(blankPanel1);
		newMaterialTab.add(blankPanel2);
		newMaterialTab.add(blankPanel3);
		newMaterialTab.add(VMPBottom);
		
		/*
		newMaterialTab.add(new JScrollPane(ordersList));
		newMaterialTab.add(radioButton);
		 */

		jtp.addTab("New Material", newMaterialTab);
		jtp.addTab("Projects", projectsTab);
		jtp.addTab("New Projects", newProjectTab);
		jtp.addTab("Closed Projects", closedProjectsTab);
		
		add(jtp);

		submitMatBtn.addActionListener(new Action());

		nameField.addKeyListener(new Action());
	
		ordersList.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent event){
				if(event.getSource() == costField || event.getSource() == QOHField) {
					//calculate extended cost here
				}
			}

		});
	}
}
