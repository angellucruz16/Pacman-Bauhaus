package src;
import processing.core.*;

public class Scores extends Display {
	
	public Scores (PApplet sketch) {
		super (sketch);

		  img = sketch.loadImage("/Imagenes/Scores.png");
	} 
	
	//public enum type () {
		
		//PACDOTS,FRUIT,GHOST;
		
		
		
	//} 
	
	public void render () {
		sketch.image(img, 0, 0);
		
	}
}
