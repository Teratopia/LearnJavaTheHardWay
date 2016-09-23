import java.util.Scanner; //allows access to Scanner library methods

public class RudeQuestions{
	public static void main (String[] args){
	
		String name;
		int age;
		double weight, income;
		String answer;
		
		Scanner keyboard = new Scanner(System.in); //creates and names new Scanner object (class?)
		
		System.out.print( "Hello. What is your name? ");
		name = keyboard.next(); //initializes name variable
		
		System.out.print("Hi, " + name + "! How old are you? ");
		age= keyboard.nextInt();
		
		System.out.println("So you're " + age + ", eh? That's not very old.");
		System.out.print("How much do you weigh, " +name+ "? ");
		weight = keyboard.nextDouble();
		
		System.out.println(weight + "! Better keep that quiet!!");
		System.out.print("Finally, what's your income, " + name + "? ");
		income=keyboard.nextDouble();
		
		System.out.print("Hopefully that is " + income + " per hour");
		System.out.println(" and not per year!");
		System.out.print("Well, thanks for answering my rude questions, ");
		System.out.println(name + ".\n\n\n");
		System.out.print("One more thing: donuts or pancakes?");
		answer = keyboard.next();
		System.out.println("I'm sorry, " +name+ ", " + answer + " is incorrect. The correct answer was waffles.");
		
		}
	}
	
	//1. No, integers are doubles but doubles aren't integers
	//2. No, Strings include digits, chars and symbols
	/*3. 	1. Won't break		char, double, int, String == String
			2. 1.1 				double != int
			3. Apples			String != double
			4. Oranges			String != double
			5. Won't break		char, double, int, String == String
				?
				*/