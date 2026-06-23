/*
Problem:
Find first repeating character.

Input:
abcade

Output:
a
*/

import java.util.*;

class FirstRepeating {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        int[] freq = new int[26];

        for(char ch : s.toCharArray()) {

            freq[ch-'a']++;

            if(freq[ch-'a']==2) {
                System.out.println(ch);
                return;
            }
        }

        System.out.println("No Repeating Character");
    }
}