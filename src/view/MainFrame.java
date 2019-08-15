package view;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import validadorcpf.ValidadorCPF;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Henrique
 */
public class MainFrame extends javax.swing.JFrame {

    String CPF9;
    public String CPF11;
    String RG;
    String CNPJ8;
    String CNPJ12;
    public String CNPJ14;
    ValidadorCPF validador = new ValidadorCPF();

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        setResizable(false);
        setTitle("Cálculo do Dígito Verificador RG SSP-SP/CPF/CNPJ");
    }

    public static String formatcnpj(String x) throws ParseException {
        MaskFormatter mask = new MaskFormatter("##.###.###/####-##");
        mask.setValueContainsLiteralCharacters(false);
        return mask.valueToString(x);
    }

    public static String formatcpf(String x) throws ParseException {
        MaskFormatter mask = new MaskFormatter("###.###.###-##");
        mask.setValueContainsLiteralCharacters(false);
        return mask.valueToString(x);
    }

    public static String formatrg7(String x) throws ParseException {
        MaskFormatter mask = new MaskFormatter("#.###.###-#");
        mask.setValueContainsLiteralCharacters(false);
        return mask.valueToString(x);
    }

    public static String formatrg8(String x) throws ParseException {
        MaskFormatter mask = new MaskFormatter("##.###.###-#");
        mask.setValueContainsLiteralCharacters(false);
        return mask.valueToString(x);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selecaorgcpf = new javax.swing.ButtonGroup();
        txt1 = new javax.swing.JTextField();
        lbl1 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        lbl2 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        btn3 = new javax.swing.JButton();
        btnsair = new javax.swing.JButton();
        radiorg = new javax.swing.JRadioButton();
        radiocpf = new javax.swing.JRadioButton();
        radiocnpj = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(440, 291));
        setPreferredSize(new java.awt.Dimension(500, 291));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                formComponentMoved(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 64, 173, -1));

        lbl1.setText("CPF com 9 Digitos (calcular 2 dígitos verificadores):");
        getContentPane().add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 43, -1, -1));

        btn1.setText("Consultar");
        btn1.setToolTipText("Consulta os 2 dígitos verificadores do CPF, insira apenas os 9 primeiros dígitos");
        btn1.setMaximumSize(new java.awt.Dimension(80, 23));
        btn1.setMinimumSize(new java.awt.Dimension(80, 23));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 63, -1, -1));

        btn2.setText("Validar");
        btn2.setToolTipText("Consulta se o CPFé válido, já com os 11 dígitos contando com os 2 dígitos verificadores");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 80, -1));

        lbl2.setText("CPF 11 Digitos (calcular se o CPF é válido ou descobrir CPF similares):");
        getContentPane().add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 173, -1));

        btn3.setText("Gerar CPFs Similares");
        btn3.setToolTipText("Se o CPF estiver com 1 número errado, calcula o CPF correto, informar o CPF errado com 11 dígitos");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 173, -1));

        btnsair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnsair.setText("Sair");
        btnsair.setToolTipText("Fechar o programa");
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });
        getContentPane().add(btnsair, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 80, -1));

        selecaorgcpf.add(radiorg);
        radiorg.setText("RG");
        radiorg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiorgActionPerformed(evt);
            }
        });
        getContentPane().add(radiorg, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        selecaorgcpf.add(radiocpf);
        radiocpf.setSelected(true);
        radiocpf.setText("CPF");
        radiocpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiocpfActionPerformed(evt);
            }
        });
        getContentPane().add(radiocpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 50, -1));

        selecaorgcpf.add(radiocnpj);
        radiocnpj.setText("CNPJ");
        radiocnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiocnpjActionPerformed(evt);
            }
        });
        getContentPane().add(radiocnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if (radiocpf.isSelected()) {
            CPF9 = txt1.getText().replace(".", "").replace(",", "").replace("-", "");
            System.out.println(CPF9);
            if (CPF9.length() != 9) {
                JOptionPane.showMessageDialog(null, "Valor Inserido do CPF Incorreto.");
                CPF9 = null;
            } else {
                calculadigitos();
                try {
                    JOptionPane.showMessageDialog(null, "Dígito: " + validador.v10 + "" + validador.v11 + "\n(" + formatcpf(CPF9 + "" + validador.v10 + "" + validador.v11) + ")");
                } catch (ParseException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else if (radiocnpj.isSelected()) {
            switch (txt1.getText().length()) {
                case 8:
                    CNPJ8 = txt1.getText().replace(".", "").replace(",", "").replace("-", "");
                    System.out.println(CNPJ8);
                    validador.y9 = 0;
                    validador.y10 = 0;
                    validador.y11 = 0;
                    validador.y12 = 1;
                    calculacnpj8();
                     {
                        try {
                            JOptionPane.showMessageDialog(null, "Dígito: " + validador.y13 + "" + validador.y14 + "\n(" + formatcnpj(CNPJ8 + "" + "0001" + "" + "" + validador.y13 + "" + validador.y14) + ")");
                        } catch (ParseException ex) {
                            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    break;

                case 12:
                    CNPJ12 = txt1.getText().replace(".", "").replace(",", "").replace("-", "");
                    System.out.println(CNPJ12);
                    calculacnpj12();
                    try {
                        JOptionPane.showMessageDialog(null, "Dígito: " + validador.y13 + "" + validador.y14 + "\n(" + formatcnpj(CNPJ12 + "" + validador.y13 + "" + validador.y14) + ")");
                    } catch (ParseException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Valor Inserido do CNPJ Incorreto.");
                    CNPJ8 = null;
                    CNPJ12 = null;
                    break;
            }
        } else {
            RG = txt1.getText().replace(".", "").replace(",", "").replace("-", "");
            System.out.println(RG);
            if (RG.length() > 8 || RG.length() < 7) {
                JOptionPane.showMessageDialog(null, "Valor Inserido do RG Incorreto.");
                CPF9 = null;
            } else {
                validador.carregavalorrg(RG);
                validador.digitorg();
                try {
                    switch (RG.length()) {
                        case 7:
                            JOptionPane.showMessageDialog(null, "Dígito: " + validador.x9 + "\n(" + formatrg7(RG + "" + validador.x9) + ")");
                            validador.copytoclipboard(RG + "" + validador.x9);
                            break;
                        case 8:
                            JOptionPane.showMessageDialog(null, "Dígito: " + validador.x9 + "\n(" + formatrg8(RG + "" + validador.x9) + ")");
                            validador.copytoclipboard(RG + "" + validador.x9);
                            break;
                        default:
                            break;
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }


    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed

        if (radiocpf.isSelected()) {
            CPF11 = txt2.getText().replace(".", "").replace(",", "").replace("-", "");

            if (CPF11.length() != 11) {
                JOptionPane.showMessageDialog(null, "Valor informado não possui 11 dígitos.");
                CPF11 = null;
            } else {
                if (validador.validadigitosbtn(CPF11) == true) {
                    JOptionPane.showMessageDialog(null, "Cpf Válido!");
                    validador.copytoclipboard(CPF11);
                } else {
                    JOptionPane.showMessageDialog(null, "Cpf Inválido");
                }
            }
        } else {
            CNPJ14 = txt2.getText().replace(".", "").replace(",", "").replace("-", "");

            if (CNPJ14.length() != 14) {
                JOptionPane.showMessageDialog(null, "Valor informado não possui 14 dígitos.");
                CNPJ14 = null;
            } else {
                if (validador.validadigitoscnpj12(CNPJ14) == true) {
                    JOptionPane.showMessageDialog(null, "CNPJ Válido!");
                    validador.copytoclipboard(CNPJ14);
                } else {
                    JOptionPane.showMessageDialog(null, "CNPJ Inválido");
                }
            }
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if (radiocpf.isSelected()) {
            CPF11 = txt2.getText().replace(".", "").replace(",", "").replace("-", "");
            validador.carregavalor(CPF11);
            //for(int i = 0; i <= 10; i++){
            //    System.out.println(validador.v[i]);}

            validador.gerarsimilares(CPF11);
            txt2.setText(validador.CPFbuffer);
        } else if (radiocnpj.isSelected()) {
            CNPJ14 = txt2.getText().replace(".", "").replace(",", "").replace("-", "");
            validador.carregavalorcnpj(CNPJ14);
            //for(int i = 0; i <= 10; i++){
            //    System.out.println(validador.v[i]);}

            validador.gerarsimilarescnpj(CNPJ14);
            txt2.setText(validador.CNPJbuffer);
        }
        //System.out.println("buffer="+validador.CPFbuffer);

    }//GEN-LAST:event_btn3ActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_btnsairActionPerformed

    private void radiorgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiorgActionPerformed
        txt2.setVisible(false);
        btn2.setVisible(false);
        btn3.setVisible(false);
        lbl2.setVisible(false);
        lbl1.setText("RG de SSP/SP 7 ou 8 dígitos:");
    }//GEN-LAST:event_radiorgActionPerformed

    private void radiocpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiocpfActionPerformed
        txt2.setVisible(true);
        btn2.setVisible(true);
        btn3.setVisible(true);
        lbl2.setVisible(true);
        lbl1.setText("CPF 9 Digitos:");
        lbl2.setText("CPF 11 Digitos (calcular se o CPF é válido ou descobrir CPF similares):");
    }//GEN-LAST:event_radiocpfActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void formComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentMoved

    private void radiocnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiocnpjActionPerformed
        txt2.setVisible(true);
        btn2.setVisible(true);
        btn3.setVisible(true);
        lbl2.setVisible(true);
        lbl1.setText("CNPJ 8 ou 12 Digitos:");
        lbl2.setText("CNPJ 14 Digitos (calcular se o CNPJ é válido ou descobrir CNPJ similares):");
    }//GEN-LAST:event_radiocnpjActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    public void calculadigitos() {
        validador.digito1(CPF9);
        validador.digito2();
        validador.copytoclipboard(CPF9 + "" + validador.v10 + "" + validador.v11);
    }

    public void calculacnpj8() {
        validador.digito1cnpj8(CNPJ8);
        validador.digito2cnpj8();
        validador.copytoclipboard(CNPJ8 + "" + "0001" + "" + validador.y13 + "" + validador.y14);
    }

    public void calculacnpj12() {
        validador.digito1cnpj12(CNPJ12);
        validador.digito2cnpj12();
        validador.copytoclipboard(CNPJ12 + "" + validador.y13 + "" + validador.y14);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btnsair;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JRadioButton radiocnpj;
    private javax.swing.JRadioButton radiocpf;
    private javax.swing.JRadioButton radiorg;
    private javax.swing.ButtonGroup selecaorgcpf;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    // End of variables declaration//GEN-END:variables

}