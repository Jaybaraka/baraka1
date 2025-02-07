import java.util.Scanner;

public class Primejava {
 public static void main(String[] args) {
        // TODO code application logic here
         Scanner scn = new Scanner(System.in);

        System.out.print("Prime numbers between 0 and 1000:");
        for (int i = 2; i <= 1000; i++) {
            
        if (isPrime(i)) {
            System.out.println(i + " ");
        }
        }
    }
    

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        if (number <= 3) {
            return true;
        }

        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
    
    
    
    
