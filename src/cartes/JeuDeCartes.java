package cartes;

public class JeuDeCartes {
	protected Configuration[] typesDeCartes;
	
	public JeuDeCartes(){
		 
        typesDeCartes = new Configuration[19];

        typesDeCartes[0] = new Configuration(new Borne(25), 10);
        typesDeCartes[1] = new Configuration("50KM", 10);
        typesDeCartes[2] = new Configuration("75KM", 10);
        typesDeCartes[3] = new Configuration("100KM", 12);
        typesDeCartes[4] = new Configuration("200KM", 4);
        typesDeCartes[5] = new Configuration("Feu vert", 14);
        typesDeCartes[6] = new Configuration("Fin Limite", 6);
        typesDeCartes[7] = new Configuration("Bidon d'essence", 6);
        typesDeCartes[8] = new Configuration("Roue de secours", 6);
        typesDeCartes[9] = new Configuration("Réparation", 6);
        typesDeCartes[10] = new Configuration("Feu Rouge", 5);
        typesDeCartes[11] = new Configuration("Limite 50", 4);
        typesDeCartes[12] = new Configuration("Panne d'essence", 3);
        typesDeCartes[13] = new Configuration("Crevaison", 3);
        typesDeCartes[14] = new Configuration("Accident", 3);
        typesDeCartes[15] = new Configuration("Prioritaire", 1);
        typesDeCartes[16] = new Configuration("Citerne", 1);
        typesDeCartes[17] = new Configuration("Increvable", 1);
        typesDeCartes[18] = new Configuration("As du volant", 1);

	}
	
	public String affichageJeuDeCartes() {
		StringBuilder str = new StringBuilder("JEU : \n");
		for(int i = 0;i <typesDeCartes.length;i++) {
			str.append(typesDeCartes[i]).append("\n");
		}
		return str.toString();
	}
}
