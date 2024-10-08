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
		Scanner scann = new Scanner(System.in);
		int t = scann.nextInt();
		while(t-->0){
		    int n = scann.nextInt();
		    int[] myArr = new int[n];
		    int sum = 0;
		    int odd = 0;
		    for(int i=0; i<n; i++){
		        myArr[i] = scann.nextInt();
		        sum += myArr[i];
		        if(myArr[i]%2!=0) odd++;
		    } 
		    if(odd==0) System.out.println("NO");
		    else if(sum%2==0 && odd%2==0) System.out.println("YES");
		    else System.out.println("NO");
		    
		}
	}
}