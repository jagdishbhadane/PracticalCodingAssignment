package VariableandTypes;
public class VariablesAndTypes {
	 String name="Jagdish Dinkar Bhadane"; //instance variable 
	 static String collegename="Imrd College Shirpur"; //static variable
	 public void m1()
	 {
		   int age=23; //local variable
		   
		   System.out.println("This is Age :"+age);
		   System.out.println("My Name Is :"+name);	   
	 }
	public static void main(String[] args) {
		
		VariablesAndTypes v1=new VariablesAndTypes();
		 v1.m1();
		System.out.println("This Is my College name :"+VariablesAndTypes.collegename);
		 
	}
}
