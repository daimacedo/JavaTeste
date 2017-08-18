import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//creating an int array with the hard mode
		
		System.out.println("creating an int array with the hard mode");
		int[] myIntArray = new int[10];
		myIntArray[0] = 90;
		myIntArray[1] = 100;
		System.out.println(myIntArray[0]);
		System.out.println(myIntArray[1]);
		//here will print value zero (0) because zero is default value to a empty idex of array
		System.out.println(myIntArray[2]);
		
		
		// creating an array with the most commum way
		System.out.println("\ncreating an array with the most commum way");
		int[] myArray2 = {0,1,58,99,2,100};
		System.out.println(myArray2[0]);
		System.out.println(myArray2[1]);
		System.out.println(myArray2[2]);
		System.out.println(myArray2[3]);
		System.out.println(myArray2[4]);
		System.out.println(myArray2[5]);
		
		//here if a try to print the 2nd position of array i will have a exception 
		//because there isn't a 2nd position created in array, dont even empty
		//System.out.println(myArray2[2]);
		
		
		//creating a string array
		System.out.println("\ncreating a string array");
		String[] strArray1= {"Daiane", "Ana"};
		System.out.println(strArray1[0]);
		System.out.println(strArray1[1]);
		
		//using Array sort
		Arrays.sort(myArray2);
		for(int i=0; i<myArray2.length; i++)
		{
			System.out.println(myArray2[i]);
		}
		
		
	
		
	}

}
