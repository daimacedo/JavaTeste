package usingThis;

public class ThisKeywordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car();
		Car c2 = new Car();
		
		// I can create two objects with distincts values using the same class Car
		// and using the same method get and set
		
		c1.setCar("BMW");
		System.out.println(c1.getCar());

		c2.setCar("Benz");
		System.out.println(c2.getCar());
	}

}
