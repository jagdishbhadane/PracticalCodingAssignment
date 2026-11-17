package Operator;
public class RelationalOperator {
	public static void main(String[] args) {
		System.out.println((10 > 5) == (5 < 10));//true
		System.out.println(5 >= 5 && 6 != 7);// true
		System.out.println('A' == 65);//true
		System.out.println('B' > 'A' && 'a' > 'Z');//true
		System.out.println(5 < 3 || 2 == 2 && 3 > 1);//true
		System.out.println((10 == 10) && !(10 != 10));//true
		int a = 10, b = 20, c = 30;
		System.out.println(a < b && b < c);//true
		System.out.println((5 < 6) == true);//true
		System.out.println((true == false) != (false == false));//true
		System.out.println((5 < 10 ? 1 : 0) == 1);//true
	}

}
