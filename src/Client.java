
public class Client {
	public static void main(String[] args) {
		Lamp lamp = new Lamp();
		Alarm alarm = new Alarm();
		Car car = new Car();
		Button button = new Button(alarm, lamp, car);
		
		button.setMode(Mode.LAMP);
		button.pressed();
		
		button.setMode(Mode.ALARM);
		button.pressed();
		
		button.setMode(Mode.CAR);
		button.pressed();
	}
}
