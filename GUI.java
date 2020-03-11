import java.awt.*;
import javax.swing.*;

public class GUI extends JFrame {

    public GUI() {
        initComponents();
    } 
                      
	private void initComponents() {

    	//Tabbed pane
        jtp = new JTabbedPane();
        
        //Tabs
        materialsPanel  = new JPanel();
        projectsPanel   = new JPanel();
        newProjectPanel = new JPanel();
        reportsPanel    = new JPanel();
        customersPanel  = new JPanel();
        invoicePanel    = new JPanel();

        //Customer tab
        CTNewBtn    = new JButton();
        CTSubmitBtn = new JButton();
        CTDeleteBtn = new JButton();
        CTEditBtn   = new JButton();
        CTCustomersLabel = new JLabel();
        CTNameLabel 	 = new JLabel();
        CTAddressLabel	 = new JLabel();
        CTPhoneLabel 	 = new JLabel();
        CTProjectsLabel  = new JLabel();
        CTProjectsLabel1 = new JLabel();
        CTOpenLabel 	 = new JLabel();
        CTClosedLabel 	 = new JLabel();
        CTCustomersList = new JList<>();
        CTOpenProList   = new JList<>();
        CTClosedProList = new JList<>();
        CTCustomersPane = new JScrollPane();
        CTClosedProPane = new JScrollPane();
        CTOpenProPane  = new JScrollPane();
        CTNameField    = new JTextField();
        CTPhoneField   = new JTextField();
        CTAddressField = new JTextField();

        //Invoice tab
        ITFinishBtn = new JButton();
        ITFinishLabel  = new JLabel();
        ITPreviewLabel = new JLabel();
        ITEMALabel 	   = new JLabel();
        ITDateLabel   = new JLabel();
        ITNameLabel    = new JLabel();
        ITAddressLabel = new JLabel();
        ITProjectLabel = new JLabel();
        ITQtyLabel 	   = new JLabel();
        ITCostLabel    = new JLabel();
        ITFinishList = new JList<>();
        ITFinishScrollPane  = new JScrollPane();
        ITMessageScrollPane = new JScrollPane();
        ITMessageArea = new JTextArea();

        //Materials tab
        MTNewBtn    = new JButton();
        MTEditBtn   = new JButton();
        MTSubmitBtn = new JButton();
        MTDeleteBtn = new JButton();
        MTTypeComboBox = new JComboBox<>();
        MTSelectLabel    = new JLabel();
        MTMatUsedInLabel = new JLabel();
        MTNotesLabel 	 = new JLabel();
        MTTypeLabel 	 = new JLabel();
        MTExtCostLabel 	 = new JLabel();
        MTCostLabel 	 = new JLabel();
        MTAvailLabel 	 = new JLabel();
        MTUsingLabel 	 = new JLabel();
        MTQtyLabel 		 = new JLabel();
        MTNameLabel 	 = new JLabel();
        MTMaterialsList = new JList<>();
        MTUsedInList    = new JList<>();
        MTNotesScrollPane 	  = new JScrollPane();
        MTMaterialsScrollPane = new JScrollPane();
        MTUsedInScrollPane 	  = new JScrollPane();
        MTNotesArea = new JTextArea();
        MTExtCostField = new JTextField();
        MTCostField    = new JTextField();
        MTNameField    = new JTextField();
        MTQtyField 	   = new JTextField();
        MTUsingField   = new JTextField();
        MTAvailField   = new JTextField();

        //New Project tab
        NPTAddBtn    = new JButton();
        NPTRemoveBtn = new JButton();
        NPTCancelBtn = new JButton();
        NPTSubmitBtn = new JButton();
        NPTEditBtn   = new JButton();
        PTEditBtn 	 = new JButton();
        NPTRemUsedMatBtn = new JButton();
        NPTCustomerComboBox = new JComboBox<>();
        NPTTypeComboBox 	= new JComboBox<>();
        NPTNameLabel 	  = new JLabel();
        NPTCustomerLabel  = new JLabel();
        NPTChooseMatLabel = new JLabel();
        NPTNotesLabel 	  = new JLabel();
        NPTDedicateLabel  = new JLabel();
        NPTTypeLabel 	  = new JLabel();
        ElunaMaeArtsLabel = new JLabel();
        NPTProjectsLabel  = new JLabel();
        NPTUsedMatLabel   = new JLabel();
        NPTqtyLabel 	  = new JLabel();
        NPTMaterialsList = new JList<>();
        NPTDedicateList  = new JList<>();
        NPTProjectsList  = new JList<>();
        NPTUsedMatList   = new JList<>();
        NPTMaterialsPane = new JScrollPane();
        NPTDedicatePane  = new JScrollPane();
        NPTNotesPane 	 = new JScrollPane();
        NPTProjectsPane  = new JScrollPane();
        NPTUsedMatPane	 = new JScrollPane();
        NPTSeparator1 = new JSeparator();
        NPTNotesArea = new JTextArea();
        NPTNameField = new JTextField();
        NPTPopup = new JPopupMenu();
        NPTDeleteMenuItem = new JMenuItem();
        
        //Projects tab
        PTCloseBtn 		= new JButton();
        PTReopenBtn		= new JButton();
        PTAutoChargeBtn = new JButton();
        PTManChargeBtn  = new JButton();
        PTDeleteBtn 	= new JButton();
        PTOpenProLabel   = new JLabel();
        PTMatLabel 		 = new JLabel();
        PTCostLabel 	 = new JLabel();
        PTTotalLabel 	 = new JLabel();
        PTMatCostLabel	 = new JLabel();
        PTHoursLabel 	 = new JLabel();
        PTProfitLabel 	 = new JLabel();
        PTChargeLabel 	 = new JLabel();
        PTNetLabel 		 = new JLabel();
        PTClosedProLabel = new JLabel();
        PTCustomerLabel  = new JLabel();
        PTTypeLabel		 = new JLabel();
        PTOpenProList   = new JList<>();
        PTMaterialsList = new JList<>();
        PTClosedProList = new JList<>();
        PTTotalField    = new JTextField();
        PTMatCostField  = new JTextField();
        PTChargeField   = new JTextField();
        PTNetField 	    = new JTextField();
        PTCustomerField = new JTextField();
        PTTypeField		= new JTextField();
        PTOpenScrollPane   = new JScrollPane();
        PTMatScrollPane    = new JScrollPane();
        PTClosedScrollPane = new JScrollPane();
        PTHoursSpinner = new JSpinner();
        
        //Reports tab
        RTGenerateComboBox  = new JComboBox<>();
        RTTypeComboBox = new JComboBox<>();
        RTGenerateBtn = new JButton();
        RTGenLabel   	 = new JLabel();
        RTTypeLabel  	 = new JLabel();
        RTMarginLabel 	 = new JLabel();
        RTAvgTimeLabel   = new JLabel();
        RTProducedLabel  = new JLabel();
        RTTotalTimeLabel = new JLabel();
        RTSoldLabel 	 = new JLabel();
        RTProfitLabel 	 = new JLabel();
        RTTotalCostLabel = new JLabel();
        RTEquationLabel  = new JLabel();
        RTTotalCostField = new JTextField();
        RTTotalTimeField = new JTextField();
        RTProducedField  = new JTextField();
        RTAvgTimeField   = new JTextField();
        RTSoldField		 = new JTextField();
        RTProfitField 	 = new JTextField();
        RTMarginField 	 = new JTextField();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(830, 560));
        setResizable(false);

