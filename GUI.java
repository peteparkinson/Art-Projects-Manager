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
        CTCustomersList = new JList<>();
        CTProjectsList  = new JList<>();
        CTCustomersScrollPane = new JScrollPane();
        CTProjectsScrollPane  = new JScrollPane();
        CTNameField    = new JTextField();
        CTPhoneField   = new JTextField();
        CTAddressField = new JTextField();

        //Invoice tab
        ITFinishBtn = new JButton();
        ITFinishLabel  = new JLabel();
        ITPreviewLabel = new JLabel();
        ITEMALabel 	   = new JLabel();
        ITTodayLabel   = new JLabel();
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
        NPTAddBtn     = new JButton();
        NPTRemoveBtn  = new JButton();
        NPTCancelBtn  = new JButton();
        NPTSubmitBtn  = new JButton();
        NPTEditBtn    = new JButton();
        PTEditBtn 	  = new JButton();
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
        NPTqtyLabel 	  = new JLabel();
        NPTMaterialsList = new JList<>();
        NPTDedicateList  = new JList<>();
        NPTProjectsList  = new JList<>();
        NPTMatScrollPane 	  = new JScrollPane();
        NPTDedicateScrollPane = new JScrollPane();
        NPTNotesScrollPane 	  = new JScrollPane();
        NPTProjectsScrollPane = new JScrollPane();
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
        PTOpenProList   = new JList<>();
        PTMaterialsList = new JList<>();
        PTClosedProList = new JList<>();
        PTTotalField    = new JTextField();
        PTMatCostField  = new JTextField();
        PTChargeField   = new JTextField();
        PTNetField 	    = new JTextField();
        PTCustomerField = new JTextField();
        PTOpenScrollPane   = new JScrollPane();
        PTMatScrollPane    = new JScrollPane();
        PTClosedScrollPane = new JScrollPane();
        PTSeparator1 = new JSeparator();
        PTSeparator2 = new JSeparator();
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
        
        MTTypeComboBox.setEditable(true);
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
        PTCostLabel.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        PTCostLabel.setText("Cost:");
        PTCostLabel.setFocusable(false);
        PTProfitLabel.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        PTProfitLabel.setText("Profit:");
        PTProfitLabel.setFocusable(false);
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
        PTMaterialsList.setModel(usedMaterialsModel);
        PTMaterialsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        /**************************************************
         * Draw Projects tab
         **************************************************/

        GroupLayout projectsPanelLayout = new GroupLayout(projectsPanel);
        projectsPanel.setLayout(projectsPanelLayout);
        projectsPanelLayout.setHorizontalGroup(
            projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(projectsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(PTOpenProLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PTCloseBtn, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(PTOpenScrollPane))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(PTMatScrollPane, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                    .addComponent(PTMatLabel, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(PTClosedProLabel, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                    .addComponent(PTReopenBtn, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
                    .addComponent(PTClosedScrollPane, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(PTSeparator2)
                    .addGroup(projectsPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(PTMatCostLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PTHoursLabel, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(GroupLayout.Alignment.TRAILING, projectsPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(GroupLayout.Alignment.TRAILING, projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(PTSeparator1, GroupLayout.Alignment.TRAILING)
                                .addComponent(PTCustomerLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PTCostLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(projectsPanelLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, projectsPanelLayout.createSequentialGroup()
                                            .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(projectsPanelLayout.createSequentialGroup()
                                                    .addComponent(PTTotalLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGap(69, 69, 69))
                                                .addGroup(GroupLayout.Alignment.TRAILING, projectsPanelLayout.createSequentialGroup()
                                                    .addGap(0, 0, Short.MAX_VALUE)
                                                    .addComponent(PTEditBtn)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                                            .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(PTHoursSpinner, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(PTMatCostField, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(PTTotalField, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(projectsPanelLayout.createSequentialGroup()
                                            .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(PTNetLabel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(PTChargeLabel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                            .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(PTChargeField, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(PTNetField, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(PTCustomerField))))
                            .addGroup(GroupLayout.Alignment.TRAILING, projectsPanelLayout.createSequentialGroup()
                                .addComponent(PTAutoChargeBtn)
                                .addGap(37, 37, 37)
                                .addComponent(PTManChargeBtn, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                            .addComponent(PTProfitLabel, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28))
        );
        projectsPanelLayout.setVerticalGroup(
            projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(projectsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(PTOpenProLabel)
                    .addComponent(PTMatLabel)
                    .addComponent(PTClosedProLabel))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(projectsPanelLayout.createSequentialGroup()
                        .addComponent(PTCostLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(PTHoursLabel)
                            .addComponent(PTHoursSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(PTEditBtn))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(PTMatCostLabel)
                            .addComponent(PTMatCostField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(PTTotalLabel)
                            .addComponent(PTTotalField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PTSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PTProfitLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(PTChargeLabel)
                            .addComponent(PTChargeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(PTManChargeBtn)
                            .addComponent(PTAutoChargeBtn))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(PTNetLabel)
                            .addComponent(PTNetField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PTSeparator2, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PTCustomerLabel, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PTCustomerField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addComponent(PTClosedScrollPane)
                    .addComponent(PTMatScrollPane)
                    .addComponent(PTOpenScrollPane))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(PTCloseBtn)
                    .addComponent(PTReopenBtn))
                .addGap(23, 23, 23))
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
        NPTTypeLabel.setText("Type:");
        NPTTypeLabel.setFocusable(false);
        NPTProjectsLabel.setText("Open Projects:");
        NPTqtyLabel.setText("");

        //other
        NPTNotesArea.setColumns(20);
        NPTNotesArea.setRows(5);
        NPTNotesScrollPane.setViewportView(NPTNotesArea);

        NPTCustomerComboBox.setEditable(true);
    	NPTCustomerComboBox.setModel(new DefaultComboBoxModel(ListData.getcustomerNames()));

        NPTTypeComboBox.setEditable(true);
        NPTTypeComboBox.setModel(new DefaultComboBoxModel<>(ListData.projectTypes));
        NPTTypeComboBox.addActionListener(new Action());

        NPTDeleteMenuItem.setText("Delete");
        NPTDeleteMenuItem.addActionListener(new Action());
        NPTPopup.add(NPTDeleteMenuItem);

        //lists
        NPTMatScrollPane.setViewportView(NPTMaterialsList);
        NPTDedicateScrollPane.setViewportView(NPTDedicateList);
        NPTProjectsScrollPane.setViewportView(NPTProjectsList);
        
        NPTMaterialsList.setModel(allMaterialsModel);
        NPTMaterialsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        NPTMaterialsList.addListSelectionListener(new Action());
        NPTDedicateList.setModel(dedicateMatModel);
        NPTDedicateList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        NPTDedicateList.addListSelectionListener(new Action());
        NPTDedicateList.setEnabled(false);
        NPTProjectsList.setModel(openProModel);
        NPTProjectsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        NPTProjectsList.addMouseListener(new Action());
        NPTProjectsList.addListSelectionListener(new Action());
        
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
                        .addGroup(newProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(NPTTypeComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 257, Short.MAX_VALUE)
                            .addComponent(NPTNameField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NPTCustomerComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newProjectPanelLayout.createSequentialGroup()
                        .addGroup(newProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(newProjectPanelLayout.createSequentialGroup()
                                .addComponent(NPTCancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                .addComponent(NPTEditBtn))
                            .addComponent(NPTNotesScrollPane, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NPTProjectsScrollPane))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(newProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newProjectPanelLayout.createSequentialGroup()
                        .addGroup(newProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NPTMatScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newProjectPanelLayout.createSequentialGroup()
                                .addComponent(NPTqtyLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NPTAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(NPTChooseMatLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(newProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(newProjectPanelLayout.createSequentialGroup()
                                .addComponent(NPTRemoveBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NPTSubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(newProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NPTDedicateLabel)
                                .addComponent(NPTDedicateScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newProjectPanelLayout.createSequentialGroup()
                        .addGroup(newProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ElunaMaeArtsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NPTSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99))))
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
                        .addGap(9, 9, 9)
                        .addGroup(newProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NPTCustomerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NPTCustomerLabel)))
                    .addGroup(newProjectPanelLayout.createSequentialGroup()
                        .addComponent(ElunaMaeArtsLabel)
                        .addGap(0, 0, 0)
                        .addComponent(NPTSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(newProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newProjectPanelLayout.createSequentialGroup()
                        .addGroup(newProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NPTDedicateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NPTChooseMatLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(newProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NPTMatScrollPane)
                            .addComponent(NPTDedicateScrollPane)))
                    .addGroup(newProjectPanelLayout.createSequentialGroup()
                        .addGroup(newProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NPTNotesLabel)
                            .addComponent(NPTNotesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(newProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NPTProjectsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addGroup(newProjectPanelLayout.createSequentialGroup()
                                .addComponent(NPTProjectsLabel)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
        RTTotalCostLabel.setText("Total Cost:");
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
        
        RTTypeComboBox.setEditable(false);
        RTTypeComboBox.addItem("");


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

        //fields
        CTNameField.setEditable(true);
        CTNameField.setEnabled(false);
        CTPhoneField.setEditable(true);
        CTPhoneField.setEnabled(false);
        CTPhoneField.setText("");
        CTAddressField.setEditable(true);
        CTAddressField.setEnabled(false);

        //Lists
        CTCustomersScrollPane.setViewportView(CTCustomersList);
        CTProjectsScrollPane.setViewportView(CTProjectsList);

        CTProjectsList.setEnabled(false);
        CTProjectsList.setModel(custProModel);
        CTProjectsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        CTCustomersList.setModel(customersModel);
        CTCustomersList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        CTCustomersList.addListSelectionListener(new Action());

        /**************************************************
         * Draw Customers Tab
         **************************************************/
        
        GroupLayout customersPanelLayout = new GroupLayout(customersPanel);
        customersPanel.setLayout(customersPanelLayout);
        customersPanelLayout.setHorizontalGroup(
            customersPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(customersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customersPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(customersPanelLayout.createSequentialGroup()
                        .addComponent(CTCustomersScrollPane, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE)
                        .addGroup(customersPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(customersPanelLayout.createSequentialGroup()
                                .addGap(18, 79, Short.MAX_VALUE)
                                .addGroup(customersPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(customersPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(CTProjectsLabel, GroupLayout.Alignment.TRAILING)
                                        .addComponent(CTAddressLabel, GroupLayout.Alignment.TRAILING))
                                    .addComponent(CTPhoneLabel)
                                    .addComponent(CTNameLabel))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(customersPanelLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(customersPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CTEditBtn, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(CTNewBtn, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(CTDeleteBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, Short.MAX_VALUE)))
                        .addGroup(customersPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(CTPhoneField, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
                            .addGroup(customersPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addComponent(CTNameField, GroupLayout.Alignment.LEADING)
                                .addComponent(CTAddressField, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE))
                            .addGroup(customersPanelLayout.createSequentialGroup()
                                .addComponent(CTProjectsScrollPane, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CTSubmitBtn, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19))
                    .addGroup(customersPanelLayout.createSequentialGroup()
                        .addComponent(CTCustomersLabel)
                        .addContainerGap())))
        );
        customersPanelLayout.setVerticalGroup(
            customersPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(customersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CTCustomersLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(customersPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(CTCustomersScrollPane)
                    .addGroup(customersPanelLayout.createSequentialGroup()
                        .addGroup(customersPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(CTNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(CTNameLabel))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(customersPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(CTAddressField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(CTAddressLabel))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(customersPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(CTPhoneLabel)
                            .addComponent(CTPhoneField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(customersPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(customersPanelLayout.createSequentialGroup()
                                .addComponent(CTProjectsLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                                .addComponent(CTDeleteBtn, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CTEditBtn, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CTNewBtn, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                            .addComponent(CTProjectsScrollPane)))
                    .addGroup(customersPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CTSubmitBtn, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );


        /**************************************************
         * Invoice tab elements
         **************************************************/

        //buttons
        ITFinishBtn.setText("Finish");
        ITFinishBtn.addActionListener(new Action());

        //labels
        ITFinishLabel.setText("Projects to Finish:");
        ITPreviewLabel.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        ITPreviewLabel.setText("Preview Invoice:");
        ITEMALabel.setText("Eluna Mae Arts");
        ITTodayLabel.setText("Today's Date");
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
                            .addComponent(ITTodayLabel)
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
                        .addComponent(ITTodayLabel)
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
    static JList<Customer> CTCustomersList;
    static JList<Project> CTProjectsList;
    private JScrollPane CTCustomersScrollPane;
    private JScrollPane CTProjectsScrollPane;
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
    static JLabel ITTodayLabel;
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
    static JLabel NPTqtyLabel;
    static JList<Material> NPTDedicateList;
    static JList<Material> NPTMaterialsList;
    static JList<Project> NPTProjectsList;
    private JScrollPane NPTDedicateScrollPane;
    private JScrollPane NPTMatScrollPane;
    private JScrollPane NPTNotesScrollPane;
    private JScrollPane NPTProjectsScrollPane;
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
    static JList<Project> PTClosedProList;
    static JList<Material> PTMaterialsList;
    static JList<Project> PTOpenProList;
    private JScrollPane PTClosedScrollPane;
    private JScrollPane PTMatScrollPane;
    private JScrollPane PTOpenScrollPane;
    private JSeparator PTSeparator1;
    private JSeparator PTSeparator2;
    static JSpinner PTHoursSpinner;
    static JTextField PTTotalField;
    static JTextField PTChargeField;
    static JTextField PTCustomerField;
    static JTextField PTMatCostField;
    static JTextField PTNetField;
    
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
	static DefaultListModel<Project> usedInProModel   = new DefaultListModel<Project>();
	static DefaultListModel<Project> openProModel 	  = new DefaultListModel<Project>();
	static DefaultListModel<Project> closedProModel   = new DefaultListModel<Project>();
	static DefaultListModel<Project> proToFinishModel = new DefaultListModel<Project>();
	static DefaultListModel<Project> custProModel     = new DefaultListModel<Project>();
	static DefaultListModel<Customer> customersModel = new DefaultListModel<Customer>();
          
}
