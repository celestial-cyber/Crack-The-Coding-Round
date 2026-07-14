import java.io.*;
import java.util.*;

/*
 * QUESTION: Count Blocks of Same Characters
 * * Given a string s, count how many groups (blocks) of consecutive 
 * identical characters exist.
 * * Sample Input: aaabbcaaa
 * Sample Output: 4
 * Explanation: (aaa | bb | c | aaa) -> 4 distinct blocks
 */

public class countBlockOfSameCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) return;
        
        String s = sc.next();
        
        // ALGORITHM:
        // 1. Every non-empty string starts with at least one initial block.
        //    So, we initialize our block counter to 1.
        int blocks = 1;
        
        // 2. Loop through the string from the beginning up to the second-to-last character.
        //    We use 's.length() - 1' to avoid throwing a StringIndexOutOfBoundsException.
        for (int i = 0; i < s.length() - 1; i++) {
            
            // 3. Compare the current character with the very next character.
            //    If they don't match, it means the current block has ended 
            //    and a brand new block of characters is beginning.
            if (s.charAt(i) != s.charAt(i + 1)) {
                blocks++; // Increment the block count
            }
        }
        
        // 4. Print the final total number of blocks found.
        System.out.println(blocks);
        
        sc.close();
    }
}