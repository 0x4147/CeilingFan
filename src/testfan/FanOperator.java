package testfan;

import fan.Fan;

public class FanOperator {

	public static void main(String[] args) {
		Fan myFan = new Fan ();
		myFan.getCurrentFanState();
		myFan.cord1();
		myFan.cord1();
		myFan.cord2();
		myFan.cord1();
		myFan.cord1();
		myFan.cord2();	
		myFan.getCurrentFanState();
	}

}
