import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
  float flowerX;
  float flowerY;
  float petalSize = 30;
  float petalDistance = petalSize / 2;
  PImage img;

  boolean upPressed = false;
  boolean downPressed = false;
  boolean leftPressed = false;
  boolean rightPressed = false;

	public void settings() {
	   size(600, 600);
	}
	  
	public void setup() {
	   background(125, 235, 250);
	}

	public void draw() {

		flowerX = mouseX;
    flowerY = mouseY;
	   // GROUND
	   fill(94, 219, 98);
	   rect(0, 550, 600, 100);
	   
	   fill(242, 255, 59);
	   ellipse(0, 0, 100, 100);

     fill(255, 128, 0);
  

     if(keyPressed){
      if(key == 'r'){
        background(255,128,128);
      }
      else if(key == 'p'){
        background(255,153,255);
      }
    }
    
    if(mousePressed){
      ellipse(flowerX - petalDistance, flowerY - petalDistance, petalSize, petalSize);

      // upper-right petal
      ellipse(flowerX + petalDistance, flowerY - petalDistance, petalSize, petalSize);

      // lower-left petal
      ellipse(flowerX - petalDistance, flowerY + petalDistance, petalSize, petalSize);

      // lower-right petal
      ellipse(flowerX + petalDistance, flowerY + petalDistance, petalSize, petalSize);

      // center petal
      fill(255, 0, 0);
      ellipse(flowerX, flowerY, petalSize, petalSize);
    }

	}
  @Override
  public void mouseReleased() {
      super.mouseReleased();
      img = loadImage("zabling.png");
      image(img, mouseX, mouseY, width/10, height / 10);
  }

  @Override
  public void mouseWheel() {
      // TODO Auto-generated method stub
      super.mouseWheel();
      img = loadImage("floppa.jpg");
      image(img, mouseX, mouseY, width/6, height/10);
  }
  
  @Override
  public void keyTyped() {
      // TODO Auto-generated method stub
      super.keyTyped();
      String message = "";
      message += key;
      text(message, 25, 150);
  }


}