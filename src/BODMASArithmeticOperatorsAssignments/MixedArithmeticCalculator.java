package BODMASArithmeticOperatorsAssignments;

public class MixedArithmeticCalculator {

    public static void main(String[] args) {

        int a = 20;
        int b = 6;

        System.out.println("===== Mixed Arithmetic Calculator =====");
        System.out.println();

        System.out.println("Expression 1: " + (a + b * 3));
        System.out.println("Expression 2: " + ((a + b) * 2 - 5));
        System.out.println("Expression 3: " + (a / b + 4));
        System.out.println("Expression 4: " + (a % b + 10));
        System.out.println("Expression 5: " + ((a * 2 + b) / 3));

    }
}