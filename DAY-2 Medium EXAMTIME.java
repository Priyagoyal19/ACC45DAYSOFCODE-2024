import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc = new Scanner(System.in);
	  int t = sc.nextInt();
	  for(int i =0;i<t;i++)
	  {
	       int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

	        int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            
            
            int d =a+b+c;
            int s=x+y+z;
            
	       if(d>s)
	         System.out.println("DRAGON");
	         
	         else if (d < s) 
                System.out.println("SLOTH");
	       
	         else {
                // Total scores are tied, compare DSA scores
                if (a>x) {
                    System.out.println("DRAGON");
                } else if (a<x) {
                    System.out.println("SLOTH");
                } else {
                    // DSA scores are tied, compare TOC scores
                    if (b>y) {
                        System.out.println("DRAGON");
                    } else if (b<y) {
                        System.out.println("SLOTH");
                    } else {
                        // Everything is tied
                        System.out.println("TIE");
                    }
	       
	  }
	         }
	  }

	}
}
