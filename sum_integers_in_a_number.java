
import java.util.*;
public class sum_integers_in_a_number {
    public static void main (String [] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter an integer between 0 and 1000: ");
        int number = keyboard.nextInt();
        
        int sum = number;
        
        int digit = number% 10;
        
        number = number/10;
        
        int digit2 = number%10;
        
        number = number/10;
        
        int digit3 = number%10;
        
        int total = digit+digit2+digit3;
        
        System.out.println("The sum of all digits in " +sum+ " is " +total);
      
    }
}
