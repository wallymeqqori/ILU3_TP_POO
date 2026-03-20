package cartes;

public class JeuDeCartes {
	protected Configuration[] typesDeCartes;
	
	public JeuDeCartes(){
		 
        typesDeCartes = new Configuration[19];

        typesDeCartes[0] = new Configuration(new Borne(25), 10);
        typesDeCartes[1] = new Configuration(new Borne(50), 10);
        typesDeCartes[2] = new Configuration(new Borne(75), 10);
        typesDeCartes[3] = new Configuration(new Borne(100), 12);
        typesDeCartes[4] = new Configuration(new Borne(200), 4);
        typesDeCartes[5] = new Configuration(new Parade(Type.FEU), 14);
        typesDeCartes[6] = new Configuration(new FinLimite(), 6);
        typesDeCartes[7] = new Configuration(new Parade(Type.ESSENCE), 6);
        typesDeCartes[8] = new Configuration(new Parade(Type.CREVAISON), 6);
        typesDeCartes[9] = new Configuration(new Parade(Type.ACCIDENT), 6);
        typesDeCartes[10] = new Configuration(new Attaque(Type.FEU), 5);
        typesDeCartes[11] = new Configuration(new Limite("Limite 50"), 4);
        typesDeCartes[12] = new Configuration(new Attaque(Type.ESSENCE), 3);
        typesDeCartes[13] = new Configuration(new Attaque(Type.CREVAISON), 3);
        typesDeCartes[14] = new Configuration(new Attaque(Type.ACCIDENT), 3);
        typesDeCartes[15] = new Configuration(new Botte(Type.FEU), 1);
        typesDeCartes[16] = new Configuration(new Botte(Type.ESSENCE), 1);
        typesDeCartes[17] = new Configuration(new Botte(Type.CREVAISON), 1);
        typesDeCartes[18] = new Configuration(new Botte(Type.ACCIDENT), 1);

	}
	
	public String affichageJeuDeCartes() {
		StringBuilder str = new StringBuilder("JEU : \n");
		for(int i = 0;i <typesDeCartes.length;i++) {
			str.append(typesDeCartes[i]).append("\n");
		}
		return str.toString();
	}
}






/*
Ajouter au package cartes la classe JeuDeCartes contenant un tableau de configurations. Chaque configuration contient une carte et son nombre d'exemplaires. La méthode affichageJeuDeCartes permet d’afficher pour chacune des cartes son nombre d’exemplaires dans le jeu : JEU : 10 25KM 10 50KM 10 75KM 12 100KM 4 200KM 14 Feu Vert 6 Fin Limite 6 Bidon d'essence 6 Roue de secours 6 Réparation 5 Feu Rouge 4 Limite 50 3 Panne d'essence 3 Crevaison 3 Accident 1 Prioritaire Voici ce que j'ai fait : package cartes; public class JeuDeCartes { protected Configuration[] typesDeCartes; public JeuDeCartes(){ typesDeCartes = new Configuration[19]; typesDeCartes[0] = new Configuration(new Borne(25), 10); typesDeCartes[1] = new Configuration(new Borne(50), 10); typesDeCartes[2] = new Configuration(new Borne(75), 10); typesDeCartes[3] = new Configuration(new Borne(100), 12); typesDeCartes[4] = new Configuration(new Borne(200), 4); typesDeCartes[5] = new Configuration(new Parade(Type.FEU), 14); typesDeCartes[6] = new Configuration(new FinLimite(), 6); typesDeCartes[7] = new Configuration("Bidon d'essence", 6); typesDeCartes[8] = new Configuration("Roue de secours", 6); typesDeCartes[9] = new Configuration("Réparation", 6); typesDeCartes[10] = new Configuration(new Attaque(Type.FEU), 5); typesDeCartes[11] = new Configuration("Limite 50", 4); typesDeCartes[12] = new Configuration("Panne d'essence", 3); typesDeCartes[13] = new Configuration("Crevaison", 3); typesDeCartes[14] = new Configuration("Accident", 3); typesDeCartes[15] = new Configuration(new Botte(Type.FEU), 1); typesDeCartes[16] = new Configuration("Citerne", 1); typesDeCartes[17] = new Configuration("Increvable", 1); typesDeCartes[18] = new Configuration("As du volant", 1); } public String affichageJeuDeCartes() { StringBuilder str = new StringBuilder("JEU : \n"); for(int i = 0;i <typesDeCartes.length;i++) { str.append(typesDeCartes[i]).append("\n"); } return str.toString(); } } Sauf que ça marche pas parce que j'ai pas donne le type de toutes les cartes, à chaque fois que tu vois new c'est que je l'ai fait; Voici l'ensemble de mes classes : Attaque Bataille Borne Botte Carte Configuration DebutLimite FinLimite JeuDeCartes Limite Parade Probleme Type Et le diagramme suivant : Attaque -> Bataille Parade -> Bataille Bataille -> Probleme Botte -> Probleme Probleme ->Carte DebutLimite -> Limite FinLimite -> Limite Limite->Carte Borne-> Carte Et la classe TYPE est à part, c'est une sorte d'enum package cartes; public enum Type { FEU ("Prioritaire", "Feu rouge","Feu vert"), ESSENCE ("Citerne", "Panne d'essence","Essence"), CREVAISON ("Increvable","Crevaison","Roue de secours"), ACCIDENT ("As du volant","Accident","Réparations"); private final String botte; private final String attaque; private final String parade; Type(String botte, String attaque, String parade){ this.botte = botte; this.attaque = attaque; this.parade = parade; } public String getBotte() { return botte; } public String getAttaque() { return attaque; } public String getParade() { return parade; } } Définir les méthodes toString renvoyant le nom de chaque carte en s’inspirant de la description du contenu d’un jeu donnée dans règles du jeu. On nommera Feu rouge et Feu vert les attaques et parades représentées par des feux. On considèrera que Prioritaire est une botte associée au feu et non à une limite de vitesse. Pour faciliter la redéfinition de toString dans les sous-classes de Probleme on ajoutera 3 paramètres au constructeur de l’énumération Type, contenant respectivement l’affichage souhaité lorsque la carte de ce type est une attaque, une parade ou une botte.
 */
