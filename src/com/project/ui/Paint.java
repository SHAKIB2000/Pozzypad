/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.ui;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author SHAKIB
 */
public class Paint extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     */
    public Paint() {
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
        pencil = new javax.swing.JButton();
        brush = new javax.swing.JButton();
        colour = new javax.swing.JButton();
        eraser = new javax.swing.JButton();
        canvas1 = new java.awt.Canvas();
        labelAll = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        fileNew = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        fileOpen = new javax.swing.JMenuItem();
        fileSave = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pozzypad");
        setSize(new java.awt.Dimension(1350, 740));

        pencil.setBackground(new java.awt.Color(255, 255, 255));
        pencil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/sad/icons/pencil.png"))); // NOI18N
        pencil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pencil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pencilMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pencilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pencilMouseExited(evt);
            }
        });
        pencil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencilActionPerformed(evt);
            }
        });

        brush.setBackground(new java.awt.Color(255, 255, 255));
        brush.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/sad/icons/paint-brush.png"))); // NOI18N
        brush.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        brush.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brushMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                brushMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                brushMouseExited(evt);
            }
        });
        brush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brushActionPerformed(evt);
            }
        });

        colour.setBackground(new java.awt.Color(255, 255, 255));
        colour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/sad/icons/color-picker.png"))); // NOI18N
        colour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                colourMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                colourMouseExited(evt);
            }
        });
        colour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colourActionPerformed(evt);
            }
        });

        eraser.setBackground(new java.awt.Color(255, 255, 255));
        eraser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/sad/icons/eraser.png"))); // NOI18N
        eraser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eraserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eraserMouseExited(evt);
            }
        });
        eraser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eraserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(pencil, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(brush, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(colour, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(eraser, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pencil, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(brush, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(colour, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eraser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(244, Short.MAX_VALUE))
        );

        canvas1.setBackground(new java.awt.Color(255, 255, 255));
        canvas1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        canvas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                canvas1MouseReleased(evt);
            }
        });
        canvas1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                canvas1MouseDragged(evt);
            }
        });

        labelAll.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelAll.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAll.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jMenu1.setText("File");

        fileNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        fileNew.setText("New                                       ");
        fileNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileNewActionPerformed(evt);
            }
        });
        jMenu1.add(fileNew);
        jMenu1.add(jSeparator1);

        fileOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        fileOpen.setText("Open...                       ");
        fileOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileOpenActionPerformed(evt);
            }
        });
        jMenu1.add(fileOpen);

        fileSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        fileSave.setText("Save/ Save As                     ");
        fileSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileSaveActionPerformed(evt);
            }
        });
        jMenu1.add(fileSave);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(canvas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAll, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelAll, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(canvas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fileNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileNewActionPerformed
        // TODO add your handling code here:
        new Paint().setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_fileNewActionPerformed

    private void fileOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileOpenActionPerformed
        // TODO add your handling code here:
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(this);

    }//GEN-LAST:event_fileOpenActionPerformed

    private void fileSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileSaveActionPerformed
        // TODO add your handling code here:
        JFileChooser jf = new JFileChooser();
        jf.showSaveDialog(this);
        //JOptionPane.showMessageDialog(jLabel1, "You can't save this file", "Error", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_fileSaveActionPerformed

    private void brushMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brushMouseExited
        // TODO add your handling code here:
        labelAll.setText("");
    }//GEN-LAST:event_brushMouseExited

    private void brushMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brushMouseEntered
        // TODO add your handling code here:
        labelAll.setText("<html>B<br>r<br>u<br>s<br>h</html>");
    }//GEN-LAST:event_brushMouseEntered

    private void brushMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brushMouseClicked
        // TODO add your handling code here:
        labelAll.setText("<html>B<br>r<br>u<br>s<br>h</html>");
    }//GEN-LAST:event_brushMouseClicked

    private void pencilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencilActionPerformed
        // TODO add your handling code here:
        //currentColor = Color.black;
        canvas1.setIgnoreRepaint(true);
        print = ".";
        canvas1.setForeground(currentColor);
    }//GEN-LAST:event_pencilActionPerformed

    private void pencilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pencilMouseExited
        // TODO add your handling code here:
        labelAll.setText("");
    }//GEN-LAST:event_pencilMouseExited

    private void pencilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pencilMouseEntered
        // TODO add your handling code here:
        labelAll.setText("<html>P<br>e<br>n<br>c<br>i<br>l</html>");
    }//GEN-LAST:event_pencilMouseEntered

    private void pencilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pencilMouseClicked
        // TODO add your handling code here:
        labelAll.setText("<html>P<br>e<br>n<br>c<br>i<br>l</html>");
    }//GEN-LAST:event_pencilMouseClicked

    private void colourMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colourMouseEntered
        // TODO add your handling code here:
        labelAll.setText("<html>C<br>o<br>l<br>o<br>u<br>r</html>");
    }//GEN-LAST:event_colourMouseEntered

    private void colourMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colourMouseExited
        // TODO add your handling code here:
        labelAll.setText("");
    }//GEN-LAST:event_colourMouseExited

    private void eraserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eraserMouseEntered
        // TODO add your handling code here:
        labelAll.setText("<html>E<br>r<br>a<br>s<br>e<br>r</html>");
    }//GEN-LAST:event_eraserMouseEntered

    private void eraserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eraserMouseExited
        // TODO add your handling code here:
        labelAll.setText("");
    }//GEN-LAST:event_eraserMouseExited

    private void canvas1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas1MouseReleased
        // TODO add your handling code here:
        //canvas1.getGraphics().drawLine(evt.getX(), evt.getY(), evt.getX(), evt.getY());
    }//GEN-LAST:event_canvas1MouseReleased
