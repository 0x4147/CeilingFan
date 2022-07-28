package fan;

public class Fan {
	FanSpeedState speedState;
	FanDirectionState directionState;
	
	FanSpeedState speed0;
	FanSpeedState speed1;
	FanSpeedState speed2;
	FanSpeedState speed3;
	FanDirectionState clockwise;
	FanDirectionState anticlockwise;
	
	public Fan(){
		speed0 = new Speed0(this);
		speed1 = new Speed1(this);
		speed2 = new Speed2(this);
		speed3 = new Speed3(this);
		clockwise = new Clockwise(this);
		anticlockwise = new Anticlockwise(this);
		
		speedState = speed0; 
		directionState = clockwise;
	}
	
	void setFanSpeedState(FanSpeedState newSpeedState) {
		speedState = newSpeedState;
	}
	
	void setFanDirectionState(FanDirectionState newDirectionState) {
		directionState = newDirectionState;
	}
	
	FanSpeedState getSpeed0() {
		return speed0;
	}

	FanSpeedState getSpeed1() {
		return speed1;
	}
	
	FanSpeedState getSpeed2() {
		return speed2;
	}
	
	FanSpeedState getSpeed3() {
		return speed3;
	}
	
	FanDirectionState getclockwise() {
		return clockwise;
	}
	
	FanDirectionState getAnticlockwise() {
		return anticlockwise;
	}
	
	public void getCurrentFanState() {
		System.out.println("*----------------------------------------------*");
		speedState.getSpeedState();
		directionState.getDirectionState();
		System.out.println("*----------------------------------------------*\n");
	}
	
	public void getCurrentSpeedState() {
		speedState.getSpeedState();
	}	

	public void getCurrentDirectionState() {
		directionState.getDirectionState();
	}
	
	public int getCurrentSpeed() {
		return speedState.getSpeed();
	}
	
	public String getCurrentDirection() {
		return directionState.getDirection();
	}
	public void cord1() {
		System.out.println("*----------------------------------------------*");
		speedState.cord1();
		System.out.println("*----------------------------------------------*\n");
	}
	
	public void cord2() {
		System.out.println("*----------------------------------------------*");
		directionState.cord2();
		System.out.println("*----------------------------------------------*\n");
	}	
}
