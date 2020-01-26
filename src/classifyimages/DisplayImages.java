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
    MainFrame mf = new MainFrame();
    d_imageName = mf.imageName;
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
}
