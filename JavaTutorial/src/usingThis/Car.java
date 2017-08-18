package usingThis;

public class Car {


	private String make;
	
	//the method set is responsable for ask for the value from a controler class
	// a voide methods dont need a return
	// for convention in Java the private attribute as named as its parameter but
	// in this case i have to use the keyword "this" to say that "this" parameter is about the
	// an instance of the class, or just about a class variable (a private variable)
	public void setCar(String make)
	{
		this.make = make;
	}
	
	//the method after the method have caught the value from set method return his value
	// the method get cant be a void method because it needs return a value
	// the type of the method should be exactly the type of the return if the return is a
	// String so the public method should be a string
	public String getCar()
	{
		return make;
	}
}
