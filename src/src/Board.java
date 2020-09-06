package src;


import processing.core.*;




public class Board extends Display {

	private int startTime;
	private int endTime;
	private int score;
	private Box [][] maze;	    


	public Board(PApplet sketch) {
		super (sketch);
		maze = new Box [30][20];

	}
	public Box setBox () {
		Box currentBox=null;
		for(int i =0; i<30; i++){
			
			for(int j =0; j<20; j++){
				
				if (i==5 && j==3 || i==5 && j==8  || i==7 && j==18)// aqui pongo todas las frutas
					maze [i][j].addFruit(); 
				if (i==5 && j==3 || i==5 && j==8  || i==7 && j==18) //Pacdots
						maze [i][j].addPacdots(); 
			}	
		}
		return currentBox;
	}


}//public void

