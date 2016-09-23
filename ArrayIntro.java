public class ArrayIntro {
	public static void main(String[] args ){
		String[] planets = {"Mercury", "Venus", "Earth", "Mars",
							"Jupiter", "Saturn", "Uranus", "Neptune"};
		
		for (String p : planets){
			System.out.println( p + "\t" + p.toUpperCase());
		}
		
		String [] vars = {"Strings", "in", "arrays", "don't", "take", "ints", "chars", "doubles", "or booleans"};
		
		for (String p : vars){
			System.out.print(p + ", ");
		}
		System.out.println("\n");
	}
}

/*
	line three declares a variable called planets. [] makes variable
	and ARRAY OF STRINGS. The curly braces are used instead of parens.
	
	line six is a FOREACH LOOP/enhanced for loop= "for each String 'p'
	in the array 'planets'..." In the body of the loop the String
	variable p will take a copy of each value in the String array
	'planets', print it in lower and upper case, then run through
	the body again with the next variable in the array.
*/