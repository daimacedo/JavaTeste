package exceptions;

import java.sql.SQLException;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		
		Account acc = new Account();
		// My call always enter in a try, if it ok, so dont to go to the catch, if not, its go to the catch
		try {
			System.out.println("Entering in the try");
			//If I call a method that have a throw so this method needs a throw too
			acc.withDraw(10);
			System.out.println("2nd line after process");
		} 
		
		// The catch is not required for a try, but if I have a TRY so I nedd a catch or a finally
		catch (SQLException e) {
			// print full stackTrace
			e.printStackTrace();
			System.out.println(e.getMessage());
			// I cant print especified kinds of return error
		}
		
		// The finally method is always executed even try works or not
		finally{
			System.out.println("Always executed");
		}
		
	}
}
