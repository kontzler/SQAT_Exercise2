
// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID:
// Finish time:

public class PlanetExplorer {
	public int x;
	public int y;
	public String orientation = "N";
	public int pos_x = 0;
	public int pos_y = 0;
	
	public PlanetExplorer(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use: For a 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  
		 
	 */
	
		this.x=x;
		this.y=y;
	}
	
	public void Moving(char command){
	
		
		if(command=='r'){
			if(orientation=="N")orientation="E";
			else if (orientation=="E")orientation = "S"; 
			else if(orientation=="S")orientation="W"; 
			else if(orientation=="W")orientation="N";
		}
		
		if(command=='l'){
			if(orientation=="N")orientation="W";
			else if (orientation=="E")orientation = "N"; 
			else if(orientation=="S")orientation="E"; 
			else if(orientation=="W")orientation="S"; 
			
		}
		if(command=='f'){
			if(orientation=="N")pos_y++;
			if (orientation=="E")pos_x++;
			if(orientation=="S")pos_y--; 
			if(orientation=="W")pos_x--; 
		}
		
		if(command=='b'){
			if(orientation=="N")pos_y--;
			if (orientation=="E")pos_x--;
			if(orientation=="S")pos_y++;
			if(orientation=="W")pos_x++; 
			
		}
		
		if (pos_x==100)pos_x=1;
		if(pos_x==-1)pos_x=99;
		if(pos_y==100)pos_y=1;
		if(pos_y==-1)pos_y=99;
		
	}
	
	
	public String executeCommand(String command){
		int i = 0;
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		if(command=="")return "("+this.pos_x+","+this.pos_y+","+orientation+")";
		else
			for(i=0;i<command.length();i++)Moving(command.charAt(i));
			
		
		
		return null;
	}
}

