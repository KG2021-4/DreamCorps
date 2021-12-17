/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kg.rock_paper_scissors;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author khalid
 */
public class Play_Frame extends javax.swing.JFrame {
    Border gray_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.DARK_GRAY);
    Border orange_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.ORANGE);
      // images path
    String rock ="/Users/khalid/Documents/Rock_Paper_Scissors/src/main/java/images/rock.png";
    String paper ="/Users/khalid/Documents/Rock_Paper_Scissors/src/main/java/images/realPaper.png";
    String scissors ="/Users/khalid/Documents/Rock_Paper_Scissors/src/main/java/images/paper.png";
    /**    
     * Creates new form Play_Frame
     */
    ArrayList<String> list = new ArrayList<>();
    Random random = new Random();
    int your_wins = 0, computer_wins = 0;
    String random_selection;
    public Play_Frame() {
        initComponents();
    jLabel_You.setBorder(gray_border);
    JLabel_Computer.setBorder(gray_border);
    jLabel_Rock.setBorder(gray_border);
    jLabel_Paper.setBorder(gray_border);
    jLabel_Scissors.setBorder(gray_border);
    
    displayImage(rock, jLabel_Rock,149,108);
    displayImage(paper, jLabel_Paper,149,108);
    displayImage(scissors, jLabel_Scissors,149,108);
    list.add(rock);
    list.add(paper);
    list.add(scissors);
    
    }
    
    
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JLabel_Computer = new javax.swing.JLabel();
        jLabel_You = new javax.swing.JLabel();
        jLabel_ComputerWins = new javax.swing.JLabel();
        jLabel_YourWins = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel_Scissors = new javax.swing.JLabel();
        jLabel_Rock = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel_Paper = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLabel_Computer.setBackground(new java.awt.Color(102, 102, 255));
        JLabel_Computer.setOpaque(true);

        jLabel_You.setBackground(new java.awt.Color(102, 102, 255));
        jLabel_You.setOpaque(true);

        jLabel_ComputerWins.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel_ComputerWins.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_ComputerWins.setText("0");

        jLabel_YourWins.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel_YourWins.setForeground(new java.awt.Color(51, 255, 51));
        jLabel_YourWins.setText("0");

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("-");

        jLabel7.setText("          YOU");

        jLabel8.setText("COMPUTER");

        jLabel_Scissors.setBackground(new java.awt.Color(102, 102, 255));
        jLabel_Scissors.setOpaque(true);
        jLabel_Scissors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ScissorsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_ScissorsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ScissorsMouseExited(evt);
            }
        });

        jLabel_Rock.setBackground(new java.awt.Color(102, 102, 255));
        jLabel_Rock.setOpaque(true);
        jLabel_Rock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_RockMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_RockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_RockMouseExited(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(102, 102, 255));
        jLabel12.setOpaque(true);

        jLabel_Paper.setBackground(new java.awt.Color(102, 102, 255));
        jLabel_Paper.setOpaque(true);
        jLabel_Paper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_PaperMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_PaperMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_PaperMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel_Rock, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_Paper, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel_Scissors, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel_You, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(jLabel_YourWins, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel_ComputerWins)
                                .addGap(27, 27, 27)
                                .addComponent(JLabel_Computer, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(83, 83, 83))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel12)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabel_Computer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_You, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_ComputerWins, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_YourWins))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Paper, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Scissors, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Rock, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel12)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_RockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_RockMouseClicked
        displayImage(rock, jLabel_You,176,170);
        // make a random selection
        random_selection = list.get(random.nextInt(list.size()));
        // display image 
        displayImage(random_selection, JLabel_Computer,176,170);
         getWinner(rock, random_selection);
    }//GEN-LAST:event_jLabel_RockMouseClicked

    private void jLabel_RockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_RockMouseEntered
        jLabel_Rock.setBorder(orange_border);
    }//GEN-LAST:event_jLabel_RockMouseEntered

    private void jLabel_RockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_RockMouseExited
           jLabel_Rock.setBorder(gray_border);

    }//GEN-LAST:event_jLabel_RockMouseExited

    private void jLabel_PaperMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PaperMouseClicked
     displayImage(paper, jLabel_You,176,170);
        // make a random selection
        random_selection = list.get(random.nextInt(list.size()));
        // display image 
        displayImage(random_selection, JLabel_Computer,176,170);
        getWinner(paper, random_selection);
    }//GEN-LAST:event_jLabel_PaperMouseClicked

    private void jLabel_PaperMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PaperMouseEntered
       jLabel_Paper.setBorder(orange_border);
    }//GEN-LAST:event_jLabel_PaperMouseEntered

    private void jLabel_PaperMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PaperMouseExited
            jLabel_Paper.setBorder(gray_border);
    }//GEN-LAST:event_jLabel_PaperMouseExited

    private void jLabel_ScissorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ScissorsMouseClicked
        displayImage(scissors, jLabel_You,176,170);
       // make a random selection
        random_selection = list.get(random.nextInt(list.size()));
        // display image 
        displayImage(random_selection, JLabel_Computer,176,170);
        getWinner(scissors, random_selection);
    }//GEN-LAST:event_jLabel_ScissorsMouseClicked

    private void jLabel_ScissorsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ScissorsMouseEntered
        jLabel_Scissors.setBorder(orange_border);

    }//GEN-LAST:event_jLabel_ScissorsMouseEntered

    private void jLabel_ScissorsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ScissorsMouseExited
         jLabel_Scissors.setBorder(gray_border);
    }//GEN-LAST:event_jLabel_ScissorsMouseExited
