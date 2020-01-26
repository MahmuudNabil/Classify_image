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
public class DisplayImages extends MainFrame{
        //disease Bacterial_spot    
         // get images list
     public String[] getBacterial_spot()
     {
         File file = new File(getClass().getResource("/Tomato___Bacterial_spot/").getFile());
         String[] imagesList = file.list();
         return imagesList;
     }
     // display the image by index
     public void showBacterial_spot(int index)
     {
         String[] imagesList = getImages();
          imageName = imagesList[index];
         ImageIcon icon = new ImageIcon(getClass().getResource("/Tomato___Bacterial_spot/"+imageName));
         Image image = icon.getImage().getScaledInstance(jLabel_image.getWidth(), jLabel_image.getHeight(), Image.SCALE_SMOOTH);
         jLabel_image.setIcon(new ImageIcon(image));
     }

      // disease Early_blight
      public String[] getEarly_blight()
     {
         File file = new File(getClass().getResource("/Tomato___Early_blight/").getFile());
         String[] imagesList = file.list();
         return imagesList;
     }
         // display the image by index
     public void showEarly_blight(int index)
     {
         String[] imagesList = getImages();
          imageName = imagesList[index];
         ImageIcon icon = new ImageIcon(getClass().getResource("/Tomato___Early_blight/"+imageName));
         Image image = icon.getImage().getScaledInstance(jLabel_image.getWidth(), jLabel_image.getHeight(), Image.SCALE_SMOOTH);
         jLabel_image.setIcon(new ImageIcon(image));
     }
      // disease Late_blight
      public String[] getLate_blight()
     {
         File file = new File(getClass().getResource("/Tomato___Early_blight/").getFile());
         String[] imagesList = file.list();
         return imagesList;
     }
         // display the image by index
     public void showLate_blight(int index)
     {
         String[] imagesList = getImages();
          imageName = imagesList[index];
         ImageIcon icon = new ImageIcon(getClass().getResource("/Tomato___Early_blight/"+imageName));
         Image image = icon.getImage().getScaledInstance(jLabel_image.getWidth(), jLabel_image.getHeight(), Image.SCALE_SMOOTH);
         jLabel_image.setIcon(new ImageIcon(image));
     }
      // disease Leaf_Mold
      public String[] getLeaf_Mold()
     {
         File file = new File(getClass().getResource("/Tomato___Early_blight/").getFile());
         String[] imagesList = file.list();
         return imagesList;
     }
         // display the image by index
     public void showLeaf_Mold(int index)
     {
         String[] imagesList = getImages();
          imageName = imagesList[index];
         ImageIcon icon = new ImageIcon(getClass().getResource("/Tomato___Early_blight/"+imageName));
         Image image = icon.getImage().getScaledInstance(jLabel_image.getWidth(), jLabel_image.getHeight(), Image.SCALE_SMOOTH);
         jLabel_image.setIcon(new ImageIcon(image));
     }
      // disease Septoria_leaf_spot
      public String[] getSeptoria_leaf_spot()
     {
         File file = new File(getClass().getResource("/Tomato___Early_blight/").getFile());
         String[] imagesList = file.list();
         return imagesList;
     }
         // display the image by index
     public void showSeptoria_leaf_spot(int index)
     {
         String[] imagesList = getImages();
          imageName = imagesList[index];
         ImageIcon icon = new ImageIcon(getClass().getResource("/Tomato___Early_blight/"+imageName));
         Image image = icon.getImage().getScaledInstance(jLabel_image.getWidth(), jLabel_image.getHeight(), Image.SCALE_SMOOTH);
         jLabel_image.setIcon(new ImageIcon(image));
     }
       // disease Spider_mites
      public String[] getSpider_mites()
     {
         File file = new File(getClass().getResource("/Tomato___Early_blight/").getFile());
         String[] imagesList = file.list();
         return imagesList;
     }
         // display the image by index
     public void showSpider_mites(int index)
     {
         String[] imagesList = getImages();
          imageName = imagesList[index];
         ImageIcon icon = new ImageIcon(getClass().getResource("/Tomato___Early_blight/"+imageName));
         Image image = icon.getImage().getScaledInstance(jLabel_image.getWidth(), jLabel_image.getHeight(), Image.SCALE_SMOOTH);
         jLabel_image.setIcon(new ImageIcon(image));
     }
     // disease Target_Spot
      public String[] getTarget_Spot()
     {
         File file = new File(getClass().getResource("/Tomato___Early_blight/").getFile());
         String[] imagesList = file.list();
         return imagesList;
     }
         // display the image by index
     public void showTarget_Spot(int index)
     {
         String[] imagesList = getImages();
          imageName = imagesList[index];
         ImageIcon icon = new ImageIcon(getClass().getResource("/Tomato___Early_blight/"+imageName));
         Image image = icon.getImage().getScaledInstance(jLabel_image.getWidth(), jLabel_image.getHeight(), Image.SCALE_SMOOTH);
         jLabel_image.setIcon(new ImageIcon(image));
     }
     // disease Tomato_mosaic_virus
      public String[] getTomato_mosaic_virus()
     {
         File file = new File(getClass().getResource("/Tomato___Early_blight/").getFile());
         String[] imagesList = file.list();
         return imagesList;
     }
         // display the image by index
     public void showTomato_mosaic_virus(int index)
     {
         String[] imagesList = getImages();
          imageName = imagesList[index];
         ImageIcon icon = new ImageIcon(getClass().getResource("/Tomato___Early_blight/"+imageName));
         Image image = icon.getImage().getScaledInstance(jLabel_image.getWidth(), jLabel_image.getHeight(), Image.SCALE_SMOOTH);
         jLabel_image.setIcon(new ImageIcon(image));
     }
     // disease Tomato_Yellow_Leaf_Curl_Virus
      public String[] getYellow_Leaf_Curl_Virus()
     {
         File file = new File(getClass().getResource("/Tomato___Early_blight/").getFile());
         String[] imagesList = file.list();
         return imagesList;
     }
         // display the image by index
     public void showYellow_Leaf_Curl_Virus(int index)
     {
         String[] imagesList = getImages();
          imageName = imagesList[index];
         ImageIcon icon = new ImageIcon(getClass().getResource("/Tomato___Early_blight/"+imageName));
         Image image = icon.getImage().getScaledInstance(jLabel_image.getWidth(), jLabel_image.getHeight(), Image.SCALE_SMOOTH);
         jLabel_image.setIcon(new ImageIcon(image));
     }
    

}
