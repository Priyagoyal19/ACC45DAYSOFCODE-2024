/* package codechef; // don't place package name! */

import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int T = in.nextInt(); //for No. of test cases
		while(T-->0) {
		    //your code goes here
		    int x = in.nextInt(); //time taken by Bike
		    int y = in.nextInt(); //time taken by car
		    System.out.println(x==y?"Same":x<y?"Bike":"car");
		}
		in.close();
	}
}