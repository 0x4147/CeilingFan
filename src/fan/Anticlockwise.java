package fan;

public class Anticlockwise implements FanDirectionState{
	Fan fan;
	
	public Anticlockwise(Fan newFan) {
		fan = newFan;
	}
	
	@Override
	public void cord2() {
		fan.setFanDirectionState(fan.getclockwise());
		System.out.println("Fan direction has been set to clockwise");
		fan.getCurrentSpeedState();
	}

	@Override
	public void getDirectionState() {
		System.out.println("Current fan direction is anticlockwise");
	}

	@Override
	public String getDirection() {
		return "Anticlockwise";
	}

}
