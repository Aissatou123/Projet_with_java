public class Coding {
	
	// Fonction code
	public static byte[][] code(byte[] data){
		byte[] x = data.clone();
		byte[] y = data.clone();
		byte[][] z = {x,y,data};
		return z;
	}
	
	public static byte[] decode (byte[][] data){
		//Création du tableau qui sera retourné
		byte[] res = new byte[data[0].length];
		
		
		//Pour parcourir les colonnes
	for (int z = 0; z <data[0].length; z++){  // z est le 2e index (data [?][z])
	

		// Formation d'un array contenant les valeurs de la colonne parcourue
		byte [] tab = new byte[3];
		
		//Pour parcourir les lignes d'une colonne
			for (int i =0; i <tab.length; i++){ // i est le 1er index (data [i][?])
				
				tab [i] = data[i][z]; // à data[i][z] 
			}
			
		/*Maintenant qu'un array contenant les valeurs de la colonne
		est créé, il faudra compter le nombre d'occurences de chaque élements*/
		
		//Création d'un compteur pour chaque élément
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		byte a = tab [0];
		
		for (int i = 0 ; i<tab.length; i++){
			if (tab[0] == tab[i]){
				c1 = c1+1;
			}
			if (tab[1] == tab[i]){
				c2 = c2+1;
			}
			if (tab[2] == tab[i]){
				c3 = c3+1;
			}
			if (c1 > 1){
				a = tab[0];
				break;
			}
			if (c2 > 1){
				a = tab[1];
				break;
			}
			if (c3 > 1){
				a = tab[2];
				break;
			}	
		}
		
		res[z] = a;
		}
		
		
		
		
		return res;
}
			
			
		
		

	
	
	
	
	// Cette méthode sert à afficher les tableaux 2D
	public static void atab (byte[][] tab ){
		for (int z = 0 ; z<tab.length; z++){
			for (int i = 0 ; i<tab[z].length; i++){
			System.out.print(tab[z][i]+ "  ");
			}
			System.out.println("");
		}	
	}
	
	public static void main(String[] args){
		
		
		
		byte[] donnees = {1,2,3,4,5,6};//Données transmises
		
		byte [][]data = code(donnees);//Utilisation de code 
		
		//Impression du tableau codé s'il n'y a pas d'erreur
		System.out.println("Le tableau code si pas d'erreur de transmission :\n");
		atab(data);
		
		
		
		//Simulation d'erreur de transmission
		/*Supposons que lors de l'envoi sur la ligne de télécommunication,
		Des éléments du tableau "data" changent de valeurs
		*/
		data[0][0] = 50;
		data[1][2] = 11;
		data[2][3] = 32;
		
		//Impression du tableau erroné
		System.out.println("\nLe tableau code recu est :\n");
		atab(data);
		
		// Correction du tableau erroné
		donnees = decode(data);

		//Impression du tableau corrigé
		System.out.println("\nLe tableau corrige est :\n");
		for (int i = 0 ; i<donnees.length; i++){
			System.out.print(donnees[i]+ "  ");
			}

	}
	
}



