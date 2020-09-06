package src;


import processing.core.*;

public class Board extends Display {
	int posX=40;
	int PosY=40;

	private int startTime;
	private int endTime;
	private int score;
	private Box [][] maze;	    
	

	public Board(PApplet sketch) {
		super (sketch);
		maze = new Box [19][21];
	}
	
		public void renderArray () {
			
			
		int maze [][] = {
				
				{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
				{1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1},
				{1,0,4,4,0,2,2,2,0,1,0,2,2,2,0,4,4,0,1},
				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
				{1,0,2,2,0,3,0,5,5,5,5,5,0,3,0,2,2,0,1},
				{1,0,0,0,0,3,0,0,0,5,0,0,0,3,0,0,0,0,1},
				{1,1,1,1,0,3,3,3,0,5,0,3,3,3,0,1,1,1,1},
				{1,0,0,1,0,3,0,0,0,0,0,0,0,3,0,1,0,0,1},
				{1,1,1,1,0,3,0,1,1,0,1,1,0,3,0,1,1,1,1},
				{1,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,1},
				{1,1,1,1,0,2,0,1,1,1,1,1,0,2,0,1,1,1,1},
				{1,0,0,1,0,2,0,0,0,0,0,0,0,2,0,1,0,0,1},
				{1,1,1,1,0,2,0,3,3,3,3,3,0,2,0,1,1,1,1},
				{1,0,0,0,0,0,0,0,0,3,0,0,0,0,0,0,0,0,1},
				{1,0,3,3,0,4,4,4,0,3,0,4,4,4,0,3,3,0,1},
				{1,0,0,3,0,0,0,0,0,0,0,0,0,0,0,3,0,0,1},
				{1,0,0,3,0,2,0,5,5,5,5,5,0,2,0,3,0,0,1},
				{1,0,0,0,0,2,0,0,0,5,0,0,0,2,0,0,0,0,1},
				{1,0,2,2,2,2,2,2,0,5,0,2,2,2,2,2,2,0,1},				
				{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
				{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
		};
		
		for (int i = 0; i<19; i++) { //negro
            for (int j = 0; j<21; j++) { 
              if (maze[j][i] == 1) { 
            	  sketch.fill(0);
            	  sketch.rect(23*i+50, 23*j+200, 23, 23);
              }
              else if (maze[j][i] == 2) { // rojo
            	  sketch.fill(233, 82, 66);
            		  sketch.rect(23*i+50, 23*j+200, 23, 23);          		 
              }
              else if (maze[j][i] == 3) {  //amarillo
            	  sketch.fill(255, 209, 56);
            		  sketch.rect(23*i+50, 23*j+200, 23, 23);
            
              }
              else if (maze[j][i] == 4) {  // azul oscuro
            	  sketch.fill(29, 94, 166);
            		  sketch.rect(23*i+50, 23*j+200, 23, 23);	
            		  
              }
              else if (maze[j][i] == 5) { 
            	  sketch.fill(152, 208, 188); //Azul claro
            		  sketch.rect(23*i+50, 23*j+200, 23, 23);	
            		  
                  //app.image(tile,i15,j15+110);
              }
		}
        //    sketch.ellipse (posX, PosY)

	} 
		}
		}















	//public Box setBox () {
		/*Box currentBox=null;
		for(int i =0; i<30; i++){
			
			for(int j =0; j<20; j++){
				
				if (i==5 && j==3 || i==5 && j==8  || i==7 && j==18)//  frutas
					maze [i][j].addFruit(); 
				if (i==5 && j==3 || i==5 && j==8  || i==7 && j==18) //Pacdots
						maze [i][j].addPacdots(); 
				if (i>0 && i <19 && j==0 || i==18 && j>0 && j<21  || i==7 && j==18) //Barrier)
				maze [i][j].addBarrier();
				
			}	
		}v 
		return currentBox;
	}
*/


