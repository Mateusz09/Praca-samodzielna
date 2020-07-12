package course;

public class Praca {

	public static void main(String[] args) {
		
		int proszek = 5;         // litrów
		int szampon = 30;           // litrów
		int myd³o = 12;          // kilgramów
		
		int proszekLack = 2;     // litrów
		int szamponLack = 10;        // litrów
		int myd³oLack = 5;      // kilogramów
		
		boolean holidays = true;
		
		if (proszekLack < proszek) {
			
			int ró¿nica = proszek - proszekLack;
			System.out.println("Aktualna iloœæ proszku wynosi " + ró¿nica + " kilogramy.");
		}
		
		if (holidays && szamponLack < szampon) {
			
			int ró¿nica = szampon / 2 - szamponLack;
			System.out.println("Aktualna iloœæ szamponu wynosi " + ró¿nica + " litrów.");
			
		}
		
		else if (szamponLack < szampon) {
			
			int ró¿nica = szampon - szamponLack;
			System.out.println("Aktualna iloœæ szamponu wynosi " + ró¿nica + " litrów.");
			
		}
		
		if (holidays && myd³oLack < myd³o) {
			
			int ró¿nica = myd³o / 2 - myd³oLack;
			System.out.println("Aktualna iloœæ myd³a wynosi " + ró¿nica + " litr.");
			
		}
		
		else if (myd³oLack < myd³o) {
			
			int ró¿nica = myd³o - myd³oLack;
			System.out.println("Aktualny stan mydla wynosi " + ró¿nica + " litrów.");
			
		}
			
	}

}
