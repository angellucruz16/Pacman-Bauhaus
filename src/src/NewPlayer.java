package src;
import processing.core.*;

public class NewPlayer extends Display {

    String name;
 

    public NewPlayer(PApplet sketch) {
        super (sketch);

        name = "Type New Name";

          img = sketch.loadImage("/Imagenes/New player.png");
    } 

    public void render () {
        sketch.image(img, 0, 0);

        sketch.text(name,505,360);
    }
    public void setName (String newName) {
        name = newName;

    }
  public String getName () {
	  return name;
	  
  }
}
