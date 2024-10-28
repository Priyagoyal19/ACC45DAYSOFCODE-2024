/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for(int i=0; i<t; i++){
		    int n = read.nextInt();
		    int k = read.nextInt();
		    int[] a = new int[n];
		    for(int j=0; j<n; j++){
		        int ele = read.nextInt();
		        a[j] = ele;
		        a[j] = a[j] + k;
		    }
		    int count = 0;
		    for(int l=0; l<n; l++){
		        if(a[l]%7==0){
		            count = count + 1;
		        }
		    }
		    System.out.println(count);
		}
	}
}