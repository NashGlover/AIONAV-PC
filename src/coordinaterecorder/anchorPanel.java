/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coordinaterecorder;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


/**
 *
 * @author Administrator
 */
public class anchorPanel extends JPanel {
    
    private JButton setButton;
    private JButton hereButton;
    private JTextField xText;
    private JTextField yText;
    private JTextField zText;
    
    public anchorPanel() {
        super();
        initComponents();
    }
    
    private void initComponents() {
        
        System.out.println("In initComponents");
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));
        setButton = new JButton();
        hereButton = new JButton();
        xText = new JTextField();
        yText = new JTextField();
        zText = new JTextField();
        
        setButton.setText("Set");
        hereButton.setText("Here");
        xText.setText("x");
        yText.setText("y");
        zText.setText("z");
        
        add(xText);
        add(yText);
        add(zText);
    }
    
}
