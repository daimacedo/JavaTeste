import javax.swing.plaf.synth.SynthSeparatorUI;

public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Teste";
		System.out.println(str1);
		
		for(int i = 0; i < args.length; i++)
		{
			System.out.println(args[i]);
		}
		
		//Creating an object from CarClass
		// c1 is an object type CarClass
		CarClass c1 = new CarClass();
		//here i am printing the year from CarClass but i Can overwrite this value on my new class
		System.out.println(c1.year);
		//overwriting the year value
		CarClass c2 = new CarClass();
		c2.year= 2015;
		//now the year of the car will be 2015 because i overwrote that
		System.out.println(c2.year);
		// if i dont want that my attributes of Car is open here i can return this
		//attribute from a set method from CarClass like bellow
		CarClass c3 = new CarClass();
		System.out.println(c3.getCarYear());
		
	}

}

class CarClass{
	
	int year = 2000;
	String model = "BMW";
	
	public int getCarYear()
	{
		return this.year;
	}
	
}