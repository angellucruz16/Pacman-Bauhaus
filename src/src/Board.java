package src;


import processing.core.*;

public class Board extends Display {
	int posX=36+49;
	int PosY=36+199;

	private int startTime;
	private int endTime;
	private int score;
	private Box [][] maze;	    
	private int mazeNum [][] =  {

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
			{1,0,0,0,0,0,0,0,0,6,0,0,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
	}; 



	public Board(PApplet sketch) {
		super (sketch);
		maze = new Box [19][21];
		fillMaze ();

	}

	public void renderArray () {

		for (int i = 0; i<19; i++) { //negro
			for (int j = 0; j<21; j++) { 
				if (mazeNum[j][i] == 1) { 
					sketch.fill(0);
					sketch.rect(23*i+50, 23*j+200, 23, 23);
				}
				else if (mazeNum[j][i] == 2) { // rojo
					sketch.fill(233, 82, 66);
					sketch.rect(23*i+50, 23*j+200, 23, 23);          		 
				}
				else if (mazeNum[j][i] == 3) {  //amarillo
					sketch.fill(255, 209, 56);
					sketch.rect(23*i+50, 23*j+200, 23, 23);

				}
				else if (mazeNum[j][i] == 4) {  // azul oscuro
					sketch.fill(29, 94, 166);
					sketch.rect(23*i+50, 23*j+200, 23, 23);	

				}
				else if (mazeNum[j][i] == 5) { 
					sketch.fill(152, 208, 188); //Azul claro
					sketch.rect(23*i+50, 23*j+200, 23, 23);	

					//app.image(tile,i15,j15+110);
				}
				else if (mazeNum[j][i]==0) { //A�adir Pacdots
					maze[i][j]= new Box(sketch);
					maze [i][j].addPacdots();
				}
				else if (mazeNum[j][i]==0) { //A�adir ghost1 
					maze[i][j]= new Box(sketch);
					maze [i][j].addGhost1();
				}
		}

		}
	} 


	public void renderMaze () {
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				maze [i][j].render(i*24+50,j*24+200);
			}
		}


	}

	public void fillMaze () {
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				maze [i][j]= new Box (sketch);
			}
		}


	}

	public boolean canGoUp (int posX, int posY){
		int [] pos = posMatriz(posX, posY);
		if (maze[pos[0]-1][pos[1]]!= null && mazeNum[pos[0]-1][pos[1]]==0)
			return true;
		return false;
	}//cangoup

	public boolean canGoDown (int posX, int posY){
		int [] pos = posMatriz(posX, posY);
		if (maze[pos[0]+1][pos[1]]!= null && mazeNum[pos[0]+1][pos[1]]==0)
			return true;
		return false;
	}//cangoup

	public boolean canGoLeft (int posX, int posY){
		int [] pos = posMatriz(posX, posY);
		if (maze[pos[0]][pos[1]-1]!= null && mazeNum[pos[0]][pos[1]-1]==0)
			return true;
		return false;
	}//cangoup

	public boolean canGoRight (int posX, int posY){
		int [] pos = posMatriz(posX, posY);
		if (maze[pos[0]][pos[1]+1]!= null && mazeNum[pos[0]][pos[1]+1]==0)
			return true;
		return false;
	}//cangoup

	public int [] posMatriz (int posX, int posY) { //saber posicion
		int [] ans = new int [2];
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {

				if (posX-50>24*i && posX-50< 24*(i+1) && posY-200> 24*j && posY-200< 24*(j+1))
				{ ans [0] = i;
				ans [1]= j;
				}
			}

		}
		return ans;
	}

	public int pacManleft(int posX, int posY) {
		return posX-24;	
	}//left

	public int pacManUp(int posX, int posY) {
		return posY-24;	
	}//up

	public int pacManDown(int posX, int posY) {
		return posY+24;	
	}//down
	public int pacManRight(int posX, int posY) {
		return posX+24;	
	}//right


	public void renderPacman (int a,int b,float height,float width, float start, float stop,float pie) {
		sketch.noStroke();
		sketch.fill(255, 209, 56);
		sketch.arc(a, b, height, width, start, stop);


	}
	public void renderGhost () {
	
	
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


