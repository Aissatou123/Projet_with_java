import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUI extends JFrame implements ActionListener{ // notre classe GUI qui hérite de JFrame et qui implémente ActionListener
	
	Calculator cal = new Calculator(); //Objet qui effectuera les opérations
	JLabel ecran ;// Affichera les opérations
	
	
	public GUI(){
		super("Calculator"); // nom de notre fenêtre
		
		setDefaultCloseOperation (EXIT_ON_CLOSE) ;
		JPanel panelBoutoninf =new JPanel(); // POUR LES BOUTONS
		JPanel panelBoutonsup =new JPanel(); // POUR AFFICHER LES OPERATIONS
		panelBoutonsup.setBackground(Color.WHITE);
		JButton bouton; //un bouton standard pour créer tous les boutons de notre calculatrice
		
		
		ecran = new JLabel();
		ecran.setPreferredSize(new Dimension(100, 25));
		
		
		panelBoutoninf.setLayout (new GridLayout(4,4)); // Appel de gridlayout
		
		panelBoutonsup.add(ecran); 
		
		
		
		this.add(panelBoutonsup,BorderLayout.NORTH); //mise en place de notre boutton inférieur pour les chiffres
		this.add(panelBoutoninf,BorderLayout.SOUTH); //mise en place de notre bouton supérieur pour les textes
		setVisible(true);
        panelBoutoninf.add(bouton=new JButton("0")); // AJOUT DE TOUS 
        bouton.addActionListener(this);                //LES BOUTONS
        panelBoutoninf.add(bouton=new JButton("1"));
        bouton.addActionListener(this);
        panelBoutoninf.add(bouton=new JButton("2"));
        bouton.addActionListener(this);
        panelBoutoninf.add(bouton=new JButton("3"));
        bouton.addActionListener(this);
        panelBoutoninf.add(bouton=new JButton("C"));
        bouton.addActionListener(this);
        panelBoutoninf.add(bouton=new JButton("4"));
        bouton.addActionListener(this);
        panelBoutoninf.add(bouton=new JButton("5"));
        bouton.addActionListener(this);
        panelBoutoninf.add(bouton=new JButton("6"));
        bouton.addActionListener(this);
        panelBoutoninf.add(bouton=new JButton("7"));
        bouton.addActionListener(this);
        panelBoutoninf.add(bouton=new JButton("!"));
        bouton.addActionListener(this);
        panelBoutoninf.add(bouton=new JButton("8"));
        bouton.addActionListener(this);
        panelBoutoninf.add(bouton=new JButton("9"));
        bouton.addActionListener(this);
        panelBoutoninf.add(bouton=new JButton("+"));
        bouton.addActionListener(this);
        panelBoutoninf.add(bouton=new JButton("-"));
        bouton.addActionListener(this);
        panelBoutoninf.add(bouton=new JButton("*"));
        bouton.addActionListener(this);
        panelBoutoninf.add(bouton=new JButton("POW"));
        bouton.addActionListener(this);
        panelBoutoninf.add(bouton=new JButton("sqrt"));
        bouton.addActionListener(this);
        panelBoutoninf.add(bouton=new JButton("ln"));
        bouton.addActionListener(this);
        panelBoutoninf.add(bouton=new JButton("="));
        bouton.addActionListener(this);
        panelBoutoninf.add(bouton=new JButton("/"));
        bouton.addActionListener(this);
        setVisible(true);
        pack();
		ecran.setText("0");
		
	}
	
	
	// Variables qui serviront dans actionPerformed
	
	String line = ""; // Ce qui sera affiché par le JLabel ecran
	String chiffres = "0123456789"; // Tous les chiffres y sont énumérés
	String numInput = "0"; // composé par les chiffres entrés par l'utilisateur
	double nombre = 0; // Sera le nombre écrit par l'utilisateur
	
	/*Explication du fonctionnement de numInput et nombre:
	--> numInput est la transcription de ce qu'écrit l'utilisateur
		Au début, numInput est seulement composé de "0"
		A chaque fois que l'utilisateur clique sur un chiffre, ce
		chiffre s'ajoute à numInput
	
	-->nombre est la conversion de numInput en double
		On suppose que quand l'utilisateur appuie sur quelque chose d'autre
		qu'un chiffre, il a finit d'entrer le nombre qu'il souhaite manipuler
		On convertis alors numInput en double et on assigne cette valeur à nombre
		On réinitialise ensuite numInput à "0" pour d'éventuelles réutilisations
	
	Exemple:
	L'utilisateur clique (dans l'ordre) sur les boutons "1", "2", "5"
	-->	numInput sera alors égal à "0125" 
	Il clique ensuite sur "+"
	--> nombre est alors égal à 125.0
	-->numInput devient "0"
	L'utilisateur appuie ensuite sur "1";
	-->numInput devient alors "01"
	
	*/
	
	
	public void actionPerformed(ActionEvent e){
	String command ;
	
	
	
	command = e.getActionCommand ( ) ;
	
	if (command.equals("C")){ // Si on clique sur C
		cal.operation(command); // oP = "C"
		cal.clear(); // réinitialise first et second à 0
		numInput = "0"; // réinitialise numInput
		line = ""; // réinitialise ce qui sera affiché
		ecran.setText("0");// Affiche 0
	} else{
			line = line + command;//Le contenu du bouton sera affiché à l'écran
			
			if (chiffres.contains(command) ){ // Si on a cliqué sur un chiffre 
			numInput = numInput + command;	
			
			}	
			else{ // Si on a cliqué sur quelque chose d'autre qu'un chiffre et "C"
				nombre = Double.parseDouble(numInput); // Conversion de numInput en double		
				
				numInput = "0"; // réinitialise numInput
				
							
				
				
				if (command.equals("=")){ // Si on clique sur "="
					line = line +cal.display(); // Le résultat sera affiché
					}
				
				// C'est dans ce bloc qu'il faut coder de telle
				//sorte que les opérations s'effectuent 
				
			
			}
			
		ecran.setText(line); // Affiche à l'écran l'opération
		} 
		
	
	
	
	
	
	
	

}


public static void main(String[] args){
	JFrame calculette=new GUI();
}
}
