/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classifyimages;

import static classifyimages.MainFrame.pos;
import java.io.IOException;

/**
 *
 * @author Mahmoud
 */
public class Next_prev {
    DisplayImages dimg =new DisplayImages();
    
   public void bacterial_spot_next() throws IOException
    {
         pos = pos + 1;
       if(pos >= dimg.getBacterial_spot().length)
       {
           pos  = dimg.getBacterial_spot().length - 1;
       }
       dimg.showBacterial_spot(pos);
    }
    public void bacterial_spot_prev() throws IOException
    {
        pos = pos - 1;
       if(pos < 0)
       {
           pos = 0;
       }
       dimg.showBacterial_spot(pos);
    }
    
    
   /// Early_blight 
    
    public void early_blight_next()
    {
         pos = pos + 1;
       if(pos >= dimg.getEarly_blight().length)
       {
           pos  = dimg.getEarly_blight().length - 1;
       }
       dimg.showEarly_blight(pos);
    }
    public void early_blight_prev()
    {
        pos = pos - 1;
       if(pos < 0)
       {
           pos = 0;
       }
       dimg.showEarly_blight(pos);
    }
    
    //Late_blight
    public void late_blight_next()
    {
         pos = pos + 1;
       if(pos >= dimg.getLate_blight().length)
       {
           pos  = dimg.getLate_blight().length - 1;
       }
       dimg.showLate_blight(pos);
    }
    public void late_blight_prev()
    {
        pos = pos - 1;
       if(pos < 0)
       {
           pos = 0;
       }
       dimg.showLate_blight(pos);
    }
    
    //getLeaf_Mold
   public void leaf_Mold_next()
    {
         pos = pos + 1;
       if(pos >= dimg.getLeaf_Mold().length)
       {
           pos  = dimg.getLeaf_Mold().length - 1;
       }
       dimg.showLeaf_Mold(pos);
    }
    public void leaf_Mold_prev()
    {
        pos = pos - 1;
       if(pos < 0)
       {
           pos = 0;
       }
       dimg.showLeaf_Mold(pos);
    } 
    
    //get Septoria_leaf_spot
    public void septoria_leaf_spot_next()
    {
         pos = pos + 1;
       if(pos >= dimg.getSeptoria_leaf_spot().length)
       {
           pos  = dimg.getSeptoria_leaf_spot().length - 1;
       }
       dimg.showSeptoria_leaf_spot(pos);
    }
    public void septoria_leaf_spot_prev()
    {
        pos = pos - 1;
       if(pos < 0)
       {
           pos = 0;
       }
       dimg.showSeptoria_leaf_spot(pos);
    } 
    
    // get Spider mite
     public void spider_mite_next()
    {
         pos = pos + 1;
       if(pos >= dimg.getSpider_mites().length)
       {
           pos  = dimg.getSpider_mites().length - 1;
       }
       dimg.showSpider_mites(pos);
    }
    public void spider_mite_prev()
    {
        pos = pos - 1;
       if(pos < 0)
       {
           pos = 0;
       }
       dimg.showSpider_mites(pos);
    }
    
    // get Target Spot
    public void target_spot_next()
    {
         pos = pos + 1;
       if(pos >= dimg.getTarget_Spot().length)
       {
           pos  = dimg.getTarget_Spot().length - 1;
       }
       dimg.showTarget_Spot(pos);
    }
    public void target_spot_prev()
    {
        pos = pos - 1;
       if(pos < 0)
       {
           pos = 0;
       }
       dimg.showTarget_Spot(pos);
    }
    
    //get  tomato mosaic virus
    public void mosaic_virus_next()
    {
         pos = pos + 1;
       if(pos >= dimg.getTomato_mosaic_virus().length)
       {
           pos  = dimg.getTomato_mosaic_virus().length - 1;
       }
       dimg.showTomato_mosaic_virus(pos);
    }
    public void mosaic_virus_prev()
    {
        pos = pos - 1;
       if(pos < 0)
       {
           pos = 0;
       }
       dimg.showTomato_mosaic_virus(pos);
    }
    
    // get yellow leaf curv virus
    public void yellow_curv_virus_next()
    {
         pos = pos + 1;
       if(pos >= dimg.getYellow_Leaf_Curl_Virus().length)
       {
           pos  = dimg.getYellow_Leaf_Curl_Virus().length - 1;
       }
       dimg.showYellow_Leaf_Curl_Virus(pos);
    }
    public void yellow_curv_virus_prev()
    {
        pos = pos - 1;
       if(pos < 0)
       {
           pos = 0;
       }
       dimg.showYellow_Leaf_Curl_Virus(pos);
    }
    
}
