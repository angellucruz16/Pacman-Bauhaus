package src;


import processing.core.*;

public class Playing extends Display {
	public String player1;
	public int currentPlayer;
	
	 
	
	public Playing (PApplet sketch,String name) {
		super (sketch);

		  img = sketch.loadImage("/Imagenes/Gaming.png");
		  player1 = name;
		 
	} 
	
	public void render () {
		sketch.image(img, 0, 0);

		sketch.textSize(14);
		sketch.fill(0);
		sketch.text(player1,561,110);
		
	}

	public void namePlayer1 (String name1) {
		player1 = name1;
		
	}
}
