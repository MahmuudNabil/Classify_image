/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classifyimages;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;

/**
 *
 * @author Mahmoud
 */
public class DisplayImages {
    static String imageName ;
    File file;
    String[] imagesList;
    ImageIcon icon;
    Image image;
    
        //disease Bacterial_spot    
         // get images list
     public String[] getBacterial_spot()
     {
          file = new File(getClass().getResource("/Tomato___Bacterial_spot/").getFile());
          imagesList = file.list();
         return imagesList;
     }
     // display the image by index
     public void showBacterial_spot(int index)
     {
          imagesList = getBacterial_spot();
          imageName = imagesList[index];
          icon = new ImageIcon(getClass().getResource("/Tomato___Bacterial_spot/"+imageName));
          image = icon.getImage().getScaledInstance(MainFrame.jLabel_image.getWidth(), MainFrame.jLabel_image.getHeight(), Image.SCALE_SMOOTH);
          MainFrame.jLabel_image.setIcon(new ImageIcon(image));
     }

      // disease Early_blight
      public String[] getEarly_blight()
     {
          file = new File(getClass().getResource("/Tomato___Early_blight/").getFile());
          imagesList = file.list();
         return imagesList;
     }
         // display the image by index
     public void showEarly_blight(int index)
     {
         imagesList = getEarly_blight();
          imageName = imagesList[index];
          icon = new ImageIcon(getClass().getResource("/Tomato___Early_blight/"+imageName));
          image = icon.getImage().getScaledInstance(MainFrame.jLabel_image.getWidth(), MainFrame.jLabel_image.getHeight(), Image.SCALE_SMOOTH);
         MainFrame.jLabel_image.setIcon(new ImageIcon(image));
     }
    
      // disease Late_blight
      public String[] getLate_blight()
     {
          file = new File(getClass().getResource("/Tomato___Late_blight/").getFile());
          imagesList = file.list();
         return imagesList;
     }
         // display the image by index
     public void showLate_blight(int index)
     {
          imagesList = getLate_blight();
          imageName = imagesList[index];
          icon = new ImageIcon(getClass().getResource("/Tomato___Late_blight/"+imageName));
          image = icon.getImage().getScaledInstance(MainFrame.jLabel_image.getWidth(), MainFrame.jLabel_image.getHeight(), Image.SCALE_SMOOTH);
         MainFrame.jLabel_image.setIcon(new ImageIcon(image));
     }
     
      // disease Leaf_Mold
      public String[] getLeaf_Mold()
     {
          file = new File(getClass().getResource("/Tomato___Leaf_Mold/").getFile());
          imagesList = file.list();
         return imagesList;
     }
         // display the image by index
     public void showLeaf_Mold(int index)
     {
          imagesList = getLeaf_Mold();
          imageName = imagesList[index];
          icon = new ImageIcon(getClass().getResource("/Tomato___Leaf_Mold/"+imageName));
          image = icon.getImage().getScaledInstance(MainFrame.jLabel_image.getWidth(), MainFrame.jLabel_image.getHeight(), Image.SCALE_SMOOTH);
         MainFrame.jLabel_image.setIcon(new ImageIcon(image));
     }
     
      // disease Septoria_leaf_spot
      public String[] getSeptoria_leaf_spot()
     {
          file = new File(getClass().getResource("/Tomato___Septoria_leaf_spot/").getFile());
          imagesList = file.list();
         return imagesList;
     }
         // display the image by index
     public void showSeptoria_leaf_spot(int index)
     {
          imagesList =  getSeptoria_leaf_spot();
          imageName = imagesList[index];
          icon = new ImageIcon(getClass().getResource("/Tomato___Septoria_leaf_spot/"+imageName));
          image = icon.getImage().getScaledInstance(MainFrame.jLabel_image.getWidth(), MainFrame.jLabel_image.getHeight(), Image.SCALE_SMOOTH);
         MainFrame.jLabel_image.setIcon(new ImageIcon(image));
     }
     

       // disease Spider_mites
      public String[] getSpider_mites()
     {
          file = new File(getClass().getResource("/Tomato___Spider_mites_two_spotted_spider_mite/").getFile());
          imagesList = file.list();
         return imagesList;
     }
         // display the image by index
     public void showSpider_mites(int index)
     {
          imagesList = getSpider_mites();
          imageName = imagesList[index];
          icon = new ImageIcon(getClass().getResource("/Tomato___Spider_mites_two_spotted_spider_mite/"+imageName));
          image = icon.getImage().getScaledInstance(MainFrame.jLabel_image.getWidth(), MainFrame.jLabel_image.getHeight(), Image.SCALE_SMOOTH);
         MainFrame.jLabel_image.setIcon(new ImageIcon(image));
     }
      
     // disease Target_Spot
      public String[] getTarget_Spot()
     {
          file = new File(getClass().getResource("/Tomato___Target_Spot/").getFile());
          imagesList = file.list();
         return imagesList;
     }
         // display the image by index
     public void showTarget_Spot(int index)
     {
          imagesList = getTarget_Spot();
          imageName = imagesList[index];
          icon = new ImageIcon(getClass().getResource("/Tomato___Target_Spot/"+imageName));
          image = icon.getImage().getScaledInstance(MainFrame.jLabel_image.getWidth(), MainFrame.jLabel_image.getHeight(), Image.SCALE_SMOOTH);
         MainFrame.jLabel_image.setIcon(new ImageIcon(image));
     }
     
     // disease Tomato_mosaic_virus
      public String[] getTomato_mosaic_virus()
     {
          file = new File(getClass().getResource("/Tomato___Tomato_mosaic_virus/").getFile());
          imagesList = file.list();
         return imagesList;
     }
         // display the image by index
     public void showTomato_mosaic_virus(int index)
     {
          imagesList = getTomato_mosaic_virus();
          imageName = imagesList[index];
          icon = new ImageIcon(getClass().getResource("/Tomato___Tomato_mosaic_virus/"+imageName));
          image = icon.getImage().getScaledInstance(MainFrame.jLabel_image.getWidth(), MainFrame.jLabel_image.getHeight(), Image.SCALE_SMOOTH);
         MainFrame.jLabel_image.setIcon(new ImageIcon(image));
     }
     
     // disease Tomato_Yellow_Leaf_Curl_Virus
      public String[] getYellow_Leaf_Curl_Virus()
     {
          file = new File(getClass().getResource("/Tomato___Tomato_Yellow_Leaf_Curl_Virus/").getFile());
          imagesList = file.list();
         return imagesList;
     }
         // display the image by index
     public void showYellow_Leaf_Curl_Virus(int index)
     {
          imagesList = getYellow_Leaf_Curl_Virus();
          imageName = imagesList[index];
          icon = new ImageIcon(getClass().getResource("/Tomato___Tomato_Yellow_Leaf_Curl_Virus/"+imageName));
          image = icon.getImage().getScaledInstance(MainFrame.jLabel_image.getWidth(), MainFrame.jLabel_image.getHeight(), Image.SCALE_SMOOTH);
          MainFrame.jLabel_image.setIcon(new ImageIcon(image));
     }
      
    

}
