package BODMASArithmeticOperatorsAssignments;

public class BasicBODMASCalculator {

	public static void main(String[] args) {
		 int a=10;
		 int b=5;
		 
		 System.out.println("===== BODMAS Calculator =====");
         System.out.println();
		 System.out.println("Expression 1: " + (a + b * 2));
		 System.out.println("Expression 2: " + ((a + b) * 2));
		 System.out.println("Expression 3: " + (a - b + 3));
		 System.out.println("Expression 4: " + (a * b / 2));
		 System.out.println("Expression 5: " + (a + b * 2 - 3));
	}

}
