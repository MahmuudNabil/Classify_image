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
public class Move  extends MainFrame{
    
    // move Bacterial_spot disease
    public class MoveBacterial_spot{
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
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        }
    }
    
    
    // move Early_blight disease
    public class MoveEarly_blight{
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        }
    }
    
    //move Late_blight disease
    public class MoveLate_blight{
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        }
    }
    
    
    //move LeafMold disease
    public class MoveLeafMold{
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        }
    }
    
    // move Septoria_leaf_spot disease
    public class MoveSeptoria_leaf_spot{
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        }
    }
    
    //move Spider_mites disease
    public class Spider_mites{
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        }
    }
    
    //move Target_Spot disease
    public class Target_Spot{
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        }
    }
    
    //move Mosaic_virus disease
    public class Mosaic_virus{
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        }
    }
    
    //move Yellow_Leaf_Curl_Virus disease
    public class Yellow_Leaf_Curl_Virus{
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            } catch (IOException ex) {
               // Logger.getLogger(TestIOStreams.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        }
    }
}
