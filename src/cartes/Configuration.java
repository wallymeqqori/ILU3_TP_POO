package cartes;

public class Configuration{
	
	private int nbExemplaires;
	private Carte carte;
	
	public Configuration(Carte carte, int nbExemplaires) {
		super();
		this.nbExemplaires = nbExemplaires;
		this.carte = carte;
	}

	public Carte getCarte() {
		return this.carte;
	}
	public int getNbExemplaires() {
		return this.nbExemplaires;
	}
	
}
