import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        
        // Input number of test cases
        int T = sc.nextInt();
        
        // Loop through each test case
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); // Length of the string (not needed for logic)
            String S = sc.next(); // The string itself

            int consonantCount = 0;
            boolean isHardToPronounce = false;
            String vowels = "aeiou";
            
            // Loop through each character in the string
            for (int i = 0; i < S.length(); i++) {
                char c = S.charAt(i);
                
                // Check if the character is a consonant (not in the vowels list)
                if (vowels.indexOf(c) == -1) {
                    consonantCount++;
                    // If there are 4 consecutive consonants, mark as hard to pronounce
                    if (consonantCount >= 4) {
                        isHardToPronounce = true;
                        break;
                    }
                } else {
                    // Reset consonant count if a vowel is found
                    consonantCount = 0;
                }
            }

            // Output the result
            if (isHardToPronounce) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
