package abstractClasses;

public class LegalPerson extends Person{

	public static void main(String[] args) {
		
		//it is impossible instanciate an object from a abstract class
		//Person p1 = new Person();
		
		//I can call a method from an abstract class
		LegalPerson l1 = new LegalPerson();
		l1.setTeste3(20);
		//or one attribute from there
		l1.teste1 = 1;
		
		

	}

	// If I have one abstract method in my abstract class i must implements the same method in my
	// child class
	@Override
	public void setNomePerson() {
	// here I can create same code to process this method
		
	}



}
