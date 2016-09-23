import java.util.Scanner;

public class ArrayLinearSearch {
	public static void main (String[] args){
		Scanner keyboard = new Scanner(System.in);
		int[] orderNumbers = {12345, 54321, 101010, 8675309, 31415, 271828};
		int toFind;
		boolean isThere = true;
		
		System.out.print("There are " + orderNumbers.length);
		System.out.println(" order in the database.");
		
		System.out.print("Orders: ");
		for ( int num : orderNumbers){
			System.out.print(num + "  ");
		}
		System.out.println();
		
		System.out.print("Which order to find? ");
		toFind = keyboard.nextInt();
		
			for ( int num : orderNumbers){
				if ( num == toFind){
					System.out.println( num + " found.");
				}else{
				isThere=false;
			}
		}
		if(isThere == false){
			System.out.println("The order could not be found.");
		}
	}
}


// .length is built-in variable that tells the number of things
//in the array. Can be read but not altered. 
// on line 13 a foreach loop displays all the order numbers
// ^ "for-each integer 'num' in the array 'orderNumbers'..."
//on line 19 we make human input = toFind, then on 20 a loop compares
//it to each thing in the array, then says so when there is a match

// 1. No, have to include int