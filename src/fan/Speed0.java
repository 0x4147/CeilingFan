package fan;

public class Speed0 implements FanSpeedState{
	Fan fan;
	
	public Speed0(Fan newFan) {
		fan = newFan;
	}
	
	@Override
	public void cord1() {
		fan.setFanSpeedState(fan.getSpeed1());
		System.out.println("Fan speed has been set to 1");
		fan.getCurrentDirectionState();
	}

	@Override
	public void getSpeedState() {
		System.out.println("Current fan Speed is 0");
	}

	@Override
	public int getSpeed() {
		return 0;
	}

}
