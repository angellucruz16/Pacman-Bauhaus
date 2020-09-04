package src;

import java.lang.reflect.Array;
import java.util.ArrayList;

import processing.core.PApplet;
public class System extends PApplet {
	
	MainMenu mainMenu;
	SelectPlayer selectPlayer;
	NewPlayer newPlayer;
	ArrayList<String> letters;
	
	int state;
	
	int posX=516;
	int posY=212;

	
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
	
		state=1;
	} //settings


	public void setup () {
		background (255);



	} //setup

	public void draw() {
		
		//m.render(); //m es el nombre que le dimos
		switch (state) {
		case 1:
			mainMenu.render();
			break;
			
		case 2:
			selectPlayer.render();
			break;

		case 3:
			background (0); //scores
			break;
			
		case 4:
			newPlayer.render();
			break;
		}




	}//draw

	public void mouseClicked () {
		PApplet.println(mouseX);
		PApplet.println(mouseY);
		
		switch (state) {
		case 1:
			if (mouseX > posX && mouseX < posX + 197
				&& mouseY > posY && mouseY < posY+70 )	
				state = 2;
			
			if (mouseX > posX && mouseX < posX + 197
				&& mouseY > 291 && mouseY < 291 +39)
				state = 3;
			
			if (mouseX > posX && mouseX < posX + 197
				&& mouseY >  342 && mouseY< 342 + 33)
				exit (); 
			
			break;
			
		case 2:
			
			if (mouseX > 596 && mouseX < 596+ 118 //Play
				&& mouseY > 462 && mouseY < 462 + 32)
			{}	
			if (mouseX > 520 && mouseX < 520 + 197 //button 1
				&& mouseY > 279 && mouseY < 279 + 39)
				selectPlayer.bottonOneRed();
				//PApplet.println("entre");
			
			if (mouseX > 520 && mouseX < 520 + 197
					&& mouseY > 328 && mouseY < 328 + 39) //Button 2
				selectPlayer.bottonTwoRed();
			
			if (mouseX > 520 && mouseX < 520 + 197
					&& mouseY > 377 && mouseY < 377 + 39) // Button 3
				selectPlayer.bottonThreeRed();
			
			if (mouseX > 520 && mouseX < 520 + 66 // Delete
				&& mouseY > 472 && mouseY < 472 + 32)
				PApplet.println("entre");
			
			if (mouseX > 596 && mouseX < 596 + 118 // New Player
				&& mouseY > 472 && mouseY < 472 + 32)
				state = 4;
			
			break;
			
		case 4:
			if (mouseX > 600 && mouseX < 600 + 118
				&& mouseY > 396 && mouseY < 396 + 32) // Save
				
				switch (selectPlayer.getcurrentPlayer()) {
				
				case 1: 
					selectPlayer.setNameP1(String.join("", letters));
					
					state=2;
				break;
				}
			
			break;
			
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
			
		
		
	
		break;
		
		}//Switch
		
		
	} //KeyPressed

}