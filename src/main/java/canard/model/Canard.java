package canard.model;

public abstract class Canard {
	
	protected String nom;
	protected ComportementVol vol;
	
	public Canard(String nom) {
		this.nom = nom;
	}
	
	public String nager() {
		return "Tous les canards flottent, même les leurres!";
	}
	
	public String effectuerVol() {
		return(vol.voler());
	}
	
	public abstract String afficher();

	public String getNom() {
		return this.nom;
	}
}
