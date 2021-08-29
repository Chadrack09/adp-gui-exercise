package za.ac.cput.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import za.ac.cput.model.TModel;

/**
 *
 * @author    Chadrack B. Boudzoumou
 * @email     219383847@mycput.ac.za
 * @student   219383847
 * @uni       Cape Peninsula University Of Technology
 * @since     Aug 29, 2021 | 7:20:10 PM
 *
 */
public class MainApp extends JFrame implements ActionListener {
  
  private final JPanel panel_one = new JPanel();
  private final JPanel panel_two = new JPanel();
  private final JPanel panel_three = new JPanel();
  private final JLabel po_table_name = new JLabel("Table Name");
  private final JTextField po_tf = new JTextField("Test", 30);
  private final JButton pt_button = new JButton("Add Column");
  private final JButton pt_btn_ok = new JButton("Ok");
  private final JButton pt_btn_cancel = new JButton("Cancel");
  private final JLabel pt_label = new JLabel("sample");
  
  
  /* Table data */
  String[] tHEader = {"Column Name", "Data Type", "Size", "Primary Key", "Null"};
  String[][] tBody = {
    {"id", "INT", "", "PRIMARY KEY  ", "NOT NULL"},
    {"testname", "VARCHAR", "255", "", "NOT NULL"}
  };
  private final JTable po_table = new JTable(tBody, tHEader);
  
  public MainApp() {
    this.setSize(720, 480);
    this.setTitle("Main Frame");
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setLayout(new BorderLayout());
    this.setVisible(true);
    
    setting();
    addEvent();
  }
  
  public void setting() {
    
    panel_one.setBorder(new TitledBorder("Panel one"));
    panel_two.setBorder(new TitledBorder("Panel two"));
    panel_three.setBorder(new TitledBorder("Panel three"));
    
    this.add(panel_one, BorderLayout.NORTH);
    this.add(panel_two, BorderLayout.CENTER);
    this.add(panel_three, BorderLayout.SOUTH);
    
    panel_one.setLayout(new FlowLayout());
    panel_one.add(po_table_name);
    panel_one.add(po_tf);
    
    panel_two.setLayout(new GridLayout(1, 2));
    panel_two.add(new JScrollPane(po_table));
    

    panel_three.setLayout(new FlowLayout());
    panel_three.add(pt_btn_ok);
    panel_three.add(pt_btn_cancel);
    panel_three.add(pt_label);
    
    pt_label.setText(getAllTableData().get(0).getDataType());
  }
  
  public void addEvent() {
    pt_btn_ok.addActionListener(this);
    pt_btn_cancel.addActionListener(this);
  }
  
  public List<TModel> getAllTableData() {
    
    List<TModel> list = new ArrayList<>();
    for(int i = 0; i < po_table.getRowCount(); i++) {
//      for(int j = 0; j < po_table.getColumnCount(); j++) {
        TModel tm = new TModel();
//        String id = po_table.getModel().getValueAt(i, j).toString();
//        tm.setId(Integer.parseInt(id));
        tm.setDataType(po_table.getModel().getValueAt(i, i + 1).toString());
        tm.setSize(po_table.getModel().getValueAt(i, i + 2).toString());
        tm.setPrimaryKey(po_table.getModel().getValueAt(i, i + 3).toString());
        tm.setNulls(po_table.getModel().getValueAt(i, i + 4).toString());
        list.add(tm);
//      }
    }
    
    return list;
  }
  
  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == pt_btn_ok) {
      System.exit(0);
    }
    if(e.getSource() == pt_btn_cancel) {
      System.exit(0);
    }
  }
  
  public static void main(String[] args) {
    new MainApp();
  }
}
