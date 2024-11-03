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
		int n = read.nextInt();
		int[] s1 = new int[n];
		int[] s2 = new int[n];
		for(int i=0; i<n; i++){
		    int x = read.nextInt();
		    int y = read.nextInt();
		    s1[i] = x;
		    s2[i] = y;
		}
		int p1=0;
		int p2=0;
		int[] wnr = new int[n];
		int[] ld = new int[n];
		for(int i=0; i<n; i++){
		    p1 = p1 + s1[i];
		    p2 = p2 + s2[i];
		    if(p1>p2){
		        wnr[i]=1;
		        ld[i]=Math.abs(p1-p2);
		    }
		    else{
		        wnr[i]=2;
		        ld[i]=Math.abs(p1-p2);
		    }
		}
		int max = ld[0];
		int pl = wnr[0];
		for(int i=0; i<n-2; i++){
		    if(ld[i+1]>max){
		        max = ld[i+1];
		        pl = wnr[i+1];
		    }
		}
		System.out.println(pl + " " + max);
	}
}