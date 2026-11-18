package BODMASArithmeticOperatorsAssignments;

public class BODMASCalculator3 {
    public static void main(String[] args) {
        int a = 30;
        int b = 10;
        int c = 5;
        int d = 2;

        System.out.println("===== BODMAS Calculator =====");
        System.out.println();

        System.out.println("Expression 1: " + (a / b + c * d - 3));
        System.out.println("Expression 2: " + ((a + b) / c * (d + 1)));
        System.out.println("Expression 3: " + (a % b + (c * d) - b / d));
        System.out.println("Expression 4: " + ((a - b) / (c - d) + a % c));
        System.out.println("Expression 5: " + (a / (b - c) + (c + d) * b));
    }
}