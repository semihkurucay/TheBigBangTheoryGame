/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package thebigbangtheorygame;

import javax.swing.ImageIcon;
import java.awt.Image;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author semih
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        this.setIconImage(new ImageIcon(getClass().getResource("/resources/images/icon.png")).getImage());
        
        initComponents();
        btnSetImage();
    }

    int sheldon = 0, you = 0;
    char sheldonSelectItem;
    char[] cards = {'C', 'S', 'P', 'L', 'H'};

    Image imgCut = new ImageIcon(getClass().getResource("/resources/Images/cut.png")).getImage();
    Image imgStone = new ImageIcon(getClass().getResource("/resources/Images/stone.png")).getImage();
    Image imgPaper = new ImageIcon(getClass().getResource("/resources/Images/paper.png")).getImage();
    Image imgLizard = new ImageIcon(getClass().getResource("/resources/Images/lizard.png")).getImage();
    Image imgHand = new ImageIcon(getClass().getResource("/resources/Images/hand.png")).getImage();

    private void btnSetImage() {
        btnCut.setIcon(new ImageIcon(imgCut.getScaledInstance(90, 90, Image.SCALE_SMOOTH)));
        btnHand.setIcon(new ImageIcon(imgHand.getScaledInstance(90, 90, Image.SCALE_SMOOTH)));
        btnLizard.setIcon(new ImageIcon(imgLizard.getScaledInstance(90, 90, Image.SCALE_SMOOTH)));
        btnPaper.setIcon(new ImageIcon(imgPaper.getScaledInstance(90, 90, Image.SCALE_SMOOTH)));
        btnStone.setIcon(new ImageIcon(imgStone.getScaledInstance(90, 90, Image.SCALE_SMOOTH)));
    }

    private void game(char selectItem) {
        Random rnd = new Random();
        sheldonSelectItem = cards[rnd.nextInt(cards.length)];
        sheldonOpenCardImage(sheldonSelectItem);

        if (isWin(selectItem) == 1) {
            lblYouScore.setText(++you + "");
            JOptionPane.showMessageDialog(this, "Tebrikler Dr. Sheldon'ı yendiniz", "Oyuncuya Duyrulur", JOptionPane.INFORMATION_MESSAGE);
        } else if (isWin(selectItem) == 2) {
            JOptionPane.showMessageDialog(this, "Tebrikler Dr. Sheldon ile berabere kaldınız", "Oyuncuya Duyrulur", JOptionPane.INFORMATION_MESSAGE);
        } else {
            lblSheldonScore.setText(++sheldon + "");
            JOptionPane.showMessageDialog(this, "Maalesef kaybettiniz, Dr. Sheldon kazandı her zamanki gibi", "Oyuncuya Duyrulur", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private int isWin(char selectItem) {
        switch (selectItem) {
            case 'C':
                if (sheldonSelectItem == 'P' || sheldonSelectItem == 'L') {
                    return 1;
                } else if (sheldonSelectItem == selectItem) {
                    return 2;
                }
                return 0;
            case 'S':
                if (sheldonSelectItem == 'L' || sheldonSelectItem == 'C') {
                    return 1;
                } else if (sheldonSelectItem == selectItem) {
                    return 2;
                }
                return 0;
            case 'P':
                if (sheldonSelectItem == 'S' || sheldonSelectItem == 'H') {
                    return 1;
                } else if (sheldonSelectItem == selectItem) {
                    return 2;
                }
                return 0;
            case 'L':
                if (sheldonSelectItem == 'H' || sheldonSelectItem == 'P') {
                    return 1;
                } else if (sheldonSelectItem == selectItem) {
                    return 2;
                }
                return 0;
            case 'H':
                if (sheldonSelectItem == 'C' || sheldonSelectItem == 'S') {
                    return 1;
                } else if (sheldonSelectItem == selectItem) {
                    return 2;
                }
                return 0;
            default:
                return 0;
        }
    }

    private void sheldonOpenCardImage(char card) {
        switch (card) {
            case 'C':
                lblSheldonImage.setIcon(new ImageIcon(imgCut.getScaledInstance(lblSheldonImage.getWidth(), lblSheldonImage.getHeight(), Image.SCALE_SMOOTH)));
                break;
            case 'S':
                lblSheldonImage.setIcon(new ImageIcon(imgStone.getScaledInstance(lblSheldonImage.getWidth(), lblSheldonImage.getHeight(), Image.SCALE_SMOOTH)));
                break;
            case 'P':
                lblSheldonImage.setIcon(new ImageIcon(imgPaper.getScaledInstance(lblSheldonImage.getWidth(), lblSheldonImage.getHeight(), Image.SCALE_SMOOTH)));
                break;
            case 'L':
                lblSheldonImage.setIcon(new ImageIcon(imgLizard.getScaledInstance(lblSheldonImage.getWidth(), lblSheldonImage.getHeight(), Image.SCALE_SMOOTH)));
                break;
            case 'H':
                lblSheldonImage.setIcon(new ImageIcon(imgHand.getScaledInstance(lblSheldonImage.getWidth(), lblSheldonImage.getHeight(), Image.SCALE_SMOOTH)));
                break;
            default:
                break;
        }
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
        lblSheldonImage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblSheldonScore = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnStone = new javax.swing.JButton();
        btnPaper = new javax.swing.JButton();
        btnCut = new javax.swing.JButton();
        btnLizard = new javax.swing.JButton();
        btnHand = new javax.swing.JButton();
        lblYouScore = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The Big BangTheory Game");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(203, 210, 164));

        lblSheldonImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setText("Dr. Sheldon :");

        lblSheldonScore.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        lblSheldonScore.setForeground(new java.awt.Color(233, 238, 217));
        lblSheldonScore.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSheldonScore.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(84, 84, 84)
                .addComponent(lblSheldonImage, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSheldonScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSheldonImage, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSheldonScore)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(233, 238, 217));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(0, 0, 0)));

        btnStone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStoneActionPerformed(evt);
            }
        });

        btnPaper.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPaper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaperActionPerformed(evt);
            }
        });

        btnCut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCutActionPerformed(evt);
            }
        });

        btnLizard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLizard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLizardActionPerformed(evt);
            }
        });

        btnHand.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHandActionPerformed(evt);
            }
        });

        lblYouScore.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        lblYouScore.setForeground(new java.awt.Color(203, 210, 164));
        lblYouScore.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblYouScore.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(btnStone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPaper, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCut, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLizard, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHand, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblYouScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblYouScore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPaper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLizard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(btnStone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStoneActionPerformed
        // TODO add your handling code here:
        game('S');
    }//GEN-LAST:event_btnStoneActionPerformed

    private void btnPaperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaperActionPerformed
        // TODO add your handling code here:
        game('P');
    }//GEN-LAST:event_btnPaperActionPerformed

    private void btnCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCutActionPerformed
        // TODO add your handling code here:
        game('C');
    }//GEN-LAST:event_btnCutActionPerformed

    private void btnLizardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLizardActionPerformed
        // TODO add your handling code here:
        game('L');
    }//GEN-LAST:event_btnLizardActionPerformed

    private void btnHandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHandActionPerformed
        // TODO add your handling code here:
        game('H');
    }//GEN-LAST:event_btnHandActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCut;
    private javax.swing.JButton btnHand;
    private javax.swing.JButton btnLizard;
    private javax.swing.JButton btnPaper;
    private javax.swing.JButton btnStone;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblSheldonImage;
    private javax.swing.JLabel lblSheldonScore;
    private javax.swing.JLabel lblYouScore;
    // End of variables declaration//GEN-END:variables
}
