/*
Problem:
Check whether two strings are anagrams of each other.

Input:
listen
silent

Output:
Anagram
*/

import java.util.*;

class ValidAnagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s1 = in.nextLine();
        String s2 = in.nextLine();

        if(s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        int[] freq = new int[26];

        for(char ch : s1.toCharArray())
            freq[ch - 'a']++;

        for(char ch : s2.toCharArray())
            freq[ch - 'a']--;

        for(int x : freq) {
            if(x != 0) {
                System.out.println("Not Anagram");
                return;
            }
        }

        System.out.println("Anagram");
    }
}