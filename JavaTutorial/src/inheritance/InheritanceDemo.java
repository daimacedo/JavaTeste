package inheritance;

import javax.swing.plaf.synth.SynthSeparatorUI;

import constructorDemo.Car;

public class InheritanceDemo {

	public static void main(String[] args) {
		
		Cars c1 = new Cars();
		c1.increaseSpeed();
		
		// create an instance of BWM class
		BMW bmw1 = new BMW();
		// printing the same thing of Cars class because in the BWM class i dont yet
		//override the code
		bmw1.decreaseSpeed();
		
		BMW bmw2 = new BMW();
		bmw2.ValordoCarro(100);
	
		
		Cars c2 = new Cars();
		c2.ValordoCarro(100);
		
		BMW teste = new BMW();
		teste.increaseSpeed();
		
		

	}

}
