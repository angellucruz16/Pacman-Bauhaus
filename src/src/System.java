package src;

//import java.lang.reflect.Array;
import java.util.ArrayList;

import processing.core.PApplet;
public class System extends PApplet {
	
	MainMenu mainMenu;
	SelectPlayer selectPlayer;
	NewPlayer newPlayer;
	ArrayList<String> letters;
	Scores scores;
	Playing playing;
	String name;
	Board board;
	
	ArrayList <Player> players;
	
	int state;

	
	public static void main(String[] args) {
		String[] processingArgs = {"System"};
		System mySketch = new System();
		PApplet.runSketch(processingArgs, mySketch);


	}
	public void settings () {
		size (800,800);
		mainMenu = new MainMenu (this);
		
		selectPlayer = new SelectPlayer (this);
		
		newPlayer = new NewPlayer (this);
		
		letters = new ArrayList<String> ();
		
		scores = new Scores(this);
		
		playing = new Playing (this);
	
		players = new ArrayList <Player> ();
		
		players.add(new Player());
		players.add(new Player());
		players.add(new Player());
		board = new Board (this);
	
		state=1;
	} //settings


	public void setup () {
		background (255);



	} //setup

	public void draw() {
		
		
		switch (state) {
		case 1:
			mainMenu.render();
			break;
			
		case 2:
			selectPlayer.render();
			break;

		case 3:
			scores.render(); //scores
			break;
			
		case 4:
			newPlayer.render();
			break;
		case 5:
			playing.render();
			board.renderArray();
			
			
			
			break;
		
		}




	}//draw

	public void mouseClicked () {
		PApplet.println(mouseX);
		PApplet.println(mouseY);
		
		switch (state) {
		case 1: //MainMenu
			if (mouseX > 308 && mouseX < 308 + 184
				&& mouseY > 366 && mouseY < 366+34 )	// PLAY
				state = 2;
			
			if (mouseX > 308 && mouseX < 308 + 184
				&& mouseY > 414 && mouseY < 414 +34)  // SCORES
				state = 3;
			
			if (mouseX > 47 && mouseX < 47 + 83
				&& mouseY >  36 && mouseY< 36 + 34) //EXIT
				exit (); 
			
			break;
			
		case 2://Select Player
			
			if (mouseX > 557 && mouseX < 557+ 141 //Play
				&& mouseY > 563 && mouseY < 563 + 42) {
				PApplet.println(players.get(selectPlayer.getcurrentPlayer()-1));
				playing.currentPlayer= players.get(selectPlayer.getcurrentPlayer()-1);
				state = 5;
			}
				
			//PApplet.println("entre");
				
			if (mouseX > 453 && mouseX < 453 + 244 //button 1
				&& mouseY > 324 && mouseY < 324 + 42)
				selectPlayer.bottonOneRed();
				//PApplet.println("entre");
			
			if (mouseX > 453 && mouseX < 453 + 244
					&& mouseY > 383 && mouseY < 383 + 42) //Button 2
				selectPlayer.bottonTwoRed();
			
			if (mouseX > 453 && mouseX < 453 + 244
					&& mouseY > 443 && mouseY < 443 + 42) // Button 3
				selectPlayer.bottonThreeRed();
			
			if (mouseX > 453 && mouseX < 453 + 93 // Delete
				&& mouseY > 523 && mouseY < 523 + 26)
				PApplet.println("entre");
			
			if (mouseX > 557 && mouseX < 557 + 140 // Set Player
				&& mouseY > 523 && mouseY < 523 + 26)
				state = 4;
			
			break;
			
		case 3://Scores
			if (mouseX > 329 && mouseX < 329 + 141 
					&& mouseY > 642 && mouseY < 642 + 43)
					state = 1;
			//PApplet.println("entre");	
			break;
			
			
		case 4: //New player
			if (mouseX > 576 && mouseX < 576 + 141
				&& mouseY > 399 && mouseY < 399 + 42) // Save
			{
				switch (selectPlayer.getcurrentPlayer()) {
				
				case 1: 
					selectPlayer.setNameP1(String.join("", letters));
					
				break;
				
				case 2: 
					selectPlayer.setNameP2(String.join("", letters));
					
				break;
				
				case 3: 
					selectPlayer.setNameP3(String.join("", letters));
					
				break;
				}
				namePlayers();
			//	newPlayer = new NewPlayer (this);
				state=2;
			}
			break;
			
		case 5://Playing
			if (mouseX > 542 && mouseX < 542 + 184
					&& mouseY > 255 && mouseY < 255 + 34)
			//PApplet.println("entre");
			state = 1;
			
			if (mouseX > 542 && mouseX < 542 + 184
					&& mouseY > 301 && mouseY < 301 + 34)
			state = 3;
		}

		
	}
	
	public void keyPressed () {
		PApplet.println(key);
		
		switch(state) {
		
		case 4:
		
			if((key >= 'A' && key <= 'Z') || (key >= 'a' && key <= 'z')) {
				letters.add(key+"");
						
			}
			
			if(BACKSPACE==key)
			//PApplet.println("borrar");
			letters.remove(letters.size()-1);
			newPlayer.setName(String.join("", letters)); // se guarda en el nombre que se escribe
			
			name = newPlayer.getName();
		
	
		break;
		
		}//Switch
		
		
	} //KeyPressed
	
 public void namePlayers () {
	 players.get(selectPlayer.getcurrentPlayer()-1).name = String.join("", letters);
	 //String name = letters.get(0);
	// playing.namePlayer1(name);
	 
	 
 }//nameplayers
 
 
 
 
 
 
 
  
}