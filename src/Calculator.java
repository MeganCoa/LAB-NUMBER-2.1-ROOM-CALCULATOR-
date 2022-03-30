import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		char choice = 'y';
		
		while(choice == 'y'){
			Scanner scrn = new Scanner(System.in); //Create a Scanner Object user input
			
			System.out.println("Welcome to Grand Circus’ Room Detail Generator!");
			
			System.out.println("Enter Length:");
			float lenght = scrn.nextFloat(); 
			System.out.println("Enter Width:");
			float width = scrn.nextFloat(); 
			
			float area = lenght * width;
			float perimeter = lenght * 4;
			System.out.println("Area:" + area);
			System.out.println("Perimeter:" + perimeter);
			System.out.println("Continue? (y/n): ");
			
			choice = scrn.next().charAt(0);
			}
	
	}
}
