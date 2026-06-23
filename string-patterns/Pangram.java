/*
Problem:
Check whether all 26 letters are present.

Input:
thequickbrownfoxjumpsoverthelazydog

Output:
Pangram
*/

import java.util.*;

class Pangram {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        int[] freq = new int[26];

        for(char ch : s.toCharArray())
            freq[ch-'a']++;

        for(int i=0;i<26;i++) {

            if(freq[i]==0) {
                System.out.println("Not Pangram");
                return;
            }
        }

        System.out.println("Pangram");
    }
}