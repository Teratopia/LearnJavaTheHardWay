import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class CoinFlipSave{
	public static void main(String[] args) throws Exception{
		Scanner keyboard = new Scanner(System.in);
		String coin, again, playerName, bestName, saveFileName = "coin-flip-score.txt";
		int streak = 0, best;
		boolean gotHeads;
		
		//Creates new file called "coin-flip-score.txt" (defined above)
		//if... checks if the file exists/has more than zero bytes
		//^ "A GOOD PROGRAMMER LOOKS BOTH WAYS BEFORE CROSSING A
		//ONE WAY STREET"
		File f = new File(saveFileName);
		if (f.exists() && f.length() > 0){
			Scanner input = new Scanner(f);
				bestName = input.next();
				best = input.nextInt();
			input.close();
			System.out.print("High score is " + best);
			System.out.println(" flips in a row by " + bestName);
		}
		//if it does exist it scans for name and high score
		else{
			System.out.println("Save game file doesn't exist or is empty.");
			best = -1;
			bestName = "";
		}
		
		do{
			gotHeads = Math.random() < .5;
			
			if(gotHeads){
				coin = "HEADS";
			}else{
				coin = "TAILS";
			}
			
			System.out.println("You flip and a coin and it is..."+coin);
			
			if(gotHeads){
				streak++;
				System.out.println("\tThat's " +streak+ " in a row....");
				System.out.print("\tWould you like to flip again? (y/n)? ");
				again = keyboard.next();
			}else{
				System.out.println("\tYou lose everything!");
				System.out.println("\tShould've quit while you were aHEAD....");
				streak = 0;
				again = "n";
			}
		} while (again.equals("y"));
		
		System.out.println("Final score: " + streak );
		

		if (streak > best) {
			System.out.println("That's a new high score!");
			System.out.print("Your name: ");
			playerName = keyboard.next();
			if (!playerName.equals(bestName)){
				playerName = bestName;
				best = streak;
				}else{
				System.out.println("Go read a book!");
				}
				
		}
		else if (streak == best){
			System.out.println("That ties the high score. Cool.");
		}
		else {
			System.out.print("You'll have to do better than ");
			System.out.println(streak + " if you want a high score.");
		}
		
		//Save this name and high score to file.
		PrintWriter out = new PrintWriter(f);
			out.println(bestName);
			out.println(best);
		out.close();
	}
}