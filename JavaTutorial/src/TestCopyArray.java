
public class TestCopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
	            'i', 'n', 'a', 't', 'e', 'd'};
	            
	    char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
	    char[] copyTo2 = java.util.Arrays.copyOf(copyFrom, 5);
	        
	        System.out.println(new String(copyTo));
	        System.out.println(new String(copyTo2));
	    }

	}

