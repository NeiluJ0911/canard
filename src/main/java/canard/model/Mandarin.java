package canard.model;

public class Mandarin extends Canard{
	
	public Mandarin(String nom) {
			super(nom);
			this.vol = new VolerAvecDesAiles();
			this.cancan = new Cancan();
		}
	
	@Override
	public String afficher() {
		return this.nom+" : Je suis un vrai mandarin";
	}

	

}
