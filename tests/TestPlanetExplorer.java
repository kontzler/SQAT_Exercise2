import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_executeCommand() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_new_planet_x(){
		PlanetExplorer PlanetExplorer = new PlanetExplorer(100,100,"");
		assertEquals("",100,PlanetExplorer.x);
	}
}
