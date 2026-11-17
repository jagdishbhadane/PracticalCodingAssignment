package Operator;

public class Assignment {
    public static void main(String[] args)
    {
         int a=20;

        a += 10;
        System.out.println("Add Assign :"+a);
        a -= 5;
        System.out.println("Substract Assign :"+a);
        a *= 2;
        System.out.println("Multiply Assign :"+a);
        a /= 5;
        System.out.println("Divison Assign :"+a);
        a %= 3;
        System.out.println("Modulus Assign :"+a);

    }
}
