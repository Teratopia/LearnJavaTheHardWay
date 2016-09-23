import java.util.Scanner;

public class CountingFor{
	public static void main (String[] args){
		Scanner keyboard = new Scanner(System.in);
		int n;
		String message;
		
		System.out.println("Enter a message and I'll display it five times.");
		System.out.print("Message: ");
		message = keyboard.nextLine();
		
		for ( n = 1; n <= 5; n++){
			System.out.println( n + ". " + message );
		}
		
		System.out.println("\nNow I'll show it ten times and count by 5s.");
		for (n = 5; n <= 50; n += 5){
			System.out.println( n + ". " + message );
		}
		
		System.out.println("\nFinally, three times counting backward.");
		for ( ; n > 0; n -= 1){
			System.out.println(n + ". " + message );
		}
	}
}

/*
	Three kinds of loops so far:
		while loop: conditions come first, as long as true body runs
		do loop: conditions last, body always runs once and continues as long as conditions true
		for loop: has three parts separated by semicolons (usually the same var in all parts)
			part 1- initialization tells variable where to start
			part 2- condition with truth value determines if loop continues
			part 3- update statement that controls how variable is changed each time
	For loops are best when doing something a set number of times, do and while loops
	are better when the loop is going an indefinite number of times
*/