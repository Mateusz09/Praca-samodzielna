package course;

public class Praca {

	public static void main(String[] args) {
		
		int proszek = 5;         // litr�w
		int szampon = 30;           // litr�w
		int myd�o = 12;          // kilgram�w
		
		int proszekLack = 2;     // litr�w
		int szamponLack = 10;        // litr�w
		int myd�oLack = 5;      // kilogram�w
		
		boolean holidays = true;
		
		if (proszekLack < proszek) {
			
			int r�nica = proszek - proszekLack;
			System.out.println("Aktualna ilo�� proszku wynosi " + r�nica + " kilogramy.");
		}
		
		if (holidays && szamponLack < szampon) {
			
			int r�nica = szampon / 2 - szamponLack;
			System.out.println("Aktualna ilo�� szamponu wynosi " + r�nica + " litr�w.");
			
		}
		
		else if (szamponLack < szampon) {
			
			int r�nica = szampon - szamponLack;
			System.out.println("Aktualna ilo�� szamponu wynosi " + r�nica + " litr�w.");
			
		}
		
		if (holidays && myd�oLack < myd�o) {
			
			int r�nica = myd�o / 2 - myd�oLack;
			System.out.println("Aktualna ilo�� myd�a wynosi " + r�nica + " litr.");
			
		}
		
		else if (myd�oLack < myd�o) {
			
			int r�nica = myd�o - myd�oLack;
			System.out.println("Aktualny stan mydla wynosi " + r�nica + " litr�w.");
			
		}
			
	}

}
