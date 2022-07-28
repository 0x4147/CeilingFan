package fan;

public class Speed2 implements FanSpeedState{
	Fan fan;
	
	public Speed2(Fan newFan) {
		fan = newFan;
	}
	
	@Override
	public void cord1() {
		fan.setFanSpeedState(fan.getSpeed3());
		System.out.println("Fan speed has been set to 3");
		fan.getCurrentDirectionState();
	}

	@Override
	public void getSpeedState() {
		System.out.println("Current fan Speed is 2");
	}

	@Override
	public int getSpeed() {
		return 2;
	}

}
