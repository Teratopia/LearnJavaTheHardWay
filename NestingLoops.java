public class NestingLoops{
	public static void main(String [] args){
		//CN
		for (int n = 1; n <= 3; n ++){
			for (char c = 'A'; c <= 'E'; c++){
				System.out.println(c + " " + n);
			}
		}
		
		System.out.println("\n");
		//AB
		for (int a = 1; a <= 3; a++){
			for (int b=1; b<=3; b++){
				System.out.print("(" + a + "," + b + ") " );
			}
			System.out.println("---");
		}
		
		System.out.println("\n");
	}
}

/*

	1. n changes faster
	2. c counts up to E three times in a row instead of counting
		1-3 five times in a row
	3. points appear on new lines instead of all on the same line
	4. statment appears after second for loop finishes running
		three times, starting the next run of the first for
		loop on a new line
*/