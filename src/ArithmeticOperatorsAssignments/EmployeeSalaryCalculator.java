package ArithmeticOperatorsAssignments;

public class EmployeeSalaryCalculator {

	public static void main(String[] args) {
		int basicSalary = 25000;
		int hra = 5000;
		int da = 3000;
		int pf = 2000;
		int tax = 1000;
		
		System.out.println("===== Employee Salary Report =====");
		System.out.println("Basic Salary: " + basicSalary);
		System.out.println("HRA: " + hra);
		System.out.println("DA: " + da);
		System.out.println("PF: " + pf);
		System.out.println("Tax: " + tax);
		
		System.out.println();
		
		int GrossSalary=basicSalary+hra+da;
		System.out.println("Gross Salary :"+GrossSalary);
		int totaldeduction=pf+tax;
		System.out.println("Total Deduction :"+totaldeduction);
		int netsalary=GrossSalary-totaldeduction;
		System.out.println("Net Salary :"+netsalary);
		int annualsalary=netsalary*12;
		System.out.println("Annual salary :"+annualsalary);
		int averagemonthlysalary=annualsalary/12;
		System.out.println("Average Monthly Salary :"+averagemonthlysalary);
		

	}

}
