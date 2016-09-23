import java.util.Scanner;

public class BMICalculator{
	public static void main (String[] args){
		Scanner keyboard = new Scanner(System.in);
		double feet, inches, height, pounds, m, kg, bmi;
		
		System.out.print("Your height (feet only) : ");
		feet = keyboard.nextDouble();
		
		System.out.print("Your height (inches) : ");
		inches = keyboard.nextDouble();
		
		height = (feet*12)+inches;
		m = height*.0254;
		
		System.out.print("Your weight in pounds: ");
		pounds = keyboard.nextDouble();
		kg = pounds*.453592;
		
		
		bmi = kg/(m*m);
		
		System.out.println("Your BMI is " + bmi);
		
		}
	}
	
	