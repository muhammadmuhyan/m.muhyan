/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BG
 */
public class kalkulator extends javax.swing.JFrame {
String angka;
    double jumlah, bil1, bil2;
    int pilih;

    /**
     * Creates new form aldiprasetyo
     */
    public kalkulator() {
        initComponents();
        angka = "";
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        tampilhasil = new javax.swing.JTextField();
        BTNCLEAR = new javax.swing.JButton();
        BTNBAGI = new javax.swing.JButton();
        BTNMOD = new javax.swing.JButton();
        TUJUH = new javax.swing.JButton();
        DELAPAN = new javax.swing.JButton();
        SEMBILAN = new javax.swing.JButton();
        BTNKALI = new javax.swing.JButton();
        EMPAT = new javax.swing.JButton();
        LIMA = new javax.swing.JButton();
        ENAM = new javax.swing.JButton();
        BTNKURANG = new javax.swing.JButton();
        SATU = new javax.swing.JButton();
        DUA = new javax.swing.JButton();
        TIGA = new javax.swing.JButton();
        BTNTAMBAH = new javax.swing.JButton();
        NOL = new javax.swing.JButton();
        BTNEQL = new javax.swing.JButton();
        DECIMAL = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        jButton15.setText("jButton15");
        getContentPane().add(jButton15);
        jButton15.setBounds(294, 11, 73, 0);
        getContentPane().add(tampilhasil);
        tampilhasil.setBounds(10, 11, 278, 72);

        BTNCLEAR.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BTNCLEAR.setText("C");
        BTNCLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCLEARActionPerformed(evt);
            }
        });
        getContentPane().add(BTNCLEAR);
        BTNCLEAR.setBounds(10, 94, 134, 59);

        BTNBAGI.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BTNBAGI.setText("/");
        BTNBAGI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBAGIActionPerformed(evt);
            }
        });
        getContentPane().add(BTNBAGI);
        BTNBAGI.setBounds(226, 94, 62, 59);

        BTNMOD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BTNMOD.setText("%");
        BTNMOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNMODActionPerformed(evt);
            }
        });
        getContentPane().add(BTNMOD);
        BTNMOD.setBounds(154, 94, 62, 59);

        TUJUH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TUJUH.setText("7");
        TUJUH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TUJUHActionPerformed(evt);
            }
        });
        getContentPane().add(TUJUH);
        TUJUH.setBounds(10, 159, 62, 59);

        DELAPAN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DELAPAN.setText("8");
        DELAPAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELAPANActionPerformed(evt);
            }
        });
        getContentPane().add(DELAPAN);
        DELAPAN.setBounds(82, 159, 62, 59);

        SEMBILAN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SEMBILAN.setText("9");
        SEMBILAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEMBILANActionPerformed(evt);
            }
        });
        getContentPane().add(SEMBILAN);
        SEMBILAN.setBounds(154, 159, 62, 59);

        BTNKALI.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BTNKALI.setText("X");
        BTNKALI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNKALIActionPerformed(evt);
            }
        });
        getContentPane().add(BTNKALI);
        BTNKALI.setBounds(226, 159, 62, 59);

        EMPAT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        EMPAT.setText("4");
        EMPAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EMPATActionPerformed(evt);
            }
        });
        getContentPane().add(EMPAT);
        EMPAT.setBounds(10, 224, 62, 59);

        LIMA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LIMA.setText("5");
        LIMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIMAActionPerformed(evt);
            }
        });
        getContentPane().add(LIMA);
        LIMA.setBounds(82, 224, 62, 59);

        ENAM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ENAM.setText("6");
        ENAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENAMActionPerformed(evt);
            }
        });
        getContentPane().add(ENAM);
        ENAM.setBounds(154, 224, 62, 59);

        BTNKURANG.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BTNKURANG.setText("-");
        BTNKURANG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNKURANGActionPerformed(evt);
            }
        });
        getContentPane().add(BTNKURANG);
        BTNKURANG.setBounds(226, 224, 62, 59);

        SATU.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SATU.setText("1");
        SATU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SATUActionPerformed(evt);
            }
        });
        getContentPane().add(SATU);
        SATU.setBounds(10, 289, 62, 59);

        DUA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DUA.setText("2");
        DUA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DUAActionPerformed(evt);
            }
        });
        getContentPane().add(DUA);
        DUA.setBounds(82, 289, 62, 59);

        TIGA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TIGA.setText("3");
        TIGA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIGAActionPerformed(evt);
            }
        });
        getContentPane().add(TIGA);
        TIGA.setBounds(154, 289, 62, 59);

        BTNTAMBAH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BTNTAMBAH.setText("+");
        BTNTAMBAH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNTAMBAHActionPerformed(evt);
            }
        });
        getContentPane().add(BTNTAMBAH);
        BTNTAMBAH.setBounds(226, 289, 62, 59);

        NOL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NOL.setText("0");
        NOL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOLActionPerformed(evt);
            }
        });
        getContentPane().add(NOL);
        NOL.setBounds(10, 354, 135, 59);

        BTNEQL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BTNEQL.setText("=");
        BTNEQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEQLActionPerformed(evt);
            }
        });
        getContentPane().add(BTNEQL);
        BTNEQL.setBounds(226, 354, 62, 59);

        DECIMAL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DECIMAL.setText(",");
        DECIMAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DECIMALActionPerformed(evt);
            }
        });
        getContentPane().add(DECIMAL);
        DECIMAL.setBounds(155, 354, 62, 59);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EMPATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EMPATActionPerformed
        angka +="4";
        tampilhasil.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_EMPATActionPerformed

    private void SEMBILANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEMBILANActionPerformed
        angka +="9";
        tampilhasil.setText(angka);         // TODO add your handling code here:
    }//GEN-LAST:event_SEMBILANActionPerformed

    private void NOLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOLActionPerformed
        angka +="0";
        tampilhasil.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_NOLActionPerformed

    private void SATUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SATUActionPerformed
        angka +="1";
        tampilhasil.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_SATUActionPerformed

    private void DUAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DUAActionPerformed
        angka +="2";
        tampilhasil.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_DUAActionPerformed

    private void TIGAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIGAActionPerformed
        angka +="3";
        tampilhasil.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_TIGAActionPerformed

    private void LIMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMAActionPerformed
        angka +="5";
        tampilhasil.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_LIMAActionPerformed

    private void ENAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENAMActionPerformed
        angka +="6";
        tampilhasil.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_ENAMActionPerformed

    private void TUJUHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TUJUHActionPerformed
        angka +="7";
        tampilhasil.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_TUJUHActionPerformed

    private void DELAPANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELAPANActionPerformed
        angka +="8";
        tampilhasil.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_DELAPANActionPerformed

    private void DECIMALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DECIMALActionPerformed
        angka +=",";
        tampilhasil.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_DECIMALActionPerformed

    private void BTNTAMBAHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNTAMBAHActionPerformed
        bil1 = Double.parseDouble(angka);
        tampilhasil.setText("+");
        angka = "";
        pilih=1;        // TODO add your handling code here:
    }//GEN-LAST:event_BTNTAMBAHActionPerformed

    private void BTNKURANGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNKURANGActionPerformed
        bil1 = Double.parseDouble(angka);
        tampilhasil.setText("-");
        angka = "";
        pilih=2;          // TODO add your handling code here:
    }//GEN-LAST:event_BTNKURANGActionPerformed

    private void BTNKALIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNKALIActionPerformed
        bil1 = Double.parseDouble(angka);
        tampilhasil.setText("*");
        angka = "";
        pilih=3;          // TODO add your handling code here:
    }//GEN-LAST:event_BTNKALIActionPerformed

    private void BTNBAGIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBAGIActionPerformed
        bil1 = Double.parseDouble(angka);
        tampilhasil.setText("/");
        angka = "";
        pilih=4;          // TODO add your handling code here:
    }//GEN-LAST:event_BTNBAGIActionPerformed

    private void BTNMODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNMODActionPerformed
        bil1 = Double.parseDouble(angka);
        tampilhasil.setText("%");
        angka = "";
        pilih=5;          // TODO add your handling code here:
    }//GEN-LAST:event_BTNMODActionPerformed

    private void BTNEQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEQLActionPerformed
            switch (pilih){
            case 1:
                bil2 = Double.parseDouble(angka);
                jumlah = bil1+bil2;
                angka = Double.toString(jumlah);
                tampilhasil.setText(angka);
                break;
            case 2:
                bil2 = Double.parseDouble(angka);
                jumlah = bil1-bil2;
                angka = Double.toString(jumlah);
                tampilhasil.setText(angka);
                break;
            case 3:
                bil2 = Double.parseDouble(angka);
                jumlah = bil1*bil2;
                angka = Double.toString(jumlah);
                tampilhasil.setText(angka);
                break;
            case 4:
                bil2 = Double.parseDouble(angka);
                jumlah = bil1/bil2;
                angka = Double.toString(jumlah);
                tampilhasil.setText(angka);
                break;
            case 5:
                bil2 = Double.parseDouble(angka);
                jumlah = bil1%bil2;
                angka = Double.toString(jumlah);
                tampilhasil.setText(angka);
                break;
            default:
                break;        // TODO add your handling code here:
    }//GEN-LAST:event_BTNEQLActionPerformed

    private void BTNCLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCLEARActionPerformed
        tampilhasil.setText(angka);
        bil1 = 0.0;
        bil2 = 0.0;
        jumlah = 0.0;
        angka = "";     // TODO add your handling code here:
    }//GEN-LAST:event_BTNCLEARActionPerformed

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
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNBAGI;
    private javax.swing.JButton BTNCLEAR;
    private javax.swing.JButton BTNEQL;
    private javax.swing.JButton BTNKALI;
    private javax.swing.JButton BTNKURANG;
    private javax.swing.JButton BTNMOD;
    private javax.swing.JButton BTNTAMBAH;
    private javax.swing.JButton DECIMAL;
    private javax.swing.JButton DELAPAN;
    private javax.swing.JButton DUA;
    private javax.swing.JButton EMPAT;
    private javax.swing.JButton ENAM;
    private javax.swing.JButton LIMA;
    private javax.swing.JButton NOL;
    private javax.swing.JButton SATU;
    private javax.swing.JButton SEMBILAN;
    private javax.swing.JButton TIGA;
    private javax.swing.JButton TUJUH;
    private javax.swing.JButton jButton15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tampilhasil;
    // End of variables declaration//GEN-END:variables
}
