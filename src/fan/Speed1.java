package fan;

public class Speed1 implements FanSpeedState{
	Fan fan;
	
	public Speed1(Fan newFan) {
		fan = newFan;
	}
	
	@Override
	public void cord1() {
		fan.setFanSpeedState(fan.getSpeed2());
		System.out.println("Fan speed has been set to 2");
		fan.getCurrentDirectionState();
	}

	@Override
	public void getSpeedState() {
		System.out.println("Current fan Speed is 1");
	}

	@Override
	public int getSpeed() {
		return 1;
	}

}