String print = "o";
    private void colourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colourActionPerformed
        // TODO add your handling code here:
        //JColorChooser.showDialog(null, "Choose a color", currentColor);
        currentColor = JColorChooser.showDialog(this, "Choose color", Color.black);
        canvas1.setIgnoreRepaint(true);
        print = "o";
        canvas1.setForeground(currentColor);
        //canvas1.repaint(evt.getX(), evt.getY(), evt.getX(), evt.getY());
    }//GEN-LAST:event_colourActionPerformed

    private void canvas1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas1MouseDragged
        // TODO add your handling code here:evt.getX(), evt.getY(), evt.getX(), evt.getY()
        //canvas1.getGraphics().setColor(currentColor);
        //canvas1.setBackground(currentColor);
        
        canvas1.getGraphics().drawString(print, evt.getX(), evt.getY());
        
        //canvas1.repaint(evt.getX(), evt.getY(), evt.getX(), evt.getY());
        
        
        //canvas1.getGraphics().drawLine(evt.getX(), evt.getY(), evt.getX(), evt.getY());
        
    }//GEN-LAST:event_canvas1MouseDragged

    private void eraserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eraserActionPerformed
        // TODO add your handling code here:
        //evt.getActionCommand()
        currentColor = Color.white;
        canvas1.setIgnoreRepaint(true);
        print = "99";
        canvas1.setForeground(currentColor);
    }//GEN-LAST:event_eraserActionPerformed

    private void brushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brushActionPerformed
        // TODO add your handling code here:
        currentColor = Color.black;
        canvas1.setIgnoreRepaint(true);
        print = "o";
        canvas1.setForeground(currentColor);
    }//GEN-LAST:event_brushActionPerformed

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
            java.util.logging.Logger.getLogger(Paint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paint().setVisible(true);
            }
        });
    }
    Color currentColor;
    
    JButton[] b;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brush;
    private java.awt.Canvas canvas1;
    private javax.swing.JButton colour;
    private javax.swing.JButton eraser;
    private javax.swing.JMenuItem fileNew;
    private javax.swing.JMenuItem fileOpen;
    private javax.swing.JMenuItem fileSave;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel labelAll;
    private javax.swing.JButton pencil;
    // End of variables declaration//GEN-END:variables
}
