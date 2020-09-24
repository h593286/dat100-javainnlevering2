package no.hvl.dat100.lab6.matriser;

public class Matriser {


	// a)
	public static void skrivUt(int[][] matrise) {
		 for (int i = 0; i < matrise.length ; i++) {
			 for (int j = 0; j < matrise[i].length ; j ++) {
				 System.out.print(matrise[i][j] + " ");
			 }
		System.out.println();
		 }
		// TODO
		//throw new UnsupportedOperationException("skrivUt ikke implementert");
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String streng = "";
		for (int i = 0; i < matrise.length ; i++) {
			 for (int j = 0; j < matrise[i].length ; j ++) {
				 streng += (matrise[i][j] + " ");
			 }
		streng +=  "\n";
		}
		return streng; 
		// TODO
		//throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int [][] nyMatrise = new int[matrise.length][matrise[0].length];
		
		for (int i = 0; i < matrise.length ; i++) {
			 for (int j = 0; j < matrise[i].length ; j ++) {
				 nyMatrise[i][j] = matrise[i][j] * tall;
			 }
		 }
		return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean lik = false;
		for (int i = 0; i < a.length ; i++) {
			 for (int j = 0; j < a[i].length ; j ++) {
				 if (a[i][j] == b[i][j]) {
					 lik = true; 
				 } else {
					 lik = false;
				 }
			 }
		}
		return lik; 
		// TODO
		//throw new UnsupportedOperationException("erLik ikke implementert");
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int [][] nyMatrise = new int[matrise.length][matrise[0].length];
		for (int i = 0; i < matrise.length ; i++) {
			 for (int j = 0; j < matrise[i].length ; j ++) {
				 nyMatrise[j][i] = matrise[i][j];
			 }
		 }
		return nyMatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		if (b.length == a[0].length) {
			int [][] nyMatrise = new int[a[0].length][b.length];
			for (int radNy = 0; radNy < nyMatrise.length ; radNy ++) {
				for (int kolonneNy = 0; kolonneNy < nyMatrise[radNy].length ; kolonneNy ++) {
					for (int i = 0; i < b.length; i++) {
						nyMatrise[radNy][kolonneNy] += a[radNy][i] * b[i][kolonneNy];
					}
				}
			}
			return nyMatrise;
		} else {
			throw new UnsupportedOperationException("Antall kolonner i a =/= antall rader i b");
		}

	}
}
