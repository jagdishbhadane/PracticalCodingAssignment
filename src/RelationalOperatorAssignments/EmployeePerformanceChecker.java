package RelationalOperatorAssignments;

public class EmployeePerformanceChecker {

	public static void main(String[] args) {
        
		    int performance = 85;
	        int target = 80;

	        if (performance > target) {
	            System.out.println("Performance is greater than target");
	        } else {
	            System.out.println("Performance is not greater than target");
	        }

	        if (performance == target) {
	            System.out.println("Performance is equal to target");
	        } else {
	            System.out.println("Performance is not equal to target");
	        }

	        if (performance < target) {
	            System.out.println("Performance is less than target");
	        } else {
	            System.out.println("Performance is not less than target");
	        }

	}

}
