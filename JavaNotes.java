/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javanotes;

import java.util.Scanner;

public class JavaNotes {

   
    public static void main(String[] args) {
    

        Scanner input = new Scanner(System.in);

        int choice;

        do {

            // =====================================================
            // MENU
            // =====================================================

            System.out.println("\n========================================");
            System.out.println("       JAVA BASIC PROGRAMMING TOOLBOX");
            System.out.println("========================================");
            System.out.println("1.  Sum and Average of Array");
            System.out.println("2.  Find Largest and Smallest");
            System.out.println("3.  Count Even and Odd Numbers");
            System.out.println("4.  Search for a Number");
            System.out.println("5.  Reverse an Array");
            System.out.println("6.  Multiplication Table");
            System.out.println("7.  Factorial");
            System.out.println("8.  Number Reversal");
            System.out.println("9.  Prime Number Checker");
            System.out.println("10. Sort an Array");
            System.out.println("11. Student Grade Calculator");
            System.out.println("12. Basic Math Calculator");
            System.out.println("0. Exit");
            System.out.println("========================================");

            // =====================================================
            // INPUT VALIDATION
            // =====================================================

            System.out.print("Choose a problem: ");

            while (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                input.next();
                System.out.print("Choose a problem: ");
            }

            choice = input.nextInt();


            // =====================================================
            // PROBLEM 1: SUM AND AVERAGE OF ARRAY
            // =====================================================

            if (choice == 1) {

                System.out.println("\n--- SUM AND AVERAGE ---");

                System.out.print("How many numbers? ");
                int n = input.nextInt();

                int[] numbers = new int[n];

                int sum = 0;

                for (int i = 0; i < numbers.length; i++) {

                    System.out.print("Enter number " + (i + 1) + ": ");
                    numbers[i] = input.nextInt();

                    sum += numbers[i];
                }

                double average = (double) sum / numbers.length;

                System.out.println("Sum = " + sum);
                System.out.println("Average = " + average);
            }


            // =====================================================
            // PROBLEM 2: LARGEST AND SMALLEST
            // =====================================================

            else if (choice == 2) {

                System.out.println("\n--- LARGEST AND SMALLEST ---");

                System.out.print("How many numbers? ");
                int n = input.nextInt();

                int[] numbers = new int[n];

                for (int i = 0; i < numbers.length; i++) {

                    System.out.print("Enter number " + (i + 1) + ": ");
                    numbers[i] = input.nextInt();
                }

                int largest = numbers[0];
                int smallest = numbers[0];

                for (int i = 1; i < numbers.length; i++) {

                    if (numbers[i] > largest) {
                        largest = numbers[i];
                    }

                    if (numbers[i] < smallest) {
                        smallest = numbers[i];
                    }
                }

                System.out.println("Largest = " + largest);
                System.out.println("Smallest = " + smallest);
            }


            // =====================================================
            // PROBLEM 3: COUNT EVEN AND ODD
            // =====================================================

            else if (choice == 3) {

                System.out.println("\n--- EVEN AND ODD ---");

                System.out.print("How many numbers? ");
                int n = input.nextInt();

                int[] numbers = new int[n];

                int even = 0;
                int odd = 0;

                for (int i = 0; i < numbers.length; i++) {

                    System.out.print("Enter number " + (i + 1) + ": ");
                    numbers[i] = input.nextInt();

                    if (numbers[i] % 2 == 0) {
                        even++;
                    }
                    else {
                        odd++;
                    }
                }

                System.out.println("Even numbers = " + even);
                System.out.println("Odd numbers = " + odd);
            }


            // =====================================================
            // PROBLEM 4: SEARCH AN ARRAY
            // =====================================================

            else if (choice == 4) {

                System.out.println("\n--- SEARCH ARRAY ---");

                System.out.print("How many numbers? ");
                int n = input.nextInt();

                int[] numbers = new int[n];

                for (int i = 0; i < numbers.length; i++) {

                    System.out.print("Enter number " + (i + 1) + ": ");
                    numbers[i] = input.nextInt();
                }

                System.out.print("Enter number to search: ");
                int search = input.nextInt();

                boolean found = false;

                for (int i = 0; i < numbers.length; i++) {

                    if (numbers[i] == search) {

                        found = true;

                        System.out.println(
                            "Number found at index " + i
                        );

                        break;
                    }
                }

                if (!found) {
                    System.out.println("Number not found.");
                }
            }


            // =====================================================
            // PROBLEM 5: REVERSE AN ARRAY
            // =====================================================

            else if (choice == 5) {

                System.out.println("\n--- REVERSE ARRAY ---");

                System.out.print("How many numbers? ");
                int n = input.nextInt();

                int[] numbers = new int[n];

                for (int i = 0; i < numbers.length; i++) {

                    System.out.print("Enter number " + (i + 1) + ": ");
                    numbers[i] = input.nextInt();
                }

                System.out.println("Original array:");

                for (int i = 0; i < numbers.length; i++) {
                    System.out.print(numbers[i] + " ");
                }

                System.out.println("\nReversed array:");

                for (int i = numbers.length - 1; i >= 0; i--) {
                    System.out.print(numbers[i] + " ");
                }

                System.out.println();
            }


            // =====================================================
            // PROBLEM 6: MULTIPLICATION TABLE
            // =====================================================

            else if (choice == 6) {

                System.out.println("\n--- MULTIPLICATION TABLE ---");

                System.out.print("Enter a number: ");
                int number = input.nextInt();

                System.out.print("Enter limit: ");
                int limit = input.nextInt();

                for (int i = 1; i <= limit; i++) {

                    System.out.printf(
                        "%d x %d = %d%n",
                        number,
                        i,
                        number * i
                    );
                }
            }


            // =====================================================
            // PROBLEM 7: FACTORIAL
            // =====================================================

            else if (choice == 7) {

                System.out.println("\n--- FACTORIAL ---");

                System.out.print("Enter a positive number: ");
                int number = input.nextInt();

                if (number < 0) {

                    System.out.println(
                        "Factorial cannot be negative."
                    );

                }
                else {

                    long factorial = 1;

                    int i = 1;

                    while (i <= number) {

                        factorial *= i;

                        i++;
                    }

                    System.out.println(
                        number + "! = " + factorial
                    );
                }
            }


            // =====================================================
            // PROBLEM 8: REVERSE A NUMBER
            // =====================================================

            else if (choice == 8) {

                System.out.println("\n--- NUMBER REVERSAL ---");

                System.out.print("Enter a number: ");
                int number = input.nextInt();

                int original = number;
                int reversed = 0;

                while (number != 0) {

                    int digit = number % 10;

                    reversed = reversed * 10 + digit;

                    number /= 10;
                }

                System.out.println(
                    "Original = " + original
                );

                System.out.println(
                    "Reversed = " + reversed
                );
            }


            // =====================================================
            // PROBLEM 9: PRIME NUMBER
            // =====================================================

            else if (choice == 9) {

                System.out.println("\n--- PRIME NUMBER CHECKER ---");

                System.out.print("Enter a number: ");
                int number = input.nextInt();

                boolean prime = true;

                if (number <= 1) {

                    prime = false;

                }
                else {

                    for (int i = 2; i < number; i++) {

                        if (number % i == 0) {

                            prime = false;
                            break;
                        }
                    }
                }

                if (prime) {
                    System.out.println(
                        number + " is a prime number."
                    );
                }
                else {
                    System.out.println(
                        number + " is not a prime number."
                    );
                }
            }


            // =====================================================
            // PROBLEM 10: SORT ARRAY
            // =====================================================

            else if (choice == 10) {

                System.out.println("\n--- SORT ARRAY ---");

                System.out.print("How many numbers? ");
                int n = input.nextInt();

                int[] numbers = new int[n];

                for (int i = 0; i < numbers.length; i++) {

                    System.out.print("Enter number " + (i + 1) + ": ");
                    numbers[i] = input.nextInt();
                }

                // Bubble Sort

                for (int i = 0; i < numbers.length - 1; i++) {

                    for (int j = 0;
                         j < numbers.length - 1 - i;
                         j++) {

                        if (numbers[j] > numbers[j + 1]) {

                            int temp = numbers[j];

                            numbers[j] = numbers[j + 1];

                            numbers[j + 1] = temp;
                        }
                    }
                }

                System.out.println("Sorted array:");

                for (int i = 0; i < numbers.length; i++) {

                    System.out.print(numbers[i] + " ");
                }

                System.out.println();
            }


            // =====================================================
            // PROBLEM 11: STUDENT GRADE CALCULATOR
            // =====================================================

            else if (choice == 11) {

                System.out.println("\n--- STUDENT GRADE CALCULATOR ---");

                System.out.print("Enter number of subjects: ");
                int n = input.nextInt();

                double[] grades = new double[n];

                double sum = 0;

                for (int i = 0; i < grades.length; i++) {

                    System.out.print(
                        "Enter grade for subject " +
                        (i + 1) + ": "
                    );

                    grades[i] = input.nextDouble();

                    sum += grades[i];
                }

                double average = sum / grades.length;

                System.out.println(
                    "Average = " + average
                );

                if (average >= 90) {
                    System.out.println("Excellent");
                }
                else if (average >= 80) {
                    System.out.println("Very Good");
                }
                else if (average >= 75) {
                    System.out.println("Passed");
                }
                else {
                    System.out.println("Failed");
                }
            }


            // =====================================================
            // PROBLEM 12: BASIC MATH CALCULATOR
            // =====================================================

            else if (choice == 12) {

                System.out.println("\n--- BASIC CALCULATOR ---");

                System.out.print("Enter first number: ");
                double a = input.nextDouble();

                System.out.print("Enter second number: ");
                double b = input.nextDouble();

                System.out.println("\nChoose operation:");
                System.out.println("+ Addition");
                System.out.println("- Subtraction");
                System.out.println("* Multiplication");
                System.out.println("/ Division");
                System.out.println("% Remainder");

                System.out.print("Enter operator: ");
                char operator = input.next().charAt(0);

                double result;

                switch (operator) {

                    case '+':

                        result = a + b;

                        System.out.println(
                            "Result = " + result
                        );

                        break;

                    case '-':

                        result = a - b;

                        System.out.println(
                            "Result = " + result
                        );

                        break;

                    case '*':

                        result = a * b;

                        System.out.println(
                            "Result = " + result
                        );

                        break;

                    case '/':

                        if (b == 0) {

                            System.out.println(
                                "Cannot divide by zero."
                            );

                        }
                        else {

                            result = a / b;

                            System.out.println(
                                "Result = " + result
                            );
                        }

                        break;

                    case '%':

                        if (b == 0) {

                            System.out.println(
                                "Cannot divide by zero."
                            );

                        }
                        else {

                            result = a % b;

                            System.out.println(
                                "Remainder = " + result
                            );
                        }

                        break;

                    default:

                        System.out.println(
                            "Invalid operator."
                        );
                }
            }


            // =====================================================
            // EXIT
            // =====================================================

            else if (choice == 0) {

                System.out.println("Program ended.");

            }


            // =====================================================
            // INVALID MENU CHOICE
            // =====================================================

            else {

                System.out.println(
                    "Invalid choice. Please choose 0-12."
                );
            }


        } while (choice != 0);


        input.close();
    }


    }
    
}
