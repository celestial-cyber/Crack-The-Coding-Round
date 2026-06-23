import java.util.*;

public class reverseString {
    public static void main(String[] args) {
        String original = "Hello World";
        String reversed = "";
        
        // Loop backwards from the last character to the first
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        
        System.out.println("Reversed: " + reversed);
    }
}