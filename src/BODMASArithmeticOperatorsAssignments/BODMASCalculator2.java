package BODMASArithmeticOperatorsAssignments;

public class BODMASCalculator2 {
    public static void main(String[] args) {
        int a = 24;
        int b = 8;
        int c = 4;
        int d = 3;

        System.out.println("===== BODMAS Calculator =====");
        System.out.println();

        System.out.println("Expression 1: " + (a + b / c * d));
        System.out.println("Expression 2: " + ((a - b) / c + d * 2));
        System.out.println("Expression 3: " + (a % c + b * d - 5));
        System.out.println("Expression 4: " + ((a + b) / d + c * (b - d)));
        System.out.println("Expression 5: " + (a / (b - c) + d * (a % b)));
    }
}