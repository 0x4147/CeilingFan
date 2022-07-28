package fan;

public class Speed3 implements FanSpeedState{
	Fan fan;
	
	public Speed3(Fan newFan) {
		fan = newFan;
	}
	
	@Override
	public void cord1() {
		fan.setFanSpeedState(fan.getSpeed0());
		System.out.println("Fan speed has been set to 0");
		fan.getCurrentDirectionState();
	}

	@Override
	public void getSpeedState() {
		System.out.println("Current fan Speed is 3");
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return 3;
	}

}
