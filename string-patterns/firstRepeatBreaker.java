import java.io.*;
import java.util.*;

/*
 * QUESTION: First Repeat Breaker-spec
 * * You are given a string s consisting of lowercase alphabets.
 * Your task is to remove characters after the first repeating character appears 
 * (including that repeated occurrence).
 * * Sample Input: abcdefa
 * Sample Output: abcdef
 * Explanation: 'a' repeats at the end, so we stop right before it.
 */

public class firstRepeatBreaker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) return;
        
        String s = sc.next();
        
        // ALGORITHM:
        // 1. Use a HashSet to track unique characters we have seen so far.
        HashSet<Character> seen = new HashSet<>();
        
        // 2. Use a StringBuilder to efficiently construct the output string.
        StringBuilder result = new StringBuilder();
        
        // 3. Traverse through the string character by character.
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // 4. If the character is already in the set, it means it's a duplicate.
            //    Break the loop immediately as instructed.
            if (seen.contains(ch)) {
                break;
            }
            
            // 5. If it's a new character, add it to our set and append it to the result.
            seen.add(ch);
            result.append(ch);
        }
        
        // 6. Print the accumulated result string.
        System.out.println(result.toString());
        
        sc.close();
    }
}