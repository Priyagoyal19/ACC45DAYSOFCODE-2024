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
	    int a =sc.nextInt();
	     int b =sc.nextInt();
	      int c=sc.nextInt();
	       int d=sc.nextInt();
	       
	       
	       if(a+c == 180 && b+d==180)
	       {
	           System.out.println("Yes");
	       }
	       else
	       {
	            System.out.println("no");
	       }
	}

	}
}
