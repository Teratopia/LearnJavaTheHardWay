import java.io.PrintWriter;

public class ReceiptRevisited{
	public static void main (String[] args) throws Exception{
		PrintWriter fileout = new PrintWriter("reciept.txt");
		
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
	}
}