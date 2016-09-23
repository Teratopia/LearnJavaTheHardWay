
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class CaesarCipher{
	//main doesn't have to be the first function in a class
	//char variables are use '' instead of ""
	public static char shiftLetter( char c, int n){
		int u = c;
		
		if ( ! Character.isLetter(c))
			return c;
			
		u = u + n;
		if ( Character.isUpperCase(c) && u > 'Z'
		|| Character.isLowerCase(c) && u > 'z'){
			u -= 26;
		}
		if ( Character.isUpperCase(c) && u < 'A'
		|| Character.isLowerCase(c) && u < 'a' ) {
			u += 26;
		}
		
		return (char) u;
	}
	
	public static void main ( String[] args) throws Exception{
		Scanner keyboard = new Scanner( System.in);
		String plaintext, caesarSave= "CaesarSave.txt", cipher = "";
		int shift;
		
		System.out.print("File: ");
		plaintext = keyboard.nextLine();
		System.out.print("Shift (0-26): ");
		shift = keyboard.nextInt();
		
		Scanner wordReadr = new Scanner( new File(plaintext));
			while (wordReadr.hasNext()){
				String w = wordReadr.next();
		
				for ( int i = 0; i<w.length(); i++){
					cipher += shiftLetter( w.charAt(i), shift );
				}
			}
			wordReadr.close();
		
		File f = new File(caesarSave);
		System.out.println("Saving to file CaesarSave.txt...done");
		PrintWriter out = new PrintWriter(f);
			out.println(cipher);
		out.close();
	}
}