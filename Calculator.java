//QUESTION 1
import java.lang.Math;
public class Calculator{ // notre classe calculator qui effectue les calcule et stock nos données
	private double first = 0 ; // Variable first pour le choix d'un premier chiffre qui est obligatoire
		
	private double second; // variable second qui stock notre premier choix et qui représente le choix du second chiffre
	
	
	public void  setSecond(double y){ // Pour modifier second
		this.second = y;
	}
	
	
	private String oP; // variable oP qui va reconnaitre les touches +,-,*...
	public Calculator(){ //construction sans paramètre de notre classe Calculator
	}
	void operation(String str){ // méthode qui stock nos variables
		first=second; // garde la 1ère opérande
		second=0; // initialise et mise à jour la 2e opérande
		oP= str;
	}
	
	
	
	void add(){operation("+");}// addition
    void subtract(){operation("-");} //soustraction
    void multiply() {operation("*");}//multiplication
    void divide() {operation("/");} // division
    void factorial() {operation("!");} // factorielle d’un nombre (réel)
    void pow() {operation("POW");} //puissance
    void rootSquare(){operation("sqrt");} // racine carrée d’un nombre
    void nepLog() {operation("ln");} // logarithme népérien
	void compute(){ // méthode qui va effetuer nos calcules en fonction de la touche qu'on appuit +,-,*,/,...
		if(oP=="+"){
			second=first+second; //faire une addition
		}
		if(oP=="-"){
			second=first-second; // faire une soustraction
		}
		if(oP=="*"){
			second=first*second; // faire une multiplication
		}
		if(oP=="/"){
			second=first/second; // faire une division
		}
		if(oP=="ln"){
			second=Math.log(first) ; // effetuer le logarithme néperien de first
		}
		if(oP=="sqrt"){
			second=Math.sqrt(first); // effectuer la racine carré de first
		}
		if(oP=="POW"){
			second=Math.pow(first,second); // élever first à la puissance second
		}
		if(oP=="!"){
			second=(Math.sqrt(2*Math.PI*first)*Math.pow((first/Math.E),first)*(1+1/Math.pow((double)12,first)));
			// faire le factoriel de first suivant la méthode du factoriel
		}

	}
	void clear(){ // méthode qui remet à zéro quand on appuie sur la touche C
		if(oP=="C"){
			first=0;
			second=0;
		}

	}
	double display(){ // renvoie la deuxième opérande second
		return second;
	}
}
