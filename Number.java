//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Number
{
	//Instance Variable
	private Integer number;

	//Default Constructor
	public Number()
	{
		number=0;
	}

	//Modified Constructor
	public Number(int num)
	{
		setNumber(num);
	}

	//Methods
	public void setNumber(int num)
	{
		number = num;
	}

	public int getNumber()
	{
		return number;
	}

	public boolean isOdd()
	{
		//If the number is odd, return true
		if (number%2==1)
			return true;
		
		return false;	
	}

	public boolean isPerfect()
	{
		int total=0;
		int test = 1;
		//A perfect number is any number equal to the sum of its divisors
		//excluding itself.
		for(test=1; test <= number-1; test++)
			if(number%test < 1)
				total = test + total;
			
			else 
				test++;

		//return (number==total);	
		if (number == total)
			return true;
		return false;	
		/*
		if (number%test ==0)
			total = test +total;
			test++
		*/
		
	}

	public String toString( )
	{

		String returnString;

		returnString = number + "\n";
		returnString += number + " isOdd == " + isOdd() + "\n";
		returnString += number + " isPerfect == " + isPerfect() + "\n\n";
		
		return "" + returnString;
	}
}