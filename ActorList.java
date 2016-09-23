import java.util.Scanner;

class Actor {
	String name;
	String role;
	String birthdate;
}
//^ record = Actor, three fields

public class ActorList{
	public static void main (String[] args) throws Exception{
		String url = "https://learnjavathehardway.org/txt/s01e01-cast.txt";
		//Scanner inFile = new Scanner(new java.io.File("s01e01=cast.txt"));
		Scanner inFile = new Scanner((new java.net.URL(url)).openStream());
		//^ Scanner object connected to internet address of input
		//text file. instead of importing java.net.URL first, the
		//whole class name is declared at once. better if only using
		//one time.
		
		int counter = 0;
		
		while ( inFile.hasNext()){
			Actor a = getActor(inFile);
			counter++;
			System.out.print(a.name + " was born on " + a.birthdate);
			System.out.println(" and played " + a.role);
		}
		inFile.close();
		System.out.println("There were " + counter + " records processed.");
	}
	
	public static Actor getActor( Scanner input ){
		Actor a = new Actor();
		a.name = input.nextLine();
		a.role = input.nextLine();
		a.birthdate = input.nextLine();
		
		return a;
	}
}