        jtp.setFocusable(false);
        jtp.setPreferredSize(new Dimension(820, 520));
        jtp.addChangeListener(new Action());


        //newProjectPanel.setPreferredSize(new Dimension(820, 430));

        /**************************************************
         * Materials tab elements
         **************************************************/
        
        //buttons
        MTNewBtn.setText("New");
        MTNewBtn.addActionListener(new Action());
        MTEditBtn.setText("Edit");
        MTEditBtn.setEnabled(false);
        MTEditBtn.addActionListener(new Action());
        MTSubmitBtn.setText("Submit");
        MTSubmitBtn.setEnabled(false);
        MTSubmitBtn.addActionListener(new Action());
        MTDeleteBtn.setText("Delete");
        MTDeleteBtn.setEnabled(false);
        MTDeleteBtn.addActionListener(new Action());

        //fields
        MTExtCostField.setEditable(false);
        MTExtCostField.setEnabled(false);
        MTCostField.setNextFocusableComponent(MTTypeComboBox);
        MTCostField.setEnabled(false);
        MTCostField.addKeyListener(new Action());
        MTNameField.setNextFocusableComponent(MTQtyField);
        MTNameField.setEnabled(false);
        MTQtyField.setNextFocusableComponent(MTCostField);
        MTQtyField.setEnabled(false);
        MTQtyField.addKeyListener(new Action());
        MTUsingField.setEditable(false);
        MTUsingField.setEnabled(false);
        MTAvailField.setEditable(false);
        MTAvailField.setEnabled(false);
        
        //labels
        MTSelectLabel.setText("Select:");
        MTMatUsedInLabel.setText("Used in Projects:");
        MTNotesLabel.setText("Notes:");
        MTNotesLabel.setFocusable(false);
        MTTypeLabel.setText("Type:");
        MTTypeLabel.setFocusable(false);
        MTExtCostLabel.setText("Ext. Cost:");
        MTExtCostLabel.setFocusable(false);
        MTCostLabel.setText("Cost:");
        MTCostLabel.setFocusable(false);
        MTAvailLabel.setText("Available:");
        MTAvailLabel.setFocusable(false);
        MTUsingLabel.setText("Using:");
        MTUsingLabel.setFocusable(false);
        MTQtyLabel.setText("Qty:");
        MTQtyLabel.setFocusable(false);
        MTNameLabel.setText("Name:");
        MTNameLabel.setFocusable(false);

        //other
        MTNotesArea.setColumns(20);
        MTNotesArea.setRows(5);
        MTNotesArea.setName(""); // NOI18N
        MTNotesArea.setNextFocusableComponent(MTSubmitBtn);
        MTNotesArea.setEnabled(false);
        
        MTTypeComboBox.setEditable(false);
        MTTypeComboBox.setEnabled(false);
        MTTypeComboBox.setModel(new DefaultComboBoxModel<>(ListData.materialTypes));
        
        //lists
        MTMaterialsScrollPane.setViewportView(MTMaterialsList);
        MTNotesScrollPane.setViewportView(MTNotesArea);
        MTUsedInScrollPane.setViewportView(MTUsedInList);
        
        MTMaterialsList.setMaximumSize(new Dimension(33, 75));
        MTMaterialsList.setMinimumSize(new Dimension(33, 75));
        MTMaterialsList.setPreferredSize(new Dimension(33, 75));
        
        MTUsedInList.setModel(usedInProModel);
        MTUsedInList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        MTUsedInList.setEnabled(false);

        MTMaterialsList.setModel(allMaterialsModel);
        MTMaterialsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        MTMaterialsList.addListSelectionListener(new Action());

        /**************************************************
         * Draw Materials tab
         **************************************************/
        
