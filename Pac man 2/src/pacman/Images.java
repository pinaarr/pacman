package pacman;

import java.awt.Image;
import javax.swing.ImageIcon;



public class Images extends ImageIcon {
  private Image heart,ghost;
  private Image up, down, left, right;
	 private void loadImages() {
	    	
	  down = new ImageIcon(Model.class.getResource("/down.gif")).getImage();
	   up= new ImageIcon(Images.class.getResource("/up.gif")).getImage();
	   left = new ImageIcon("C:/resim/left.gif").getImage();
	   right = new ImageIcon("C:/Images/right.gif").getImage();
	   ghost = new ImageIcon(Image.class.getResource("C:/resim/ghost.gif")).getImage();
	     heart = new ImageIcon("C:/Images/heart.png").getImage();


}
}