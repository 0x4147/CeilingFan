package testfan;
import fan.Fan;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FanTest {

	@Test
	void fanSetup() {
		Fan fan = new Fan();
		assertEquals(0, fan.getCurrentSpeed());
		assertEquals("Clockwise", fan.getCurrentDirection());
	}

	@Test
	void fanSpeedTest() {
		Fan fan = new Fan();
		fan.cord1();
		assertEquals(1, fan.getCurrentSpeed());
		fan.cord1();
		assertEquals(2, fan.getCurrentSpeed());
		assertEquals("Clockwise", fan.getCurrentDirection());
		fan.cord1();
		assertEquals(3, fan.getCurrentSpeed());
		fan.cord1();
		assertEquals(0, fan.getCurrentSpeed());
		assertEquals("Clockwise", fan.getCurrentDirection());
	}
	
	@Test
	void fanDirectionTest() {
		Fan fan = new Fan();
		assertEquals("Clockwise", fan.getCurrentDirection());
		fan.cord2();
		assertEquals("Anticlockwise", fan.getCurrentDirection());
		fan.cord2();
		assertEquals("Clockwise", fan.getCurrentDirection());
	}

}
