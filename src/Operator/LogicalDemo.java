package Operator;

public class LogicalDemo {

    public static void main (String[] args)
    {
          int a=15;
          int b=10;

          System.out.println((a>b)&&(a>0)); // true
          System.out.println((a<b)&&(b>0)); // false
          System.out.println((a>b)||(a<0)); //true
          System.out.println((a<b) ||(b>0)); //  true
          System.out.println(!(a>b)); //false

    }
}
