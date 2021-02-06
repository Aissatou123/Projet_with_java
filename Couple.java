public class Couple {
  private int p,q;
  public Couple(int membre1, int membre2) {

p = membre1;
q= membre2;
}
  public Couple(int a) {
a=0;
p = a;
p = a;
}
  public Couple () {
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
 public boolean compare(Couple){
	//(p1, q1) < (p2, q2) si et seulement si (p1 < p2) ou (p1 = p2 et q1 < q2).//
	
	if (p1<p2 || p1==p2 && q1<q2) {
		Couple alpha=new Couple(p1,q1);
		Couple beta=new Couple(p2,q2);
		return(compare(alpha,beta)); //num1<num2

}
}

}
