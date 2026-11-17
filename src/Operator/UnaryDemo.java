package Operator;
public class UnaryDemo {
    public static void main(String[]args)
    {
          int a=10;

          System.out.println("Pre-Increment :"+(++a));//11 first increment after current use value
          System.out.println("Post-Increment :"+(a++));//11  first  current use value after increment
          System.out.println("Pre-Decrement :"+(--a));//11  first decrement after current value use
          System.out.println("Post-Decrement :"+(a--));//11  first current value use  after decrement
          System.out.println("Final Value :"+a);//10
    }
}
