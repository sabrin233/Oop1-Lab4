package oop1Lab4;

public class BicycleTest {

	public static void main(String[] args) {
		Bicycle b1= new Bicycle();
		b1.setGear(2);
		b1.setSpeed(200);
		b1.showinfo();
		
		Bicycle b2= new Bicycle(3,300);
		b2.showinfo();
		
		MountainBike mb1 = new MountainBike();
		mb1.setSeatheight(4);
		mb1.setGear(6);
		mb1.setSpeed(400);
		mb1.showinfo();
	}

}
