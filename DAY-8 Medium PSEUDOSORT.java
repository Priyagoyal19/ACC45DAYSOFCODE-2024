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
		    int n =sc.nextInt();
		    int a[] = new int[n];
		    int count=0;
		    
		    for(int i=0;i<a.length;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    for(int i=0;i<a.length-1;i++)
		    {
		         if(a[i]>a[i+1]){
                     int temp = a[i];
	                a[i] = a[i+1];
	                a[i+1] = temp;
	           break;
                     
                  }   
		    }
		    for(int j=0; j<n-1; j++){
	            if(a[j]>a[j+1]){
	                count = count + 1;
	            }
	        }
	        System.out.println((count==0)?"YES":"NO");
		}

	}
}
