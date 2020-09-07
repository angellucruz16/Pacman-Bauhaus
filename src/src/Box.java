package src;


import processing.core.*;

	public class Box extends Display {
	

		public Box(PApplet sketch) {
		        super (sketch);
}
		String image1;
		
		public enum type {
			
			FRUIT,PACDOTS,EMPTY,GHOST,PACMAN,BARRIER
			
		}
		public void addFruit () {
			image1= "/Imagenes/image_FRUIT.png";
			
			
		}//AddFruit
		public void addPacdots () {
			image1= "/Imagenes/Imagenes/Pacdot.png";
			
			
		}//AddPacdots
		public void leaveEmpty () {
			image1=null;
		
			
		}//LeaveEmpty

		public void addGhost () {
			image1= "/Imagenes/image_GHOST.png";
	
	
	
		}//AddGhost

		public void addPacman () {
			image1= "/Imagenes/Imagenes/Pacman.png";
	
	
		}//AddPacman
		
		public void addBarrier () {
			image1= "/Imagenes/imageBARRIER.png";
			
		}//AddBarrier
		
		public void render(float posX, float posY ) {
			if(image1!=null) {
				
				

				img = sketch.loadImage(image1);
				img.resize(4,4);
				if(image1.equals("/Imagenes/Imagenes/Pacman.png") )
					img.resize(20, 20);

				 sketch.image(img, posX, posY);
				 
			}
				
		
			
		}
		
}