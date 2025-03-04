import java.util.Scanner;

public class p

rime {    
    public static void main(String[] args) {    
        // Create a scanner to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.println("Enter a number to check if it's prime: ");
        int n = scanner.nextInt(); // Read the input number
        
        int m = n / 2;    
        int flag = 0;    

        // Check if the number is 0 or 1
        if (n == 0 || n == 1) {  
            System.out.println(n + " is not a prime number");      
        } else {  
            // Loop from 2 to n/2 to check for factors
            for (int i = 2; i <= m; i++) {      
                if (n % i == 0) {      
                    System.out.println(n + " is not a prime number");      
                    flag = 1;      
                    break;      
                }      
            }      
            // If no factors are found, the number is prime
            if (flag == 0) { 
                System.out.println(n + " is a prime number"); 
            }  
        }    

        // Close the scanner
        scanner.close();
    }    
}
