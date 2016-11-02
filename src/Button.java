
public class Button {
	private Lamp theLamp;
	private Alarm theAlarm;
	private Car theCar;
	
	private Mode mode; //enum
	
	public Button(Alarm theAlarm, Lamp theLamp, Car theCar) {
		
		this.theAlarm = theAlarm;
		this.theLamp = theLamp;
		this.theCar = theCar;
	}
	
	public void setMode(Mode mode) {
		this.mode = mode;
	}
	
	public void pressed() {
		switch(mode) {
		case LAMP:
			theLamp.turnOn();
			break;
			
		case ALARM:
			theAlarm.Start();
			break;
			
		case CAR:
			theCar.EngineOn();
			break;
		}
	}

}
