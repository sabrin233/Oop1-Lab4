package oop1Lab4;

public class Bicycle {

	public int gear;
	public int speed;
	
	public Bicycle() {
		super();
	}

	public Bicycle(int gear, int speed) {
		super();
		this.gear = gear;
		this.speed = speed;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + "]";
	}
	
	public void showinfo() {
		System.out.println(gear+" "+speed);
	}
	
	
}
