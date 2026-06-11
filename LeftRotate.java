import java.util.*;
class LeftRotate{
    public static void main(String args[]){
        int [] arr ={1,2,3,4,5};
        int k =2;

        int n = arr.length;
        k%=n;
        int[] result = new int[n];
        for(int i=0;i<n;i++){
            result[(i-k+n)%n]=arr[i];

       }
       System.out.println(Arrays.toString(result));

    }
}