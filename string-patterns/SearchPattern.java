
import java.util.*;

/*
 * PROBLEM STATEMENT:
 * Given a string 's' consisting only of lowercase characters 'a' and 'b'.
 * Determine whether all occurrences of 'a' appear before any occurrence of 'b'.
 * Once a 'b' appears, no 'a' should appear after it.
 * * Input Format:
 * A single line containing string s.
 * * Output Format:
 * Print "true" if the condition is satisfied, otherwise print "false".
 * * ALGORITHM:
 * 1. Read the input string 's' using a Scanner.
 * 2. Check if the string contains the substring "ba".
 * - Because the string only consists of 'a' and 'b', an 'a' appearing after 
 * a 'b' means the sequence "ba" must exist somewhere in the string.
 * 3. If "ba" is found, print "false".
 * 4. If "ba" is not found, print "true".
 * * Time Complexity: O(N) - Single scan of the string via s.contains().
 * Space Complexity: O(1) - Uses a constant amount of extra memory.
 */

public class SearchPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            String s = sc.nextLine();
            
            // Check if 'a' comes after 'b' by looking for "ba"
            if (s.contains("ba")) {
                System.out.println("false");
            } else {
                System.out.println("true");
            }
        }
        sc.close();
    }
}