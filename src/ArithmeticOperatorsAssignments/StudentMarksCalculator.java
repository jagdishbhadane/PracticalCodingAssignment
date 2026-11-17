package ArithmeticOperatorsAssignments;
public class StudentMarksCalculator {
	public static void main(String[] args) {
		
		int java=85;
		int sql=75;
		int python=90;	
		 System.out.println("Student marks Report");
		 System.out.println("Java Marks :"+java);
		 System.out.println("Sql Marks :"+sql);
		 System.out.println("Python Marks :"+python);
		 
		 System.out.println();
		
		int total=java+sql+python;   // calculate of marks 
		System.out.println("Total Marks :"+total); //display
		float average=total/3.0f;
		System.out.println("Average of Marks :"+average);
		float percentage = (total / 300.0f) * 100;
		System.out.println("Percentage  :"+percentage);
		int totalmarks=300;
		int remainingmarks=totalmarks-total;
		System.out.println("Remaining Marks :"+remainingmarks);

	}
}
