package BODMASArithmeticOperatorsAssignments;
public class ModulusCalculator {
    public static void main(String[] args) {
        int a = 25;
        int b = 4;

        System.out.println("===== Modulus Calculator =====");
        System.out.println();

        System.out.println("a % b = " + (a % b));
        System.out.println("a % 3 = " + (a % 3));
        System.out.println("(a + b) % 5 = " + ((a + b) % 5));
        System.out.println("(a * 2) % b = " + ((a * 2) % b));
        System.out.println("(a + 10) % (b + 2) = " + ((a + 10) % (b + 2)));
    }
}