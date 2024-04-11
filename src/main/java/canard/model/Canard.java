package canard.model;

public abstract class Canard {
	
	protected String nom;
	protected ComportementVol vol;
	protected ComportementCanCan cancan;
	
	public Canard(String nom) {
		this.nom = nom;
	}
	
	public abstract String afficher();
	
	public String nager() {
		return "Tous les canards flottent, même les leurres!";
	}
	
	public String effectuerVol() {
		return(vol.voler());
	}
	
	public String effectuerCancan() {
		return(cancan.cancaner());
	}

	public String getNom() {
		return this.nom;
	}
}
          