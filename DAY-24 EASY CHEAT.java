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
	    int N=  sc.nextInt();
	    int fullWeeks = N / 7;
            int remainingDays = N % 7;
            
            int tuesdayCount = fullWeeks;
            
            if (remainingDays >= 2) {  // Monday + at least one more day to reach Tuesday
                tuesdayCount++;
            }
            System.out.println(tuesdayCount);
	}

	}
}
