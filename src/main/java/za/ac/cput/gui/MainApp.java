package za.ac.cput.gui;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author    Chadrack B. Boudzoumou
 * @email     219383847@mycput.ac.za
 * @student   219383847
 * @uni       Cape Peninsula University Of Technology
 * @since     Aug 29, 2021 | 7:20:10 PM
 *
 */
public class MainApp extends JFrame {
  
  private final JPanel panel_one = new JPanel();
  private final JPanel panel_two = new JPanel();
  private final JPanel panel_three = new JPanel();
  
  public MainApp() {
    this.setSize(720, 480);
    this.setTitle("Main Frame");
    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setLayout(new BorderLayout());
    
    setting();
  }
  
  public void setting() {
    
    panel_one.setBorder(new TitledBorder("Panel one"));
    panel_two.setBorder(new TitledBorder("Panel two"));
    panel_three.setBorder(new TitledBorder("Panel three"));
    
    this.add(panel_one, BorderLayout.NORTH);
    this.add(panel_two, BorderLayout.CENTER);
    this.add(panel_three, BorderLayout.SOUTH);
    
  }
  
  public static void main(String[] args) {
    new MainApp();
  }
}
