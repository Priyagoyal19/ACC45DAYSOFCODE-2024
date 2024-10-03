import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc = new Scanner(System.in);
        
        // Reading number of test cases
        int T = sc.nextInt();
        
        while (T-- > 0) {
            // Reading N (number of events) and X (initial number of people)
            int N = sc.nextInt();
            int X = sc.nextInt();
            
            // Array to store the events
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            
            // Variable to store the current number of people in the room
            int currentPeople = X;
            // Variable to store the maximum number of people in the room
            int maxPeople = X;
            
            // Processing the events
            for (int i = 0; i < N; i++) {
                if (A[i] >= 0) {
                    currentPeople += A[i]; // People entering
                } else {
                    currentPeople += A[i]; // People leaving (since A[i] is negative, this subtracts)
                }
                
                // Update the maximum number of people in the room
                if (currentPeople > maxPeople) {
                    maxPeople = currentPeople;
                }
            }
            
            // Output the result for the current test case
            System.out.println(maxPeople);
        }
        

	}
}
