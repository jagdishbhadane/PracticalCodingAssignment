package BODMASArithmeticOperatorsAssignments;

public class BODMASCalculator5 {
    public static void main(String[] args) {
        int a = 40;
        int b = 12;
        int c = 5;
        int d = 3;

        System.out.println("===== BODMAS Calculator =====");
        System.out.println();

        System.out.println("Expression 1: " + (a + b / c * d - b % c));
        System.out.println("Expression 2: " + ((a - b) / (c - d) + b * 2));
        System.out.println("Expression 3: " + (a % b + c * d - (b / d)));
        System.out.println("Expression 4: " + ((a + b) / d - c * (b % c)));
        System.out.println("Expression 5: " + (a / (b - c) + (c + d) * (a % b)));
    }
} 