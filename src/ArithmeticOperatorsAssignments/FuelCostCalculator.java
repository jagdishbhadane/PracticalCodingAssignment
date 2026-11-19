package ArithmeticOperatorsAssignments;

public class FuelCostCalculator {

	public static void main(String[] args) {
		int distance = 350;       
		int mileage = 14;         
		int petrolPrice = 105;   

		int requiredPetrol = distance / mileage;
		System.out.println("Required Petrol : " + requiredPetrol + " litres");

		int totalFuelCost = requiredPetrol * petrolPrice;
		System.out.println("Total Fuel Cost : ₹" + totalFuelCost);

	}

}
