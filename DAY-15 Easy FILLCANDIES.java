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
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
	    {
	        int n=sc.nextInt();
	        int k=sc.nextInt();
	        int m=sc.nextInt();
	        k=m*k;
	        if(n%k==0)
	        {
	            int c=(n/k);
	            System.out.println(c);
	        }
	        else{
	        int c=n/k;
	        System.out.println(c+1);
	    }}
	}
}
