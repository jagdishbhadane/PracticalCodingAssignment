package ArithmeticOperatorsAssignments;

public class RestaurantBillSplitter {

	public static void main(String[] args) {
		
		int totalBill = 2400;
		int friends = 4;
		int serviceCharge = 50;

		int eachPerson = totalBill / friends;
		System.out.println("Each Person's Contribution : " + eachPerson);

		int finalContribution = eachPerson + serviceCharge;
		System.out.println("Final Contribution Per Person : " + finalContribution);

	}

}
