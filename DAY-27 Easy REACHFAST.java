import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		// your code goes here
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int d=Math.abs(a-b);
		    if(d%c==0)
		    {
		        System.out.println(d/c);
		    }
		    else if(d%c!=0)
		    {
		        System.out.println((d/c)+1);
		    }
		}

	}
}