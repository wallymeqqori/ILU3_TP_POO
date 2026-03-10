package cartes;

public enum Type {
    FEU			("Prioritaire", "Feu rouge","Feu vert"),
    ESSENCE   	("Citerne", "Panne d'essence","Essence"),
    CREVAISON   ("Increvable","Crevaison","Roue de secours"),
    ACCIDENT 	("As du volant","Accident","Réparations");
	
	private final String botte;
	private final String attaque;
	private final String parade;
	
	Type(String botte, String attaque, String parade){
    	this.botte = botte;
    	this.attaque = attaque;
    	this.parade = parade;
	}
    public String getBotte() {
    	return botte;
    }
    public String getAttaque() {
    	return attaque;
    }
    public String getParade() {
    	return parade;
    }
}