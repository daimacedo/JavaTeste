package abstractClasses;

public abstract class Person {
	
	// When i dont explicit the modifier i name this modifier "default" it is acessible by all
	//package
	int teste = 0;
	
	// a public modifier means i Can acess this method/variable in anywhere in my code
	public int teste1 = 0;
	
	// a private modifier means i Can acess this method/variable only by the same class
	private int teste3 = 0;
	
	//a protected modifier means i can acess this method in the same package and in child class outside
	// the package (an extended class)
	protected int teste4 = 0;
	

	// I can create a public method to become the private attribute available for others classes (security)
	// set receive a value from other class by parameter, is a void and dont return a value
	public void setTeste3(int teste3)
	{
		this.teste3 = teste3;
	}
	
	// the get return a value is not void and the return should be same type of the method
	public int getTest3()
	{
		return this.teste3;
	}
	
	
	//--------------------------------------------Start Here----------------------------------
	
	/* 1- An abstract class cant be Instantiated it means i cant creat an object typed Person
	   2- I can have public and private methods, and that methods can be called by other classes in other 
	   object type
	   3- If i want have a abstract method I have to have a Abstract class, I cant define i abstract
	   methods in non-abstract class 
	*/
	
	// I cant implements any code in a abstract method
	// this method must implement in a child class
	// Just the signature method
	
	//important: http://www.devmedia.com.br/interfaces-x-classes-abstratas/13337
	public abstract void setNomePerson();
	
	
	
	
	
	
}
