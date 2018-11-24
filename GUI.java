import java.awt.*;
import javax.swing.*;
import java.util.logging.*;


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
        NPTAddBtn      = new JButton();
        NPTRemoveBtn   = new JButton();
        NPTEditProBtn = new JButton();
        NPTSubmitBtn   = new JButton();
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
        
        //Projects tab
        PTCloseBtn 		= new JButton();
        PTReopenBtn		= new JButton();
        PTAutoChargeBtn = new JButton();
        PTManChargeBtn  = new JButton();
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
        PTSeparator3 = new JSeparator();
        PTSeparator4 = new JSeparator();
        PTHoursSpinner = new JSpinner();
        
        //Reports tab
        RTGenerateComboBox  = new JComboBox<>();
        RTTypeComboBox = new JComboBox<>();
        RTGenerateBtn = new JButton();
        RTGenLabel   	 = new JLabel();
        RTTypeLabel  	 = new JLabel();
        RTMarginLabl 	 = new JLabel();
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
        setResizable(false);

        jtp.setFocusable(false);

        MTNewBtn.setText("New");
        MTNewBtn.addActionListener(new Action());

        MTEditBtn.setText("Edit");
        MTEditBtn.addActionListener(new Action());

        MTSelectLabel.setText("Select:");

        MTMatUsedInLabel.setText("Used in Projects:");

        MTSubmitBtn.setText("Submit");
        MTSubmitBtn.setEnabled(false);
        MTSubmitBtn.addActionListener(new Action());

        MTDeleteBtn.setText("Delete");
        MTDeleteBtn.addActionListener(new Action());

        MTNotesArea.setColumns(20);
        MTNotesArea.setRows(5);
        MTNotesArea.setName(""); // NOI18N
        MTNotesArea.setNextFocusableComponent(MTSubmitBtn);
        MTNotesScrollPane.setViewportView(MTNotesArea);

        MTNotesLabel.setText("Notes:");
        MTNotesLabel.setFocusable(false);

        MTTypeComboBox.setEditable(true);
        MTTypeComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        MTTypeLabel.setText("Type:");
        MTTypeLabel.setFocusable(false);

        MTExtCostLabel.setText("Ext. Cost:");
        MTExtCostLabel.setFocusable(false);

        MTExtCostField.setEditable(false);

        MTCostField.setNextFocusableComponent(MTTypeComboBox);

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

        MTNameField.setNextFocusableComponent(MTQtyField);

        MTQtyField.setNextFocusableComponent(MTCostField);

        MTUsingField.setEditable(false);

        MTAvailField.setEditable(false);

        MTMaterialsList.setModel(new AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        MTMaterialsList.setMaximumSize(new Dimension(33, 75));
        MTMaterialsList.setMinimumSize(new Dimension(33, 75));
        MTMaterialsList.setPreferredSize(new Dimension(33, 75));
        MTMaterialsScrollPane.setViewportView(MTMaterialsList);

        MTUsedInList.setModel(new AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        MTUsedInScrollPane.setViewportView(MTUsedInList);

        GroupLayout materialsPanelLayout = new GroupLayout(materialsPanel);
        materialsPanel.setLayout(materialsPanelLayout);
        materialsPanelLayout.setHorizontalGroup(
            materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(materialsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(materialsPanelLayout.createSequentialGroup()
                        .addComponent(MTNewBtn, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(MTEditBtn, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
                    .addComponent(MTSelectLabel)
                    .addComponent(MTMaterialsScrollPane, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(materialsPanelLayout.createSequentialGroup()
                        .addComponent(MTMatUsedInLabel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131))
                    .addGroup(materialsPanelLayout.createSequentialGroup()
                        .addComponent(MTUsedInScrollPane, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addComponent(MTExtCostLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MTCostLabel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MTAvailLabel, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
                            .addComponent(MTNameLabel, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                            .addComponent(MTNotesLabel)
                            .addComponent(MTQtyLabel, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                            .addComponent(MTUsingLabel, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                            .addComponent(MTTypeLabel))
                        .addGap(32, 32, 32)))
                .addGroup(materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(materialsPanelLayout.createSequentialGroup()
                        .addComponent(MTDeleteBtn, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MTSubmitBtn, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
                    .addComponent(MTNotesScrollPane)
                    .addComponent(MTNameField)
                    .addComponent(MTTypeComboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(materialsPanelLayout.createSequentialGroup()
                        .addGroup(materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(MTQtyField, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(MTUsingField)
                            .addComponent(MTAvailField)
                            .addComponent(MTCostField)
                            .addComponent(MTExtCostField))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        materialsPanelLayout.setVerticalGroup(
            materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(materialsPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(MTSelectLabel)
                    .addComponent(MTMatUsedInLabel))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(materialsPanelLayout.createSequentialGroup()
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
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(MTQtyField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(MTQtyLabel))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(MTUsingField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(MTUsingLabel))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(MTAvailLabel)
                            .addComponent(MTAvailField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(MTCostLabel)
                            .addComponent(MTCostField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(MTExtCostLabel)
                            .addComponent(MTExtCostField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(MTTypeLabel)
                            .addComponent(MTTypeComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(GroupLayout.Alignment.TRAILING, materialsPanelLayout.createSequentialGroup()
                                .addComponent(MTNotesLabel)
                                .addGap(100, 100, 100))
                            .addGroup(GroupLayout.Alignment.TRAILING, materialsPanelLayout.createSequentialGroup()
                                .addComponent(MTNotesScrollPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(materialsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(MTDeleteBtn, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(MTSubmitBtn, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jtp.addTab("Materials", materialsPanel);

        projectsPanel.setFocusable(false);

        PTOpenProLabel.setText("Open Projects:");
        PTOpenProLabel.setFocusable(false);

        PTMatLabel.setText("Materials:");
        PTMatLabel.setFocusable(false);

        PTCostLabel.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        PTCostLabel.setText("Cost:");
        PTCostLabel.setFocusable(false);

        PTTotalLabel.setText("Total:");
        PTTotalLabel.setFocusable(false);

        PTMatCostLabel.setText("Materials:");
        PTMatCostLabel.setFocusable(false);

        PTHoursLabel.setText("Hours:");
        PTHoursLabel.setFocusable(false);

        PTTotalField.setEditable(false);
        PTTotalField.setHorizontalAlignment(JTextField.RIGHT);

        PTMatCostField.setEditable(false);
        PTMatCostField.setHorizontalAlignment(JTextField.RIGHT);

        PTProfitLabel.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        PTProfitLabel.setText("Profit:");
        PTProfitLabel.setFocusable(false);

        PTChargeLabel.setText("Charge:");
        PTChargeLabel.setFocusable(false);

        PTNetLabel.setText("Net:");
        PTNetLabel.setFocusable(false);

        PTChargeField.setEditable(false);
        PTChargeField.setHorizontalAlignment(JTextField.RIGHT);

        PTNetField.setEditable(false);
        PTNetField.setHorizontalAlignment(JTextField.RIGHT);

        PTCloseBtn.setText("Close Project");
        PTCloseBtn.addActionListener(new Action());

        PTReopenBtn.setText("Reopen Project");

        PTClosedProLabel.setText("Closed Projects:");
        PTClosedProLabel.setFocusable(false);

        PTAutoChargeBtn.setText("Auto");

        PTManChargeBtn.setText("Manual");

        PTCustomerLabel.setText("Customer:");
        PTCustomerLabel.setFocusable(false);

        PTCustomerField.setEditable(false);
        PTCustomerField.setHorizontalAlignment(JTextField.RIGHT);

        PTOpenProList.setModel(new AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        PTOpenScrollPane.setViewportView(PTOpenProList);

        PTMaterialsList.setModel(new AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        PTMatScrollPane.setViewportView(PTMaterialsList);

        PTClosedProList.setModel(new AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        PTClosedScrollPane.setViewportView(PTClosedProList);

        GroupLayout projectsPanelLayout = new GroupLayout(projectsPanel);
        projectsPanel.setLayout(projectsPanelLayout);
        projectsPanelLayout.setHorizontalGroup(
            projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(projectsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(PTOpenProLabel)
                    .addComponent(PTSeparator4)
                    .addComponent(PTCloseBtn, GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(PTOpenScrollPane))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(PTMatLabel)
                    .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                        .addComponent(PTMatScrollPane, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                        .addComponent(PTSeparator3, GroupLayout.Alignment.LEADING)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(PTClosedProLabel)
                    .addComponent(PTReopenBtn, GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(PTSeparator2)
                    .addComponent(PTClosedScrollPane))
                .addGap(24, 24, 24)
                .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(projectsPanelLayout.createSequentialGroup()
                        .addComponent(PTAutoChargeBtn)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(PTManChargeBtn, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                    .addComponent(PTSeparator1)
                    .addGroup(projectsPanelLayout.createSequentialGroup()
                        .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(PTTotalLabel)
                            .addComponent(PTMatCostLabel)
                            .addComponent(PTHoursLabel)
                            .addComponent(PTCostLabel, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(PTTotalField, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(PTMatCostField)
                            .addComponent(PTHoursSpinner, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(projectsPanelLayout.createSequentialGroup()
                        .addComponent(PTChargeLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PTChargeField, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                    .addGroup(projectsPanelLayout.createSequentialGroup()
                        .addComponent(PTNetLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PTNetField, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                    .addComponent(PTCustomerField)
                    .addGroup(projectsPanelLayout.createSequentialGroup()
                        .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(PTProfitLabel)
                            .addComponent(PTCustomerLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        projectsPanelLayout.setVerticalGroup(
            projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(projectsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(PTOpenProLabel)
                    .addComponent(PTMatLabel)
                    .addComponent(PTClosedProLabel))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(projectsPanelLayout.createSequentialGroup()
                        .addComponent(PTCostLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(PTHoursLabel)
                            .addComponent(PTHoursSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PTProfitLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(PTChargeLabel)
                            .addComponent(PTChargeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(PTManChargeBtn)
                            .addComponent(PTAutoChargeBtn))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(PTNetLabel)
                            .addComponent(PTNetField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(PTCustomerLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PTCustomerField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(projectsPanelLayout.createSequentialGroup()
                        .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(PTSeparator2, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                            .addComponent(PTSeparator3, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(PTMatScrollPane)
                            .addComponent(PTClosedScrollPane)))
                    .addGroup(projectsPanelLayout.createSequentialGroup()
                        .addComponent(PTSeparator4, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PTOpenScrollPane)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(projectsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(PTCloseBtn)
                    .addComponent(PTReopenBtn))
                .addContainerGap())
        );

        jtp.addTab("Projects", projectsPanel);

        NPTNameLabel.setText("Name:");
        NPTNameLabel.setFocusable(false);

        NPTCustomerLabel.setText("Customer:");
        NPTCustomerLabel.setFocusable(false);

        NPTMaterialsList.setModel(new AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        NPTMatScrollPane.setViewportView(NPTMaterialsList);

        NPTChooseMatLabel.setText("Choose Materials:");
        NPTChooseMatLabel.setFocusable(false);

        NPTDedicateList.setModel(new AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        NPTDedicateScrollPane.setViewportView(NPTDedicateList);

        NPTNotesLabel.setText("Notes:");
        NPTNotesLabel.setFocusable(false);

        NPTNotesArea.setColumns(20);
        NPTNotesArea.setRows(5);
        NPTNotesScrollPane.setViewportView(NPTNotesArea);

        NPTAddBtn.setText("Add ->");
        NPTAddBtn.setEnabled(false);
        NPTAddBtn.addActionListener(new Action());

        NPTRemoveBtn.setText("<- Remove");
        NPTRemoveBtn.setEnabled(false);

        NPTDedicateLabel.setText("Dedicate to Project:");
        NPTDedicateLabel.setFocusable(false);

        NPTTypeLabel.setText("Type:");
        NPTTypeLabel.setFocusable(false);

        NPTCustomerComboBox.setEditable(true);
        NPTCustomerComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ElunaMaeArtsLabel.setFont(new Font("Palace Script MT", 3, 48)); // NOI18N
        ElunaMaeArtsLabel.setText("Eluna Mae Arts");
        ElunaMaeArtsLabel.setEnabled(false);
        ElunaMaeArtsLabel.setFocusable(false);

        NPTTypeComboBox.setEditable(true);
        NPTTypeComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        NPTTypeComboBox.addActionListener(new Action());

        NPTProjectsLabel.setText("Open Projects:");

        NPTProjectsList.setModel(new AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        NPTProjectsScrollPane.setViewportView(NPTProjectsList);

        NPTEditProBtn.setText("Edit Project");

        NPTSubmitBtn.setText("Submit");

        GroupLayout newProjectPanelLayout = new GroupLayout(newProjectPanel);
        newProjectPanel.setLayout(newProjectPanelLayout);
        newProjectPanelLayout.setHorizontalGroup(
            newProjectPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(newProjectPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(newProjectPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(newProjectPanelLayout.createSequentialGroup()
                        .addGroup(newProjectPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(NPTProjectsLabel)
                            .addGroup(newProjectPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(NPTCustomerLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NPTTypeLabel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                            .addComponent(NPTNameLabel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                            .addComponent(NPTNotesLabel))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(newProjectPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(NPTNameField, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(NPTCustomerComboBox, GroupLayout.Alignment.TRAILING, 0, 226, Short.MAX_VALUE)
                            .addComponent(NPTTypeComboBox, GroupLayout.Alignment.TRAILING, 0, 226, Short.MAX_VALUE)
                            .addComponent(NPTNotesScrollPane, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(NPTProjectsScrollPane, GroupLayout.Alignment.TRAILING)))
                    .addComponent(NPTEditProBtn, GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(newProjectPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(newProjectPanelLayout.createSequentialGroup()
                        .addGroup(newProjectPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(NPTChooseMatLabel)
                            .addComponent(NPTMatScrollPane, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
                            .addComponent(NPTAddBtn, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(newProjectPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(NPTDedicateLabel)
                            .addGroup(newProjectPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addGroup(GroupLayout.Alignment.LEADING, newProjectPanelLayout.createSequentialGroup()
                                    .addComponent(NPTRemoveBtn)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(NPTSubmitBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(NPTDedicateScrollPane, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE))))
                    .addGroup(newProjectPanelLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(newProjectPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(ElunaMaeArtsLabel, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
                            .addComponent(NPTSeparator1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        newProjectPanelLayout.setVerticalGroup(
            newProjectPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(newProjectPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(newProjectPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(newProjectPanelLayout.createSequentialGroup()
                        .addGroup(newProjectPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(newProjectPanelLayout.createSequentialGroup()
                                .addGroup(newProjectPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(NPTNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NPTNameLabel))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(newProjectPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(NPTTypeComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NPTTypeLabel))
                                .addGap(9, 9, 9)
                                .addGroup(newProjectPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(NPTCustomerComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NPTCustomerLabel)))
                            .addGroup(newProjectPanelLayout.createSequentialGroup()
                                .addComponent(ElunaMaeArtsLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NPTSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(newProjectPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(NPTChooseMatLabel)
                                    .addComponent(NPTDedicateLabel, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(newProjectPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(NPTMatScrollPane, GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(NPTDedicateScrollPane)))
                    .addGroup(newProjectPanelLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(newProjectPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(NPTNotesLabel)
                            .addComponent(NPTNotesScrollPane, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(newProjectPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(NPTProjectsScrollPane, GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addGroup(newProjectPanelLayout.createSequentialGroup()
                                .addComponent(NPTProjectsLabel)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newProjectPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(NPTAddBtn)
                    .addComponent(NPTRemoveBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NPTEditProBtn)
                    .addComponent(NPTSubmitBtn))
                .addContainerGap())
        );

        jtp.addTab("New Project", newProjectPanel);

        reportsPanel.setFocusable(false);

        RTGenerateComboBox.setEditable(true);
        RTGenerateComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        RTGenLabel.setText("Generate Report for:");
        RTGenLabel.setFocusable(false);

        RTTypeLabel.setText("Type:");
        RTTypeLabel.setFocusable(false);

        RTTypeComboBox.setEditable(true);
        RTTypeComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        RTMarginLabl.setText("Profit Margin:");
        RTMarginLabl.setFocusable(false);

        RTTotalCostField.setEditable(false);

        RTTotalTimeLabel.setText("Total Time Spent:");
        RTTotalTimeLabel.setFocusable(false);

        RTTotalTimeField.setEditable(false);

        RTAvgTimeLabel.setText("Average Time Spent:");
        RTAvgTimeLabel.setFocusable(false);

        RTProducedLabel.setText("Number Produced:");
        RTProducedLabel.setFocusable(false);

        RTProducedField.setEditable(false);

        RTAvgTimeField.setEditable(false);

        RTSoldLabel.setText("Number Sold:");
        RTSoldLabel.setFocusable(false);

        RTSoldField.setEditable(false);

        RTProfitLabel.setText("Total Profit:");
        RTProfitLabel.setFocusable(false);

        RTProfitField.setEditable(false);

        RTTotalCostLabel.setText("Total Cost:");
        RTTotalCostLabel.setFocusable(false);

        RTMarginField.setEditable(false);

        RTEquationLabel.setText("(rev. - exp.) / net sales");

        RTGenerateBtn.setText("Generate");

        GroupLayout reportsPanelLayout = new GroupLayout(reportsPanel);
        reportsPanel.setLayout(reportsPanelLayout);
        reportsPanelLayout.setHorizontalGroup(
            reportsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(reportsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(reportsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(reportsPanelLayout.createSequentialGroup()
                        .addGroup(reportsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(RTAvgTimeLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RTSoldLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RTProducedLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RTTotalTimeLabel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RTMarginLabl, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RTProfitLabel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RTTotalCostLabel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(reportsPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(RTTotalTimeField, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(RTAvgTimeField, GroupLayout.Alignment.LEADING)
                            .addComponent(RTSoldField, GroupLayout.Alignment.LEADING)
                            .addComponent(RTProducedField, GroupLayout.Alignment.LEADING)
                            .addComponent(RTMarginField, GroupLayout.Alignment.LEADING)
                            .addComponent(RTProfitField, GroupLayout.Alignment.LEADING)
                            .addComponent(RTTotalCostField))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RTEquationLabel))
                    .addGroup(reportsPanelLayout.createSequentialGroup()
                        .addGroup(reportsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(RTTypeLabel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RTGenLabel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(reportsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(RTGenerateBtn, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                            .addGroup(reportsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(RTGenerateComboBox, 0, 120, Short.MAX_VALUE)
                                .addComponent(RTTypeComboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(311, 418, Short.MAX_VALUE))
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
                .addComponent(RTGenerateBtn)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(reportsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(RTTotalCostField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(RTTotalCostLabel))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(reportsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(RTProfitLabel)
                    .addComponent(RTProfitField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(reportsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(RTMarginLabl)
                    .addComponent(RTMarginField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(RTEquationLabel))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(reportsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(RTProducedLabel)
                    .addComponent(RTProducedField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(reportsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(RTSoldLabel)
                    .addComponent(RTSoldField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(reportsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(RTAvgTimeLabel)
                    .addComponent(RTAvgTimeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(reportsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(RTTotalTimeLabel)
                    .addComponent(RTTotalTimeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );

        jtp.addTab("Reports", reportsPanel);

        CTCustomersLabel.setText("Customers:");
        CTCustomersLabel.setFocusable(false);

        CTCustomersList.setModel(new AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        CTCustomersScrollPane.setViewportView(CTCustomersList);

        CTNameLabel.setText("Name:");
        CTNameLabel.setFocusable(false);

        CTAddressLabel.setText("Address:");
        CTAddressLabel.setFocusable(false);

        CTPhoneLabel.setText("Phone:");
        CTPhoneLabel.setFocusable(false);

        CTNewBtn.setText("New");

        CTSubmitBtn.setText("Submit");
        CTSubmitBtn.setEnabled(false);

        CTNameField.setEditable(false);

        CTPhoneField.setEditable(false);
        CTPhoneField.setText("jTextField4");

        CTAddressField.setEditable(false);

        CTProjectsLabel.setText("Projects:");
        CTProjectsLabel.setFocusable(false);

        CTProjectsList.setModel(new AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        CTProjectsScrollPane.setViewportView(CTProjectsList);

        GroupLayout customersPanelLayout = new GroupLayout(customersPanel);
        customersPanel.setLayout(customersPanelLayout);
        customersPanelLayout.setHorizontalGroup(
            customersPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(customersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customersPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(customersPanelLayout.createSequentialGroup()
                        .addComponent(CTCustomersScrollPane, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(customersPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(customersPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(CTProjectsLabel, GroupLayout.Alignment.TRAILING)
                                .addComponent(CTAddressLabel, GroupLayout.Alignment.TRAILING))
                            .addComponent(CTPhoneLabel)
                            .addComponent(CTNameLabel))
                        .addGap(18, 18, 18)
                        .addGroup(customersPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(CTPhoneField, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
                            .addGroup(customersPanelLayout.createSequentialGroup()
                                .addComponent(CTProjectsScrollPane, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(customersPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CTSubmitBtn, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(CTNewBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(customersPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addComponent(CTNameField, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                                .addComponent(CTAddressField, GroupLayout.Alignment.LEADING))))
                    .addComponent(CTCustomersLabel))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(customersPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(CTAddressField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(CTAddressLabel))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(customersPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(CTPhoneLabel)
                            .addComponent(CTPhoneField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(customersPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(customersPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(CTNewBtn, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CTSubmitBtn, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                            .addComponent(CTProjectsScrollPane, GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                            .addGroup(customersPanelLayout.createSequentialGroup()
                                .addComponent(CTProjectsLabel)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        jtp.addTab("Customers", customersPanel);

        ITFinishLabel.setText("Projects to Finish:");

        ITFinishList.setModel(new AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ITFinishScrollPane.setViewportView(ITFinishList);

        ITFinishBtn.setText("Finish");

        ITPreviewLabel.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        ITPreviewLabel.setText("Preview Invoice:");

        ITEMALabel.setText("Eluna Mae Arts");

        ITTodayLabel.setText("Today's Date");

        ITNameLabel.setText("Customer Name");

        ITAddressLabel.setText("Customer Address");

        ITProjectLabel.setText("Project Name");

        ITQtyLabel.setText("Qty: 1");

        ITCostLabel.setText("Cost: ");

        ITMessageArea.setColumns(20);
        ITMessageArea.setRows(5);
        ITMessageArea.setText("Message:");
        ITMessageScrollPane.setViewportView(ITMessageArea);

        GroupLayout invoicePanelLayout = new GroupLayout(invoicePanel);
        invoicePanel.setLayout(invoicePanelLayout);
        invoicePanelLayout.setHorizontalGroup(
            invoicePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(invoicePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(invoicePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(ITFinishScrollPane, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
                    .addComponent(ITFinishLabel))
                .addGap(18, 18, 18)
                .addGroup(invoicePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(invoicePanelLayout.createSequentialGroup()
                        .addComponent(ITMessageScrollPane, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(ITFinishBtn, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                    .addGroup(invoicePanelLayout.createSequentialGroup()
                        .addGroup(invoicePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(ITPreviewLabel)
                            .addComponent(ITEMALabel)
                            .addComponent(ITTodayLabel)
                            .addComponent(ITNameLabel)
                            .addComponent(ITAddressLabel)
                            .addComponent(ITProjectLabel)
                            .addComponent(ITQtyLabel)
                            .addComponent(ITCostLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        invoicePanelLayout.setVerticalGroup(
            invoicePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(invoicePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ITFinishLabel)
                .addGap(9, 9, 9)
                .addGroup(invoicePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(ITFinishScrollPane)
                    .addGroup(GroupLayout.Alignment.TRAILING, invoicePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ITFinishBtn, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupLayout.Alignment.TRAILING, invoicePanelLayout.createSequentialGroup()
                        .addComponent(ITPreviewLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
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
                        .addComponent(ITMessageScrollPane, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jtp.addTab("Invoice", invoicePanel);

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
    
    private void MTNewBtnActionPerformed(Action evt) {             
    }                                        

    private void MTSubmitBtnActionPerformed(Action evt) {         
    }                                           

    private void MTDeleteBtnActionPerformed(Action evt) {        
    }                                           

    private void MTEditBtnActionPerformed(Action evt) {       
    }                                         

    private void NPTAddBtnActionPerformed(Action evt) {  
    }                                         

    private void PTCloseBtnActionPerformed(Action evt) {           
    }                                          

    private void NPTTypeComboBoxActionPerformed(Action evt) {     
    }                                               
    
    public static void main(String args[]) {

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Init GUI
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    //Declarations
    //Tabbed pane
    private JTabbedPane jtp;

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
    private JLabel CTAddressLabel;
    private JLabel CTCustomersLabel;
    private JLabel CTNameLabel;
    private JLabel CTPhoneLabel;
    private JLabel CTProjectsLabel;
    static JList<String> CTCustomersList;
    static JList<String> CTProjectsList;
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
    static JList<String> ITFinishList;
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
    static JList<String> MTMaterialsList;
    static JList<String> MTUsedInList;
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
    static JButton NPTEditProBtn;
    static JButton NPTRemoveBtn;
    static JButton NPTSubmitBtn;
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
    static JList<String> NPTDedicateList;
    static JList<String> NPTMaterialsList;
    static JList<String> NPTProjectsList;
    private JScrollPane NPTDedicateScrollPane;
    private JScrollPane NPTMatScrollPane;
    private JScrollPane NPTNotesScrollPane;
    private JScrollPane NPTProjectsScrollPane;
    private JSeparator NPTSeparator1;
    static JTextArea NPTNotesArea;
    static JTextField NPTNameField;
    
    //Projects tab
    static JButton PTAutoChargeBtn;
    static JButton PTCloseBtn;
    static JButton PTManChargeBtn;
    static JButton PTReopenBtn;
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
    static JList<String> PTClosedProList;
    static JList<String> PTMaterialsList;
    static JList<String> PTOpenProList;
    private JScrollPane PTClosedScrollPane;
    private JScrollPane PTMatScrollPane;
    private JScrollPane PTOpenScrollPane;
    private JSeparator PTSeparator1;
    private JSeparator PTSeparator2;
    private JSeparator PTSeparator3;
    private JSeparator PTSeparator4;
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
    private JLabel RTMarginLabl;
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
          
}
