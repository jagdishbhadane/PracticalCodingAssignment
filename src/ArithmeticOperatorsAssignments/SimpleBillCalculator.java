package ArithmeticOperatorsAssignments;

public class SimpleBillCalculator {

	public static void main(String[] args) {
		int product1 = 500;
		int product2 = 300;
		int product3 = 200;
		int quantity = 2;
		
		System.out.println("===== Shopping Bill =====");
		System.out.println("Product 1 Price : " +product1);
		System.out.println("Product 2 Price : " +product2);
		System.out.println("Product 3 Price : " +product3);
		System.out.println("Quantity : " +quantity);
        System.out.println();
		int totalprice=product1+product2+product3;
		System.out.println("TotalPrice : "+totalprice);
	    int finalbill=totalprice*quantity;
	    System.out.println("Final Bill : "+finalbill );
	    int discount=(finalbill*10/100);
	    System.out.println("Discount (10%) : "+discount);
        int amountpayable=finalbill-discount;
        System.out.println("Amount Payable : "+amountpayable);
        int priceperproduct = amountpayable / 2;
        System.out.println("Price Per Product: "+priceperproduct);

	}

}
