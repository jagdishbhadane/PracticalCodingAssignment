package BODMASArithmeticOperatorsAssignments;

public class BODMASCalculator1 {
    public static void main(String[] args) {
        int a = 15;
        int b = 5;
        int c = 3; 
        int d = 2;

        System.out.println("===== BODMAS Calculator =====");
        System.out.println();

        System.out.println("Expression 1: " + (a + b * c - d));
        System.out.println("Expression 2: " + ((a + b) * (c - d)));
        System.out.println("Expression 3: " + (a % b + c * d));
        System.out.println("Expression 4: " + (a / c + b * d - a % d));
        System.out.println("Expression 5: " + ((a + b * c) / (d + 1)));
    }
}