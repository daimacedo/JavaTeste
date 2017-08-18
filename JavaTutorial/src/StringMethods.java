import javax.swing.plaf.synth.SynthSeparatorUI;

public class StringMethods {

	public static void main(String[] args) {
	
		String strlenght = "This is my first string";		
		String str1 = "blabla";
		String str2 = "blabla";
		String str3 = "";
		String str4 = " fasdfasd teste          ";
		String str5 = "Hello";
		
		// return the lenght of the string
		System.out.println(strlenght.length());
		
		// return the exactly character in the index
		System.out.println(strlenght.charAt(9));
		
		// Combine the new string after the end strlenght
		System.out.println(strlenght.concat(" >> Other string after my first string"));
		
		//Return true if string contain the set string and false if not
		System.out.println(strlenght.contains("This"));
		System.out.println(strlenght.contains("on"));
		
		//Return true if string starts with the set string and false if not
		System.out.println(strlenght.startsWith("This"));
		
		//Return true if string ends with the set string and false if not
		System.out.println(strlenght.endsWith("string"));

		//Compare the content of two string and return true if the content is equal
		System.out.println(str1.equals(str2));
		
		//Return the first index of the char in the string or -1 if the char doesn't exists in
		System.out.println(strlenght.indexOf("i"));
		System.out.println(strlenght.indexOf("z"));
		
		//Return true if the string is empty and false if not
		System.out.println(str3.isEmpty());
		
		//remove the spaces in the begin and end of the strings
		System.out.println(str4.trim());
		
		//replace all the old char for the new
		System.out.println(str5.replace('l', 'k'));
		
		//return parts of the string
		System.out.println(strlenght.substring(5));
		System.out.println(strlenght.substring(5, 9));
		
		//Convert a string into a array char
		char[] charArray = strlenght.toCharArray();
		for(int i=0; i <charArray.length; i++)
		{
			System.out.println("The index " +  i + " is the character: " + charArray[i]);
		}
		
		//Convert a string to upper case
		System.out.println(strlenght.toUpperCase());
	
		// Convert a string to lower case
		System.out.println(strlenght.toLowerCase());
	
	}

}
