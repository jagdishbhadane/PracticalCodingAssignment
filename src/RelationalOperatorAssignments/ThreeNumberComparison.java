package RelationalOperatorAssignments;

public class ThreeNumberComparison {

	public static void main(String[] args) {
		
		int a = 50, b = 30, c = 70;
		
		if(a>b)
		{
			 System.out.println("A Is Greater than b");
		}
		else
		{
			 System.out.println("A is Not Greater than b ");
		}
		if(c>a)
		{
			 System.out.println("C is Greater than b");
		}
		else
		{
			 System.out.println("C is Not Greater than a");
		}
		
		boolean abEqual=a==b;
		boolean bcEqual=b==c;
		
		 System.out.println("a == b : " + abEqual);
	     System.out.println("b == c : " + bcEqual);
	}

}  
