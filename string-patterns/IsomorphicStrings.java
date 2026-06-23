/*
Problem:
Check if characters can be mapped one-to-one.

Input:
egg
add

Output:
Isomorphic
*/

import java.util.*;

class IsomorphicStrings {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String s1 = in.nextLine();
        String s2 = in.nextLine();

        if(s1.length()!=s2.length()) {
            System.out.println("Not Isomorphic");
            return;
        }

        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for(int i=0;i<s1.length();i++) {

            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if(map1[c1] != map2[c2]) {
                System.out.println("Not Isomorphic");
                return;
            }

            map1[c1] = i+1;
            map2[c2] = i+1;
        }

        System.out.println("Isomorphic");
    }
}