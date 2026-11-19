/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Alex Cai
*****************************************************************************************************
*/

// Alex Cai - Y11 CS Lab 1.2 - Main

public class Main {

    public static void main(String[] args) {

        // Call add method for two integers
        int sum_two = add(3, 8);
        System.out.println(sum_two);

        // Call add method for four integers
        int sum_four = add(3, 8, 4, 9);
        System.out.println(sum_four);

        // Call morningGreeting method
        String morning_greeting_result = morningGreeting("Alex");
        System.out.println(morning_greeting_result);

        // Call afternoonGreeting method
        String afternoon_greeting_result = afternoonGreeting("Alex");
        System.out.println(afternoon_greeting_result);

        // Call triple method
        String tripled_string = triple("helloworld");
        System.out.println(tripled_string);

        // Call half method
        double half_int = half(37);
        System.out.println(half_int);

        // Call roundPositiveValueToNearestInteger method
        int rounded_pos = roundPositiveValueToNearestInteger(33.49);
        System.out.println(rounded_pos);

        // Call roundNegativeValueToNearestInteger method
        int rounded_neg = roundNegativeValueToNearestInteger(-0.5);
        System.out.println(rounded_neg);

    }

    // 1. add
    public static int add(int a, int b) {
        return a + b;
    }
    
    // 2. add
    public static int add(int a, int b, int c, int d) {
        int first_sum = add(a, b);
        int second_sum = add(c, d);
        return add(first_sum, second_sum);
    }

    // 3. morningGreeting
    public static String morningGreeting(String name_parameter) {
        return ("Good morning, " + name_parameter + "!");
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name_parameter) {
        return ("Good afternoon, " + name_parameter + "!");
    }

    // 5. triple
    public static String triple(String message) {
        return (message + message + message);
    }

    // 6. half

    public static double half(int num_parameter) {
        return ((double) num_parameter / 2);
    }

    // 7. roundPositiveValueToNearestInteger

    public static int roundPositiveValueToNearestInteger (double positive_value) {
        int int_part = (int) positive_value;
        if (positive_value - int_part >= 0.5) {
            int_part++;
        }
        return int_part;
    }

    // 8. roundNegativeValueToNearestInteger

    public static int roundNegativeValueToNearestInteger (double negative_value) {
        int int_part = (int) negative_value;
        if (negative_value - int_part <= -0.5) {
            int_part--;
        }
        return int_part;
    }

}