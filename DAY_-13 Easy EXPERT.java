/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    for(int i=0;i<n;i++){
	        float a=s.nextInt();
	        float b=s.nextInt();
	        if(b>=a/2)
	        System.out.println("YES");
	        else
	        System.out.println("NO");
	    }
		// your code goes here
	}
}
