//class TriTabCouple pour trier un tableau de couple à l'aide de deux méthode au choix//
public class TriTabCouple{
	public static void bubbleSort(Couple [] tab){ // methode pour trier deux tableau 
		int i , j , min ; //déclaration de trois entiers
    for ( i = tab.length-1 ; i>=0 ; i--) { 
    	min = i; 
    for ( j = i -1; j >=0 ; j--) { //boucle for imbriqué
    	Couple coupl=new Couple();
    	if (coupl.compare(tab[i],tab[j])) { //appel de la méthode compare de couple
    		min = j ; 
    	}
    }
    Couple tmp=new Couple();
    tmp = tab[min] ;                 //ranger les couples s'ils sont pas en ordre//
    tab[min] = tab[ i ] ;             
    tab [ i ] = tmp ; 
}
}
public static void insertSort(Couple [] tabb){ //méthode pour trier un tableau de couple
int x = tabb.length;  
        
          for (int y = 1; y < x; y++){ 
               	Couple i = tabb[y];  
               int j = y-1;  
               Couple cou=new Couple();
               while(j >= 0 && cou.compare(i,tabb[j]))  { // appel de la méthode compare de Couple
                    tabb[j+1] = tabb[j];  
                    j--;  
               }  
               tabb[j+1] = i;
}
}
public static void main(String[] args){
	Couple a=new Couple(2,5); // déclaration de 3 couple//
	Couple b=new Couple(2,3);
	Couple c=new Couple(0,5);
	Couple[] exemple = {a,b,c}; //déclaration d’une variable (exemple) référence vers un tableau de couples//

	insertSort( exemple ); // appel de la méthode insertSort//
	for ( int l =0; l<exemple.length ; l++) { //impression du contenu du tableau//
       if ( l >0 ) {
       System.out.print ( " , " ) ;
       }
       System.out.print ("("+exemple[ l ].getP()+","+exemple[l].getQ()+")" ) ;
       }
       System.out.println ( ) ;
}
}
