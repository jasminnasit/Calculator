/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jasmin
 * 
 */
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculatorGUI extends javax.swing.JFrame {
    float glb=0;
    /**
     * Creates new form CalculatorGUI
     */
    public CalculatorGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        edit = new javax.swing.JTextField();
        BtnMc = new javax.swing.JButton();
        BtnMr = new javax.swing.JButton();
        BtnMplus = new javax.swing.JButton();
        Btn7 = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        Btn1 = new javax.swing.JButton();
        Btn0 = new javax.swing.JButton();
        Btn8 = new javax.swing.JButton();
        Btn5 = new javax.swing.JButton();
        Btn2 = new javax.swing.JButton();
        BtnDecimal = new javax.swing.JButton();
        BtnPorM = new javax.swing.JButton();
        Btn3 = new javax.swing.JButton();
        Btn6 = new javax.swing.JButton();
        Btn9 = new javax.swing.JButton();
        BtnDivision = new javax.swing.JButton();
        BtnSqrt = new javax.swing.JButton();
        BtnMultiply = new javax.swing.JButton();
        BtnMinus = new javax.swing.JButton();
        BtnPlus = new javax.swing.JButton();
        BtnPercentage = new javax.swing.JButton();
        BtnInverse = new javax.swing.JButton();
        BtnEqual = new javax.swing.JButton();
        BtnC = new javax.swing.JButton();
        BtnCe = new javax.swing.JButton();
        BtnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Calculator"));

        edit.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        BtnMc.setBackground(new java.awt.Color(0, 0, 0));
        BtnMc.setForeground(new java.awt.Color(255, 255, 255));
        BtnMc.setText("MC");
        BtnMc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMcActionPerformed(evt);
            }
        });

        BtnMr.setBackground(new java.awt.Color(0, 0, 0));
        BtnMr.setForeground(new java.awt.Color(255, 255, 255));
        BtnMr.setText("MR");
        BtnMr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMrActionPerformed(evt);
            }
        });

        BtnMplus.setBackground(new java.awt.Color(0, 0, 0));
        BtnMplus.setForeground(new java.awt.Color(255, 255, 255));
        BtnMplus.setText("M+");
        BtnMplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMplusActionPerformed(evt);
            }
        });

        Btn7.setBackground(new java.awt.Color(153, 153, 153));
        Btn7.setForeground(new java.awt.Color(255, 255, 255));
        Btn7.setText("7");
        Btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn7ActionPerformed(evt);
            }
        });

        Btn4.setBackground(new java.awt.Color(153, 153, 153));
        Btn4.setForeground(new java.awt.Color(255, 255, 255));
        Btn4.setText("4");
        Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4ActionPerformed(evt);
            }
        });

        Btn1.setBackground(new java.awt.Color(153, 153, 153));
        Btn1.setForeground(new java.awt.Color(255, 255, 255));
        Btn1.setText("1");
        Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1ActionPerformed(evt);
            }
        });

        Btn0.setBackground(new java.awt.Color(153, 153, 153));
        Btn0.setForeground(new java.awt.Color(240, 240, 240));
        Btn0.setText("0");
        Btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn0ActionPerformed(evt);
            }
        });

        Btn8.setBackground(new java.awt.Color(153, 153, 153));
        Btn8.setForeground(new java.awt.Color(255, 255, 255));
        Btn8.setText("8");
        Btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn8ActionPerformed(evt);
            }
        });

        Btn5.setBackground(new java.awt.Color(153, 153, 153));
        Btn5.setForeground(new java.awt.Color(255, 255, 255));
        Btn5.setText("5");
        Btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn5ActionPerformed(evt);
            }
        });

        Btn2.setBackground(new java.awt.Color(153, 153, 153));
        Btn2.setForeground(new java.awt.Color(255, 255, 255));
        Btn2.setText("2");
        Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2ActionPerformed(evt);
            }
        });

        BtnDecimal.setBackground(new java.awt.Color(153, 153, 153));
        BtnDecimal.setForeground(new java.awt.Color(255, 255, 255));
        BtnDecimal.setText(".");
        BtnDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDecimalActionPerformed(evt);
            }
        });

        BtnPorM.setBackground(new java.awt.Color(153, 153, 153));
        BtnPorM.setForeground(new java.awt.Color(255, 255, 255));
        BtnPorM.setText("+/-");
        BtnPorM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPorMActionPerformed(evt);
            }
        });

        Btn3.setBackground(new java.awt.Color(153, 153, 153));
        Btn3.setForeground(new java.awt.Color(255, 255, 255));
        Btn3.setText("3");
        Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn3ActionPerformed(evt);
            }
        });

        Btn6.setBackground(new java.awt.Color(153, 153, 153));
        Btn6.setForeground(new java.awt.Color(255, 255, 255));
        Btn6.setText("6");
        Btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn6ActionPerformed(evt);
            }
        });

        Btn9.setBackground(new java.awt.Color(153, 153, 153));
        Btn9.setForeground(new java.awt.Color(255, 255, 255));
        Btn9.setText("9");
        Btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn9ActionPerformed(evt);
            }
        });

        BtnDivision.setBackground(new java.awt.Color(0, 0, 0));
        BtnDivision.setForeground(new java.awt.Color(255, 255, 255));
        BtnDivision.setText("/");
        BtnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDivisionActionPerformed(evt);
            }
        });

        BtnSqrt.setBackground(new java.awt.Color(0, 0, 0));
        BtnSqrt.setForeground(new java.awt.Color(255, 255, 255));
        BtnSqrt.setText("Sqrt");
        BtnSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSqrtActionPerformed(evt);
            }
        });

        BtnMultiply.setBackground(new java.awt.Color(0, 0, 0));
        BtnMultiply.setForeground(new java.awt.Color(255, 255, 255));
        BtnMultiply.setText("*");
        BtnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMultiplyActionPerformed(evt);
            }
        });

        BtnMinus.setBackground(new java.awt.Color(0, 0, 0));
        BtnMinus.setForeground(new java.awt.Color(255, 255, 255));
        BtnMinus.setText("-");
        BtnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMinusActionPerformed(evt);
            }
        });

        BtnPlus.setBackground(new java.awt.Color(0, 0, 0));
        BtnPlus.setForeground(new java.awt.Color(255, 255, 255));
        BtnPlus.setText("+");
        BtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPlusActionPerformed(evt);
            }
        });

        BtnPercentage.setBackground(new java.awt.Color(0, 0, 0));
        BtnPercentage.setForeground(new java.awt.Color(255, 255, 255));
        BtnPercentage.setText("%");
        BtnPercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPercentageActionPerformed(evt);
            }
        });

        BtnInverse.setBackground(new java.awt.Color(0, 0, 0));
        BtnInverse.setForeground(new java.awt.Color(255, 255, 255));
        BtnInverse.setText("1/X");
        BtnInverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInverseActionPerformed(evt);
            }
        });

        BtnEqual.setBackground(new java.awt.Color(0, 0, 0));
        BtnEqual.setForeground(new java.awt.Color(255, 255, 255));
        BtnEqual.setText("=");
        BtnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEqualActionPerformed(evt);
            }
        });

        BtnC.setBackground(new java.awt.Color(255, 0, 0));
        BtnC.setText("C");
        BtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCActionPerformed(evt);
            }
        });

        BtnCe.setBackground(new java.awt.Color(0, 0, 0));
        BtnCe.setForeground(new java.awt.Color(255, 255, 255));
        BtnCe.setText("CE");
        BtnCe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCeActionPerformed(evt);
            }
        });

        BtnBack.setBackground(new java.awt.Color(102, 153, 255));
        BtnBack.setForeground(new java.awt.Color(255, 255, 255));
        BtnBack.setText("Backspc");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnC, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BtnMplus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnMr, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnMc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnCe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnPorM)))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnEqual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnSqrt))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnInverse, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCe, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnMc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnInverse, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnMr, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnMplus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPorM, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editActionPerformed

    private void BtnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMultiplyActionPerformed
        // TODO add your handling code here:
        String s=edit.getText();
        if(s.endsWith("+")||s.endsWith("-")||s.endsWith("*")||s.endsWith("/")||s.endsWith("%"))
        {
            s=s.substring(0,s.length()-1);
            s=s.concat("*");
        }
        else{
            s=s.concat("*");
        }
        edit.setText(s);
    }//GEN-LAST:event_BtnMultiplyActionPerformed

    private void BtnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMinusActionPerformed
        // TODO add your handling code here:
        String s=edit.getText();
        if(s.endsWith("+")||s.endsWith("-")||s.endsWith("*")||s.endsWith("/")||s.endsWith("%"))
        {
            s=s.substring(0,s.length()-1);
            s=s.concat("-");
        }
        else{
            s=s.concat("-");
        }
        edit.setText(s);
    }//GEN-LAST:event_BtnMinusActionPerformed

    private void BtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPlusActionPerformed
        // TODO add your handling code here:
        String s=edit.getText();
        if(s.endsWith("+")||s.endsWith("-")||s.endsWith("*")||s.endsWith("/")||s.endsWith("%"))
        {
            s=s.substring(0,s.length()-1);
            s=s.concat("+");
        }
        else{
            s=s.concat("+");
        }
        edit.setText(s);
    }//GEN-LAST:event_BtnPlusActionPerformed

    private void BtnPercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPercentageActionPerformed
        // TODO add your handling code here:
        String s=edit.getText();
        if(s.endsWith("+")||s.endsWith("-")||s.endsWith("*")||s.endsWith("/")||s.endsWith("%"))
        {
            s=s.substring(0,s.length()-1);
            s=s.concat("%");
        }
        else{
            s=s.concat("%");
        }
        edit.setText(s);
    }//GEN-LAST:event_BtnPercentageActionPerformed

    private void BtnInverseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInverseActionPerformed
        // TODO add your handling code here:
        String s=edit.getText();
        s="1/"+s;
        StringReader str=new StringReader(s);
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        try {
                Object result = engine.eval(str);
                 edit.setText(result.toString());
            } catch (ScriptException ex) {
                Logger.getLogger(CalculatorGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_BtnInverseActionPerformed

    private void BtnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEqualActionPerformed
        // TODO add your handling code here:
        
        String s=edit.getText();
        StringReader str=new StringReader(s);
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        try {
                Object result = engine.eval(str);
                 edit.setText(result.toString());
            } catch (ScriptException ex) {
                Logger.getLogger(CalculatorGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
       
        
    }//GEN-LAST:event_BtnEqualActionPerformed

    private void Btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn8ActionPerformed
        // TODO add your handling code here:
         String s=edit.getText();
        if(s.endsWith("0"))
        {
            edit.setText("8");
        }
        else{
            s=s.concat("8");
            edit.setText(s);
        }
    
    }//GEN-LAST:event_Btn8ActionPerformed

    private void BtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCActionPerformed
        // TODO add your handling code here:
        edit.setText("0");
    }//GEN-LAST:event_BtnCActionPerformed

    private void BtnSqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSqrtActionPerformed
        // TODO add your handling code here:
        double num=Float.parseFloat(edit.getText());
        num=Math.sqrt(num);
        edit.setText(String.valueOf(num));
        
    }//GEN-LAST:event_BtnSqrtActionPerformed

    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
        // TODO add your handling code here:
        String s=edit.getText();
        if(s.endsWith("0"))
        {
            edit.setText("4");
        }
        else{
            s=s.concat("4");
            edit.setText(s);
        }
    }//GEN-LAST:event_Btn4ActionPerformed

    private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1ActionPerformed
        // TODO add your handling code here:
         String s=edit.getText();
        if(s.endsWith("0"))
        {
            edit.setText("1");
        }
        else{
            s=s.concat("1");
            edit.setText(s);
        }
    
    }//GEN-LAST:event_Btn1ActionPerformed

    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed
        // TODO add your handling code here:
         String s=edit.getText();
        if(s.endsWith("0"))
        {
            edit.setText("2");
        }
        else{
            s=s.concat("2");
            edit.setText(s);
        }
    
    }//GEN-LAST:event_Btn2ActionPerformed

    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed
        // TODO add your handling code here:
         String s=edit.getText();
        if(s.endsWith("0"))
        {
            edit.setText("3");
        }
        else{
            s=s.concat("3");
            edit.setText(s);
        }
    
    }//GEN-LAST:event_Btn3ActionPerformed

    private void Btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn5ActionPerformed
        // TODO add your handling code here:
         String s=edit.getText();
        if(s.endsWith("0"))
        {
            edit.setText("5");
        }
        else{
            s=s.concat("5");
            edit.setText(s);
        }
    
    }//GEN-LAST:event_Btn5ActionPerformed

    private void Btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn6ActionPerformed
        // TODO add your handling code here:
         String s=edit.getText();
        if(s.endsWith("0"))
        {
            edit.setText("6");
        }
        else{
            s=s.concat("6");
            edit.setText(s);
        }
    
    }//GEN-LAST:event_Btn6ActionPerformed

    private void Btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn7ActionPerformed
        // TODO add your handling code here:
         String s=edit.getText();
        if(s.endsWith("0"))
        {
            edit.setText("7");
        }
        else{
            s=s.concat("7");
            edit.setText(s);
        }
    
    }//GEN-LAST:event_Btn7ActionPerformed

    private void Btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn9ActionPerformed
        // TODO add your handling code here:
         String s=edit.getText();
        if(s.endsWith("0"))
        {
            edit.setText("9");
        }
        else{
            s=s.concat("9");
            edit.setText(s);
        }
    
    }//GEN-LAST:event_Btn9ActionPerformed

    private void Btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn0ActionPerformed
        // TODO add your handling code here:
        String s=edit.getText();
        if(s.endsWith("0"))
        {
            edit.setText("0");
        }
        else{
            s=s.concat("0");
            edit.setText(s);
        }
    }//GEN-LAST:event_Btn0ActionPerformed

    private void BtnDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDecimalActionPerformed
        // TODO add your handling code here:
        String s=edit.getText();
        if(s.endsWith("+")||s.endsWith("-")||s.endsWith("*")||s.endsWith("/"))
        {
        }
        else{
            s=s.concat(".");
            edit.setText(s);
        }
    }//GEN-LAST:event_BtnDecimalActionPerformed

    private void BtnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDivisionActionPerformed
        // TODO add your handling code here:
        String s=edit.getText();
        if(s.endsWith("+")||s.endsWith("-")||s.endsWith("*")||s.endsWith("/")||s.endsWith("%"))
        {
            s=s.substring(0,s.length()-1);
            s=s.concat("/");
        }
        else{
            s=s.concat("/");
        }
        edit.setText(s);
    }//GEN-LAST:event_BtnDivisionActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        // TODO add your handling code here:
        String s=edit.getText();
        s=s.substring(0,s.length()-1);
        edit.setText(s);
    }//GEN-LAST:event_BtnBackActionPerformed

    private void BtnCeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCeActionPerformed
        // TODO add your handling code here:
        String s=edit.getText();
        int n=s.length();
        int k=0;
     for(int i=(n-1);i>=0;i--)
     {
         if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*'||s.charAt(i)=='/'||s.charAt(i)=='%')
         {
             k=i;
             break;
         }
     }
     s=s.substring(0,k+1);
     edit.setText(s);
        
    }//GEN-LAST:event_BtnCeActionPerformed

    private void BtnMplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMplusActionPerformed
        // TODO add your handling code here:
        float m=Float.parseFloat(edit.getText());
        glb=glb+m;
    }//GEN-LAST:event_BtnMplusActionPerformed

    private void BtnMrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMrActionPerformed
        // TODO add your handling code here:
        String s=edit.getText();
        if(s.endsWith("+")||s.endsWith("-")||s.endsWith("*")||s.endsWith("/")||s.endsWith("%"))
        {
            s=s.concat(String.valueOf(glb));
        }
        else
        {
            int n=s.length();
        int k=0;
        for(int i=(n-1);i>=0;i--)
        {
         if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*'||s.charAt(i)=='/'||s.charAt(i)=='%')
         {
             k=i;
             break;
         }
        }
        s=s.substring(0,k);
        s=s.concat(String.valueOf(glb));
            
        }
        edit.setText(s);
    }//GEN-LAST:event_BtnMrActionPerformed

    private void BtnMcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMcActionPerformed
        // TODO add your handling code here:
        glb=0;
    }//GEN-LAST:event_BtnMcActionPerformed

    private void BtnPorMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPorMActionPerformed
        // TODO add your handling code here:
        String s=edit.getText();
        int n=s.length();
        if(s.charAt(0)=='-'){
            s=s.substring(1,n);
            edit.setText(s);
        }
        else{
            s="-"+s;
            edit.setText(s);
        }
        
        
    }//GEN-LAST:event_BtnPorMActionPerformed

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
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn0;
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton Btn5;
    private javax.swing.JButton Btn6;
    private javax.swing.JButton Btn7;
    private javax.swing.JButton Btn8;
    private javax.swing.JButton Btn9;
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnC;
    private javax.swing.JButton BtnCe;
    private javax.swing.JButton BtnDecimal;
    private javax.swing.JButton BtnDivision;
    private javax.swing.JButton BtnEqual;
    private javax.swing.JButton BtnInverse;
    private javax.swing.JButton BtnMc;
    private javax.swing.JButton BtnMinus;
    private javax.swing.JButton BtnMplus;
    private javax.swing.JButton BtnMr;
    private javax.swing.JButton BtnMultiply;
    private javax.swing.JButton BtnPercentage;
    private javax.swing.JButton BtnPlus;
    private javax.swing.JButton BtnPorM;
    private javax.swing.JButton BtnSqrt;
    private javax.swing.JTextField edit;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
