package Operator;

public class RelationalDemo {

    public static void main(String[] args)
    {
        int a = 15;
        int b = 10;

        System.out.println("A is Greater Than B : "+(a>b)); // 15>10 ->true
        System.out.println("A is Less Than B : "+(a<b)); //15<10 ->false
        System.out.println("A is Greater Than equal to b : "+(a>=b)); //15>=10 ->true
        System.out.println("A is less than or equal to b : "+(a<=b)); //15<=10 ->false
        System.out.println("A is equal to b : "+(a==b)); //15==10 ->false
        System.out.println("A is not Equal to b "+ (a!=b)); //15!=10 -true
    }
}
