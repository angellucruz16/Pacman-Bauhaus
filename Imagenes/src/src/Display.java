package src;

import processing.core.PApplet;
import processing.core.PImage;

public class Display {
	
	PApplet sketch;
	public Display(PApplet sketch) {
		this.sketch=sketch;

	

	}

	PImage img;


	
	public void render () {
		
		 sketch.image(img, 0, 0);


	}//Render
}
