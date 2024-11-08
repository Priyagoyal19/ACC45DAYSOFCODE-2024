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
			Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t-->0){
		    int n = scn.nextInt();
		    int[] o = new int[n];
		    int count = 0;
		    int count1= 0;
		    int  n1 = n/2;
		    for (int i = 0;i<n ;i++ ){ 
		        o[i] = scn.nextInt();
		            if(o[i]==1)
		                count++;
		            else if (o[i]==-1)
		                count1++;
		                
		    }
		    if (n%2!=0){
		        System.out.println(-1);
		     }		    
		    else {
		           count1= Math.abs(n1-count1);
		           System.out.println(count1);
		        
		    }
		
        }
		    
	}
}