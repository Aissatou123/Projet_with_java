public class Coding {
	/*Ce programme permet d'implémenter un code correcteur.
	afin de transmettre des données représentées par un tableau d'octets (bytes)*/
	
	
	public static byte[][] code(byte[] data){ 
	
	/* Fonction code
	Utilisée par celui qui envoie les données,elle prend
	en	paramètre un tableau à une dimension et retourne
	un tableau à deux dimensions contenant 3 exemplaires du tableau initial
	*/
	
		byte[] x = data.clone();// 2e exemplaire du tableau 
		byte[] y = data.clone();// 3e exemplaire du tableau
		
		byte[][] z = {x,y,data};// Tableau 2D contenant les trois exemplaires du tableau initial
		return z;
	}
	
	
	
	public static byte[] decode (byte[][] data){
		/* Fonction decode
		Elle prend un tableau 2D en paramètre et retourne un tableau de 
		dimension 1 qui est supposé être le résultat de la réception de données
		(après correction des erreurs)
		*/
		
		//Création du tableau qui sera retourné
		byte[] res = new byte[data[0].length];
		
		
		//Pour parcourir les colonnes
		for (int z = 0; z <data[0].length; z++){  // z est le 2e index (data [?][z])
	

		// Formation d'un tableau qui contiendra les valeurs de la colonne parcourue
			byte [] tab = new byte[3];
		
		//Pour parcourir les lignes d'une colonne
			for (int i =0; i <tab.length; i++){ // i est le 1er index (data [i][?])
				
				tab [i] = data[i][z]; // On attribue à tab[i] la valeur de l'élément data[i][z] 
			}
			
		/*Maintenant qu'un tableau (nommé tab) contenant les valeurs de la colonne
		est créé, il faudra compter le nombre d'occurences de chaque élements dans tab*/
		
		//Création d'un compteur pour chaque élément
		
				int c1 = 0;//Compteur de tab[0]
				int c2 = 0;//Compteur de tab[1]
				int c3 = 0;//Compteur de tab[2]
		
				byte a = tab [0];/* a est l'élément qui apparait le plus dans tab
								Par défaut, a est le premier élément (au cas où 
								tab contient 3 élements différents	*/
							
		
				for (int i = 0 ; i<tab.length; i++){// Pour parcourir tab
		
					if (tab[0] == tab[i]){ /*Si on rencontre un élément ayant la valeur de tab[0],
									le compteur relatif à sa valeur augmente d'1 */
						c1 = c1+1;
					}
					
					if (tab[1] == tab[i]){//Pareil pour un élément ayant la valeur de tab[1]
						c2 = c2+1;
					}
					
					if (tab[2] == tab[i]){//Pareil pour un élément ayant la valeur de tab[2]
						c3 = c3+1;
					}
			
					/*Vu que tab ne contient que trois élements, si un élément apparait
					plus d'une fois,il est forcément l'élément qui apparait le plus */
			
			
					if (c2 > 1){// si tab[1] apparait plus d'une fois:
						a = tab[1];// a prend la valeur de tab[1]
						break;// Plus besoin de continuer de compter 
					}
					
					if (c3 > 1){//si tab[2] apparaît plus d'une fois
						a = tab[2];// a prend la valeur de tab[2]
						break;// Plus besoin de continuer de compter 
					}
				
					if (c1 > 1){// si tab[0] apparait plus d'une fois:
					// a possède déjà la valeur de tab[0]
						break;// Plus besoin de continuer de compter 
					}	
		}
		
			res[z] = a; /* L'élément de tab qui apparaît le plus (a) sera considéré
					comme l'élément correct de la colonne parcourue*/
		
		}
		
		return res;
}
			
			
		
		

	
	
	
	
	
	public static void print2d (byte[][] tab ){
		/* Cette méthode sert à afficher les tableaux 2D
		Soit byte[][] x = {{a,b},{c,d}}
		La méthode l'affichera sous le format
		a b
		c d 
		*/
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
		print2d(data);
		
		
		
		//Simulation d'erreur de transmission
		/*Supposons que lors de l'envoi sur la ligne de télécommunication,
		Des éléments du tableau "data" changent de valeurs
		*/
		data[0][0] = 50;
		data[1][2] = 11;
		data[2][3] = 32;
		
		//Impression du tableau erroné
		System.out.println("\nLe tableau code recu est :\n");
		print2d(data);
		
		// Correction du tableau erroné
		donnees = decode(data);

		//Impression du tableau corrigé
		System.out.println("\nLe tableau corrige est :\n");
		for (int i = 0 ; i<donnees.length; i++){
			System.out.print(donnees[i]+ "  ");
			}

	}
	
}



