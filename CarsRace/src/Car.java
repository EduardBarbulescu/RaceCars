import java.util.Random;

public class Car {

	private String name;
	private int speed;
	private int location;
	private int race;

	private static int length = 1000;
	private static int minSpeedForAll = 0;
	private static int maxSpeedForAll = 120;
	private static Random generator = new Random();

	public Car(String name, int speed, int location, int race) {
		setName(name);
		setSpeed(speed);
		setLocation(location);
		setRace(race);
	}

	private void setRace(int race2) {
		this.race=race;
		
	}

	public void locationchange() {
		setLocation(speed + location);

	}

	public void accelerate(int increase) {
		setSpeed(speed + increase);
	}

	public void deaccelerate(int decrease) {
		setSpeed(speed - decrease);
	}

	public void randomSpeedChange() {
		setSpeed(speed + generator.nextInt(21) - 10);
	}

	public Car(String name, int speed) {
		setName(name);
		setSpeed(speed);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > maxSpeedForAll) {
			speed = maxSpeedForAll;
		} else if (speed < minSpeedForAll) {
			speed = minSpeedForAll;
		} else {
			this.speed = speed;
		}
	}

	public int getLocation() {
		return location;
	}
	
	public int getRace()
	{
		return race;
	}

	public void setLocation(int location) {
		if (location > length) {
			location = length;
		} else {
			this.location = location;
		}
	}

	public String toString() {

		String result;
		result = "Name: " + name + " Speed: " + speed + " location: "
				+ location;
		return result;
	}

}