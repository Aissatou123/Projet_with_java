//REVOIR TOUT
public class Couple {
  private int p,q;
  public Couple(int membre1, int membre2) {

p = membre1;
q= membre2;
}
public Couple() {
p= 0;
q= 0;
}
public Couple (Couple x) {


}
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
void display(){
	System.out.println("("+p+","+q+")");
}
 public boolean compare(Couple alpha, Couple beta){

	//(p1, q1) < (p2, q2) si et seulement si (p1 < p2) ou (p1 = p2 et q1 < q2).//
	if (alpha.p<beta.p || alpha.p==beta.p && alpha.q<beta.q) {
		 return(true); //num1<num2

}else{
	return(false);
}
}
}
