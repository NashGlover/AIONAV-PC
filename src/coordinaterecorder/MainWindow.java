package coordinaterecorder;
import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class MainWindow extends javax.swing.JFrame {
    
    CoordinateRecorder recorder;
            
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        headingLabel.setVisible(false);
        headingXPos.setVisible(false);
        headingXNeg.setVisible(false);
        headingYPos.setVisible(false);
        headingYNeg.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        anchorX = new javax.swing.JTextField();
        anchorY = new javax.swing.JTextField();
        addAnchorButton = new javax.swing.JButton();
        headingLabel = new javax.swing.JLabel();
        headingXPos = new javax.swing.JButton();
        headingXNeg = new javax.swing.JButton();
        headingYPos = new javax.swing.JButton();
        headingYNeg = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        distanceLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        startButton = new javax.swing.JButton();
        headingButton = new javax.swing.JButton();
        markButton = new javax.swing.JButton();
        endButton = new javax.swing.JButton();
        toFileButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AIONAV Coordinate Recorder");
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        jLabel2.setText("Anchor Points");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        anchorX.setText("x");
        anchorX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anchorXActionPerformed(evt);
            }
        });
        jPanel6.add(anchorX);

        anchorY.setText("y");
        anchorY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anchorYActionPerformed(evt);
            }
        });
        jPanel6.add(anchorY);

        addAnchorButton.setText("Anchor A");
        addAnchorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAnchorButtonActionPerformed(evt);
            }
        });

        headingLabel.setText("Heading");

        headingXPos.setText("X+");

        headingXNeg.setText("X-");

        headingYPos.setText("Y+");

        headingYNeg.setText("Y-");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 139, Short.MAX_VALUE))
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addAnchorButton))
                    .addComponent(headingLabel)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(headingXPos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(headingXNeg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(headingYPos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(headingYNeg)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addAnchorButton))
                .addGap(18, 18, 18)
                .addComponent(headingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(headingXPos)
                    .addComponent(headingXNeg)
                    .addComponent(headingYPos)
                    .addComponent(headingYNeg))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2);

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setText("Distance from start to end: ");
        jPanel3.add(jLabel1);
        jPanel3.add(distanceLabel);

        getContentPane().add(jPanel3);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        jPanel1.add(startButton);

        headingButton.setText("Heading");
        headingButton.setEnabled(false);
        headingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                headingButtonActionPerformed(evt);
            }
        });
        jPanel1.add(headingButton);

        markButton.setText("Mark");
        markButton.setEnabled(false);
        markButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markButtonActionPerformed(evt);
            }
        });
        jPanel1.add(markButton);

        endButton.setText("End");
        endButton.setEnabled(false);
        endButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endButtonActionPerformed(evt);
            }
        });
        jPanel1.add(endButton);

        toFileButton.setText("Save To File...");
        toFileButton.setEnabled(false);
        toFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toFileButtonActionPerformed(evt);
            }
        });
        jPanel1.add(toFileButton);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        System.out.println("Start button clicked!");
        recorder = new CoordinateRecorder(textArea, distanceLabel);
        recorder.start();
        markButton.setEnabled(true);
        headingButton.setEnabled(true);
        endButton.setEnabled(true);
        startButton.setEnabled(false);
        System.out.println("test");
    }//GEN-LAST:event_startButtonActionPerformed

    private void toFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toFileButtonActionPerformed
        String fileName = "logs/foot/log_" + System.currentTimeMillis() + ".txt";
        try {
            PrintWriter fw = new PrintWriter (new BufferedWriter (new FileWriter(fileName)));
            fw.write(textArea.getText());
            fw.flush();
            fw.close();
            System.out.println("Saved file");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_toFileButtonActionPerformed

    private void endButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endButtonActionPerformed
        recorder.running = false;
        String fullText = textArea.getText();
        System.out.println(fullText);
        toFileButton.setEnabled(true);
        endButton.setEnabled(false);
        startButton.setEnabled(true);
    }//GEN-LAST:event_endButtonActionPerformed

    private void markButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markButtonActionPerformed
        // TODO add your handling code here: 
        //String mark = String.format("MARK%n");
        //textArea.append(mark);
        recorder.mark = true;
        System.out.println("test");
        recorder.getSegInfo();
    }//GEN-LAST:event_markButtonActionPerformed

    private void addAnchorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAnchorButtonActionPerformed
        recorder.setAnchor(Double.parseDouble(anchorX.getText()), Double.parseDouble(anchorY.getText()));
        
    }//GEN-LAST:event_addAnchorButtonActionPerformed

    private void anchorXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anchorXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anchorXActionPerformed

    private void anchorYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anchorYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anchorYActionPerformed

    private void headingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_headingButtonActionPerformed
        headingLabel.setVisible(true);
        headingXPos.setVisible(true);
        headingXNeg.setVisible(true);
        headingYPos.setVisible(true);
        headingYNeg.setVisible(true);
    }//GEN-LAST:event_headingButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAnchorButton;
    private javax.swing.JTextField anchorX;
    private javax.swing.JTextField anchorY;
    private javax.swing.JLabel distanceLabel;
    private javax.swing.JButton endButton;
    private javax.swing.JButton headingButton;
    private javax.swing.JLabel headingLabel;
    private javax.swing.JButton headingXNeg;
    private javax.swing.JButton headingXPos;
    private javax.swing.JButton headingYNeg;
    private javax.swing.JButton headingYPos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton markButton;
    private javax.swing.JButton startButton;
    private javax.swing.JTextArea textArea;
    private javax.swing.JButton toFileButton;
    // End of variables declaration//GEN-END:variables
}
