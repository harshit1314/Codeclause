package javac;
import java.util.*;
public class Calculator {
  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two no.");
		float a= sc.nextFloat();
		float b = sc.nextFloat();
		
		System.out.println("Choose the Module operation");
		
		System.out.println("");
		System.out.println("1: Addition");
		System.out.println("2: Subtraction");
		System.out.println("3: Division");
		System.out.println("4: Multiplication");
		System.out.println("5: Remainder");
		System.out.println("Enter the option");
		int c= sc.nextInt();
		
		switch(c)
		{
		case 1:
			float temp= a+b;
			System.out.println("Addition= "+temp);
			break;
		case 2:
			float temp2= a-b;
			System.out.println("Subtraction= "+temp2);
			break;
		case 3:
			float temp3= a/b;
			System.out.println("Division= "+temp3);
			break;
		case 4:
			float temp4= a*b;
			System.out.println("Division= "+temp4);
			break;
		case 5:
			float temp5= a%b;
			System.out.println("Remainder= "+temp5);
			break;
		case 6:
			System.out.println("Exit");
			System.out.println("");
			break;
			default:
				System.out.println("Wrong Choice");
			
			
		}
		
		
		

	}

}
