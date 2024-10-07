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
       int W = sc.nextInt(); // weight of the object
            int X = sc.nextInt(); // weight 1
            int Y = sc.nextInt(); // weight 2
            int Z = sc.nextInt(); // weight 3
            
            // Check all possible sums of the weights
            if (W == X || W == Y || W == Z || 
                W == X + Y || W == X + Z || W == Y + Z || 
                W == X + Y + Z) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
     
}
	}
}
