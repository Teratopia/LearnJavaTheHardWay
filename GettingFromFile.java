import java.io.File;
import java.util.Scanner;
	//^doesn't have to get input from human/keyboard!

public class GettingFromFile{
	public static void main( String[] args) throws Exception {
		String name;
		int a, b, c, sum;
		
		System.out.print("Getting name and three numbers from file...");
		Scanner fileIn = new Scanner (new File("name-and-numbers.txt"));
			//^instead of System.in, use ^ new File(blah.txt) to open text file read only
			//text file is the juice box, Scanner object is the straw
			
			name = fileIn.nextLine();
			a = fileIn.nextInt();
			b = fileIn.nextInt();
			c = fileIn.nextInt();
			fileIn.close();
			
		System.out.println("done.");
		System.out.println("Your name is "+name);
		sum = a + b + c;
		System.out.println(a + "+" + b + "+" + c + " = " + sum );
	}
}