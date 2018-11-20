import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.*;

public class GUI extends JFrame {

    public GUI() {
    	newMaterialTab();
    	projectsTab();
    }
            
    private void projectsTab(){

        plusBtn = new JButton();
        minusBtn = new JButton();
    	
    	
    }
    
    private void newMaterialTab() {

        newMatPane 	 = new JTabbedPane();
        jPanel1 	 = new JPanel();
        jPanel2 	 = new JPanel();
        nameLabel 	 = new JLabel();
        qtyLabel     = new JLabel();
        costLabel    = new JLabel();
        extCostLabel = new JLabel();
        notesLabel   = new JLabel();
        jScrollPane1 = new JScrollPane();
        notesArea 	 = new JTextArea();
        nameField 	 = new JTextField();
        qtyField 	 = new JTextField();
        costField 	 = new JTextField();
        extCostField = new JTextField();
        submitMatBtn = new JButton();

        nameLabel.setText("Name:");
        qtyLabel.setText("Qty:");
        costLabel.setText("Cost:");
        extCostLabel.setText("Ext. Cost:");
        notesLabel.setText("Notes:");

        notesArea.setColumns(20);
        notesArea.setRows(5);
        jScrollPane1.setViewportView(notesArea);

        submitMatBtn.setText("Submit");
        submitMatBtn.addActionListener(new Action());

        extCostField.setEditable(false);
        
        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(nameLabel)
                                    .addGap(46, 46, 46))
                                .addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(qtyLabel)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(costLabel)
                                .addGap(51, 51, 51))
                            .addComponent(extCostLabel))
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(nameField, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(qtyField)
                            .addComponent(costField)
                            .addComponent(extCostField))
                        .addGap(18, 18, 18)
                        .addComponent(notesLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(submitMatBtn, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(notesLabel)
                                .addComponent(nameLabel))
                            .addComponent(nameField, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(qtyLabel)
                            .addComponent(qtyField, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(costLabel)
                            .addComponent(costField, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(extCostLabel)
                            .addComponent(extCostField, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(submitMatBtn, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        newMatPane.addTab("New Material", jPanel1);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(newMatPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(newMatPane, GroupLayout.Alignment.TRAILING)
        );

        pack();
    }                    
    
    //Materials Tab elements
    private JLabel nameLabel;
    private JLabel qtyLabel;
    private JLabel costLabel;
    private JLabel extCostLabel;
    private JLabel notesLabel;
    private JPanel jPanel1;
    private JPanel jPanel2;
    
    static JTextArea notesArea;
    static JTextField nameField;
    static JTextField qtyField;
    static JTextField costField;
    static JTextField extCostField;
    
    static JButton submitMatBtn;
    
    private JScrollPane jScrollPane1;
    
    private JTabbedPane newMatPane;


    //Projects Tab elements
    static JButton plusBtn;
    static JButton minusBtn;
}
