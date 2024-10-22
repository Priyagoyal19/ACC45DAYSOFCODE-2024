import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int T = sc.nextInt();
        
        // Process each test case
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); // Number of problems
            int X = sc.nextInt(); // Maximum score for each problem
            int Y = sc.nextInt(); // Desired score

            // The possible score should be between 0 and N*X
            if (Y >= 0 && Y <= N * X && Y % X == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }


	}
}
