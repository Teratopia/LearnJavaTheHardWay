import java.io.File;
import java.util.Scanner;

public class GettingWholeFile {
	public static void main(String[] args) throws Exception{
		int fourLetter = 0;
		int caps = 0;
		String fn1 = "some-words.txt";
		String fn2 = "GettingWholeFile.java";
		
		Scanner wordReadr = new Scanner(new File(fn1));
		
		//wordReadr is new Scanner object, attached to read from a file
		//file name stored as string variable (fn1) first
		
		while (wordReadr.hasNext()){
			String w = wordReadr.next();
			if (w.length()==4){
				fourLetter++;
			}
		}
		wordReadr.close();
		
		/* .hasNext() returns TRUE if the scanner has stuff in it
			we haven't seen yet, and returns false if the file is
			empty or we've already read everything.
			while makes wordReadr loop as long as hasNext() remains
			true.
			line 16 defines w as the next string in scanner
				(AUTOMATICALLY BREAKS FOR SPACES??)
			line 17 and 18 adds to fourLetter counter variable
		*/
		
		Scanner selfInput = new Scanner(new File(fn2));
		while ( selfInput.hasNext()){
			String token = selfInput.next();
			if (Character.isUpperCase(token.charAt(0))){
				caps++;
			}
		}
		selfInput.close();
		
		//token.CharAt(0) means the first letter of current word
		//Character.isUpperCase( token.charAt(0) ) is TRUE if
		//first letter is upper cased
		
		System.out.println( fourLetter + " four-letter words in " + fn1 );
		System.out.println( caps + " words start with capitals in " + fn2 );
	}
}

//Plenty of Comments Already In this one!