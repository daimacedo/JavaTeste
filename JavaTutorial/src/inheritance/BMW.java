package inheritance;

public class BMW extends Cars{
	
	//When i extend a class if the parent class has one constructor i have to define 
	// one constructor in the child class with the same arguments
	
	// Here I can override an method from parent class
	// i can write all of them or just click with right button > source > implement override
	// If i set the method with de notation @override i should have create a method named as a method
	// in Parent class
	//@Override
	public void decreaseSpeed(){
		// Here i am calling the method decrease from Cars
	
	//	super.decreaseSpeed();
		
		System.out.println("Increasing speed of BMW");
	}
	
	@Override
	public void ValordoCarro(int valor)
	{
		this.nome = "Macedo";
		this.valor = valor + 5000;
		System.out.println("----------Class BMW------------");
		System.out.println(this.valor);
		System.out.println(nome);
	}
	
	
	
	
}
