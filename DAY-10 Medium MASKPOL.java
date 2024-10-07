import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		   int n= sc.nextInt();
		   int a =sc.nextInt();
		   
		    int r = n-a;
		    
		    if(a>r)
		    {
		        System.out.println(r);
		    }
		    
		   else
		   {
		       System.out.println(a);
		   }
		}
               
	}
}
