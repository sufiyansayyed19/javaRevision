
import java.util.Scanner;

public class Excercies {

    
    
    // public static void main (String[] args){
    //     // Take integer and print its square
    //     Scanner sc = new Scanner(System.in);
    //     int num = sc.nextInt();
    //     System.out.println("Square: "+ num * num);
        
    
        
    // }
    
    public static void main(String[] args) {
        // Take two numbers and swap them (with and without third variable)
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(num1 + "  " + num2);
        // Swap with 3rd var
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1 + "  " + num2);
        
        // Swap without 3rd var - Method 1: Using addition/subtraction
        num1 = num1 + num2;  // num1 = 15 (10 + 5)
        num2 = num1 - num2;  // num2 = 10 (15 - 5)
        num1 = num1 - num2;  // num1 = 5 (15 - 10)
        System.out.println("After swap (add/sub): " + num1 + "  " + num2);
        
        // Swap without 3rd var - Method 2: Using XOR
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("After swap (XOR): " + num1 + "  " + num2);
        
        // Swap without 3rd var - Method 3: Using multiplication/division (avoid if values can be 0)
        num1 = num1 * num2;
        num2 = num1 / num2;
        num1 = num1 / num2;
        System.out.println("After swap (mul/div): " + num1 + "  " + num2);

    }
// Addition/Subtraction: a = a + b; b = a - b; a = a - b;
// XOR (bitwise): a = a ^ b; b = a ^ b; a = a ^ b; - Most efficient
// Multiplication/Division: a = a * b; b = a / b; a = a / b; - Don't use if values can be 0

// Find minimum of three numbers

// Print ASCII value of a character
// Method 1: Cast to int
char ch = 'A';
System.out.println("ASCII value of 'A': " + (int)ch);

// Method 2: Adding 0
char ch2 = 'Z';
System.out.println("ASCII value of 'Z': " + (ch2 + 0));

// Method 3: Take input from user
Scanner sc2 = new Scanner(System.in);
System.out.print("Enter a character: ");
char userChar = sc2.next().charAt(0);
System.out.println("ASCII value of '" + userChar + "': " + (int)userChar);

// Demonstrate buffer issue using Scanner

}
