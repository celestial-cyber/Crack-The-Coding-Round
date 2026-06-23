/*
Problem:
Find the most frequent character.

Input:
banana

Output:
a
Frequency = 3
*/

import java.util.*;

class MaxFrequencyChar {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        int[] freq = new int[26];

        for(char ch : s.toCharArray())
            freq[ch-'a']++;

        int max = 0;
        char ans = 'a';

        for(int i=0;i<26;i++) {

            if(freq[i] > max) {
                max = freq[i];
                ans = (char)(i+'a');
            }
        }

        System.out.println(ans);
        System.out.println("Frequency = " + max);
    }
}