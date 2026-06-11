//digit frequency counting
import java.util.*;
class sol3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long num = sc.nextLong();
        int[] freq = new int[10];

        if(num==0){
            freq[0]=1;
        }

        while(num>0){
            int digit = (int)(num%10);
            freq[digit]++;
            num = num/10;
        }
        System.out.println("Digit Frequencies");

        for(int i=0;i<10;i++){
            if(freq[i]>0){
                System.out.println(i+"->"+freq[i]);
            }
        }
        sc.close();
        
    }
}


