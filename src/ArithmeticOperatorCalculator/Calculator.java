package ArithmeticOperatorCalculator;

public class Calculator {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;

        System.out.println("===== Arithmetic Operator Calculator =====");
        System.out.println();

        System.out.println("a = " + a + ", b = " + b);
        System.out.println();

        System.out.println("Addition       : " + add);
        System.out.println("Subtraction    : " + sub);
        System.out.println("Multiplication : " + mul);
        System.out.println("Division       : " + div);
        System.out.println("Modulus        : " + mod);
    }
}