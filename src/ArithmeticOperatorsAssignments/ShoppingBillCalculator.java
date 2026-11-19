package ArithmeticOperatorsAssignments;

public class ShoppingBillCalculator {

	public static void main(String[] args) {
		
		double productPrice = 499;
		int quantity = 3;

		double totalBill = productPrice * quantity;
		System.out.println("Total Bill : " + totalBill);

		double discount = totalBill * 10 / 100;
		System.out.println("Discount (10%) : " + discount);

		double finalAmount = totalBill * 90 / 100;
		System.out.println("Final Amount After Discount : " + finalAmount);
	}
}


