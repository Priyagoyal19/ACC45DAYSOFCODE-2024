import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // Create a Scanner object to take input
        Scanner sc = new Scanner(System.in);
        
        // Read number of test cases
        int t = sc.nextInt();
        
        for(int i = 0; i < t; i++)
        {
            // Read n (number of people) and k (initial amount of money)
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            // Create an array to hold the withdrawal amounts
            int a[] = new int[n];
            
            // Fill the array with input
            for(int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            
            // Use StringBuilder to build the result string
            StringBuilder s = new StringBuilder();
            
            // Process withdrawals
            for(int j = 0; j < n; j++) {
                if(a[j] <= k) {
                    s.append("1");
                    k -= a[j];  // Deduct the amount from the ATM
                } else {
                    s.append("0");
                }
            }
            
            // Print the result string for this test case
            System.out.println(s.toString());
        }
        
        sc.close();  // Close the scanner object
    }
}
