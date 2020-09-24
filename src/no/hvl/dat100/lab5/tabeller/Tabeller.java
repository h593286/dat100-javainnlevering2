package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for (int i : tabell) {
			System.out.println(i);
		}

		// TODO
		//throw new UnsupportedOperationException("skrivUt ikke implementert");

	}

	// b)
	public static String tilStreng(int[] tabell) {
		String streng = "[";
		for (int i = 0; i < tabell.length ; i++) {
			if (i == tabell.length - 1) {
				streng += tabell[i];
			} else {
				streng += (tabell[i] + ",");
		}
		}	
		streng += "]";
		return streng; 

		// TODO
		//throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}

	// c)
	public static int summer(int[] tabell) {
		int lopendeSum = 0;
		//for (int i = 0; i < tabell.length ; i++) {
		//	lopendeSum += tabell[i];
		//}
		//for (int element : tabell) {
		//	lopendeSum += element;
		//}
		
		int i = 0;
		while ( i < tabell.length) {
			lopendeSum += tabell[i];
			i++;
		}
		return lopendeSum;
		
		// TODO
		//throw new UnsupportedOperationException("summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean finnes = false;
		for (int i : tabell) {
			if ( i == tall) {
				finnes = true;
			}
		}
		return finnes;
		
		// TODO
		//throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int posisjon = -1 ;
		for (int i = 0; i < tabell.length ; i++) {
			if (tall == tabell[i]) {
				posisjon = i;
			}
		}
		return posisjon;
		// TODO
		//throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] nyTabell = new int[tabell.length];
		int indeksNy = 0;
		for ( int i = (tabell.length - 1) ; i >= 0 ; i--) {
			nyTabell[indeksNy] = tabell[i];
			indeksNy++;
		}
		
		return nyTabell; 
		// TODO
		//throw new UnsupportedOperationException("reverser ikke implementert");
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean sortert = true;
		for (int i = 1; i < tabell.length ; i++) {
			if (tabell[i] < tabell[i-1]) {
				sortert = false;
			}
		}
		return sortert; 

		// TODO
		//throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] nyTabell = new int[tabell1.length + tabell2.length];
		for ( int i = 0; i < tabell1.length ; i++) {
			nyTabell[i] = tabell1[i]; 
		}
		for (int i = 0; i < tabell2.length ; i ++) {
			nyTabell[i + tabell1.length] = tabell2[i];
		}
		return nyTabell; 
		// TODO
		//throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
