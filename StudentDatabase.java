class Student{
	String name;
	int credits;
	double gpa;
}

public class StudentDatabase {
	public static void main (String[] args){//<--array of strings called arg
		Student[] db; //<-- [] after variable def means array of...
		db = new Student[4];//declares db a variable that can hold an array of 3 students
		
		db[0] = new Student();
		db[0].name = "Esteban"; //stores value into name field of first record in array
		db[0].credits = 43;
		db[0].gpa = 2.9;
		
		db[1] = new Student();
		db[1].name = "Dave";
		db[1].credits = 15;
		db[1].gpa = 4.0;
		
		db[2] = new Student();
		db[2].name = "Michelle";
		db[2].credits = 132;
		db[2].gpa = 3.72;
		
		db[3] = new Student();
		db[3].name = "Tom";
		db[3].credits = 132;
		db[3].gpa = 4.10;
		
		for ( int i=0 ; i<db.length ; i++){ 
			System.out.println("Name: " + db[i].name);
			System.out.println("\tCredit hours: " + db[i].credits);
			System.out.println("\tGPA: " + db[i].gpa + "\n");
		}
		
		int maxLoc = 0; //holds index for highest gpa
		
		for( int i=1; i<db.length; i++){
			if ( db[i].gpa > db[maxLoc].gpa ) //gpa of db[i] > db[current highest] gpa
				maxLoc = i;
		}
		
		System.out.println(db[maxLoc].name + " has the highest GPA.");
		
		maxLoc = 0;
		
		for( int i=1; i<db.length; i++){
			if ( db[i].credits < db[maxLoc].credits ) //gpa of db[i] > db[current highest] gpa
				maxLoc = i;
		}
		
		System.out.println(db[maxLoc].name + " has the fewest credit hours.");
	}
}

/*
	1. There's no name to print on line 28
	
*/