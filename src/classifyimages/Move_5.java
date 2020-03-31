/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classifyimages;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Mahmoud
 */
public class Move_5 {
     FileInputStream fio;
    BufferedInputStream bis;
    FileOutputStream FOS;
    BufferedOutputStream BOS;
    int i;
    byte[] buffer;
    // Bacterial spot
    public void moveBacterial_spot()
        {
         try {
             fio=new FileInputStream("res\\Tomato___Bacterial_spot\\"+DisplayImages.imageName);
             bis=new BufferedInputStream(fio);
            
             FOS=new FileOutputStream("D:\\class_image\\Tomato___Bacterial_spot\\5\\"+DisplayImages.imageName);
             BOS= new BufferedOutputStream(FOS);
            
             buffer=new byte[10240];  // 10kb
            i= bis.read(buffer);
          
           
           while( i != -1){
             BOS.write(buffer, 0, i);
             i= bis.read(buffer);  
           }
            
           BOS.flush();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
}
    
    //Early_blight
    public void moveEarly_blight()
        {
            try {
                 fio=new FileInputStream("res\\Tomato___Early_blight\\"+DisplayImages.imageName);
                 bis=new BufferedInputStream(fio);

                 FOS=new FileOutputStream("D:\\class_image\\Tomato___Early_blight\\5\\"+DisplayImages.imageName);
                 BOS= new BufferedOutputStream(FOS);

                 buffer=new byte[10240];  // 10kb
                i= bis.read(buffer);


               while( i != -1){
                 BOS.write(buffer, 0, i);
                 i= bis.read(buffer);  
               }

               BOS.flush();
            } catch (FileNotFoundException ex) {
                //Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
}
    
    //move Late_blight disease
    
        public void moveLate_blight()
    {
        try {
             fio=new FileInputStream("src\\Tomato___Late_blight\\"+DisplayImages.imageName);
             bis=new BufferedInputStream(fio);
            
             FOS=new FileOutputStream("D:\\class_image\\Tomato___Late_blight\\5\\"+DisplayImages.imageName);
             BOS= new BufferedOutputStream(FOS);
            
             buffer=new byte[10240];  // 10kb
            i= bis.read(buffer);
          
           
           while( i != -1){
             BOS.write(buffer, 0, i);
             i= bis.read(buffer);  
           }
            
           BOS.flush();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
           // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
        // Leaf_mold
         public void moveLeaf_mold()
        {
            try {
                 fio=new FileInputStream("src\\Tomato___Leaf_Mold\\"+DisplayImages.imageName);
                 bis=new BufferedInputStream(fio);

                 FOS=new FileOutputStream("D:\\class_image\\Tomato___Leaf_Mold\\5\\"+DisplayImages.imageName);
                 BOS= new BufferedOutputStream(FOS);

                 buffer=new byte[10240];  // 10kb
                i= bis.read(buffer);


               while( i != -1){
                 BOS.write(buffer, 0, i);
                 i= bis.read(buffer);  
               }

               BOS.flush();
            } catch (FileNotFoundException ex) {
                //Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
         // Septoria_leaf_spot
         public void moveSeptoria_leaf_spot()
        {
            try {
                 fio=new FileInputStream("src\\Tomato___Septoria_leaf_spot\\"+DisplayImages.imageName);
                 bis=new BufferedInputStream(fio);

                 FOS=new FileOutputStream("D:\\class_image\\Tomato___Septoria_leaf_spot\\5\\"+DisplayImages.imageName);
                 BOS= new BufferedOutputStream(FOS);

                 buffer=new byte[10240];  // 10kb
                i= bis.read(buffer);


               while( i != -1){
                 BOS.write(buffer, 0, i);
                 i= bis.read(buffer);  
               }

               BOS.flush();
            } catch (FileNotFoundException ex) {
                //Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
         
         //move Spider_mites disease
         public void moveSpider_mites()
        {
            try {
                 fio=new FileInputStream("src\\Tomato___Spider_mites_two_spotted_spider_mite\\"+DisplayImages.imageName);
                 bis=new BufferedInputStream(fio);

                 FOS=new FileOutputStream("D:\\class_image\\Tomato___Spider_mites_two_spotted_spider_mite\\5\\"+DisplayImages.imageName);
                 BOS= new BufferedOutputStream(FOS);

                 buffer=new byte[10240];  // 10kb
                i= bis.read(buffer);


               while( i != -1){
                 BOS.write(buffer, 0, i);
                 i= bis.read(buffer);  
               }

               BOS.flush();
            } catch (FileNotFoundException ex) {
                //Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
         
         
        //move Target_Spot disease
         public void moveTarget_Spot()
        {
            try {
                 fio=new FileInputStream("src\\Tomato___Target_Spot\\"+DisplayImages.imageName);
                 bis=new BufferedInputStream(fio);

                 FOS=new FileOutputStream("D:\\class_image\\Tomato___Target_Spot\\5\\"+DisplayImages.imageName);
                 BOS= new BufferedOutputStream(FOS);

                 buffer=new byte[10240];  // 10kb
                i= bis.read(buffer);


               while( i != -1){
                 BOS.write(buffer, 0, i);
                 i= bis.read(buffer);  
               }

               BOS.flush();
            } catch (FileNotFoundException ex) {
                //Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
         
         //move Mosaic_virus disease
         public void moveMosaic_virus()
        {
            try {
                 fio=new FileInputStream("src\\Tomato___Tomato_mosaic_virus\\"+DisplayImages.imageName);
                 bis=new BufferedInputStream(fio);

                 FOS=new FileOutputStream("D:\\class_image\\Tomato___Tomato_mosaic_virus\\5\\"+DisplayImages.imageName);
                 BOS= new BufferedOutputStream(FOS);

                 buffer=new byte[10240];  // 10kb
                i= bis.read(buffer);


               while( i != -1){
                 BOS.write(buffer, 0, i);
                 i= bis.read(buffer);  
               }

               BOS.flush();
            } catch (FileNotFoundException ex) {
                //Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
         
         //move Yellow_Leaf_Curl_Virus disease
         public void moveYellow_Leaf_Curl_Virus()
        {
            try {
                 fio=new FileInputStream("src\\Tomato___Tomato_Yellow_Leaf_Curl_Virus\\"+DisplayImages.imageName);
                 bis=new BufferedInputStream(fio);

                 FOS=new FileOutputStream("D:\\class_image\\Tomato___Tomato_Yellow_Leaf_Curl_Virus\\5\\"+DisplayImages.imageName);
                 BOS= new BufferedOutputStream(FOS);

                 buffer=new byte[10240];  // 10kb
                i= bis.read(buffer);


               while( i != -1){
                 BOS.write(buffer, 0, i);
                 i= bis.read(buffer);  
               }

               BOS.flush();
            } catch (FileNotFoundException ex) {
                //Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    
}
