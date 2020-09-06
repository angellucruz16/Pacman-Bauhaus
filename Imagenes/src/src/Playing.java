package src;


import processing.core.*;

public class Playing extends Display {
	public Player currentPlayer;
	public  NewPlayer name;
	 
	
	public Playing (PApplet sketch) {
		super (sketch);

		  img = sketch.loadImage("/Imagenes/Gaming.png");
		 // if (name.getName()!=null)
			//  player1 = "" +name.getName();
		
	} 
	
	public void render () {
		sketch.image(img, 0, 0);

		sketch.textSize(14);
		sketch.fill(0);
		sketch.text(currentPlayer.name,561,110);
		
	}


	
}
