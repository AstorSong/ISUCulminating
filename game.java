
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wewan5525
 */
public class game extends javax.swing.JFrame {

    /**
     * Creates new form game
     */
    public game() {
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

        p1 = new javax.swing.JPanel();
        welcomeL = new javax.swing.JLabel();
        startTheGameB = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        M1 = new javax.swing.JMenu();
        intro = new javax.swing.JCheckBoxMenuItem();
        stuff = new javax.swing.JMenuItem();
        concluding = new javax.swing.JMenuItem();
        end1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        end2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeL.setBackground(new java.awt.Color(204, 255, 255));
        welcomeL.setFont(new java.awt.Font("Three Arrows", 2, 18)); // NOI18N
        welcomeL.setForeground(new java.awt.Color(255, 102, 102));
        welcomeL.setText("Wellcome to the Hightest");

        startTheGameB.setBackground(new java.awt.Color(255, 153, 51));
        startTheGameB.setFont(new java.awt.Font("Tunga", 1, 18)); // NOI18N
        startTheGameB.setText("Start Game");
        startTheGameB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startTheGameBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(welcomeL, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(startTheGameB, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(383, Short.MAX_VALUE))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap(211, Short.MAX_VALUE)
                .addComponent(welcomeL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(startTheGameB)
                .addGap(184, 184, 184))
        );

        M1.setText("Menue");
        M1.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                M1MenuSelected(evt);
            }
        });

        intro.setSelected(true);
        intro.setText("Introduction of the game");
        intro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                introActionPerformed(evt);
            }
        });
        M1.add(intro);

        stuff.setText("Something to say");
        stuff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stuffActionPerformed(evt);
            }
        });
        M1.add(stuff);

        concluding.setText("concluding");
        concluding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concludingActionPerformed(evt);
            }
        });
        M1.add(concluding);

        end1.setText("Endings");

        jMenuItem3.setText("First Ending");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        end1.add(jMenuItem3);

        end2.setText("Second Ending");
        end1.add(end2);

        M1.add(end1);

        jMenuBar1.add(M1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startTheGameBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startTheGameBActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_startTheGameBActionPerformed

    private void M1MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_M1MenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_M1MenuSelected

    private void introActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_introActionPerformed
        // TODO add your handling code here:
        //new introduction().setVisible(true);
        //this.setVisible(false);
        //intro.addAncestorListener(new ActionListener){
        
    }//GEN-LAST:event_introActionPerformed

    private void stuffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stuffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stuffActionPerformed

    private void concludingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concludingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_concludingActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu M1;
    private javax.swing.JMenuItem concluding;
    private javax.swing.JMenu end1;
    private javax.swing.JMenuItem end2;
    private javax.swing.JCheckBoxMenuItem intro;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel p1;
    private javax.swing.JButton startTheGameB;
    private javax.swing.JMenuItem stuff;
    private javax.swing.JLabel welcomeL;
    // End of variables declaration//GEN-END:variables
}
