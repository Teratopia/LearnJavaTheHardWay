import java.io.IOException;
import java.io.PrintWriter;

public class ReceiptRevisitedException{
	public static void main (String[] args) throws Exception{
		PrintWriter fileout;
		
		try {
			fileout = new PrintWriter("receipt.txt");
		}
		catch ( IOException err){
			System.out.println("Sorry, I can't open 'receipt.txt' for writing.");
			System.out.println("Maybe the file exists and is read-only?");
			fileout = null;
			System.exit(1);
		}
		
		fileout.println("+---------------------------+");
		fileout.println("|                           |");
		fileout.println("|        CORNER STORE       |");
		fileout.println("|                           |");
		fileout.println("|   2015-03-29   04:38PM    |");
		fileout.println("|                           |");
		fileout.println("|   Gallons:       10.870   |");
		fileout.println("|   Price/gallon: $ 2.089   |");
		fileout.println("|                           |");
		fileout.println("|   Fuel Total:   $ 22.71   |");
		fileout.println("|                           |");
		fileout.println("+---------------------------+");
		fileout.close();
		//^saves contents of file
	}
}