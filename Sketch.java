import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
  float flowerX;
  float flowerY;
  float petalSize = 30;
  float petalDistance = petalSize / 2;

  int r = 242;
  int g = 255;
  int b = 59;

  boolean upPressed = false;
  boolean downPressed = false;
  boolean leftPressed = false;
  boolean rightPressed = false;

	public void settings() {
	   size(600, 600);
	}
	  
	public void setup() {
	   strokeWeight(1);
     background(125, 235, 250);
	}

	public void draw() {
		flowerX = mouseX;
    flowerY = mouseY;

	   fill(94, 219, 98);
	   rect(0, 550, 600, 100);
	   
	   fill(r, g, b);
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
      PImage img;
      img = loadImage("zabling.png");
      image(img, mouseX, mouseY, width/10, height / 10);
  }

  @Override
  public void mouseWheel() {
      super.mouseWheel();
      PImage img;
      img = loadImage("floppa.jpg");
      image(img, mouseX, mouseY, width/6, height/10);
  }

  @Override
  public void keyPressed() {
    if(keyCode == UP){
      r = 2;
      g = 247;
      b = 235;
      upPressed = true;
    }
    else if(keyCode == DOWN){
      r = 212;
      g = 57;
      b = 194;

      downPressed = true;
    }
    else if(keyCode == LEFT){
      r = 57;
      g = 212;
      b = 106;

      leftPressed = true;
    }
    else if(keyCode == RIGHT){
      r = 240;
      g = 46;
      b = 46;

      rightPressed = true;
    }
  }

  @Override
  public void keyReleased() {
    r = 242; 
    g = 255;
    b = 59;
    upPressed = false;
    downPressed = false;
    leftPressed = false;
    rightPressed = false;
  }

}
