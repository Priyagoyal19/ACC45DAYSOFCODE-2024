import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		   
		   int a=500-x*2;
		   int b=1000-(y+x)*4;
		  
		   
		   int c=1000-y*4;
		   int d=500-(y+x)*2;
		   
		   if(a+b>c+d)
		   System.out.println(a+b);
		   
		   else
		   System.out.println(c+d);
		   
		}

	}
}
