package uebung_3_4;

public class Binomialkoeffizienten {

	public static void main(String[] args) {
		double n = 49;
		
		double fakultitätN = 1;
		for (int zaehler = 2; zaehler <= n; zaehler = zaehler + 1){
		//Übernahme der Formel aus 1.2
		// Welche Bedeutung hat for?
		fakultitätN = fakultitätN * zaehler;
		}
		
		double k = 6;
		double fakultitätK = 1;
		for (int zaehler = 2; zaehler <= k; zaehler = zaehler + 1) {
		fakultitätK = fakultitätK * zaehler;
		}
					
		double nminusk = n - k;
		double fakultitätnk = 1;
		for (int zaehler = 2; zaehler <= nminusk; zaehler = zaehler + 1) {
		fakultitätnk = fakultitätnk * zaehler;
		}
				
		double nüberk = fakultitätN / fakultitätK * fakultitätnk;

		System.out.println("Die Lösung von n über k ist " + nüberk);
	}

}
