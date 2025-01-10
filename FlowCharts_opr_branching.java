import java.util.Scanner;

public class FlowCharts_opr_branching {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter units used: ");
        int units = sc.nextInt(); // Accept the number of units consumed as input.
        electricityBill(units);
    }

    /**
     * Function to find the maximum of three numbers.
     * The method takes three floating-point numbers as input and returns the largest.
     * Note: Change the number or type of input variables according to your requirements.
     */
    static float max_three(float num1, float num2, float num3) {
        float max1 = Math.max(num1, num2); // Find the maximum of num1 and num2.
        float max = Math.max(num3, max1); // Compare the result with num3 to find the maximum.
        return max;
    }

    /**
     * Function to calculate the grade based on marks obtained.
     * The method returns a grade (A-F) as per the score ranges provided.
     * Note: Modify the type of the marks parameter if required.
     */
    static String grade(float marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80 && marks < 90) {
            return "B";
        } else if (marks >= 70 && marks < 80) {
            return "C";
        } else if (marks >= 60 && marks < 70) {
            return "D";
        } else if (marks >= 50 && marks < 60) {
            return "E";
        }
        return "F";
    }

    /**
     * Function to validate if the input number is within the range of 1 to 99.
     * If the number is outside this range, it displays an appropriate message.
     * Note: Adjust the range or input validation logic as needed.
     */
    static void validInput(int num) {
        if (num < 0 || num > 100) {
            System.out.println("Please specify a number greater than 0 and less than 100.");
        } else {
            System.out.println("Number accepted");
        }
    }

    /**
     * Function to subtract the smaller number from the larger one.
     * The method returns the absolute difference between two integers.
     * Note: Change input variable types if your requirements differ.
     */
    static int result_of_subtraction(int a, int b) {
        int max = Math.max(a, b); // Identify the larger number.
        int min = Math.min(a, b); // Identify the smaller number.
        return max - min; // Return the difference.
    }

    /**
     * Function to calculate BMI and categorize the individual based on their BMI value.
     * The method accepts weight (kg) and height (m) as inputs and returns the category.
     * Note: Adjust weight and height types if required for different units.
     */
    static String BMI_calculator(double weight, double height) {
        double bmi = (weight / (height * height)); // Calculate BMI using the formula.
        if (bmi < 18.5) {
            return "thin";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "normal";
        } else if (bmi >= 25 && bmi < 30) {
            return "overweight";
        }
        return "obese"; // BMI >= 30 falls into the obese category.
    }

    /**
     * Function to calculate the electricity bill based on the number of units consumed.
     * The bill includes fixed charges and is calculated in slabs:
     * - 0 to 100 units: 6.30 per unit
     * - 101 to 200 units: 6.85 per unit
     * - Beyond 200 units: 7.40 per unit
     * The method prints the total bill and a detailed breakdown of charges.
     * Note: Update unit prices or slab ranges if the tariff changes.
     */
    static void electricityBill(int units) {
        double bill_to_pay_upto100 = 0;
        double bill_to_pay_upto200 = 0;
        double bill_to_pay_forRemaining = 0;
        double amount = 0;
        final int fixedPrice = 100; // Fixed charge for the bill.

        if (units > 0 && units <= 100) {
            amount = units * 6.30;
            bill_to_pay_upto100 = units * 6.30;
        } else if (units > 100 && units <= 200) {
            amount = (100 * 6.30) + ((units - 100) * 6.85);
            bill_to_pay_upto100 = 100 * 6.30;
            bill_to_pay_upto200 = (units - 100) * 6.85;
        } else {
            amount = (100 * 6.30) + (100 * 6.85) + ((units - 200) * 7.40);
            bill_to_pay_upto100 = 100 * 6.30;
            bill_to_pay_upto200 = 100 * 6.85;
            bill_to_pay_forRemaining = (units - 200) * 7.40;
        }

        double bill = fixedPrice + amount;
        System.out.println("Your total bill: " + bill);
        System.out.println("Total units: " + units);
        System.out.println("Breakup!");
        System.out.println("Fixed Charges: " + fixedPrice);
        System.out.println("Bill for first 100 units: " + bill_to_pay_upto100);
        System.out.println("Bill for 101 to 200 units: " + bill_to_pay_upto200);
        System.out.println("Bill beyond 200 units: " + bill_to_pay_forRemaining);
    }
}
