package src;
import processing.core.*;

public class Playing extends Display {
	
	public Playing (PApplet sketch) {
		super (sketch);

		  img = sketch.loadImage("/Imagenes/Gaming.png");
	} 
	
	public void render () {
		sketch.image(img, 0, 0);
		
	}
}
