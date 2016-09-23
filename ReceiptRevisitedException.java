import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReceiptRevisitedException{
	public static void main (String[] args) throws Exception{
		PrintWriter fileout;
		Scanner keyboard = new Scanner(System.in);
		double gallons, fuelTotal;

		//Try = this code may throw an exception but attempt it anyway
		try {
			fileout = new PrintWriter("receipt.txt");
		}
		//if exception is thrown, do catch block
		catch (IOException err){
			System.out.println("Sorry, I can't open 'receipt.txt' for writing.");
			System.out.println("Maybe the file exists and is read-only?");
			fileout = null;
			System.exit(1);
		} //^ if System.exit(0) then everything fine, if (1) the program is ending, something wrong
		
		System.out.println("Gas costs $ 1.959 per gallon.");
		System.out.print("How many gallons do you want? ");
		gallons = keyboard.nextDouble();
		fuelTotal = (1.959*gallons);
		System.out.println("Total cost: $ " + fuelTotal);
		System.out.println("\nWriting customized receipt to 'receipt.txt'... done.");

		
		fileout.println("+---------------------------+");
		fileout.println("|                           |");
		fileout.println("|        CORNER STORE       |");
		fileout.println("|                           |");
		fileout.println("|   2015-03-29   04:38PM    |");
		fileout.println("|                           |");
		fileout.println("|   Gallons:       " +gallons+"  |");
		fileout.println("|   Price/gallon: $ 2.089   |");
		fileout.println("|                           |");
		fileout.println("|   Fuel Total:   $ "+fuelTotal+"   |");
		fileout.println("|                           |");
		fileout.println("+---------------------------+");
		fileout.close();
		//^saves contents of file
		
	}
}