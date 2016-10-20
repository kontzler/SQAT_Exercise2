import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {
	PlanetExplorer PlanetExplorer = new PlanetExplorer(100,100,"");
	
	
	@Test
	public void test_executeCommand() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_new_planet_x(){
		assertEquals("",100,PlanetExplorer.x);
	}
	
	@Test
	public void test_new_planet_y(){
		assertEquals("",100,PlanetExplorer.y);
	}
	
	@Test
	public void test_get_position(){
		assertEquals("","(0,0,N)",PlanetExplorer.executeCommand(""));
	}
	
	@Test
	public void test_turn_right(){
		PlanetExplorer.executeCommand("r");
		assertEquals("","E",PlanetExplorer.orientation);
	}
	
	@Test
	public void test_turn_left(){
		PlanetExplorer.executeCommand("l");
		assertEquals("","W",PlanetExplorer.orientation);
	}
	
	@Test
	public void test_move_forward(){
		PlanetExplorer.executeCommand("f");
		assertEquals("",1,PlanetExplorer.pos_y);
	}
}
