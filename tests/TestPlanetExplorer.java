import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {
	PlanetExplorer PlanetExplorer = new PlanetExplorer(100,100,"(2,2)");
	
	
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
	
	@Test
	public void test_move_backward(){
		PlanetExplorer.executeCommand("f");
		PlanetExplorer.executeCommand("b");
		assertEquals("",0,PlanetExplorer.pos_y);
	}
	
	@Test
	public void test_stringmove(){
		PlanetExplorer.executeCommand("ffrff");
		assertEquals("","(2,2,E)",PlanetExplorer.executeCommand(""));
	}
	
	@Test
	public void test_y_loop(){
		PlanetExplorer.executeCommand("b");
		assertEquals("",99,PlanetExplorer.pos_y);
	}
	
	@Test
	public void test_x_loop(){
		PlanetExplorer.executeCommand("lf");
		assertEquals("",99,PlanetExplorer.pos_x);
	}
	
	@Test
	public void test_obstacle(){
		PlanetExplorer PlanetExplorer= new PlanetExplorer(100,100,"(1,0)");
		assertEquals("","(1,0)",PlanetExplorer.obstacle);
	}
	
	@Test
	public void test_locating_obstacle(){
		PlanetExplorer.executeCommand("ffrff");
		assertEquals("","(1,2,E)(2,2)",PlanetExplorer.executeCommand("report"));
	}
	
	@Test
	public void test_on_obstacle(){
		PlanetExplorer.pos_x=2;
		PlanetExplorer.pos_y=2;
		assertEquals("",true,PlanetExplorer.isOnObstacle());
		
	}
	
}
