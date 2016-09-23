	/*
		foreach loops can't iterate backward or change the values in an array
		
		initializer lists '{}' only work when the array is first
		being declared, best only for small arrays, can't read from files
		or other places.
		Alternative is using square brackets and a slot number
	*/
	
public class ArraySlotAccess{
	public static void main( String[] args){
		int [] arr = new int[1000];
		//integer array "arr" = new integer array with three items
		
		//We almost always use a for loop to access each slot of an array.
		for ( int i = 0; i < arr.length ; i++){
			arr[i] = 1 + (int)(Math.random()*100);
		}
		
		//Displaying all values in an array usually looks like this:
		System.out.print("Values: ");
		for (int i=0 ; i < arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//Step one: put a number into each slot of the array, one at a time
		//arrays begin at 0 in most languages == 'index 0'
		arr[0] = 6;
		arr[1] = 7;
		arr[2] = 8;
		
		//Then display the values in those slots, one at a time
		System.out.println("Values: " + arr[0] + " " + arr[1] + " " + arr[2]);
		
		//Put random number 1-100 into each slot of the array, one at a time
		arr[0] = 1 + (int)(Math.random()*100);
		arr[1] = 1 + (int)(Math.random()*100);
		arr[2] = 1 + (int)(Math.random()*100);
		
		//Display them again, one at a time
		System.out.println("Values: " + arr[0] + " " + arr[1] + " " + arr[2]);

		int m = 0;
		arr[m] = 1 + (int)(Math.random()*100);
		m = 1;
		arr[m] = 1 + (int)(Math.random()*100);
		m = 2;
		arr[m] = 1 + (int)(Math.random()*100);
		
		System.out.print("Values: ");
		m = 0;
		System.out.print(arr[m] + " ");
		m = 1;
		System.out.print(arr[m] + " ");
		m = 2;
		System.out.print(arr[m] + " ");
		System.out.println();
		
		int n = 0;
		arr[n] = 1 + (int)(Math.random()*100);
		n++;
		arr[n] = 1 + (int)(Math.random()*100);
		n++;
		arr[n] = 1 + (int)(Math.random()*100);
		n++;
		
		System.out.print("Values: ");
		n = 0;
		System.out.print(arr[n] + " ");
		n++;
		System.out.print(arr[n] + " ");
		n++;
		System.out.print(arr[n] + " ");
		n++;
		System.out.println();
		
		// two for loops below replace the 16 lines above
		for(int q = 0; q < arr.length ; q++){
			arr[q] = 1 + (int)(Math.random()*100);
		}
		
		System.out.print("Values: ");
		for (int q=0 ; q < arr.length ; q++){
			System.out.print(arr[q] + " ");
		}
		System.out.println();
	}
	
	//if your question is 'how do i ___ an array?', the answer is
	//a for loop
}
		