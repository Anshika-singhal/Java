import java.util.Scanner;

public class Var_exp_in_op {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input for three numbers
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd number: ");
        int num3 = sc.nextInt();
        
        // Closing the scanner to avoid resource leaks
        sc.close();
        
        // Functions can be called here as needed with the given inputs, e.g.,
        // sum_two_numbers(num1, num2);
        // avg_three_numbers(num1, num2, num3);
    }

    // Function to calculate and print the sum of two numbers
    static void sum_two_numbers(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
    }

    // Function to calculate and print the average of two numbers
    static void avg_two_numbers(int a, int b) {
        double avg = (double) (a + b) / 2;
        System.out.println("Average of " + a + " and " + b + " is: " + avg);
    }

    // Function to calculate and print the average of three numbers with formatted output
    static void avg_three_numbers(int a, int b, int c) {
        double avg = (double) (a + b + c) / 3;
        System.out.printf("Average of %d, %d, and %d is: %.2f%n", a, b, c, avg);
    }

    // Function to calculate and print the area of a circle given its radius
    static void area_circle(int rad) {
        double area = 3.14 * rad * rad;
        System.out.printf("Area of circle with radius %d is: %.2f%n", rad, area);
    }

    // Function to calculate and print the area of a rectangle given its length and breadth
    static void area_rectangle(int len, int brd) {
        double area = (double) len * brd;
        System.out.printf("Area of rectangle having length %d and breadth %d is: %.2f%n", len, brd, area);
    }

    // Function to calculate and print the area of a triangle given its base and height
    static void area_triangle(int base, int hgt) {
        double area = 0.5 * base * hgt;
        System.out.printf("Area of triangle having base %d and height %d is: %.2f%n", base, hgt, area);
    }

    // Function to swap two numbers without using a third variable
    static void swap(int a, int b) {
        System.out.printf("Before swapping num1 is %d and num2 is %d%n", a, b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.printf("After swapping num1 is %d and num2 is %d%n", a, b);
    }

    // Function to print the multiplication table of a given number
    static void multiple(int num) {
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            result = num * i;
            System.out.printf("%d * %d = %d%n", num, i, result);
        }
    }

    // Function to convert Celsius to Fahrenheit and print the result
    static void fahrenheit(float temp) {
        float fah = ((temp * 9) / 5) + 32;
        System.out.printf("Given temperature %.2f in Celsius is %.2f in Fahrenheit%n", temp, fah);
    }

    // Function to convert Fahrenheit to Celsius and print the result
    static void celcius(float temp) {
        float cel = (5.0f / 9.0f) * (temp - 32);
        System.out.printf("Given temperature %.2f in Fahrenheit is %.2f in Celsius%n", temp, cel);
    }
}

/*
Note: Modify the variables passed to the functions in the main method as needed.
For example:
- To use the 'area_circle' function, call it as: area_circle(num1);
- To use 'swap', pass two numbers: swap(num1, num2);
- Each function has specific parameters, so adjust your calls accordingly.
*/
