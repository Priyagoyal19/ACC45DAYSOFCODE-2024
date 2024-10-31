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
		while(t!=0){
		    int p=sc.nextInt();
		    int q=sc.nextInt();
		    int total_serve=p+q;
		    
		    if(total_serve<2)
		    {
		        System.out.println("Alice");
		    }
		    
		    else{
		        String name="Bob";
		        for(int j=3;j<total_serve;j=j+2)
		        {
		            if(name=="Alice")
		            {
		                name="Bob";
		            }
		            else if(name=="Bob")
		            {
		                name="Alice";
		            }
		        }
		        System.out.println(name);
		    }
		   
		    t--;
		
		}
	}
}