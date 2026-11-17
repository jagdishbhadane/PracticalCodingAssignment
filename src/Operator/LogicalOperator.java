package Operator;
public class LogicalOperator {
	public static void main(String[] args) {
		System.out.println(true || false && false); // true 
		System.out.println((5 > 3) && !(2 < 1 || 3 == 3));//false
		boolean a = false, b = true;
		System.out.println(a && (b = false)); //false
		System.out.println(!(true && false || true));//false
		System.out.println((10 > 5) || (5 / 0 == 1));//true
		System.out.println((false && true) || (true && true));//true
		System.out.println((10 < 5) || (20 > 10 && 5 < 2));//false
		boolean x = true, y = false, z = true;
		System.out.println((x || y) && !(y && z));//true
		System.out.println(!(5 == 5 && 10 > 2) || (false));//false
		System.out.println((true && false) || (false || true));//true   
	}
}
