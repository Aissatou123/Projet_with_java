public class Coding {
	
	// Fonction code
	public static byte[][] code(byte[] data){
		byte[] x = data;
		byte[] y = data;
		byte[][] z = {x,y,data};
		return z;
	}
	// Juste pour afficher le résultat (et vérifier que le code marche bien)
	public static void atab (byte[][] tab ){
		for (int z = 0 ; z<tab.length; z++){
			for (int i = 0 ; i<tab[z].length; i++){
			System.out.print(tab[z][i]+ " ");
			}
			System.out.println("");
		}
		
		
	}
	
	public static void main(String[] args){
		
		// Ceci est une vérification du code
		byte[] z = {1,2,4,11,26,15};
	byte [][]x = code(z);
	atab(x);
	}
	
}



