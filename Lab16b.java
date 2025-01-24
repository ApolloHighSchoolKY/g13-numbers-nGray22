//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Scanner;

public class Lab16b
{
	public static void main( String args[] )
	{
		NumberAnalyzer test = new NumberAnalyzer("5 12 9 6 1 4 8 6");
		System.out.println(test);
		System.out.println("odd count = "+test.countOdds());
		System.out.println("even count = "+test.countEvens());
		System.out.println("perfect count = "+test.countPerfects()+"\n\n");


		//add more test cases
		NumberAnalyzer test1 = new NumberAnalyzer("28 496 9 5 1 4 8 6");
		System.out.println(test1);
		System.out.println("odd count = "+test1.countOdds());
		System.out.println("even count = "+test1.countEvens());
		System.out.println("perfect count = "+test1.countPerfects()+"\n\n");

	}
}