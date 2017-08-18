package switchDemo;

public class SwitchDemo {

	public static void main(String[] args) {
		//int numberOfDays = numberOfDays(2001, 7);
		System.out.println(numberOfDays(2001, 7));
		
			}
	
	static int numberOfDays(int year, int month)
	{	
		int numDay;
		switch(month)
		{
			case 1:
			{
				numDay = 31;
				break;
			}
			case 2:
			{
				if(year%400==0)
				{
					numDay = 29;
				}
				else
				{
					numDay = 28;
				}
				break;
			}
			
			case 3:
			{
				numDay = 31;
				break;
			}
			default: 
				numDay = 100;
		}
		
		return numDay;
	}

}
