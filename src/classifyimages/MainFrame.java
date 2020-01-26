/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classifyimages;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Mahmoud
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        showImage(pos);
    }
// the index of the images
    int pos = 0;
    String imageName ;

// get images list
    public String[] getImages()
    {
        File file = new File(getClass().getResource("/Tomato___Bacterial_spot/").getFile());
        String[] imagesList = file.list();
        return imagesList;
    }
// display the image by index
    public void showImage(int index)
    {
        String[] imagesList = getImages();
         imageName = imagesList[index];
        ImageIcon icon = new ImageIcon(getClass().getResource("/Tomato___Bacterial_spot/"+imageName));
        Image image = icon.getImage().getScaledInstance(jLabel_image.getWidth(), jLabel_image.getHeight(), Image.SCALE_SMOOTH);
        jLabel_image.setIcon(new ImageIcon(image));
    }
    //function of turn image
    public void turn_next()
    {
         pos = pos + 1;
       if(pos >= getImages().length)
       {
           pos  = getImages().length - 1;
       }
       showImage(pos);
    }
    public void turn_prev()
    {
        pos = pos - 1;
       if(pos < 0)
       {
           pos = 0;
       }
       showImage(pos);
    }
    public void move_to_1()
    {
        try {
            FileInputStream fio=new FileInputStream("C:\\Users\\Mahmoud\\Desktop\\ClassifyImages\\src\\Tomato___Bacterial_spot\\"+imageName);
            BufferedInputStream bis=new BufferedInputStream(fio);
            
            FileOutputStream FOS=new FileOutputStream("C:\\Users\\Mahmoud\\Desktop\\class_image\\1\\"+imageName);
            BufferedOutputStream BOS= new BufferedOutputStream(FOS);
            
            byte[] buffer=new byte[10240];  // 10kb
           int i= bis.read(buffer);
          
           
           while( i != -1){
             BOS.write(buffer, 0, i);
             i= bis.read(buffer);  
           }
            
           BOS.flush();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (IOException ex) {
           // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    public void move_to_2()
    {
        try {
            FileInputStream fio=new FileInputStream("C:\\Users\\Mahmoud\\Desktop\\ClassifyImages\\src\\Tomato___Bacterial_spot\\"+imageName);
            BufferedInputStream bis=new BufferedInputStream(fio);
            
            FileOutputStream FOS=new FileOutputStream("C:\\Users\\Mahmoud\\Desktop\\class_image\\2\\"+imageName);
            BufferedOutputStream BOS= new BufferedOutputStream(FOS);
            
            byte[] buffer=new byte[10240];  // 10kb
           int i= bis.read(buffer);
          
           
           while( i != -1){
             BOS.write(buffer, 0, i);
             i= bis.read(buffer);  
           }
            
           BOS.flush();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (IOException ex) {
           // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    public void move_to_3(){
         try {
            FileInputStream fio=new FileInputStream("C:\\Users\\Mahmoud\\Desktop\\ClassifyImages\\src\\Tomato___Bacterial_spot\\"+imageName);
            BufferedInputStream bis=new BufferedInputStream(fio);
            
            FileOutputStream FOS=new FileOutputStream("C:\\Users\\Mahmoud\\Desktop\\class_image\\3\\"+imageName);
            BufferedOutputStream BOS= new BufferedOutputStream(FOS);
            
            byte[] buffer=new byte[10240];  // 10kb
           int i= bis.read(buffer);
          
           
           while( i != -1){
             BOS.write(buffer, 0, i);
             i= bis.read(buffer);  
           }
            
           BOS.flush();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (IOException ex) {
           // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    public void move_to_4()
    {
        try {
            FileInputStream fio=new FileInputStream("C:\\Users\\Mahmoud\\Desktop\\ClassifyImages\\src\\Tomato___Bacterial_spot\\"+imageName);
            BufferedInputStream bis=new BufferedInputStream(fio);
            
            FileOutputStream FOS=new FileOutputStream("C:\\Users\\Mahmoud\\Desktop\\class_image\\4\\"+imageName);
            BufferedOutputStream BOS= new BufferedOutputStream(FOS);
            
            byte[] buffer=new byte[10240];  // 10kb
           int i= bis.read(buffer);
          
           
           while( i != -1){
             BOS.write(buffer, 0, i);
             i= bis.read(buffer);  
           }
            
           BOS.flush();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (IOException ex) {
           // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    public void move_to_5(){
    try {
            FileInputStream fio=new FileInputStream("C:\\Users\\Mahmoud\\Desktop\\ClassifyImages\\src\\Tomato___Bacterial_spot\\"+imageName);
            BufferedInputStream bis=new BufferedInputStream(fio);
            
            FileOutputStream FOS=new FileOutputStream("C:\\Users\\Mahmoud\\Desktop\\class_image\\5\\"+imageName);
            BufferedOutputStream BOS= new BufferedOutputStream(FOS);
            
            byte[] buffer=new byte[10240];  // 10kb
           int i= bis.read(buffer);
          
           
           while( i != -1){
             BOS.write(buffer, 0, i);
             i= bis.read(buffer);  
           }
            
           BOS.flush();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (IOException ex) {
           // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
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

        jButton1 = new javax.swing.JButton();
        jLabel_image = new javax.swing.JLabel();
        jButton_next = new javax.swing.JButton();
        jButton_prev = new javax.swing.JButton();
        jButton_1 = new javax.swing.JButton();
        jButton_2 = new javax.swing.JButton();
        jButton_3 = new javax.swing.JButton();
        jButton_4 = new javax.swing.JButton();
        jButton_5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_next.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_next.setText("Next");
        jButton_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_nextActionPerformed(evt);
            }
        });
        jButton_next.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton_nextKeyPressed(evt);
            }
        });

        jButton_prev.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_prev.setText("Prev");
        jButton_prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_prevActionPerformed(evt);
            }
        });
        jButton_prev.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton_prevKeyPressed(evt);
            }
        });

        jButton_1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_1.setText("1");
        jButton_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_1ActionPerformed(evt);
            }
        });
        jButton_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton_1KeyPressed(evt);
            }
        });

        jButton_2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_2.setText("2");
        jButton_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_2ActionPerformed(evt);
            }
        });
        jButton_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton_2KeyPressed(evt);
            }
        });

        jButton_3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_3.setText("3");
        jButton_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_3ActionPerformed(evt);
            }
        });
        jButton_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton_3KeyPressed(evt);
            }
        });

        jButton_4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_4.setText("4");
        jButton_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_4ActionPerformed(evt);
            }
        });
        jButton_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton_4KeyPressed(evt);
            }
        });

        jButton_5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_5.setText("5");
        jButton_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_5ActionPerformed(evt);
            }
        });
        jButton_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton_5KeyPressed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 153, 255));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jButton_prev, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_next, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButton_1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel_image, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_next, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_prev, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_prevActionPerformed
       turn_prev();
       this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) { }
 
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_LEFT)
                 turn_next();
            }
 
            @Override
            public void keyReleased(KeyEvent e) { }
        });
    }//GEN-LAST:event_jButton_prevActionPerformed

    private void jButton_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_nextActionPerformed
      
       turn_next();
       this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) { }
 
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_RIGHT)
                 turn_next();
            }
 
            @Override
            public void keyReleased(KeyEvent e) { }
        });
       
    }//GEN-LAST:event_jButton_nextActionPerformed

    private void jButton_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_1ActionPerformed

         move_to_1();
       this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) { }
 
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_NUMPAD1)
                 move_to_1();
            }
 
            @Override
            public void keyReleased(KeyEvent e) { }
        });
        
    }//GEN-LAST:event_jButton_1ActionPerformed

    private void jButton_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_2ActionPerformed
          move_to_2();
       this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) { }
 
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_NUMPAD1)
                 move_to_2();
            }
 
            @Override
            public void keyReleased(KeyEvent e) { }
        });
    }//GEN-LAST:event_jButton_2ActionPerformed

    private void jButton_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_3ActionPerformed
       
          move_to_3();
       this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) { }
 
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_NUMPAD1)
                 move_to_3();
            }
 
            @Override
            public void keyReleased(KeyEvent e) { }
        });
    }//GEN-LAST:event_jButton_3ActionPerformed

    private void jButton_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_4ActionPerformed
        
        move_to_4();
       this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) { }
 
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_NUMPAD1)
                 move_to_4();
            }
 
            @Override
            public void keyReleased(KeyEvent e) { }
        });
    }//GEN-LAST:event_jButton_4ActionPerformed

    private void jButton_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_5ActionPerformed
        
         move_to_5();
       this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) { }
 
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_NUMPAD1)
                 move_to_5();
            }
 
            @Override
            public void keyReleased(KeyEvent e) { }
        });
    }//GEN-LAST:event_jButton_5ActionPerformed

    private void jButton_nextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton_nextKeyPressed

       if(evt.getKeyCode() == KeyEvent.VK_RIGHT)
            turn_next(); 
    }//GEN-LAST:event_jButton_nextKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      Menu m = new Menu();
      m.setVisible(true);
      m.setLocationRelativeTo(null);
      m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton_prevKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton_prevKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_LEFT)
        turn_prev();
    }//GEN-LAST:event_jButton_prevKeyPressed

    private void jButton_1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton_1KeyPressed
        move_to_1();
       this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) { }
 
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_NUMPAD1)
                 move_to_1();
            }
 
            @Override
            public void keyReleased(KeyEvent e) { }
        });
    }//GEN-LAST:event_jButton_1KeyPressed

    private void jButton_2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton_2KeyPressed
        move_to_2();
       this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) { }
 
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_NUMPAD2)
                 move_to_2();
            }
 
            @Override
            public void keyReleased(KeyEvent e) { }
        });
    }//GEN-LAST:event_jButton_2KeyPressed

    private void jButton_3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton_3KeyPressed
        move_to_3();
       this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) { }
 
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_NUMPAD3)
                 move_to_3();
            }
 
            @Override
            public void keyReleased(KeyEvent e) { }
        });
    }//GEN-LAST:event_jButton_3KeyPressed

    private void jButton_4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton_4KeyPressed
       move_to_4();
       this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) { }
 
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_NUMPAD4)
                 move_to_4();
            }
 
            @Override
            public void keyReleased(KeyEvent e) { }
        });
    }//GEN-LAST:event_jButton_4KeyPressed

    private void jButton_5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton_5KeyPressed
        move_to_5();
       this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) { }
 
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_NUMPAD5)
                 move_to_5();
            }
 
            @Override
            public void keyReleased(KeyEvent e) { }
        });
    }//GEN-LAST:event_jButton_5KeyPressed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_1;
    private javax.swing.JButton jButton_2;
    private javax.swing.JButton jButton_3;
    private javax.swing.JButton jButton_4;
    private javax.swing.JButton jButton_5;
    private javax.swing.JButton jButton_next;
    private javax.swing.JButton jButton_prev;
    private javax.swing.JLabel jLabel_image;
    // End of variables declaration//GEN-END:variables
}
