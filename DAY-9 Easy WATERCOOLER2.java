import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
         Scanner sc = new Scanner(System.in);
         int t=sc.nextInt();
         while(t-->0)
         {
             int x=sc.nextInt();
             int y=sc.nextInt();
             if ( y % x != 0){
                System.out.println(y / x);
            }
             else{
                System.out.println((y/x)-1);
            }
             
         }

	}
}
