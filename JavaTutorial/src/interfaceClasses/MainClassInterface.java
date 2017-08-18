package interfaceClasses;

public class MainClassInterface {

	public static void main(String[] args) {
		
		
		//implementando dessa forma eu nao consigo ter acesso a metodos publicos que foram criados
		//dentro da classe que implementa a interface
		InterfaceClass i1FromInterface = new ImplementsInterface();
		i1FromInterface.interfaceMethod1();
		
		
		ImplementsInterface i2FromInterface = new ImplementsInterface();
		i2FromInterface.interfaceMethod1();
				
	}

}
