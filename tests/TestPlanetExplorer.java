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
}
