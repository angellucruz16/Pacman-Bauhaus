package src;


import processing.core.*;

	public class Player extends Display {
	
	   String name;
	    int score;
	    int time;
	    

	public Player(PApplet sketch) {
	        super (sketch);
		
		
	}
	
	public void setName (String newName) {
	        name = newName;

	    }
    public void setScore (int score) {
    	
    	this.score = score;
    	
    }//setscore
    public void setTIME (int time) {
    	
    	this.time = time;
    	
    }//set time
}
