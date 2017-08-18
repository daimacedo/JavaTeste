package constructorDemo;

public class Car {

	private String make;
	int speed;
	int gear;
	
	// I can't create two constructor equals, i need put distincts arguments on it
	// The constructor always is named as the class name
	public Car()
	{
		speed = 0;
		gear = 0;
	}
	
	public Car (int speed, int gear)
	{
		this.speed = speed;
		this.gear = gear;
		
	}
	public void setCar(String make)
	{
		this.make = make;
	}

	public String getCar()
	{
		return make;
	}

}
