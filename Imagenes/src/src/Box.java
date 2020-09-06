package src;


import processing.core.*;

	public class Box extends Display {
	

		public Box(PApplet sketch) {
		        super (sketch);
}
		String image;
		public enum type {
			
			FRUIT,PACDOTS,EMPTY,GHOST,PACMAN,BARRIER
			
		}
		public void addFruit () {
			image= "/Imagenes/image_FRUIT.png";
			
			
		}//AddFruit
		public void addPacdots () {
			image= "/Imagenes/image_PACDOTS.png";
			
			
		}//AddPacdots
		public void leaveEmpty () {
			image=null;
		
			
		}//LeaveEmpty

		public void addGhost () {
			image= "/Imagenes/image_GHOST.png";
	
	
	
		}//AddGhost

		public void addPacman () {
			image= "/Imagenes/image_PACMAN.png";
	
	
		}//AddPacman
		
		public void addBarrier () {
			image= "/Imagenes/imageBARRIER.png";
			
		}//AddBarrier
		
}