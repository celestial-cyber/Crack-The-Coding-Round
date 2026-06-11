//prime number
import java.util.*;
class sol1{
    public static void main(String args[]){
        
      
        
        for(int i=1000; i>=1;i--){
            if(isPrime(i)){
                System.out.println(i);
            }
        }

    }
    static boolean isPrime(int n){
        if(n<0) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}