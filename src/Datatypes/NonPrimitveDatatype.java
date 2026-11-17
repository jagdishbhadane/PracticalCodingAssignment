package Datatypes;
import java.util.Scanner;
public class NonPrimitveDatatype {
	
	  int age;  //instance variable 
	public static void main(String[] args) {
		
		NonPrimitveDatatype n1=new NonPrimitveDatatype(); //object create syntax
		n1.age=23; // set value object
		System.out.println("Age :"+n1.age);  // print result 
		 
		//2.Non Primitive Datatype 
		//1.Array 
		int [] arr= {1,2,3,4,5,6};
		for(int i=0; i<arr.length-1; i++)
		{
			System.out.println(arr[i]);
		}
		 int [] arr1=new int[5];
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the array Elements size");
		 for(int i=0; i<arr1.length; i++)
		 {
			 System.out.println("Enter the array Elements");
			  arr1[i]=sc.nextInt();
		 }
		 for(int i=0; i<arr1.length; i++ )
		 {
			 System.out.println(arr1[i]);
		 }
		 
		 //2.String 
		String s1="Java";
		System.out.println(s1);
		
		String s2=new String("Sql");
		System.out.println(s2);
		

	}

}
