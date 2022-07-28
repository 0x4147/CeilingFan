package fan;

public class Clockwise implements FanDirectionState{
	Fan fan;
	
	public Clockwise(Fan newFan) {
		fan = newFan;
	}
	
	@Override
	public void cord2() {
		fan.setFanDirectionState(fan.getAnticlockwise());
		System.out.println("Fan direction has been set to anticlockwise");
		fan.getCurrentSpeedState();
	}

	@Override
	public void getDirectionState() {
		System.out.println("Current fan direction is clockwise");
	}

	@Override
	public String getDirection() {
		return "Clockwise";
	}
}
