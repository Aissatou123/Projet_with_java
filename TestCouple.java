public class TestCouple{
	public static void main(String[] args){
		Couple c1=new Couple(2,3);
		Couple c2= new Couple(0,0);
		Couple c3= new Couple(2,3);
		c1.display();
		c2.display();
		c3.display();
			c3.setP(8);
		    System.out.println("Après modification, les éléments de c3 sont: "+c3.getP()+","+c3.getQ());
		    Couple cc=new Couple();
		    cc.compare(c1,c3); 
		    System.out.println("c1 inférieur à c3: "+cc.compare(c1,c3));
	}
}
