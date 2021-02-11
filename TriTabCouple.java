public class TriTabCouple{
	public static void bubbleSort(Couple [] tab){
		int i , j , min ; 
    for ( i = 0 ; i < tab.length - 1 ; i++) {
    	min = i; 
    for ( j = i + 1 ; j < tab.length ; j++) { 
    	Couple coupl=new Couple();
    	if (coupl.compare(tab[i],tab[j])) { 
    		min = j ; 
    	}
    }
    Couple tmp=new Couple();
    tmp = tab[min] ; 
    tab[min] = tab[ i ] ; 
    tab [ i ] = tmp ; 
}
}
public static void insertSort(Couple [] tabb){
int x = tabb.length;  
        
          for (int y = 1; y < x; y++){ 
               	Couple i = tabb[y];  
               int j = y-1;  
               Couple cou=new Couple();
               while(j >= 0 && cou.compare(i,tabb[j]))  {
                    tabb[j+1] = tabb[j];  
                    j--;  
               }  
               tabb[j+1] = i;
}
}
public static void main(String[] args){
	Couple a=new Couple(2,5);
	Couple b=new Couple(2,3);
	Couple c=new Couple(0,5);
	Couple[] exemple = {a,b,c};

	insertSort( exemple );
	for ( int l =0; l<exemple.length ; l++) {
       if ( l >0 ) {
       System.out.print ( " , " ) ;
       }
       System.out.print ("("+exemple[ l ].getP()+","+exemple[l].getQ()+")" ) ;
       }
       System.out.println ( ) ;
}
}

