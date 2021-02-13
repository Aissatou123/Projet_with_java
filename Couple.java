//la classe couple
public class Couple {
	//variables//
  private int p,q;
	//constructeur qui initialise les variables//
  public Couple(int membre1, int membre2) {

p = membre1;
q= membre2;
}
	//constructeur qui initialise a zéro les variables//
public Couple() {
p= 0;
q= 0;
}
	//constructeur qui initialise un couple a l'aide d'un autre couple//
public Couple (Couple x) {


}
	//accesseurs//
public int getP() {
return p;
}
public int getQ() {
return q;
}
public void setP(int c){
	p=c;

}
public void setQ(int d){
	q=d;
	
}
void display(){ // méthode qui affiche les variables d’instance
	System.out.println("("+p+","+q+")");
}
 public boolean compare(Couple alpha, Couple beta){ //méthode qui compare deux couples

	//(p1, q1) < (p2, q2) si et seulement si (p1 < p2) ou (p1 = p2 et q1 < q2).//
	if (alpha.p<beta.p || alpha.p==beta.p && alpha.q<beta.q) {
		 return(true); //num1<num2

}else{
	return(false);
}
}
}