//https://pixabay.com/vectors/rock-paper-scissors-rock-hand-296854/
//https://pixabay.com/vectors/rock-paper-scissors-scissors-hand-296853/
//https://pixabay.com/vectors/rock-paper-scissors-paper-hand-296855/

    // create a function to display images in jlabel
    public void displayImage(String imagePath, JLabel label, int width, int height)
    {
        // get the image
        ImageIcon imgIco = new ImageIcon(imagePath);
        
        // resize the image
        Image img = imgIco.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        
        // set image into the jLabel
        label.setIcon(new ImageIcon(img));
        
    }
 // create a function to get the winner
    public void getWinner(String you, String computer)
    {
        if(you.equals(computer))
        {
            System.out.println("Draw");
        }
        else if(you.equals(rock))
        {
            if(computer.equals(scissors))
            {
                your_wins++;
                jLabel_YourWins.setText(String.valueOf(your_wins));
            }
            else
            {
                computer_wins++;
                jLabel_ComputerWins.setText(String.valueOf(computer_wins));
            }
        }
        
        else if(you.equals(paper))
        {
            if(computer.equals(rock))
            {
                your_wins++;
                jLabel_YourWins.setText(String.valueOf(your_wins));
            }
            else
            {
                computer_wins++;
                jLabel_ComputerWins.setText(String.valueOf(computer_wins));
            }
        }
        
        else if(you.equals(scissors))
        {
            if(computer.equals(paper))
            {
                your_wins++;
                jLabel_YourWins.setText(String.valueOf(your_wins));
            }
            else
            {
                computer_wins++;
                jLabel_ComputerWins.setText(String.valueOf(computer_wins));
            }
        }
           if(your_wins == 3 || computer_wins == 3) {
        
            int yes_no = JOptionPane.showConfirmDialog(null, "Play amother Person", "Play Again", JOptionPane.YES_NO_OPTION);
            if(yes_no == 0)// yes == 0
            {
                JLabel_Computer.setIcon(null);
                jLabel_You.setIcon(null);
                your_wins = 0;
                computer_wins = 0;
                jLabel_YourWins.setText(String.valueOf(your_wins));
                jLabel_ComputerWins.setText(String.valueOf(computer_wins));
            }
}
    }
          
  

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
            java.util.logging.Logger.getLogger(Play_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Play_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Play_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Play_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Play_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel_Computer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_ComputerWins;
    private javax.swing.JLabel jLabel_Paper;
    private javax.swing.JLabel jLabel_Rock;
    private javax.swing.JLabel jLabel_Scissors;
    private javax.swing.JLabel jLabel_You;
    private javax.swing.JLabel jLabel_YourWins;
    // End of variables declaration//GEN-END:variables
}
