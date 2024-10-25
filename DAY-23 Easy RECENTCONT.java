/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int i =0 ;i <t ;i++ ) {
		int N = sc.nextInt(); // Number of string input we will take
	
		int countone = 0;  //make an Integer that count START38, intialize with zero.  
		int counttwo = 0;  ////make an Integer that count LTIME108, intialize with zero. 
		
		for (int j = 0; j < N ;j++ ){ // run a loop N times
		    String M = sc.next(); // input string START38 / LTIME108
		    
		    if(M.equals("START38")){ // check if Variable M value is equal to START38 or not.
		    // if it is equal then +1 increament in countone.
		    // if it is not equal then +1 increament in counttwo.
		        countone++; 
		    }
		    else {
		        counttwo++;
		    }
		} 
		// print both values in one line separated by gape.
		System.out.println(countone+ " "+counttwo);
		
	}
}
}