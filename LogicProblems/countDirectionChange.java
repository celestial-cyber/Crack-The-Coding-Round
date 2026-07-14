import java.io.*;
import java.util.*;

/*
 * QUESTION: Count Direction Changes
 * * You are given a string s consisting only of characters 'L' and 'R'.
 * Count how many times the direction changes: 'L' -> 'R' OR 'R' -> 'L'
 * * Constraints:
 * 1 <= |s| <= 10^5
 * * Sample Input: LRLR
 * Sample Output: 3
 */

public class countDirectionChange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) return;
        
        String s = sc.next();
        
        // ALGORITHM:
        // 1. Initialize a counter to keep track of direction changes.
        int directionChanges = 0;
        
        // 2. Loop through the string from the 0-th index to the second-to-last index.
        for (int i = 0; i < s.length() - 1; i++) {
            // 3. Compare the current character with the next character.
            // If they are not equal, a direction change ('L' -> 'R' or 'R' -> 'L') has occurred.
            if (s.charAt(i) != s.charAt(i + 1)) {
                directionChanges++;
            }
        }
        
        // 4. Print the final count of direction changes.
        System.out.println(directionChanges);
        
        sc.close();
    }
}