        GroupLayout materialsPanelLayout = new GroupLayout(materialsPanel);
        materialsPanel.setLayout(materialsPanelLayout);
        materialsPanelLayout.setHorizontalGroup(
            materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(materialsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(materialsPanelLayout.createSequentialGroup()
                        .addComponent(MTNewBtn, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MTEditBtn, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
                    .addComponent(MTSelectLabel)
                    .addComponent(MTMaterialsScrollPane, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(MTMatUsedInLabel)
                    .addGroup(materialsPanelLayout.createSequentialGroup()
                        .addComponent(MTUsedInScrollPane, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addComponent(MTExtCostLabel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                .addComponent(MTCostLabel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MTAvailLabel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MTUsingLabel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MTQtyLabel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MTNameLabel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MTNotesLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(MTTypeLabel, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(materialsPanelLayout.createSequentialGroup()
                                .addComponent(MTDeleteBtn, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MTSubmitBtn, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
                            .addComponent(MTNameField)
                            .addComponent(MTTypeComboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(materialsPanelLayout.createSequentialGroup()
                                .addGroup(materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(MTCostField, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MTAvailField, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MTUsingField, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MTQtyField, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MTNotesScrollPane, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MTExtCostField, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(18, 18, 18))
        );
        materialsPanelLayout.setVerticalGroup(
            materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(materialsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(MTSelectLabel)
                    .addComponent(MTMatUsedInLabel))
                .addGap(5, 5, 5)
                .addGroup(materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, materialsPanelLayout.createSequentialGroup()
                        .addGroup(materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(MTMaterialsScrollPane)
                            .addComponent(MTUsedInScrollPane))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(MTNewBtn, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(MTEditBtn, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(materialsPanelLayout.createSequentialGroup()
                        .addGroup(materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(MTNameLabel)
                            .addComponent(MTNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(MTTypeComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(MTTypeLabel))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(MTQtyField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(MTQtyLabel))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(MTUsingField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(MTUsingLabel))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(MTAvailField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(MTAvailLabel))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(MTCostField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(MTCostLabel))
                        .addGap(10, 10, 10)
                        .addGroup(materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(MTExtCostField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(MTExtCostLabel))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(materialsPanelLayout.createSequentialGroup()
                                .addComponent(MTNotesLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(MTNotesScrollPane, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(MTDeleteBtn, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(MTSubmitBtn, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );


        /**************************************************
         * Projects tab elements
         **************************************************/
        
        //buttons
        PTCloseBtn.setText("Close Project");
        PTCloseBtn.addActionListener(new Action());
        PTReopenBtn.setText("Reopen Project");
        PTReopenBtn.addActionListener(new Action());
        PTDeleteBtn.setText("Delete Project");
        PTDeleteBtn.setEnabled(false);
        PTDeleteBtn.addActionListener(new Action());
        PTAutoChargeBtn.setText("Auto");
        PTAutoChargeBtn.setEnabled(false);
        PTAutoChargeBtn.addActionListener(new Action());
        PTManChargeBtn.setText("Manual");
        PTManChargeBtn.setEnabled(false);
        PTManChargeBtn.addActionListener(new Action());
        PTEditBtn.setText("Edit");
        PTEditBtn.setEnabled(false);
        PTEditBtn.addActionListener(new Action());

        //labels
        PTCostLabel.setFont(new Font("Tahoma", 1, 14)); 		 // NOI18N
        PTCostLabel.setText("Cost:");
        PTCostLabel.setFocusable(false);
        PTProfitLabel.setFont(new Font("Tahoma", 1, 14)); 		 // NOI18N
        PTProfitLabel.setText("Profit:");
        PTProfitLabel.setFocusable(false);
        PTTypeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PTTypeLabel.setText("Type:");
        PTTypeLabel.setFocusable(false);
        PTOpenProLabel.setText("Open Projects:");
        PTOpenProLabel.setFocusable(false);
        PTMatLabel.setText("Materials:");
        PTMatLabel.setFocusable(false);
        PTTotalLabel.setText("Total:");
        PTTotalLabel.setFocusable(false);
        PTMatCostLabel.setText("Materials:");
        PTMatCostLabel.setFocusable(false);
        PTHoursLabel.setText("Hours:");
        PTHoursLabel.setFocusable(false);
        PTChargeLabel.setText("Charge:");
        PTChargeLabel.setFocusable(false);
        PTClosedProLabel.setText("Closed Projects:");
        PTClosedProLabel.setFocusable(false);
        PTCustomerLabel.setText("Customer:");
        PTCustomerLabel.setFocusable(false);
        PTNetLabel.setText("Net:");
        PTNetLabel.setFocusable(false);

        //fields
        PTChargeField.setEnabled(false);
        PTChargeField.setHorizontalAlignment(JTextField.RIGHT);
        PTNetField.setEnabled(false);
        PTNetField.setHorizontalAlignment(JTextField.RIGHT);
        PTCustomerField.setEnabled(false);
        PTCustomerField.setHorizontalAlignment(JTextField.RIGHT);
        PTTotalField.setEnabled(false);
        PTTotalField.setHorizontalAlignment(JTextField.RIGHT);
        PTMatCostField.setEnabled(false);
        PTMatCostField.setHorizontalAlignment(JTextField.RIGHT);
        PTTypeField.setEnabled(false);
        PTTypeField.setHorizontalAlignment(JTextField.RIGHT);
        
        //other
        PTHoursSpinner.setEnabled(false);
        
        //lists
        PTOpenScrollPane.setViewportView(PTOpenProList);
        PTMatScrollPane.setViewportView(PTMaterialsList);
        PTClosedScrollPane.setViewportView(PTClosedProList);

        PTOpenProList.setModel(openProModel);
        PTOpenProList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        PTOpenProList.addListSelectionListener(new Action());
        PTClosedProList.setModel(closedProModel);
        PTClosedProList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        PTClosedProList.addListSelectionListener(new Action());
        PTMaterialsList.setModel(usedMaterialsModel);
        PTMaterialsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        PTMaterialsList.setEnabled(false);

        PTOpenScrollPane.setPreferredSize(new java.awt.Dimension(200, 399));
        PTClosedScrollPane.setPreferredSize(new java.awt.Dimension(192, 399));
        PTMatScrollPane.setPreferredSize(new java.awt.Dimension(150, 399));
        
        
        /**************************************************
         * Draw Projects tab
         **************************************************/

        javax.swing.GroupLayout projectsPanelLayout = new javax.swing.GroupLayout(projectsPanel);
        projectsPanel.setLayout(projectsPanelLayout);
        projectsPanelLayout.setHorizontalGroup(
            projectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(projectsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(projectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PTOpenProLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PTCloseBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PTOpenScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(projectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PTMatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PTMatScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(projectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PTReopenBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PTClosedProLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PTClosedScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(projectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(projectsPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(projectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(projectsPanelLayout.createSequentialGroup()
                                .addGroup(projectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(PTProfitLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PTTotalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PTHoursLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PTMatCostLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(projectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, projectsPanelLayout.createSequentialGroup()
                                        .addComponent(PTEditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PTHoursSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(PTMatCostField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PTTotalField)
                                    .addGroup(projectsPanelLayout.createSequentialGroup()
                                        .addComponent(PTAutoChargeBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(PTManChargeBtn))))
                            .addGroup(projectsPanelLayout.createSequentialGroup()
                                .addGroup(projectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PTChargeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PTNetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(projectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PTChargeField)
                                    .addComponent(PTNetField)))
                            .addComponent(PTCostLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28))
                    .addGroup(projectsPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(projectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(projectsPanelLayout.createSequentialGroup()
                                .addComponent(PTCustomerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PTCustomerField))
                            .addGroup(projectsPanelLayout.createSequentialGroup()
                                .addComponent(PTTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PTTypeField)))
                        .addGap(32, 32, 32))))
        );
        projectsPanelLayout.setVerticalGroup(
            projectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(projectsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(projectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PTOpenProLabel)
                    .addComponent(PTMatLabel)
                    .addComponent(PTClosedProLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(projectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PTMatScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, projectsPanelLayout.createSequentialGroup()
                        .addComponent(PTCostLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(projectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PTHoursLabel)
                            .addComponent(PTHoursSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PTEditBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(projectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PTMatCostLabel)
                            .addComponent(PTMatCostField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(projectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PTTotalLabel)
                            .addComponent(PTTotalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(projectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PTProfitLabel)
                            .addComponent(PTAutoChargeBtn)
                            .addComponent(PTManChargeBtn))
                        .addGap(11, 11, 11)
                        .addGroup(projectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PTChargeLabel)
                            .addComponent(PTChargeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(projectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PTNetLabel)
                            .addComponent(PTNetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(projectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PTTypeLabel)
                            .addComponent(PTTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(projectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PTCustomerLabel)
                            .addComponent(PTCustomerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(PTOpenScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PTClosedScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(projectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PTReopenBtn)
                    .addComponent(PTCloseBtn))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        

        /**************************************************
         * New Projects tab elements
         **************************************************/

        //buttons
        NPTAddBtn.setText("Add ->");
        NPTAddBtn.setEnabled(false);
        NPTAddBtn.addActionListener(new Action());
        NPTRemoveBtn.setText("<- Remove");
        NPTRemoveBtn.setEnabled(false);
        NPTRemoveBtn.addActionListener(new Action());
        NPTCancelBtn.setText("Cancel");
        NPTCancelBtn.setEnabled(false);
        NPTCancelBtn.addActionListener(new Action());
        NPTSubmitBtn.setText("Submit");
        NPTSubmitBtn.addActionListener(new Action());
        NPTEditBtn.setText("Edit Project");
        NPTEditBtn.setEnabled(false);
        NPTEditBtn.addActionListener(new Action());
        NPTRemUsedMatBtn.setText("Remove");
        NPTRemUsedMatBtn.setEnabled(false);
        NPTRemUsedMatBtn.addActionListener(new Action());

        //labels
        ElunaMaeArtsLabel.setFont(new Font("Palace Script MT", 3, 48));
        ElunaMaeArtsLabel.setText("Eluna Mae Arts");
        ElunaMaeArtsLabel.setEnabled(false);
        ElunaMaeArtsLabel.setFocusable(false);
        NPTNameLabel.setText("Name:");
        NPTNameLabel.setFocusable(false);
        NPTCustomerLabel.setText("Customer:");
        NPTCustomerLabel.setFocusable(false);
        NPTChooseMatLabel.setText("Choose Materials:");
        NPTChooseMatLabel.setFocusable(false);
        NPTNotesLabel.setText("Notes:");
        NPTNotesLabel.setFocusable(false);
        NPTDedicateLabel.setText("Dedicate to Project:");
        NPTDedicateLabel.setFocusable(false);
        NPTUsedMatLabel.setText("Materials Used in Project:");
        NPTUsedMatLabel.setFocusable(false);
        NPTTypeLabel.setText("Type:");
        NPTTypeLabel.setFocusable(false);
        NPTProjectsLabel.setText("Open Projects:");
        NPTqtyLabel.setText("");

        //other
        NPTNotesArea.setColumns(20);
        NPTNotesArea.setRows(5);
        NPTNotesPane.setViewportView(NPTNotesArea);

        NPTCustomerComboBox.setEditable(false);
    	NPTCustomerComboBox.setModel(new DefaultComboBoxModel(ListData.getcustomerNames()));

        NPTTypeComboBox.setEditable(false);
        NPTTypeComboBox.setModel(new DefaultComboBoxModel<>(ListData.projectTypes));
        NPTTypeComboBox.addActionListener(new Action());

        NPTDeleteMenuItem.setText("Delete");
        NPTDeleteMenuItem.addActionListener(new Action());
        NPTPopup.add(NPTDeleteMenuItem);

        //lists
        NPTMaterialsPane.setViewportView(NPTMaterialsList);
        NPTDedicatePane.setViewportView(NPTDedicateList);
        NPTProjectsPane.setViewportView(NPTProjectsList);
        NPTUsedMatPane.setViewportView(NPTUsedMatList);
        
        NPTMaterialsList.setModel(allMaterialsModel);
        NPTMaterialsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        NPTMaterialsList.addListSelectionListener(new Action());
        NPTDedicateList.setModel(dedicateMatModel);
        NPTDedicateList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        NPTDedicateList.addListSelectionListener(new Action());
        NPTDedicateList.setEnabled(false);

        NPTUsedMatList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        NPTUsedMatList.addListSelectionListener(new Action());
        NPTUsedMatList.setModel(usedMaterialsModel);
        NPTUsedMatList.setEnabled(false);
        
        NPTProjectsList.setModel(openProModel);
        NPTProjectsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        NPTProjectsList.addMouseListener(new Action());
        NPTProjectsList.addListSelectionListener(new Action());
        
        //Sizes
        NPTNotesPane.setPreferredSize(new java.awt.Dimension(252, 132));
        NPTUsedMatPane.setPreferredSize(new java.awt.Dimension(215, 130));
        NPTProjectsPane.setPreferredSize(new java.awt.Dimension(252, 187));
        NPTDedicatePane.setPreferredSize(new java.awt.Dimension(215, 130));
        newProjectPanel.setPreferredSize(new java.awt.Dimension(820, 430));
        NPTMaterialsPane.setPreferredSize(new java.awt.Dimension(215, 296));
        
        /**************************************************
         * Draw New Projects tab
         **************************************************/
        
        javax.swing.GroupLayout newProjectPanelLayout = new javax.swing.GroupLayout(newProjectPanel);
        newProjectPanel.setLayout(newProjectPanelLayout);
        newProjectPanelLayout.setHorizontalGroup(
            newProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newProjectPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(newProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NPTProjectsLabel)
                    .addGroup(newProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(NPTCustomerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NPTTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(NPTNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NPTNotesLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(newProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newProjectPanelLayout.createSequentialGroup()
                        .addGroup(newProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(newProjectPanelLayout.createSequentialGroup()
                                .addComponent(NPTCancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NPTEditBtn))
                            .addComponent(NPTProjectsPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NPTNotesPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(newProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(newProjectPanelLayout.createSequentialGroup()
                                .addComponent(NPTqtyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NPTAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(NPTMaterialsPane, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(newProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(newProjectPanelLayout.createSequentialGroup()
                                .addComponent(NPTRemoveBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NPTSubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(NPTUsedMatPane, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addComponent(NPTDedicatePane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(newProjectPanelLayout.createSequentialGroup()
                                .addComponent(NPTDedicateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(newProjectPanelLayout.createSequentialGroup()
                        .addGroup(newProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(newProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(NPTTypeComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 252, Short.MAX_VALUE)
                                .addComponent(NPTCustomerComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(NPTNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(newProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(newProjectPanelLayout.createSequentialGroup()
                                .addComponent(NPTChooseMatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NPTUsedMatLabel))
                            .addComponent(ElunaMaeArtsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NPTSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NPTRemUsedMatBtn)))
                .addContainerGap())
        );
        newProjectPanelLayout.setVerticalGroup(
            newProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newProjectPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(newProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newProjectPanelLayout.createSequentialGroup()
                        .addGroup(newProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NPTNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NPTNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(newProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NPTTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NPTTypeLabel))
                        .addGap(8, 8, 8)
                        .addGroup(newProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NPTCustomerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NPTCustomerLabel)
                            .addComponent(NPTChooseMatLabel)
                            .addComponent(NPTUsedMatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NPTRemUsedMatBtn)))
                    .addGroup(newProjectPanelLayout.createSequentialGroup()
                        .addComponent(ElunaMaeArtsLabel)
                        .addGap(0, 0, 0)
                        .addComponent(NPTSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(newProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newProjectPanelLayout.createSequentialGroup()
                        .addComponent(NPTUsedMatPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NPTDedicateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(NPTDedicatePane, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(newProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(NPTMaterialsPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(newProjectPanelLayout.createSequentialGroup()
                            .addGroup(newProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NPTNotesLabel)
                                .addComponent(NPTNotesPane, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(newProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NPTProjectsLabel)
                                .addComponent(NPTProjectsPane, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(12, 12, 12)
                .addGroup(newProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NPTAddBtn)
                    .addComponent(NPTRemoveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NPTCancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NPTSubmitBtn)
                    .addComponent(NPTEditBtn)
                    .addComponent(NPTqtyLabel))
                .addGap(26, 26, 26))
        );


        /**************************************************
         * Reports tab elements
         **************************************************/

        //buttons
        RTGenerateBtn.setText("Generate");
        RTGenerateBtn.setEnabled(false);
        RTGenerateBtn.addActionListener(new Action());

        RTGenLabel.setText("Generate Report for:");
        RTGenLabel.setFocusable(false);
        RTTypeLabel.setText("Type:");
        RTTypeLabel.setFocusable(false);

        RTMarginLabel.setText("Profit Margin:");
        RTMarginLabel.setFocusable(false);
        RTTotalTimeLabel.setText("Total Time Spent:");
        RTTotalTimeLabel.setFocusable(false);
        RTAvgTimeLabel.setText("Average Time Spent:");
        RTAvgTimeLabel.setFocusable(false);
        RTProducedLabel.setText("Number Produced:");
        RTProducedLabel.setFocusable(false);
        RTSoldLabel.setText("Number Sold:");
        RTSoldLabel.setFocusable(false);
        RTProfitLabel.setText("Total Profit:");
        RTProfitLabel.setFocusable(false);
        RTTotalCostLabel.setText("Cost of Materials:");
        RTTotalCostLabel.setFocusable(false);
        RTEquationLabel.setText("(rev. - exp.) / net sales");

        //fields
        RTTotalCostField.setEditable(false);
        RTTotalTimeField.setEditable(false);
        RTProducedField.setEditable(false);
        RTAvgTimeField.setEditable(false);
        RTSoldField.setEditable(false);
        RTProfitField.setEditable(false);
        RTMarginField.setEditable(false);

        //combo boxes
        RTGenerateComboBox.setEditable(false);
        RTGenerateComboBox.addItem("");
        RTGenerateComboBox.addItem("Materials");
        RTGenerateComboBox.addItem("Projects");
        RTGenerateComboBox.addActionListener(new Action());

        RTTypeComboBox.setEditable(false);
        RTTypeComboBox.setEnabled(false);
        RTTypeComboBox.addActionListener(new Action());

        
        /**************************************************
         * Draw Reports tab
         **************************************************/
        
        GroupLayout reportsPanelLayout = new GroupLayout(reportsPanel);
        reportsPanel.setLayout(reportsPanelLayout);
        reportsPanelLayout.setHorizontalGroup(
            reportsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(reportsPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(reportsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(reportsPanelLayout.createSequentialGroup()
                        .addGroup(reportsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(RTAvgTimeLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RTSoldLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RTProducedLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RTTotalTimeLabel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RTMarginLabel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RTProfitLabel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RTTotalCostLabel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(reportsPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(RTTotalTimeField, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(RTAvgTimeField, GroupLayout.Alignment.LEADING)
                            .addComponent(RTSoldField, GroupLayout.Alignment.LEADING)
                            .addComponent(RTProducedField, GroupLayout.Alignment.LEADING)
                            .addComponent(RTMarginField, GroupLayout.Alignment.LEADING)
                            .addComponent(RTProfitField, GroupLayout.Alignment.LEADING)
                            .addComponent(RTTotalCostField))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RTEquationLabel))
                    .addGroup(reportsPanelLayout.createSequentialGroup()
                        .addGroup(reportsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(RTTypeLabel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RTGenLabel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(reportsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(RTGenerateBtn, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                            .addGroup(reportsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(RTGenerateComboBox, 0, 120, Short.MAX_VALUE)
                                .addComponent(RTTypeComboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(311, 497, Short.MAX_VALUE))
        );
        reportsPanelLayout.setVerticalGroup(
            reportsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(reportsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(reportsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(RTGenerateComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(RTGenLabel))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(reportsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(RTTypeLabel)
                    .addComponent(RTTypeComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RTGenerateBtn, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addGroup(reportsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(RTTotalCostField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(RTTotalCostLabel))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(reportsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(RTProfitLabel)
                    .addComponent(RTProfitField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(reportsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(RTMarginLabel)
                    .addComponent(RTMarginField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(RTEquationLabel))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(reportsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(RTProducedLabel)
                    .addComponent(RTProducedField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(reportsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(RTSoldLabel)
                    .addComponent(RTSoldField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(reportsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(RTAvgTimeLabel)
                    .addComponent(RTAvgTimeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(reportsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(RTTotalTimeLabel)
                    .addComponent(RTTotalTimeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );


        /**************************************************
         * Customer tab elements
         **************************************************/

        //buttons
        CTNewBtn.setText("New");
        CTNewBtn.addActionListener(new Action());
        CTEditBtn.setText("Edit");
        CTEditBtn.setEnabled(false);
        CTEditBtn.addActionListener(new Action());
        CTDeleteBtn.setText("Delete");
        CTDeleteBtn.setEnabled(false);
        CTDeleteBtn.addActionListener(new Action());
        CTSubmitBtn.setText("Submit");
        CTSubmitBtn.setEnabled(false);
        CTSubmitBtn.addActionListener(new Action());

        //labels
        CTCustomersLabel.setText("Customers:");
        CTCustomersLabel.setFocusable(false);
        CTNameLabel.setText("Name:");
        CTNameLabel.setFocusable(false);
        CTAddressLabel.setText("Address:");
        CTAddressLabel.setFocusable(false);
        CTPhoneLabel.setText("Phone:");
        CTPhoneLabel.setFocusable(false);
        CTProjectsLabel.setText("Projects:");
        CTProjectsLabel.setFocusable(false);
        CTProjectsLabel1.setText("Projects:");
        CTProjectsLabel1.setFocusable(false);
        CTOpenLabel.setText("Open");
        CTOpenLabel.setFocusable(false);
        CTClosedLabel.setText("Closed");
        CTClosedLabel.setFocusable(false);

        //fields
        CTNameField.setEditable(true);
        CTNameField.setEnabled(false);
        CTPhoneField.setEditable(true);
        CTPhoneField.setEnabled(false);
        CTPhoneField.setText("");
        CTAddressField.setEditable(true);
        CTAddressField.setEnabled(false);

        //Lists
        CTCustomersPane.setViewportView(CTCustomersList);
        CTOpenProPane.setViewportView(CTOpenProList);
        CTClosedProPane.setViewportView(CTClosedProList);

        CTOpenProList.setEnabled(false);
        CTOpenProList.setModel(custOpenProModel);
        CTOpenProList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        CTClosedProList.setEnabled(false);
        CTClosedProList.setModel(custClosedProModel);
        CTClosedProList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        CTCustomersList.setModel(customersModel);
        CTCustomersList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        CTCustomersList.addListSelectionListener(new Action());

        //preferred sizes
        CTOpenProPane.setPreferredSize(new java.awt.Dimension(280, 130));
        CTClosedProPane.setPreferredSize(new java.awt.Dimension(280, 182));
        CTCustomersPane.setPreferredSize(new java.awt.Dimension(282, 450));
        
        /**************************************************
         * Draw Customers Tab
         **************************************************/
        
        javax.swing.GroupLayout customersPanelLayout = new javax.swing.GroupLayout(customersPanel);
        customersPanel.setLayout(customersPanelLayout);
        customersPanelLayout.setHorizontalGroup(
            customersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customersPanelLayout.createSequentialGroup()
                        .addComponent(CTCustomersPane, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(customersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CTNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CTProjectsLabel1)
                            .addGroup(customersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CTNewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CTDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CTEditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CTClosedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CTProjectsLabel)
                            .addComponent(CTOpenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CTPhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CTAddressLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(customersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CTPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CTAddressField)
                            .addComponent(CTNameField)
                            .addComponent(CTOpenProPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CTClosedProPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CTSubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CTCustomersLabel))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        customersPanelLayout.setVerticalGroup(
            customersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CTCustomersLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(customersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customersPanelLayout.createSequentialGroup()
                        .addGroup(customersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CTNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CTNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(customersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CTAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CTAddressLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(customersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CTPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CTPhoneLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(customersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(customersPanelLayout.createSequentialGroup()
                                .addComponent(CTOpenLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CTProjectsLabel))
                            .addComponent(CTOpenProPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(customersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customersPanelLayout.createSequentialGroup()
                                .addComponent(CTClosedLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CTProjectsLabel1)
                                .addGap(21, 21, 21)
                                .addComponent(CTDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CTEditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CTNewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CTSubmitBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CTClosedProPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(CTCustomersPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );


        /**************************************************
         * Invoice tab elements
         **************************************************/

        //buttons
        ITFinishBtn.setText("Finish");
        ITFinishBtn.setEnabled(false);
        ITFinishBtn.addActionListener(new Action());

        //labels
        ITFinishLabel.setText("Projects to Finish:");
        ITPreviewLabel.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        ITPreviewLabel.setText("Preview Invoice:");
        ITEMALabel.setText("Eluna Mae Arts");
        ITDateLabel.setText("Today's Date");
        ITNameLabel.setText("Customer Name");
        ITAddressLabel.setText("Customer Address");
        ITProjectLabel.setText("Project Name");
        ITQtyLabel.setText("Qty: 1");
        ITCostLabel.setText("Cost: ");

        //lists
        ITFinishScrollPane.setViewportView(ITFinishList);
        ITMessageScrollPane.setViewportView(ITMessageArea);
        
        ITFinishList.setModel(proToFinishModel);
        ITFinishList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        ITFinishList.addListSelectionListener(new Action());
        
        //other
        ITMessageArea.setColumns(20);
        ITMessageArea.setRows(5);
        ITMessageArea.setText("Message:");
        

        /**************************************************
         * Draw Invoice Tab
         **************************************************/
        
        GroupLayout invoicePanelLayout = new GroupLayout(invoicePanel);
        invoicePanel.setLayout(invoicePanelLayout);
        invoicePanelLayout.setHorizontalGroup(
            invoicePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(invoicePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(invoicePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(invoicePanelLayout.createSequentialGroup()
                        .addComponent(ITFinishLabel)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(invoicePanelLayout.createSequentialGroup()
                        .addComponent(ITFinishScrollPane, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(invoicePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(ITPreviewLabel)
                            .addComponent(ITEMALabel)
                            .addComponent(ITDateLabel)
                            .addComponent(ITNameLabel)
                            .addComponent(ITAddressLabel)
                            .addComponent(ITProjectLabel)
                            .addComponent(ITQtyLabel)
                            .addComponent(ITCostLabel)
                            .addComponent(ITMessageScrollPane, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)))
                .addComponent(ITFinishBtn, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        invoicePanelLayout.setVerticalGroup(
            invoicePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(invoicePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ITFinishLabel)
                .addGap(9, 9, 9)
                .addGroup(invoicePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(ITFinishScrollPane, GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                    .addGroup(GroupLayout.Alignment.TRAILING, invoicePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ITFinishBtn, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupLayout.Alignment.TRAILING, invoicePanelLayout.createSequentialGroup()
                        .addComponent(ITPreviewLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ITEMALabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ITDateLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ITNameLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ITAddressLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ITProjectLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ITQtyLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ITCostLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ITMessageScrollPane)))
                .addGap(26, 26, 26))
        );

        jtp.addTab("Materials", materialsPanel);
        jtp.addTab("Projects", projectsPanel);
        jtp.addTab("New / Edit Project", newProjectPanel);
        jtp.addTab("Customers", customersPanel);
        jtp.addTab("Invoice", invoicePanel);
        jtp.addTab("Reports", reportsPanel);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jtp)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jtp)
        );

        pack();
		
    }

    
    /**************************************************
     * Declarations
     **************************************************/
    
    //Tabbed pane
    static JTabbedPane jtp;

    //Tabs
    private JPanel customersPanel;
    private JPanel invoicePanel;
    private JPanel materialsPanel;
    private JPanel newProjectPanel;
    private JPanel projectsPanel;
    private JPanel reportsPanel;

    //Customer tab
    static JButton CTNewBtn;
    static JButton CTSubmitBtn;
    static JButton CTDeleteBtn;
    static JButton CTEditBtn;
    private JLabel CTAddressLabel;
    private JLabel CTCustomersLabel;
    private JLabel CTNameLabel;
    private JLabel CTPhoneLabel;
    private JLabel CTProjectsLabel;
    private JLabel CTProjectsLabel1;
    private JLabel CTClosedLabel;
    private JLabel CTOpenLabel;
    static JList<Customer> CTCustomersList;
    static JList<Project> CTOpenProList;
    static JList<Project> CTClosedProList;
    private JScrollPane CTCustomersPane;
    private JScrollPane CTOpenProPane;
    private JScrollPane CTClosedProPane;
    static JTextField CTAddressField;
    static JTextField CTNameField;
    static JTextField CTPhoneField;

    //Invoice tab
    static JButton ITFinishBtn;
    static JLabel ITAddressLabel;
    static JLabel ITCostLabel;
    static JLabel ITEMALabel;
    static JLabel ITNameLabel;
    static JLabel ITPreviewLabel;
    static JLabel ITProjectLabel;
    static JLabel ITQtyLabel;
    static JLabel ITDateLabel;
    static JLabel ITFinishLabel;
    static JList<Project> ITFinishList;
    private JScrollPane ITFinishScrollPane;
    private JScrollPane ITMessageScrollPane;
    static JTextArea ITMessageArea;
    
    //Materials tab
    static JButton MTDeleteBtn;
    static JButton MTEditBtn;
    static JButton MTNewBtn;
    static JButton MTSubmitBtn;
    static JComboBox<String> MTTypeComboBox;
    private JLabel MTAvailLabel;
    private JLabel MTCostLabel;
    private JLabel MTExtCostLabel;
    private JLabel MTMatUsedInLabel;
    private JLabel MTNameLabel;
    private JLabel MTNotesLabel;
    private JLabel MTQtyLabel;
    private JLabel MTSelectLabel;
    private JLabel MTTypeLabel;
    private JLabel MTUsingLabel;
    static JList<Material> MTMaterialsList;
    static JList<Project> MTUsedInList;
    private JScrollPane MTMaterialsScrollPane;
    private JScrollPane MTNotesScrollPane;
    private JScrollPane MTUsedInScrollPane;
    static JTextArea MTNotesArea;
    static JTextField MTAvailField;
    static JTextField MTCostField;
    static JTextField MTExtCostField;
    static JTextField MTNameField;
    static JTextField MTQtyField;
    static JTextField MTUsingField;
    
    //New Project tab
    static JButton NPTAddBtn;
    static JButton NPTCancelBtn;
    static JButton NPTRemoveBtn;
    static JButton NPTSubmitBtn;
    static JButton NPTEditBtn;
    static JButton NPTRemUsedMatBtn;
    static JComboBox<String> NPTCustomerComboBox;
    static JComboBox<String> NPTTypeComboBox;
    private JLabel ElunaMaeArtsLabel;
    private JLabel NPTChooseMatLabel;
    private JLabel NPTCustomerLabel;
    private JLabel NPTDedicateLabel;
    private JLabel NPTNameLabel;
    private JLabel NPTNotesLabel;
    private JLabel NPTProjectsLabel;
    private JLabel NPTTypeLabel;
    private JLabel NPTUsedMatLabel;
    static JLabel NPTqtyLabel;
    static JList<Material> NPTDedicateList;
    static JList<Material> NPTMaterialsList;
    static JList<Material> NPTUsedMatList;
    static JList<Project> NPTProjectsList;
    private JScrollPane NPTDedicatePane;
    private JScrollPane NPTMaterialsPane;
    private JScrollPane NPTNotesPane;
    private JScrollPane NPTProjectsPane;
    private JScrollPane NPTUsedMatPane;
    private JSeparator NPTSeparator1;
    static JTextArea NPTNotesArea;
    static JTextField NPTNameField;
    static JPopupMenu NPTPopup;
    static JMenuItem NPTDeleteMenuItem;
    
    //Projects tab
    static JButton PTAutoChargeBtn;
    static JButton PTCloseBtn;
    static JButton PTManChargeBtn;
    static JButton PTReopenBtn;
    static JButton PTEditBtn;
    private JButton PTDeleteBtn;
    private JLabel PTChargeLabel;
    private JLabel PTClosedProLabel;
    private JLabel PTCostLabel;
    private JLabel PTCustomerLabel;
    private JLabel PTHoursLabel;
    private JLabel PTMatCostLabel;
    private JLabel PTMatLabel;
    private JLabel PTNetLabel;
    private JLabel PTOpenProLabel;
    private JLabel PTProfitLabel;
    private JLabel PTTotalLabel;
    private JLabel PTTypeLabel;
    static JList<Project> PTClosedProList;
    static JList<Material> PTMaterialsList;
    static JList<Project> PTOpenProList;
    private JScrollPane PTClosedScrollPane;
    private JScrollPane PTMatScrollPane;
    private JScrollPane PTOpenScrollPane;
    static JSpinner PTHoursSpinner;
    static JTextField PTTotalField;
    static JTextField PTChargeField;
    static JTextField PTCustomerField;
    static JTextField PTMatCostField;
    static JTextField PTNetField;
    static JTextField PTTypeField;
    
    //Reports tab
    static JButton RTGenerateBtn;
    static JComboBox<String> RTGenerateComboBox;
    static JComboBox<String> RTTypeComboBox;
    private JLabel RTAvgTimeLabel;
    private JLabel RTEquationLabel;
    private JLabel RTGenLabel;
    private JLabel RTMarginLabel;
    private JLabel RTProducedLabel;
    private JLabel RTProfitLabel;
    private JLabel RTSoldLabel;
    private JLabel RTTotalCostLabel;
    private JLabel RTTotalTimeLabel;
    private JLabel RTTypeLabel;
    static JTextField RTAvgTimeField;
    static JTextField RTMarginField;
    static JTextField RTProducedField;
    static JTextField RTProfitField;
    static JTextField RTSoldField;
    static JTextField RTTotalCostField;
    static JTextField RTTotalTimeField;

	static DefaultListModel<Material> allMaterialsModel  = new DefaultListModel<Material>();
	static DefaultListModel<Material> usedMaterialsModel = new DefaultListModel<Material>();
	static DefaultListModel<Material> dedicateMatModel   = new DefaultListModel<Material>();
	static DefaultListModel<Project> usedInProModel     = new DefaultListModel<Project>();
	static DefaultListModel<Project> openProModel 	    = new DefaultListModel<Project>();
	static DefaultListModel<Project> closedProModel     = new DefaultListModel<Project>();
	static DefaultListModel<Project> proToFinishModel   = new DefaultListModel<Project>();
	static DefaultListModel<Project> custOpenProModel   = new DefaultListModel<Project>();
	static DefaultListModel<Project> custClosedProModel = new DefaultListModel<Project>();
	static DefaultListModel<Customer> customersModel = new DefaultListModel<Customer>();
          
}
