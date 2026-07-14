// Given:
//1. An integer N.
//2. N city names.
//3. A target character.

//For each city:
//1. Reverse the city name.
//2. Find the first occurrence index of the target character in the reversed string.
//3. Print:
  // <city_number> <index>

//If the character is not present, print -1.

//Sample Input:
//3
//Delhi
//Mumbai
//Pune
//i

//Output:
//1 -1
//2 0
//3 0

import java.util.*;
public class ReverseCitySearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();

        String[] cities = new String[n];

        for(int i=0;i<n;i++){
            cities[i]=sc.nextLine();
        }
        char target = sc.next().charAt(0);

        for(int i=0;i<n;i++){
            String reversed = new StringBuilder(cities[i]).reverse().toString();
            int index = reversed.indexOf(target);

            System.out.println((i+1) + " " + index);

        }
        sc.close();

    }
}