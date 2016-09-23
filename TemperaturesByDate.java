import java.util.Scanner;

class TemperatureSample{
	int month, day, year;
	double temperature;
}

public class TemperaturesByDate{
	public static void main (String[] args) throws Exception {
		String site = "http://academic.udayton.edu";
		String path = "/kissock/http/Weather/gsod95-current/CASANFRA.txt";
		Scanner inFile = new Scanner ((new java.net.URL(site+path)).openStream());
		
		TemperatureSample[] tempDB = new TemperatureSample[10000];
		//doesn't need to be perfect, just big enough		^
		TemperatureSample ts = tempDB[9];
		int numRecords, i = 0;
		//starts loop to read all values from the file
		while (inFile.hasNextInt() && i < tempDB.length ){
			TemperatureSample e = new TemperatureSample();
			e.month = inFile.nextInt();
			e.day = inFile.nextInt();
			e.year = inFile.nextInt();
			e.temperature = inFile.nextDouble();
			if (e.temperature == -99 )
				continue; //<--only legal inside the body of a loop
			tempDB[i] = e;
			i++;
		}
		
		System.out.println("Whole TemperatureSample record: " + ts );
		
		inFile.close();
		
		numRecords = i;
		System.out.println(numRecords + " daily temperatures loaded.");
		
		double total = 0, avg;
		int count = 0;
		for ( i=0; i<numRecords; i++){
			if ( tempDB[i].month == 2 ) {
				total += tempDB[i].temperature;
				count++;
			}
		}
		
		avg = total /count;
		avg = roundToOneDecimal(avg); //function below
		System.out.print("Average daily temperature over " + count);
		System.out.println(" days in February: " + avg);
		
	}
	
	public static double roundToOneDecimal( double d ){
		return Math.round(d*10)/10.0; //rounds to one decimal
	}
}