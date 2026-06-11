//frequency counting using array bucketing
import java.util.*;
class sol2{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int [] arr = {1,2,1,3,4,2,5,6,7,3};
        int max = 10;
        int[] freq = new int[max];

        for(int num : arr){
            freq[num]++;
        }

        for(int i=0;i<max;i++){
            if(freq[i]>0){
                System.out.println(i+"->"+freq[i]);
            }
        }
    }

}