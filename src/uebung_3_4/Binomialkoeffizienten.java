package uebung_3_4;

public class Binomialkoeffizienten {

	public static void main(String[] args) {
		double n = 49;
		
		double fakultit�tN = 1;
		for (int zaehler = 2; zaehler <= n; zaehler = zaehler + 1){
		//�bernahme der Formel aus 1.2
		// Welche Bedeutung hat for?
		fakultit�tN = fakultit�tN * zaehler;
		}
		
		double k = 6;
		double fakultit�tK = 1;
		for (int zaehler = 2; zaehler <= k; zaehler = zaehler + 1) {
		fakultit�tK = fakultit�tK * zaehler;
		}
					
		double nminusk = n - k;
		double fakultit�tnk = 1;
		for (int zaehler = 2; zaehler <= nminusk; zaehler = zaehler + 1) {
		fakultit�tnk = fakultit�tnk * zaehler;
		}
				
		double n�berk = fakultit�tN / fakultit�tK * fakultit�tnk;

		System.out.println("Die L�sung von n �ber k ist " + n�berk);
	}

}
