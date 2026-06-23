/*
Problem:
Print all duplicate characters.

Input:
programming

Output:
r
g
m
*/

import java.util.*;

class DuplicateCharacters {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        int[] freq = new int[26];

        for(char ch : s.toCharArray())
            freq[ch-'a']++;

        for(int i=0;i<26;i++) {

            if(freq[i] > 1)
                System.out.println((char)(i+'a'));
        }
    }
}