import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
Scanner sc = new Scanner(System.in);
        
        // Read number of test cases
        int T = sc.nextInt();
        
        // Loop through all test cases
        for (int t = 0; t < T; t++) {
            // Read N and X for each test case
            int N = sc.nextInt();
            int X = sc.nextInt();
            
            // The minimum flips will be the smaller of the two:
            // 1. Flipping X face-up cards to face-down
            // 2. Flipping (N - X) face-down cards to face-up
            int flips = Math.min(X, N - X);
            
            // Output the result for the current test case
            System.out.println(flips);
        }
        
	}
}
