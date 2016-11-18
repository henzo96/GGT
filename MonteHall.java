/**
 * 
 */

/**
 * @author henning
 *
 */
public class MonteHall {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	//Es gibt zwei Moeglichkeiten: Der Preis ist in der Tür, die ausgewaehlt wurde (Doorone),
	// oder in einer der beiden anderen (Doorother)	
		Long Versuche = Long.parseLong(args[0]);
		double doorone =0.0;
		double doorother =0.0;
		
		
		
		if (Versuche<1) {
			System.out.println("nur positive ganze Zahlen als Argumente erlaubt");
			System.exit(-1);}
		
	//Es wird zufaellig ermittelt, ob der Preis in Doorone (erstgewählte Tür), oder einer der beiden anderen ist
	
	for (int i = 0; i < Versuche; i++) {
		int win1 = 0;
		int win2 = 0;
		if (Math.random()*3 > 1) {win2++; ;}
		  else                     {win1++; ;}
		 if (win1 == 1) doorone++;
		 if (win2 == 1) doorother++;
		}
	;
	
	System.out.println("Nicht Wechseln "+doorone/Versuche);	
	System.out.println("Wechsenln "+doorother/Versuche);}
}
	

	


