package src;
import processing.core.*;
public class SelectPlayer extends Display{
	
	public int rRect1; //Colores rectangulos
	public int gRect1;
	public int bRect1;
	
	public int rRect2;
	public int gRect2;
	public int bRect2;
	
	public int rRect3;
	public int gRect3;
	public int bRect3;
	
	public String player1; //
	public String player2;
	public String player3;
	
	public int currentPlayer;
	
	
	public SelectPlayer(PApplet sketch) {
		super (sketch);

		  img = sketch.loadImage("/Imagenes/Select player.png");
		  
		  rRect1 = 20;
		  gRect1 = 86;
		  bRect1 = 186;
		  
		  rRect2 = 20;
		  gRect2 = 86;
		  bRect2 = 186;

		  rRect3 = 20;
		  gRect3 = 86;
		  bRect3 = 186;
		  
		  player1 = "SELECT TO SET";
		  player2 = "SELECT TO SET";
		  player3 = "SELECT TO SET";

		 currentPlayer = 0;
	}

public void render () {
	
	sketch.noStroke();
	sketch.image(img, 0, 0);
	
	sketch.fill (rRect1, gRect1, bRect1); //bot�n 1
	sketch.rect(453,324,244,42);
	
	sketch.fill (rRect2, gRect2, bRect2); // boton 2
	sketch.rect(453,383, 244, 42);
	
	sketch.fill (rRect3, gRect3, bRect3); // boton 3
	sketch.rect(453,443, 244, 42);
	
	
	sketch.textSize(14);
	sketch.fill(255);
	sketch.text(player1,526,350);
	
	sketch.text(player2,526,350+60);
	
	sketch.text(player3,526,350+120);
    }

public void bottonOneRed() {
	//186, 20, 20
	  rRect1 = 186;
	  gRect1 = 20;
	  bRect1 = 20;
	  
	  rRect2 = 20;
	  gRect2 = 86;
	  bRect2 = 186;

	  rRect3 = 20;
	  gRect3 = 86;
	  bRect3 = 186;
	  
	currentPlayer =1;
	
}

public void bottonTwoRed() {
	//186, 20, 20
	  rRect2 = 186;
	  gRect2 = 20;
	  bRect2 = 20;
	  
	  rRect1 = 20;
	  gRect1 = 86;
	  bRect1 = 186;

	  rRect3 = 20;
	  gRect3 = 86;
	  bRect3 = 186;
	  
	  currentPlayer=2;

}
public void bottonThreeRed() {
	//186, 20, 20
	  rRect3 = 186;
	  gRect3 = 20;
	  bRect3 = 20;
	  
	  rRect1 = 20;
	  gRect1 = 86;
	  bRect1 = 186;

	  rRect2 = 20;
	  gRect2 = 86;
	  bRect2 = 186;
	  
	  currentPlayer =3;

}
public void setNameP1 (String newName){
	
	player1 = newName;
	
	
} //SETNAMEP1

public void setNameP2 (String newName){
	
	player2 = newName;
	
	
} //SETNAMEP2

public void setNameP3 (String newName){
	
	player3 = newName;
	
	
} //SETNAME3

public int getcurrentPlayer () {
	
	return currentPlayer;
	
} //getcp
}

