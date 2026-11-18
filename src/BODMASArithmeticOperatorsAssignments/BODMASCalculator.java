package BODMASArithmeticOperatorsAssignments;

public class BODMASCalculator {
    public static void main(String[] args) {
        int a = 20;
        int b = 6;
        int c = 4;
        int d = 2;

        System.out.println("===== BODMAS Calculator =====");
        System.out.println();

        System.out.println("Expression 1: " + ((a + b) * c / d));
        System.out.println("Expression 2: " + (a + b * c - d));
        System.out.println("Expression 3: " + ((a - b) * (c + d)));
        System.out.println("Expression 4: " + (a / d + b * c));
        System.out.println("Expression 5: " + ((a + b * c) / d));
    }
}