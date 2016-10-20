
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
	
	public String executeCommand(String command){

		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		if(command=="r"){
			if(orientation=="N"){orientation="E";return null;}
			if (orientation=="E"){orientation = "S"; return null;}
			if(orientation=="S"){orientation="W"; return null;}
			if(orientation=="W"){orientation="N"; return null;}
		}
		
		if(command=="l"){
			if(orientation=="N"){orientation="W";return null;}
			if (orientation=="E"){orientation = "N"; return null;}
			if(orientation=="S"){orientation="E"; return null;}
			if(orientation=="W"){orientation="S"; return null;}
			
		}
		
		if(command=="")return "("+this.pos_x+","+this.pos_y+","+orientation+")";
		
		return "("+this.pos_x+","+this.pos_y+","+orientation+")";
	}
}

