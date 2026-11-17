package Operator;
public class ArithemticOperator {
	public static void main(String[] args) {
		 System.out.println(10 + 2 * 5 - 3);//17
		 System.out.println((10 + 2) * (5 - 3));//24
		 System.out.println(20 / 5 + 3 * 2 - 1);//9
		 System.out.println(100 % 3 * 4 + 6 / 2);//7
		 System.out.println(10 + 20 / 5 * 2);//18
		 System.out.println(5 + 2 * 3 % 4);//7
		 System.out.println((12 - 4) * 2 + 3);//19
		 System.out.println(15 / 2 * 2);//14
		 int a = 5;
		 System.out.println(++a + a++);//12
		 int x = 10;
		 System.out.println(x++ + ++x + x);//34
	}   
}
