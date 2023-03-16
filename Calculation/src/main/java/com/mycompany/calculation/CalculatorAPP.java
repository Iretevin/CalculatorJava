
package com.mycompany.calculation;


public class CalculatorAPP extends javax.swing.JFrame {
    double FirstNumber;
    double SecondNumber;
    double Result;
    String operations;
    
    public CalculatorAPP() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDisplay = new javax.swing.JTextField();
        Jbtn1 = new javax.swing.JButton();
        Jbtn2 = new javax.swing.JButton();
        Jbtn3 = new javax.swing.JButton();
        Jbtn4 = new javax.swing.JButton();
        Jbtn5 = new javax.swing.JButton();
        Jbtn6 = new javax.swing.JButton();
        Jbtn7 = new javax.swing.JButton();
        Jbtn8 = new javax.swing.JButton();
        Jbtn9 = new javax.swing.JButton();
        Jbtn10 = new javax.swing.JButton();
        Jbtn11 = new javax.swing.JButton();
        Jbtn12 = new javax.swing.JButton();
        Jbtn13 = new javax.swing.JButton();
        Jbtn14 = new javax.swing.JButton();
        Jbtn15 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Jbtn16 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtDisplay.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        Jbtn1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Jbtn1.setText("1");
        Jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn1ActionPerformed(evt);
            }
        });

        Jbtn2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Jbtn2.setText("2");
        Jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn2ActionPerformed(evt);
            }
        });

        Jbtn3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Jbtn3.setText("3");
        Jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn3ActionPerformed(evt);
            }
        });

        Jbtn4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Jbtn4.setText("4");
        Jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn4ActionPerformed(evt);
            }
        });

        Jbtn5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Jbtn5.setText("5");
        Jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn5ActionPerformed(evt);
            }
        });

        Jbtn6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Jbtn6.setText("6");
        Jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn6ActionPerformed(evt);
            }
        });

        Jbtn7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Jbtn7.setText("7");
        Jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn7ActionPerformed(evt);
            }
        });

        Jbtn8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Jbtn8.setText("8");
        Jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn8ActionPerformed(evt);
            }
        });

        Jbtn9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Jbtn9.setText("9");
        Jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn9ActionPerformed(evt);
            }
        });

        Jbtn10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Jbtn10.setText("0");
        Jbtn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn10ActionPerformed(evt);
            }
        });

        Jbtn11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Jbtn11.setText("+");
        Jbtn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn11ActionPerformed(evt);
            }
        });

        Jbtn12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Jbtn12.setText("-");
        Jbtn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn12ActionPerformed(evt);
            }
        });

        Jbtn13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Jbtn13.setText("*");
        Jbtn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn13ActionPerformed(evt);
            }
        });

        Jbtn14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Jbtn14.setText("/");
        Jbtn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn14ActionPerformed(evt);
            }
        });

        Jbtn15.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        Jbtn15.setText("+/-");
        Jbtn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn15ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("c");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setText("=");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Jbtn16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Jbtn16.setText(".");
        Jbtn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn16ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SIMPLE  CALCULATOR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(Jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jbtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Jbtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jbtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Jbtn13, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jbtn14, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Jbtn15, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jbtn16, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jbtn15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Jbtn13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Jbtn14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Jbtn16, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn1ActionPerformed
        String EnterNumber = txtDisplay.getText()+Jbtn1.getText();
        txtDisplay.setText( EnterNumber);
    }//GEN-LAST:event_Jbtn1ActionPerformed

    private void Jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn2ActionPerformed
          String EnterNumber = txtDisplay.getText()+Jbtn2.getText();
        txtDisplay.setText( EnterNumber);
    }//GEN-LAST:event_Jbtn2ActionPerformed

    private void Jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn3ActionPerformed
         String EnterNumber = txtDisplay.getText()+Jbtn3.getText();
        txtDisplay.setText( EnterNumber);
    }//GEN-LAST:event_Jbtn3ActionPerformed

    private void Jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn4ActionPerformed
          String EnterNumber = txtDisplay.getText()+Jbtn4.getText();
        txtDisplay.setText( EnterNumber);
    }//GEN-LAST:event_Jbtn4ActionPerformed

    private void Jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn5ActionPerformed
          String EnterNumber = txtDisplay.getText()+Jbtn5.getText();
        txtDisplay.setText( EnterNumber);
    }//GEN-LAST:event_Jbtn5ActionPerformed

    private void Jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn6ActionPerformed
          String EnterNumber = txtDisplay.getText()+Jbtn6.getText();
        txtDisplay.setText( EnterNumber);
    }//GEN-LAST:event_Jbtn6ActionPerformed

    private void Jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn7ActionPerformed
          String EnterNumber = txtDisplay.getText()+Jbtn7.getText();
        txtDisplay.setText( EnterNumber);
    }//GEN-LAST:event_Jbtn7ActionPerformed

    private void Jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn8ActionPerformed
          String EnterNumber = txtDisplay.getText()+Jbtn8.getText();
        txtDisplay.setText( EnterNumber);
    }//GEN-LAST:event_Jbtn8ActionPerformed

    private void Jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn9ActionPerformed
          String EnterNumber = txtDisplay.getText()+Jbtn9.getText();
        txtDisplay.setText( EnterNumber);
    }//GEN-LAST:event_Jbtn9ActionPerformed

    private void Jbtn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn10ActionPerformed
          String EnterNumber = txtDisplay.getText()+Jbtn10.getText();
        txtDisplay.setText( EnterNumber);
    }//GEN-LAST:event_Jbtn10ActionPerformed

    private void Jbtn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn11ActionPerformed
        FirstNumber = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operations = "+";
    }//GEN-LAST:event_Jbtn11ActionPerformed

    private void Jbtn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn12ActionPerformed
          FirstNumber = Double.parseDouble(txtDisplay.getText());
          txtDisplay.setText("");
          operations = "-";
    }//GEN-LAST:event_Jbtn12ActionPerformed

    private void Jbtn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn13ActionPerformed
        FirstNumber = Double.parseDouble(txtDisplay.getText());
          txtDisplay.setText("");
          operations = "*";
    }//GEN-LAST:event_Jbtn13ActionPerformed

    private void Jbtn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn14ActionPerformed
        FirstNumber = Double.parseDouble(txtDisplay.getText());
          txtDisplay.setText("");
          operations = "/";
    }//GEN-LAST:event_Jbtn14ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       FirstNumber = Double.parseDouble(txtDisplay.getText());
          txtDisplay.setText("");
          operations = "c";
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String answer;
        SecondNumber = Double.parseDouble(txtDisplay.getText());
        
        if (operations == "+")
        {
            Result = FirstNumber+SecondNumber;
            answer = String.format("%.0f", Result);
            txtDisplay.setText(answer);
            
        }
        else if(operations == "-")
        {
            Result = FirstNumber-SecondNumber;
            answer = String.format("%.0f", Result);
            txtDisplay.setText(answer);
            
        }
        else if(operations == "*")
        {
            Result = FirstNumber*SecondNumber;
            answer = String.format("%.0f", Result);
            txtDisplay.setText(answer);
            
        }
        else if(operations == "/")
        {
            Result = FirstNumber/SecondNumber;
            answer = String.format("%.0f", Result);
            txtDisplay.setText(answer);
            
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Jbtn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn16ActionPerformed
        String EnterNumber = txtDisplay.getText()+Jbtn16.getText();
        txtDisplay.setText( EnterNumber);
    }//GEN-LAST:event_Jbtn16ActionPerformed

    private void Jbtn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn15ActionPerformed
        double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
        ops  = ops * (-1);
        txtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_Jbtn15ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
  
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
            java.util.logging.Logger.getLogger(CalculatorAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorAPP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbtn1;
    private javax.swing.JButton Jbtn10;
    private javax.swing.JButton Jbtn11;
    private javax.swing.JButton Jbtn12;
    private javax.swing.JButton Jbtn13;
    private javax.swing.JButton Jbtn14;
    private javax.swing.JButton Jbtn15;
    private javax.swing.JButton Jbtn16;
    private javax.swing.JButton Jbtn2;
    private javax.swing.JButton Jbtn3;
    private javax.swing.JButton Jbtn4;
    private javax.swing.JButton Jbtn5;
    private javax.swing.JButton Jbtn6;
    private javax.swing.JButton Jbtn7;
    private javax.swing.JButton Jbtn8;
    private javax.swing.JButton Jbtn9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtDisplay;
    // End of variables declaration//GEN-END:variables
}
