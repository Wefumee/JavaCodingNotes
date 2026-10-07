/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basicjavaformat;

import java.util.Scanner;

public class BasicJavaFormat {

    
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        // =====================================================
        // 1. BASIC INPUT
        // =====================================================

        // Integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Double
        System.out.print("Enter a decimal number: ");
        double decimal = input.nextDouble();

        // String (one word)
        System.out.print("Enter your name: ");
        String name = input.next();

        // String (whole sentence)
        input.nextLine(); // clears leftover ENTER
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        // Character
        System.out.print("Enter a character: ");
        char letter = input.next().charAt(0);


        // =====================================================
        // 2. INPUT VALIDATION - INTEGER
        // =====================================================

        int age;

        System.out.print("Enter your age: ");

        while (!input.hasNextInt()) {
            System.out.println("Invalid input. Please enter a whole number.");
            input.next();
        }

        age = input.nextInt();


        // =====================================================
        // 3. INPUT VALIDATION - DOUBLE
        // =====================================================

        double price;

        System.out.print("Enter the price: ");

        while (!input.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a decimal number.");
            input.next();
        }

        price = input.nextDouble();


        // =====================================================
        // 4. VALIDATING A RANGE
        // =====================================================

        int score;

        System.out.print("Enter score (0-100): ");

        while (!input.hasNextInt()) {
            System.out.println("Invalid input. Enter a whole number.");
            input.next();
        }

        score = input.nextInt();

        while (score < 0 || score > 100) {
            System.out.println("Score must be between 0 and 100.");
            System.out.print("Enter score again: ");
            score = input.nextInt();
        }


        // =====================================================
        // 5. IF / ELSE
        // =====================================================

        if (age < 13) {
            System.out.println("Child");
        } 
        else if (age <= 19) {
            System.out.println("Teenager");
        } 
        else {
            System.out.println("Adult");
        }


        // =====================================================
        // 6. EVEN OR ODD
        // =====================================================

        if (number % 2 == 0) {
            System.out.println("Even");
        } 
        else {
            System.out.println("Odd");
        }


        // =====================================================
        // 7. SWITCH
        // =====================================================

        int choice;

        System.out.print("Enter choice (1-3): ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected Addition.");
                break;

            case 2:
                System.out.println("You selected Subtraction.");
                break;

            case 3:
                System.out.println("You selected Multiplication.");
                break;

            default:
                System.out.println("Invalid choice.");
        }


        // =====================================================
        // 8. FOR LOOP
        // =====================================================

        System.out.println("\nNumbers 1 to 10:");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


        // =====================================================
        // 9. FOR LOOP - EVEN NUMBERS
        // =====================================================

        System.out.println("\nEven numbers:");

        for (int i = 1; i <= 20; i++) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }


        // =====================================================
        // 10. WHILE LOOP
        // =====================================================

        int i = 1;

        System.out.println("\n\nWhile loop:");

        while (i <= 5) {
            System.out.println(i);
            i++;
        }


        // =====================================================
        // 11. DO-WHILE LOOP
        // =====================================================

        int option;

        do {

            System.out.println("\nMENU");
            System.out.println("1. Hello");
            System.out.println("2. Goodbye");
            System.out.println("3. Exit");

            System.out.print("Choose: ");
            option = input.nextInt();

            if (option == 1) {
                System.out.println("Hello!");
            } 
            else if (option == 2) {
                System.out.println("Goodbye!");
            }

        } while (option != 3);


        // =====================================================
        // 12. ARRAY - DECLARATION
        // =====================================================

        int[] numbers = {10, 20, 30, 40, 50};

        // Accessing an element
        System.out.println("\nFirst number: " + numbers[0]);

        // Last element
        System.out.println("Last number: " + numbers[numbers.length - 1]);


        // =====================================================
        // 13. ARRAY - FOR LOOP
        // =====================================================

        System.out.println("\nArray elements:");

        for (int x = 0; x < numbers.length; x++) {
            System.out.println(numbers[x]);
        }


        // =====================================================
        // 14. ARRAY - USER INPUT
        // =====================================================

        int[] values = new int[5];

        System.out.println("\nEnter 5 numbers:");

        for (int x = 0; x < values.length; x++) {
            System.out.print("Number " + (x + 1) + ": ");
            values[x] = input.nextInt();
        }


        // =====================================================
        // 15. ARRAY - SUM
        // =====================================================

        int sum = 0;

        for (int x = 0; x < values.length; x++) {
            sum += values[x];
        }

        System.out.println("Sum = " + sum);


        // =====================================================
        // 16. ARRAY - AVERAGE
        // =====================================================

        double average = (double) sum / values.length;

        System.out.println("Average = " + average);


        // =====================================================
        // 17. ARRAY - FIND MAXIMUM
        // =====================================================

        int maximum = values[0];

        for (int x = 1; x < values.length; x++) {

            if (values[x] > maximum) {
                maximum = values[x];
            }
        }

        System.out.println("Maximum = " + maximum);


        // =====================================================
        // 18. ARRAY - FIND MINIMUM
        // =====================================================

        int minimum = values[0];

        for (int x = 1; x < values.length; x++) {

            if (values[x] < minimum) {
                minimum = values[x];
            }
        }

        System.out.println("Minimum = " + minimum);


        // =====================================================
        // 19. ARRAY - COUNT EVEN AND ODD
        // =====================================================

        int evenCount = 0;
        int oddCount = 0;

        for (int x = 0; x < values.length; x++) {

            if (values[x] % 2 == 0) {
                evenCount++;
            } 
            else {
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);


        // =====================================================
        // 20. SEARCHING AN ARRAY
        // =====================================================

        System.out.print("\nEnter number to search: ");
        int search = input.nextInt();

        boolean found = false;

        for (int x = 0; x < values.length; x++) {

            if (values[x] == search) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Number found.");
        } 
        else {
            System.out.println("Number not found.");
        }


        // =====================================================
        // 21. STRING INPUT
        // =====================================================

        input.nextLine(); // clear ENTER

        System.out.print("\nEnter a word: ");
        String word = input.nextLine();

        System.out.println("Length: " + word.length());
        System.out.println("Uppercase: " + word.toUpperCase());
        System.out.println("Lowercase: " + word.toLowerCase());


        // =====================================================
        // 22. CHARACTER CHECK
        // =====================================================

        System.out.print("Enter a letter: ");
        char ch = input.next().charAt(0);

        if (ch == 'a' || ch == 'e' ||
            ch == 'i' || ch == 'o' ||
            ch == 'u') {

            System.out.println("Vowel.");

        } 
        else {
            System.out.println("Not a vowel.");
        }


        // =====================================================
        // 23. BOOLEAN INPUT
        // =====================================================

        System.out.print("Are you a student? (true/false): ");

        while (!input.hasNextBoolean()) {
            System.out.println("Invalid input. Enter true or false.");
            input.next();
        }

        boolean student = input.nextBoolean();

        if (student) {
            System.out.println("You are a student.");
        } 
        else {
            System.out.println("You are not a student.");
        }


        // =====================================================
        // 24. BASIC MATH
        // =====================================================

        int a = 10;
        int b = 3;

        System.out.println("\nAddition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));


        // =====================================================
        // 25. COMMON MATH METHODS
        // =====================================================

        System.out.println("\nMath methods:");

        System.out.println("Absolute: " + Math.abs(-10));
        System.out.println("Power: " + Math.pow(2, 3));
        System.out.println("Square root: " + Math.sqrt(25));
        System.out.println("Maximum: " + Math.max(10, 20));
        System.out.println("Minimum: " + Math.min(10, 20));


        input.close();
    }
}


        
        
    

}
