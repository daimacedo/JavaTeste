package switchDemo;

public class ForLooping {

	public static void main(String[] args) {
		
		int[] numbers= {1,5,6,7,9};
		for(int i=0; i <numbers.length; i++)
		{
			System.out.println("The value of number in position " + i + " is: " + numbers[i]);
		}
		
		String[] names = {"dai", "ana"};
		for(String name :names)
		{
			System.out.println("Nomes bonitos: "+ name);
		}

	}

}
