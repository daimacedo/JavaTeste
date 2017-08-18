package constructorDemo;


public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car();
		
		c1.setCar("BMW");
		//even i setted a default value on the constructor i can overwrite this value
		// as bellow
		c1.gear = 30;
		System.out.println(c1.getCar());
		// I called the parameters from variables created at CAR class and this parameters
		// are setted with a default value, in this case value zero to speed
		// but i overwrote the parameter gear whitin 30, so the printed value will be
		// zero for speed and 30 for gear
		System.out.println(c1.speed);
		System.out.println(c1.gear);
		
		
		// I can parametrize the values from constructor like this
		// in this case i am setting a value into the constructor arguments 
		Car c2 = new Car(1, 2);
		System.out.println("Setting a value using arguments from constructor");
		System.out.println(c2.gear);
		System.out.println(c2.speed);
						
	}

}
