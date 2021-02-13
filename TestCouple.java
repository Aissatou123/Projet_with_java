//la class TestCouple pour tester notre classe couple
public class TestCouple{
	public static void main(String[] args){ //méthode permettant d'afficher et de comparer des couples//
		Couple c1=new Couple(2,3); // création de couples//
		Couple c2= new Couple(0,0);
		Couple c3= new Couple(2,3);
		c1.display(); //afficher des couples
		c2.display();
		c3.display();
			c3.setP(8); // changer le premier chiffre de c3//
		    System.out.println("Après modification, les éléments de c3 sont: "+c3.getP()+","+c3.getQ());
		    Couple cc=new Couple(); //créer un couple standard //
		    cc.compare(c1,c3); //comparer deux couple//
		    System.out.println("c1 inférieur à c3: "+cc.compare(c1,c3));
	}
}
